/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.actions;

import net.colar.netbeans.fan.project.FanProject;

/**
 * Debug a tales project
 * @author thibautc
 */
public class DebugTalesProjectAction extends RunTalesProjectAction
{
        public static String COMMAND_DEBUG_WITH_TALES = "COMMAND_DEBUG_WITH_TALES";

        public DebugTalesProjectAction(FanProject prj)
        {
            super(prj);
            debug = true;
        }

    @Override
    public String getCommandId()
    {
        return COMMAND_DEBUG_WITH_TALES;
    }
}
