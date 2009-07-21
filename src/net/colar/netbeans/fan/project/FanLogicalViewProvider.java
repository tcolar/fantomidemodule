/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

import java.awt.Image;
import org.netbeans.spi.project.ui.LogicalViewProvider;
import org.netbeans.spi.project.ui.support.CommonProjectActions;
import org.netbeans.spi.project.ui.support.NodeFactorySupport;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Node;
import org.openide.util.ImageUtilities;
import org.openide.util.Mutex.Action;

/**
 *
 * @author thibautc
 */
public class FanLogicalViewProvider /*implements LogicalViewProvider*/
{
/*
    private final FanProject project;

    public FanLogicalViewP(FanProject project) {
        this.project = project;
    }

    @Override
    public Node createLogicalView() {
        return new RootNode(project);
    }

    private static final class RootNode extends AbstractNode {

        public static final String DEMO_PROJECT_ICON_PATH =
                "org/netbeans/demo/project/icon.png";

        public static final String REGISTERED_NODE_LOCATION =
                "Projects/org-netbeans-demo-project-DemoProject/Nodes";

        final DemoProject project;

        public RootNode(DemoProject project) {
            super(NodeFactorySupport.createCompositeChildren
                    (project, REGISTERED_NODE_LOCATION));
            this.project = project;
            setIconBaseWithExtension(DEMO_PROJECT_ICON_PATH);
        }

        @Override
        public Action[] getActions(boolean arg0) {
            Action[] nodeActions = new Action[7];
            nodeActions[0] = CommonProjectActions.newFileAction();
            nodeActions[1] = CommonProjectActions.copyProjectAction();
            nodeActions[2] = CommonProjectActions.deleteProjectAction();
            nodeActions[5] = CommonProjectActions.setAsMainProjectAction();
            nodeActions[6] = CommonProjectActions.closeProjectAction();
            return nodeActions;
        }

        @Override
        public Image getIcon(int type) {
            return ImageUtilities.loadImage(DEMO_PROJECT_ICON_PATH);
        }

        @Override
        public Image getOpenedIcon(int type) {
            return getIcon(type);
        }

        @Override
        public String getDisplayName() {
            return project.getProjectDirectory().getName();
        }
    }

    @Override
    public Node findPath(Node root, Object target) {
        //leave unimplemented for now
        return null;
    }
*/
}

