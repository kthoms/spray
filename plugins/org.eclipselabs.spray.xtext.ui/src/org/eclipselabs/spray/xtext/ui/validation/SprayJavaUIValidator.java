package org.eclipselabs.spray.xtext.ui.validation;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.validation.Check;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.SprayPackage;
import org.eclipselabs.spray.xtext.api.IConstants;
import org.eclipselabs.spray.xtext.validation.SprayJavaValidator;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * Adds UI specific validations.
 * 
 * @author Karsten Thoms
 */
public class SprayJavaUIValidator extends SprayJavaValidator {
    @Inject
    private IWorkspaceRoot root;
    @SuppressWarnings("rawtypes")
    @Inject
    @Named(IConstants.NAME_VALID_ICON_FILE_EXTENSIONS)
    private Set            validIconFileExtensions;

    @Check
    public void checkMetaClass_icon(MetaClass metaClass) {
        if (metaClass.getIcon() == null)
            return;
        if (metaClass.getIcon().trim().equals("")) {
            error("Icon path must be specified.", metaClass, SprayPackage.Literals.META_CLASS__ICON, null);
            return;
        }
        URI uri = metaClass.eResource().getURI();
        if (!uri.isPlatformResource()) {
            return;
        }
        final String projectName = uri.segment(1);
        IPath iconFolderPath = new Path(projectName).append("icons");
        IFolder folder = root.getFolder(iconFolderPath);
        if (folder.exists()) {
            IPath iconPath = iconFolderPath.append(metaClass.getIcon());
            IFile iconFile = root.getFile(iconPath);
            if (!iconFile.exists()) {
                warning("Icon '" + iconPath.removeFirstSegments(1) + "' not found.", metaClass, SprayPackage.Literals.META_CLASS__ICON, IssueCodes.FOLDER_ICON_MISSING, iconFolderPath.toString());
            } else {
                if (!validIconFileExtensions.contains(iconFile.getFileExtension())) {
                    warning("Unkown icon file extension #" + iconFile.getFileExtension() + "'.", metaClass, SprayPackage.Literals.META_CLASS__ICON, null);
                }
            }
            // TODO Check that there is no other image file in the same folder with a different extension
        } else {
            error("Folder 'icons' does not exist.", metaClass, SprayPackage.Literals.META_CLASS__ICON, IssueCodes.FOLDER_ICON_MISSING, iconFolderPath.toString());
        }
    }

}
