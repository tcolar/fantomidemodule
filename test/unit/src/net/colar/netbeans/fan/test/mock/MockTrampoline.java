/*
 * Thibaut Colar Jan 29, 2010
 */
package net.colar.netbeans.fan.test.mock;

import java.beans.PropertyChangeListener;
import java.util.concurrent.Future;
import org.netbeans.api.project.Project;
import org.netbeans.modules.project.uiapi.OpenProjectsTrampoline;

/**
 *
 * @author thibautc
 */
public class MockTrampoline implements OpenProjectsTrampoline
{

	public Project[] getOpenProjectsAPI()
	{
		return null;
	}

	public void openAPI(Project[] prjcts, boolean bln, boolean bln1)
	{
	}

	public void closeAPI(Project[] prjcts)
	{
	}

	public void addPropertyChangeListenerAPI(PropertyChangeListener pl, Object o)
	{
	}

	public Future<Project[]> openProjectsAPI()
	{
		return null;
	}

	public void removePropertyChangeListenerAPI(PropertyChangeListener pl)
	{
	}

	public Project getMainProject()
	{
		return null;
	}

	public void setMainProject(Project prjct)
	{
	}
}

