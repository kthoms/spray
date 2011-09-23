package org.eclipselabs.spray.xtext.ui.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com.google.inject.Inject;

public class SprayMultiPageEditor extends MultiPageEditorPart {
    @Inject
    private XtextEditor                  xtextEditor;
    private SprayGeneratorPropertiesForm generatorPropertiesForm;
    @Inject
    private TextEditor                   generatorPropertiesEditor;
    @Inject
    private IWorkspaceRoot               root;

    public static final String           ID = "org.eclipselabs.spray.xtext.ui.editor.SprayMultiPageEditor"; //$NON-NLS-1$

    public SprayMultiPageEditor() {
    }

    @Override
    protected void createPages() {
        IFile sprayFile = (IFile) getEditorInput().getAdapter(IFile.class);
        setPartName(sprayFile.getFullPath().removeFileExtension().lastSegment());
        try {
            addPage(xtextEditor, getEditorInput());
            setPageText(0, sprayFile.getName());
        } catch (PartInitException e) {
            e.printStackTrace();
        }
        generatorPropertiesForm = new SprayGeneratorPropertiesForm(SprayGeneratorPropertiesForm.class.getName(), "Generator Settings");
        try {
            IFile propertiesFile = root.getFile(sprayFile.getFullPath().removeFileExtension().addFileExtension("properties"));
            FileEditorInput input = propertiesFile.exists() ? new FileEditorInput(propertiesFile) : null;
            addPage(generatorPropertiesEditor, input);
            setPageText(1, propertiesFile.getName());
        } catch (PartInitException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean isSaveAsAllowed() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void doSave(IProgressMonitor monitor) {
        // TODO Auto-generated method stub
    }

    @Override
    public void doSaveAs() {
        // TODO Auto-generated method stub
    }

}
