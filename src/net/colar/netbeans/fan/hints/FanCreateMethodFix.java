/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.hints;

import java.awt.EventQueue;
import java.awt.Frame;
import net.colar.netbeans.fan.parboiled.AstNode;
import org.netbeans.modules.csl.api.HintFix;
import org.openide.windows.WindowManager;

/**
 *
 * @author thibautc
 */
class FanCreateMethodFix implements HintFix
{

    private final AstNode node;
    private final String method;

    public FanCreateMethodFix(AstNode node, String method)
    {
        this.node=node;
        this.method=method;
    }

    public String getDescription()
    {
        return "Create Local Method: " + method;
    }

    public void implement() throws Exception
    {
        // Need to use eventqueueu to avoid AWT threading warning/bugs
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                Frame win = WindowManager.getDefault().getMainWindow();
                FanAddMethodDialog d = new FanAddMethodDialog(win, node, method);
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
