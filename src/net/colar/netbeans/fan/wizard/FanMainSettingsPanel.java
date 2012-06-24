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
public class FanMainSettingsPanel extends javax.swing.JPanel
{

	private final JFileChooser chooser;
	private final FanMainSettingsController controller;

	/** Creates new form FanGlobalSettingsPanel */
	public FanMainSettingsPanel(FanMainSettingsController ctrl)
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

        homeLabel.setText(org.openide.util.NbBundle.getMessage(FanMainSettingsPanel.class, "FanMainSettingsPanel.homeLabel.text")); // NOI18N

        homeBrowse.setText(org.openide.util.NbBundle.getMessage(FanMainSettingsPanel.class, "FanMainSettingsPanel.homeBrowse.text")); // NOI18N
        homeBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBrowseActionPerformed(evt);
            }
        });

        homeField.setText(org.openide.util.NbBundle.getMessage(FanMainSettingsPanel.class, "FanMainSettingsPanel.homeField.text")); // NOI18N
        homeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                homeFieldKeyReleased(evt);
            }
        });

        errorLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setText(org.openide.util.NbBundle.getMessage(FanMainSettingsPanel.class, "FanMainSettingsPanel.errorLabel.text")); // NOI18N

        debugLabel.setText(org.openide.util.NbBundle.getMessage(FanMainSettingsPanel.class, "FanMainSettingsPanel.debugLabel.text")); // NOI18N

        debugField.setText(org.openide.util.NbBundle.getMessage(FanMainSettingsPanel.class, "FanMainSettingsPanel.debugField.text")); // NOI18N
        debugField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                debugFieldKeyReleased(evt);
            }
        });

        execLabel.setText(org.openide.util.NbBundle.getMessage(FanMainSettingsPanel.class, "FanMainSettingsPanel.execLabel.text")); // NOI18N

        execField.setText(org.openide.util.NbBundle.getMessage(FanMainSettingsPanel.class, "FanMainSettingsPanel.execField.text")); // NOI18N
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
        jTextArea1.setText(org.openide.util.NbBundle.getMessage(FanMainSettingsPanel.class, "FanMainSettingsPanel.jTextArea1.text")); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                    .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(debugLabel)
                            .addComponent(execLabel)
                            .addComponent(homeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(homeField, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(homeBrowse))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(debugField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addComponent(execField, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeLabel)
                    .addComponent(homeBrowse)
                    .addComponent(homeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(debugLabel)
                    .addComponent(debugField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(execLabel)
                    .addComponent(execField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(errorLabel)
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
