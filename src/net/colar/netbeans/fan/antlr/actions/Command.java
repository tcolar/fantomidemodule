/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.antlr.actions;

import javax.swing.JOptionPane;
import net.colar.netbeans.fan.project.FanProject;
import org.openide.nodes.Node;
import org.openide.util.Lookup;
import org.openide.windows.TopComponent;

/**
 * @author Radek Matous
 * @author Tomas Zezula
 */
public abstract class Command {


    private final FanProject project;

    public Command(FanProject project) {
        this.project = project;
        assert project != null;
    }

    public abstract String getCommandId();

    public abstract void invokeAction(Lookup context) throws IllegalArgumentException;

    public abstract boolean isActionEnabled(Lookup context) throws IllegalArgumentException;

    public boolean asyncCallRequired() {
        return true;
    }

    public boolean saveRequired() {
        return true;
    }

    public final FanProject getProject() {
        return project;
    }
    public Node[] getSelectedNodes(){
        return TopComponent.getRegistry().getCurrentNodes();
    }

    protected void showLaunchError( String message ){
      JOptionPane.showMessageDialog(null,message ,"Python Launch Error", JOptionPane.ERROR_MESSAGE);

    }


    /**
     * used by children to handle sever launched errors
     * @param errMessage
     */
    /*protected PythonPlatform checkProjectPythonPlatform( PythonProject pyProject ){
       PythonPlatform platform = PythonProjectUtil.getActivePlatform(pyProject);
       if ( platform == null ) {
         // Better to inform the user than try to use a default unsuited
         String platformId = pyProject.getEvaluator().getProperty(PythonProjectProperties.ACTIVE_PLATFORM);
         showLaunchError( "selected project has broken python platform : " +
                           platformId +
                           " => bind to an existing python platform in project's properties "
                         );
       }
       return platform ;
    }*/



    /**
     *
     * provide a reasonable common Build of PYTHONPATH for Run or Debug commands
     *
     * @param platform current platform
     * @param project current project
     * @return PythonPath FileList
     */
    /*protected ArrayList<String> buildPythonPath( PythonPlatform platform , PythonProject project ) {
      final ArrayList<String> pythonPath = new ArrayList<String>() ;
      // start with platform
      pythonPath.addAll(platform.getPythonPath());
      for (FileObject fo : project.getSourceRoots().getRoots()) {
        File f = FileUtil.toFile(fo);
        pythonPath.add(f.getAbsolutePath());
      }
      pythonPath.addAll(getProperties().getPythonPath());
      return pythonPath ;
    }*/

    /**
     *
     * provide a reasonable common Build of JAVAPATH for Run or Debug Jython commands
     * @param platform current platform
     * @param project current project
     * @return JavaPath fileList for jython CLASSPATH command
     */
    /*protected ArrayList<String> buildJavaPath( PythonPlatform platform , PythonProject project ) {
      final ArrayList<String> javaPath = new ArrayList<String>() ;
      // start with platform
      javaPath.addAll(platform.getJavaPath());
      javaPath.addAll(getProperties().getJavaPath());
      return javaPath ;
    }*/

}