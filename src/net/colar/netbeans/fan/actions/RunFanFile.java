/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.actions;

import net.colar.netbeans.fan.FanTokenID;
import net.colar.netbeans.fan.project.FanNode;
import net.colar.netbeans.fan.project.FanProject;
import org.netbeans.spi.project.ActionProvider;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.nodes.Node;
import org.openide.util.Lookup;

public class RunFanFile extends Command
{
    //PythonPlatformManager manager = PythonPlatformManager.getInstance();

    protected boolean isTest;

    public RunFanFile(FanProject project, boolean isTest)
    {
	super(project);
	this.isTest = isTest;
    }

    @Override
    public String getCommandId()
    {
	return ActionProvider.COMMAND_RUN_SINGLE;
    }

    @Override
    public void invokeAction(Lookup context) throws IllegalArgumentException
    {
	Node[] activatedNodes = getSelectedNodes();
	/*
	 * The node has my Fannode in it, which has file path
	 * but can't get to it(private)
	 * Have to do some layered context bs .. but that's not working either
	*/
	DataObject gdo = activatedNodes[0].getLookup().lookup(DataObject.class);
	FileObject file = gdo.getPrimaryFile();
	if (file.getMIMEType().equals(FanTokenID.FAN_MIME_TYPE))
	{
	    String path = FileUtil.toFile(file.getParent()).getAbsolutePath();
	    String script = FileUtil.toFile(file).getAbsolutePath();

	    final FanProject pyProject = getProject();

	    //String target = FileUtil.getRelativePath(getRoot(project.getSourceRoots().getRoots(),file), file);
            /*if (isTest || file.getName().endsWith("_test")) { // NOI18N

	    // See if this looks like a test file; if not, see if we can find its corresponding
	    // test
	    boolean isTestFile = (file.getName().endsWith("_test"));
	    if (!isTestFile) {
	    for (FileObject testRoot : pyProject.getTestSourceRootFiles()) {
	    if (FileUtil.isParentOf(testRoot, file)) {
	    isTestFile = true;
	    break;
	    }
	    }
	    }
	    if (!isTestFile) {
	    // Try to find the matching test
	    LocationResult result = new GotoTest().findTest(file, -1);
	    if (result != null && result.getFileObject() != null) {
	    file = result.getFileObject();
	    }
	    }

	    // Run test normally - don't pop up browser
	    TestRunner testRunner = PythonActionProvider.getTestRunner(TestRunner.TestType.PY_UNIT);
	    if (testRunner != null) {
	    testRunner.getInstance().runTest(file, false);
	    return;
	    }
	    }
	     */
	    FanExecution pyexec = new FanExecution();
	    pyexec.setDisplayName(gdo.getName());
	    pyexec.setWorkingDirectory(path);
	    /*if(PythonOptions.getInstance().getPromptForArgs()){
	    String args =  JOptionPane.showInputDialog("Enter the args for this script.", "");
	    pyexec.setScriptArgs(args);

	    }*/
	    /*final PythonPlatform platform = checkProjectPythonPlatform(pyProject);
	    if ( platform == null )
	    return ; // invalid platform user has been warn in check so safe to return
	    pyexec.setCommand(platform.getInterpreterCommand());
	    pyexec.setScript(script);
	    pyexec.setCommandArgs(platform.getInterpreterArgs());
	    pyexec.setPath(PythonPlatform.buildPath(super.buildPythonPath(platform, pyProject)));
	    pyexec.setJavaPath(PythonPlatform.buildPath(super.buildJavaPath(platform, pyProject)));
	    pyexec.setShowControls(true);
	    pyexec.setShowInput(true);
	    pyexec.setShowWindow(true);
	    pyexec.addStandardRecognizers();

	    PythonCoverageProvider coverageProvider = PythonCoverageProvider.get(pyProject);
	    if (coverageProvider != null && coverageProvider.isEnabled()) {
	    pyexec = coverageProvider.wrapWithCoverage(pyexec);
	    }
	     */
	    pyexec.run();
	}
    }

    @Override
    public boolean isActionEnabled(Lookup context) throws IllegalArgumentException
    {
	boolean results = false; //super.enable(activatedNodes);
	Node[] activatedNodes = getSelectedNodes();
	System.err.println("Actie nodes: "+activatedNodes.length);
	if (activatedNodes != null && activatedNodes.length > 0)
	{
	System.err.println("lookups : "+activatedNodes[0].getLookup().toString());
	    DataObject gdo = activatedNodes[0].getLookup().lookup(DataObject.class);
	    if (gdo != null && gdo.getPrimaryFile() != null)
	    {
		results = gdo.getPrimaryFile().getMIMEType().equals(
			FanTokenID.FAN_MIME_TYPE);
	    }
	}
	return results;
    }
}
