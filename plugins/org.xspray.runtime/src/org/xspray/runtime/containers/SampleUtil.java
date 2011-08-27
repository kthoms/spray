/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2005, 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SAP AG - initial API, implementation and documentation
 *
 * </copyright>
 *
 *******************************************************************************/
package org.xspray.runtime.containers;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.PropertySheet;

public class SampleUtil {

    private static final String    PROPERTY_SHEET_ID = "org.eclipse.ui.views.PropertySheet";

    static protected PropertySheet sheet             = null;

    static public void openPropertyView() {
        try {
            PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(PROPERTY_SHEET_ID);
        } catch (PartInitException e) {
            // TODO Auto-generated catch block
            System.out.println("SampleUtil:: Failed to open property view.");
            e.printStackTrace();
        }
    }

    /**
     * Opens an simple input dialog with OK and Cancel buttons.
     * <p>
     * 
     * @param dialogTitle
     *            the dialog title, or <code>null</code> if none
     * @param dialogMessage
     *            the dialog message, or <code>null</code> if none
     * @param initialValue
     *            the initial input value, or <code>null</code> if none
     *            (equivalent to the empty string)
     * @return the string
     */
    public static String askString(String dialogTitle, String dialogMessage, String initialValue) {
        String ret = null;
        Shell shell = getShell();
        InputDialog inputDialog = new InputDialog(shell, dialogTitle, dialogMessage, initialValue, null);
        int retDialog = inputDialog.open();
        if (retDialog == Window.OK) {
            ret = inputDialog.getValue();
        }
        return ret;
    }

    public static boolean confirmDialog(String dialogTitle, String dialogMessage) {
        Shell shell = getShell();
        MessageDialog dialog = new MessageDialog(shell, dialogTitle, (Image) null, dialogMessage, MessageDialog.NONE, new String[]{IDialogConstants.YES_LABEL, IDialogConstants.NO_LABEL}, 0) {
            protected int getShellStyle() {
                return super.getShellStyle() | SWT.SHEET;
            }
        };
        // ensure yes is the default

        return dialog.open() == 0;
    }

    public static void infoString(String dialogTitle, String dialogMessage) {
        Shell shell = getShell();
        MessageDialog.openError(shell, dialogTitle, dialogMessage);
    }

    /**
     * Opens a dialog to change the color.
     * 
     * @param color
     *            the color to change
     * @return the changed color
     */
    public static Color editColor(Color color) {
        if (color != null && color.eContainer() instanceof Diagram) {
            Shell shell = getShell();
            ColorDialog colorDialog = new ColorDialog(shell);
            colorDialog.setText("choose color");
            colorDialog.setRGB(new RGB(color.getRed(), color.getGreen(), color.getBlue()));

            RGB retRgb = colorDialog.open();
            if (retRgb == null) {
                return null;
            }

            Diagram diagram = (Diagram) color.eContainer();
            Color newColor = Graphiti.getGaService().manageColor(diagram, retRgb.red, retRgb.green, retRgb.blue);
            return newColor;

        }

        return null;
    }

    /**
     * Returns the currently active Shell.
     * 
     * @return The currently active Shell.
     */
    private static Shell getShell() {
        return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
    }

    /**
     * @param obj
     * @param d
     * @param modelExtension
     * @throws CoreException
     * @throws IOException
     */
    public static void saveToModelFile(final EObject obj, final Diagram d, String modelExtension) throws CoreException, IOException {
        URI uri = d.eResource().getURI();
        uri = uri.trimFragment();
        uri = uri.trimFileExtension();
        uri = uri.appendFileExtension(modelExtension);
        ResourceSet rSet = d.eResource().getResourceSet();
        final IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        IResource file = workspaceRoot.findMember(uri.toPlatformString(true));
        if (file == null || !file.exists()) {
            Resource createResource = rSet.createResource(uri);
            createResource.save(new HashMap());
            createResource.setTrackingModification(true);
        }
        final Resource resource = rSet.getResource(uri, true);
        resource.getContents().add(obj);
    }
}
