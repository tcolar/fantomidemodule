/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FanGlobalSettingsPanel.java
 *
 * Created on 25-Jul-2009, 10:22:10 PM
 */
package net.colar.netbeans.fan.wizard;

import javax.swing.JFileChooser;
import net.colar.netbeans.fan.platform.FanPlatform;

/**
 *
 * @author tcolar
 */
public class FanGlobalSettingsPanel extends javax.swing.JPanel
{

    private final JFileChooser chooser;
    private final FanGlobalSettingsController controller;

    /** Creates new form FanGlobalSettingsPanel */
    public FanGlobalSettingsPanel(FanGlobalSettingsController ctrl)
    {
	controller=ctrl;
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeLabel)
                .addGap(18, 18, 18)
                .addComponent(homeField, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homeBrowse)
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
                .addContainerGap(259, Short.MAX_VALUE))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton homeBrowse;
    private javax.swing.JTextField homeField;
    private javax.swing.JLabel homeLabel;
    // End of variables declaration//GEN-END:variables

    public boolean valid()
    {
	return FanPlatform.checkFanHome(homeField.getText());
    }
}
