package org.eclipselabs.spray.examples.one.tests;

import java.util.Arrays;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.eclipse.gef.finder.SWTBotGefTestCase;
import org.eclipse.swtbot.swt.finder.finders.UIThreadRunnable;
import org.eclipse.swtbot.swt.finder.results.VoidResult;
import org.eclipse.swtbot.swt.finder.waits.Conditions;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.junit.After;
import org.junit.Before;

public abstract class AbstractUITest extends SWTBotGefTestCase {
    @Before
    public void setUp() throws Exception {
        SWTBotView view = bot.activeView();
        if (view != null && view.getTitle().equals("Welcome")) {
            view.close();
        }
    }

    protected void createNewProject(String projectName) {
        bot.viewByTitle("Package Explorer").menu("New").click();
        SWTBotShell shell = bot.shell("New");
        shell.activate();
        SWTBotTreeItem treeItem = bot.tree().expandNode("Spray");
        treeItem.select("Xspray Project");
        // press "Next >"
        bot.button(1).click();
        // enter project name
        bot.text(0).setText(projectName);
        bot.button("Finish").click();
        bot.waitUntil(Conditions.shellCloses(shell), 20000);
    }

    protected SWTBotTreeItem selectFolderNode(String... folder) {
        SWTBotView packageExplorer = bot.viewByTitle("Package Explorer");
        SWTBotTree treeViewer = packageExplorer.bot().tree();
        return openNodePathFromTree(treeViewer, folder).select();
    }

    protected SWTBotTreeItem openNodePathFromTree(SWTBotTree treeViewer, String... path) {
        int length = path.length;
        SWTBotTreeItem item = null;
        if (length > 0) {
            SWTBotTreeItem rootItem = getNodeUnderTree(treeViewer, path[0]);
            String[] childPath = Arrays.copyOfRange(path, 1, length);
            item = openNodePathFromNode(rootItem, childPath);
        }
        return item;
    }

    protected SWTBotTreeItem openNodePathFromNode(SWTBotTreeItem startItem, String... path) {
        return openNode(startItem, path, 0, path.length);
    }

    private SWTBotTreeItem openNode(SWTBotTreeItem item, String[] path, int i, int max) {
        if (i < max) {
            SWTBotTreeItem childItem = expandParentNodeAndGetChildNode(item, path[i]);
            item = openNode(childItem, path, i + 1, max);
        }
        return item;
    }

    protected SWTBotTreeItem getNodeUnderTree(SWTBotTree tree, String childNodeName) {
        return tree.getTreeItem(childNodeName);
    }

    protected SWTBotTreeItem expandParentNodeAndGetChildNode(SWTBotTreeItem parentNode, String childNodeName) {
        expandNode(parentNode);
        return parentNode.getNode(childNodeName);
    }

    protected void expandNode(SWTBotTreeItem item) {
        item.expand();
        bot.sleep(1000);
    }

    public void destroy() {
        UIThreadRunnable.syncExec(new VoidResult() {
            public void run() {
                resetWorkbench();
            }
        });
    }

    private void resetWorkbench() {
        try {
            IWorkbench workbench = PlatformUI.getWorkbench();
            IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
            IWorkbenchPage page = workbenchWindow.getActivePage();
            Shell activeShell = Display.getCurrent().getActiveShell();
            if (activeShell != null && activeShell != workbenchWindow.getShell()) {
                activeShell.close();
            }
            page.closeAllEditors(false);
            String defaultPerspectiveId = workbench.getPerspectiveRegistry().getDefaultPerspective();
            workbench.showPerspective(defaultPerspectiveId, workbenchWindow);
            page.resetPerspective();
        } catch (WorkbenchException e) {
            throw new RuntimeException(e);
        }
    }

    @After
    public void tearDown() throws Exception {
        // SWTBotTreeItem projectNode = selectFolderNode(getProjectName());
        // projectNode.contextMenu("Delete");
        // try {
        // bot.checkBox().select();
        // bot.button("OK").click();
        // } catch(WidgetNotFoundException e) {
        // e.printStackTrace();
        // }
        destroy();
    }

    protected abstract String getProjectName();
}
