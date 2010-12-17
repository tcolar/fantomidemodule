/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.wizard;

import javax.swing.JFileChooser;
import net.colar.netbeans.fan.platform.FanPlatform;

/*
 * Panel for Fan options.
 * Generated using panel maker / wizard in netbeans.
 *
 * @author thibautc
 */
public class FanGlobalSettingsPanel extends javax.swing.JPanel
{

	private final JFileChooser chooser;
	private final FanGlobalSettingsController controller;

	/** Creates new form FanGlobalSettingsPanel */
	public FanGlobalSettingsPanel(FanGlobalSettingsController ctrl)
	{
		controller = ctrl;
		initComponents();
		chooser = new JFileChooser();
		chooser.setMultiSelectionEnabled(false);
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.setApproveButtonText("Select");
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeLabel = new javax.swing.JLabel();
        homeBrowse = new javax.swing.JButton();
        homeField = new javax.swing.JTextField();
        errorLabel = new javax.swing.JLabel();
        debugLabel = new javax.swing.JLabel();
        debugField = new javax.swing.JTextField();
        execLabel = new javax.swing.JLabel();
        execField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        talesLbl = new javax.swing.JLabel();
        talesField = new javax.swing.JTextField();
        talesButton = new javax.swing.JButton();

        homeLabel.setText(org.openide.util.NbBundle.getMessage(FanGlobalSettingsPanel.class, "FanGlobalSettingsPanel.homeLabel.text")); // NOI18N

        homeBrowse.setText(org.openide.util.NbBundle.getMessage(FanGlobalSettingsPanel.class, "FanGlobalSettingsPanel.homeBrowse.text")); // NOI18N
        homeBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBrowseActionPerformed(evt);
            }
        });

        homeField.setText(org.openide.util.NbBundle.getMessage(FanGlobalSettingsPanel.class, "FanGlobalSettingsPanel.homeField.text")); // NOI18N
        homeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                homeFieldKeyReleased(evt);
            }
        });

        errorLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setText(org.openide.util.NbBundle.getMessage(FanGlobalSettingsPanel.class, "FanGlobalSettingsPanel.errorLabel.text")); // NOI18N

        debugLabel.setText(org.openide.util.NbBundle.getMessage(FanGlobalSettingsPanel.class, "FanGlobalSettingsPanel.debugLabel.text")); // NOI18N

        debugField.setText(org.openide.util.NbBundle.getMessage(FanGlobalSettingsPanel.class, "FanGlobalSettingsPanel.debugField.text")); // NOI18N
        debugField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                debugFieldKeyReleased(evt);
            }
        });

        execLabel.setText(org.openide.util.NbBundle.getMessage(FanGlobalSettingsPanel.class, "FanGlobalSettingsPanel.execLabel.text")); // NOI18N

        execField.setText(org.openide.util.NbBundle.getMessage(FanGlobalSettingsPanel.class, "FanGlobalSettingsPanel.execField.text")); // NOI18N
        execField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                execFieldKeyReleased(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setForeground(new java.awt.Color(194, 135, 27));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(2);
        jTextArea1.setText(org.openide.util.NbBundle.getMessage(FanGlobalSettingsPanel.class, "FanGlobalSettingsPanel.jTextArea1.text")); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        talesLbl.setText(org.openide.util.NbBundle.getMessage(FanGlobalSettingsPanel.class, "FanGlobalSettingsPanel.talesLbl.text")); // NOI18N

        talesField.setText(org.openide.util.NbBundle.getMessage(FanGlobalSettingsPanel.class, "FanGlobalSettingsPanel.talesField.text")); // NOI18N

        talesButton.setText(org.openide.util.NbBundle.getMessage(FanGlobalSettingsPanel.class, "FanGlobalSettingsPanel.talesButton.text")); // NOI18N
        talesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talesButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                    .add(errorLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(debugLabel)
                            .add(execLabel)
                            .add(homeLabel))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(homeField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(homeBrowse))
                            .add(layout.createSequentialGroup()
                                .add(debugField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(20, 20, 20))
                            .add(execField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)))
                    .add(layout.createSequentialGroup()
                        .add(talesLbl)
                        .add(30, 30, 30)
                        .add(talesField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(talesButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(homeLabel)
                    .add(homeBrowse)
                    .add(homeField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(debugLabel)
                    .add(debugField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(execLabel)
                    .add(execField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(talesLbl)
                    .add(talesField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(talesButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 63, Short.MAX_VALUE)
                .add(errorLabel)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeBrowseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_homeBrowseActionPerformed
    {//GEN-HEADEREND:event_homeBrowseActionPerformed
		int val = chooser.showDialog(this, "Select");
		if (val == JFileChooser.APPROVE_OPTION)
		{
			homeField.setText(chooser.getSelectedFile().getPath());
			controller.changed();
		}
    }//GEN-LAST:event_homeBrowseActionPerformed

    private void homeFieldKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_homeFieldKeyReleased
    {//GEN-HEADEREND:event_homeFieldKeyReleased
		controller.changed();
    }//GEN-LAST:event_homeFieldKeyReleased

	private void debugFieldKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_debugFieldKeyReleased
	{//GEN-HEADEREND:event_debugFieldKeyReleased
		controller.changed();
	}//GEN-LAST:event_debugFieldKeyReleased

	private void execFieldKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_execFieldKeyReleased
	{//GEN-HEADEREND:event_execFieldKeyReleased
		controller.changed();
	}//GEN-LAST:event_execFieldKeyReleased

        private void talesButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_talesButtonActionPerformed
        {//GEN-HEADEREND:event_talesButtonActionPerformed
		int val = chooser.showDialog(this, "Select");
		if (val == JFileChooser.APPROVE_OPTION)
		{
			talesField.setText(chooser.getSelectedFile().getPath());
			controller.changed();
		}
        }//GEN-LAST:event_talesButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField debugField;
    private javax.swing.JLabel debugLabel;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTextField execField;
    private javax.swing.JLabel execLabel;
    private javax.swing.JButton homeBrowse;
    private javax.swing.JTextField homeField;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton talesButton;
    private javax.swing.JTextField talesField;
    private javax.swing.JLabel talesLbl;
    // End of variables declaration//GEN-END:variables

	public boolean valid()
	{
		boolean valid = FanPlatform.checkFanHome(homeField.getText());
		if (!valid)
		{
			errorLabel.setText("Fantom Home is invalid!");
		} else
		{
			boolean validDebug=false;
			try
			{
				Integer port=new Integer(debugField.getText());
				validDebug=true;
			}catch(NumberFormatException e){}
			if(!validDebug)
			{
				errorLabel.setText("Invalid Debugger port.");
			}
			else
			{
				//valid
				errorLabel.setText("");
			}
		}
		return valid;
	}

	void setFanHome(String home)
	{
		if (home == null)
		{
			home = "";
		}
		homeField.setText(home);
	}

	String getFanHome()
	{
		return homeField.getText();
	}

	void setTalesHome(String home)
	{
		if (home == null)
		{
			home = "";
		}
		talesField.setText(home);
	}

	String getTalesHome()
	{
		return talesField.getText();
	}

	String getDebugPort()
	{
		return debugField.getText();
	}

	String getRunOptions()
	{
		return execField.getText();
	}

	void setDebugPort(String port)
	{
		debugField.setText(port);
	}

	void setRunOptions(String options)
	{
		execField.setText(options);
	}
}
