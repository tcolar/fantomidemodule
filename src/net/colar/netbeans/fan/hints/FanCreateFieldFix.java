/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.hints;

import java.awt.EventQueue;
import java.awt.Frame;
import net.colar.netbeans.fan.FanParserTask;
import net.colar.netbeans.fan.parboiled.AstNode;
import org.netbeans.modules.csl.api.HintFix;
import org.openide.filesystems.FileUtil;
import org.openide.windows.WindowManager;

/**
 *
 * @author thibautc
 */
class FanCreateFieldFix implements HintFix
{

    private final AstNode node;
    private final String field;

    public FanCreateFieldFix(AstNode node, String field)
    {
        this.node=node;
        this.field=field;
    }

    public String getDescription()
    {
        return "Create Local Field: " + field;
    }

    public void implement() throws Exception
    {
        // Need to use eventqueueu to avoid AWT threading warning/bugs
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                Frame win = WindowManager.getDefault().getMainWindow();
                FanAddFieldDialog d = new FanAddFieldDialog(win, node, field);
                d.setLocationRelativeTo(win);
                d.pack();
                d.setVisible(true);
            }
        });
    }

    public boolean isSafe()
    {
        return true;
    }

    public boolean isInteractive()
    {
        return true;
    }
}
