/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

/**
 * Node Factory: creates teh nodes for a project
 * @author thibautc
 */

// This annotation will register this factory with Netbeans
/*@NodeFactory.Registration(projectType = "net-colar-netbeans-fan-project-FanProject", position = 200)
public class FanNodeFactory implements NodeFactory
{

    public FanNodeFactory()
    {
    }

    @Override
    public NodeList createNodes(Project prj)
    {
	FanNode nd = (FanNode)getNode(prj,prj.getProjectDirectory());
	FanNode.enhanceNodeTree(nd);
	return NodeFactorySupport.fixedNodeList(nd);
    }

    public Node getNode(Project project, FileObject dir)
    {
	FileObject[] children = dir.getChildren();
	FanNode[] nodes = new FanNode[children.length];
	for (int i = 0; i != children.length; i++)
	{
	    nodes[i] = (FanNode)getNode(project, children[i]);
	}
	Children childs = Children.LEAF;
	if (nodes.length > 0)
	{
	    childs = new Children.Array();
	    childs.add(nodes);
	}
	FanNode nd = new FanNode(project, dir, childs);
	return nd;

    }

}
*/













/*
 *            final List<Action> actions = new ArrayList<Action>();
            actions.add(CommonProjectActions.newFileAction());
            actions.add(null);
//            The action provider is not done yet
//            actions.add(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_BUILD, bundle.getString("LBL_BuildAction_Name"), null)); // NOI18N
//            actions.add(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_REBUILD, bundle.getString("LBL_RebuildAction_Name"), null)); // NOI18N
//            actions.add(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_CLEAN, bundle.getString("LBL_CleanAction_Name"), null)); // NOI18N
//            actions.add(ProjectSensitiveActions.projectCommandAction(JavaProjectConstants.COMMAND_JAVADOC, bundle.getString("LBL_JavadocAction_Name"), null)); // NOI18N
//            actions.add(null);
            actions.add(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_RUN, NbBundle.getMessage(PythonLogicalView.class, "LBL_RunAction_Name"), null)); // NOI18N
            actions.add(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_DEBUG, NbBundle.getMessage(PythonLogicalView.class, "LBL_DebugAction_Name"), null)); // NOI18N
            actions.add(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_TEST, NbBundle.getMessage(PythonLogicalView.class, "LBL_TestAction_Name"), null)); // NOI18N
            actions.add(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_BUILD, NbBundle.getMessage(PythonLogicalView.class, "LBL_BuildAction_Name"), null)); // NOI18N
            actions.add(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_REBUILD, NbBundle.getMessage(PythonLogicalView.class, "LBL_CleanBuildAction_Name"), null)); // NOI18N

//            actions.addAll(Utilities.actionsForPath("Projects/Debugger_Actions_temporary")); //NOI18N
//            actions.addAll(Utilities.actionsForPath("Projects/Profiler_Actions_temporary")); //NOI18N
//            actions.add(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_TEST, bundle.getString("LBL_TestAction_Name"), null)); // NOI18N
            actions.add(null);

            actions.add(CoverageActionFactory.createCollectorAction(null, null));
            actions.add(null);

            actions.add(CommonProjectActions.setAsMainProjectAction());
            actions.add(CommonProjectActions.openSubprojectsAction());
            actions.add(CommonProjectActions.closeProjectAction());
            actions.add(null);
            actions.add(CommonProjectActions.renameProjectAction());
            actions.add(CommonProjectActions.moveProjectAction());
            actions.add(CommonProjectActions.copyProjectAction());
            actions.add(CommonProjectActions.deleteProjectAction());
            actions.add(null);
            actions.add(new ChangePackageViewTypeAction());
            actions.add(null);
            actions.add(SystemAction.get(FindAction.class));

            // honor 57874 contact
            actions.addAll(Utilities.actionsForPath("Projects/Actions")); //NOI18N

            actions.add(null);
            actions.add(CommonProjectActions.customizeProjectAction());
            return actions.toArray(new Action[actions.size()]);
 */
