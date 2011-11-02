#!/bin/sh
# EXECUTE THIS SCRIPT FROM THE releng DIRECTORY
ARGCOUNT=2
ERRCODE=0
E_WRONGARGS=1

REL_VERSION=$1
DEV_VERSION=$2
DISTRO_DIR=../../../spray.distribution/releases
BASEDIR=../..

pushd .

if [ $# -ne $ARGCOUNT ]; 
then
	ERRCODE=$E_WRONGARGS
fi


if test $ERRCODE -ne 0
then
	echo "Usage: release.sh REL_VERSION DEV_VERSION"
	exit $ERRCODE 
fi

echo "[spray-release] set new version to release version $REL_VERSION"
cd $BASEDIR/releng/org.eclipselabs.spray.distribution
mvn org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=$REL_VERSION || exit
mvn org.eclipse.tycho:tycho-versions-plugin:set-version -Pall-modules -DnewVersion=$REL_VERSION -f $BASEDIR/releng/org.eclipselabs.spray.parent/pom.xml || exit

echo "[spray-release] change category.xml afterwards since it is not replaced by tycho-versions-plugin"
sed -i .bak 's/.qualifier//g' ../org.eclipselabs.spray.repository/category.xml

echo "[spray-release] execute Maven build"
mvn clean verify -Pskip-ui-tests || exit

echo "[spray-release] rename target repository zip"
mv ../org.eclipselabs.spray.repository/target/org.eclipselabs.spray.releng.repository.zip ../org.eclipselabs.spray.repository/target/spray-$REL_VERSION.zip 

echo "[spray-release] commit the changed files"
pwd
cd $BASEDIR
git commit -a -m "[spray-release] prepare for release"

echo "[spray-release] create release tag v$REL_VERSION"
git tag v$REL_VERSION


echo "[spray-release] Increment to next development version $DEV_VERSION"
cd releng/org.eclipselabs.spray.distribution
mvn org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=$DEV_VERSION-SNAPSHOT || exit
mvn org.eclipse.tycho:tycho-versions-plugin:set-version -Pall-modules -DnewVersion=$DEV_VERSION-SNAPSHOT -f $BASEDIR/releng/org.eclipselabs.spray.parent/pom.xml || exit


echo "[spray-release] change the releng/org.eclipselabs.spray.repository/category.xml file"
# important: use double quotes here, since we refer to variables. single quote does not replace shell variables.
sed -i .bak "s/$REL_VERSION/$DEV_VERSION\.qualifier/g" ../org.eclipselabs.spray.repository/category.xml

#Execute a Maven build with goals clean verify to assure that everything builds 
#mvn clean verify || exit

echo "[spray-release] commit the changes" 
cd $BASEDIR
git commit -a -m "[spray-release] increment to next development version"

echo "[spray-release] copy repository content to distribution git repo"
cp -R  releng/org.eclipselabs.spray.repository/target/repository/* ../spray.distribution/releases/


echo "[spray-release] push the changes including the tag to the server" 
git push origin master --tags
#
echo "[spray-release] push Eclipse repository to spray.distribution"
# Switch to the root directoy of spray.distribution
cd $DISTRO_DIR
echo "[spray-release] add, commit and push files in the spray.distribution repository"
git add *
git commit -m "[spray-release] releasing version $REL_VERSION"
git push origin master


echo "[spray-release] Process successfully completed."
echo "[spray-release] Please upload $pwd/../org.eclipselabs.spray.repository/target/spray-$REL_VERSION.zip to the project downloads http://code.google.com/a/eclipselabs.org/p/spray/downloads/list."
