#!/bin/sh
# EXECUTE THIS SCRIPT FROM THE releng DIRECTORY
ARGCOUNT=2
ERRCODE=0
E_WRONGARGS=1

REL_VERSION=$1
DEV_VERSION=$2
DISTRO_DIR=$pwd/../../spray.distribution/release
BASEDIR=$pwd



if [ $# -ne $ARGCOUNT ]; 
then
	ERRCODE=$E_WRONGARGS
fi


if test $ERRCODE -ne 0
then
	echo "Usage: release.sh REL_VERSION DEV_VERSION"
	exit $ERRCODE 
fi

# set new version to release version
mvn org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=$REL_VERSION || exit

# change category.xml afterwards since it is not replaced by tycho-versions-plugin
sed -i .bak 's/.qualifier//g'  repository/category.xml

# execute Maven build
mvn clean verify ||Êexit

# rename target repository zip
mv repository/target/org.eclipselabs.spray.releng.repository.zip repository/target/spray-$REL_VERSION.zip 

# Commit the changed files
cd ..
git commit -a -m "prepare for release"

# Create a release tag with pattern v<version>
git tag v$REL_VERSION

cd releng

# Increment to next development version
mvn org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=$DEV_VERSION-SNAPSHOT ||Êexit

# change the releng/repository/category.xml file
# important: usa double quotes here, since we refer to variables. single quote does not replace shell variables.
sed -i .bak "s/$REL_VERSION/$DEV_VERSION\.qualifier/g" repository/category.xml

#Execute a Maven build with goals clean verify to assure that everything builds 
#mvn clean verify || exit

cd ..
git commit -a -m "increment to next development version"
