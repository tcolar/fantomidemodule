/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FanTalesProjectPanel1.java
 *
 * Created on 2-Dec-2010, 10:04:32 AM
 */
package net.colar.netbeans.fan.wizard;

import java.io.File;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import net.colar.netbeans.fan.platform.FanPlatform;

/**
 *
 * @author thibautc
 */
public class FanTalesProjectPanel1 extends javax.swing.JPanel
{

    private final FanTalesProjectWizardPanel1 parent;
    private final JFileChooser chooser;
    public final static Pattern VALID_NAME = Pattern.compile("[ a-zA-Z0-9_-]+");

    /** Creates new form FanTalesProjectPanel1 */
    public FanTalesProjectPanel1(FanTalesProjectWizardPanel1 parent)
    {
        initComponents();

        this.parent = parent;

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

        locationLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        folderLabel = new javax.swing.JLabel();
        projectName = new javax.swing.JTextField();
        location = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        folder = new javax.swing.JTextField();
        errorLabel = new javax.swing.JLabel();

        locationLabel.setText(org.openide.util.NbBundle.getMessage(FanTalesProjectPanel1.class, "FanTalesProjectPanel1.locationLabel.text")); // NOI18N

        nameLabel.setText(org.openide.util.NbBundle.getMessage(FanTalesProjectPanel1.class, "FanTalesProjectPanel1.nameLabel.text")); // NOI18N

        folderLabel.setText(org.openide.util.NbBundle.getMessage(FanTalesProjectPanel1.class, "FanTalesProjectPanel1.folderLabel.text")); // NOI18N

        projectName.setText(org.openide.util.NbBundle.getMessage(FanTalesProjectPanel1.class, "FanTalesProjectPanel1.projectName.text")); // NOI18N
        projectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectNameActionPerformed(evt);
            }
        });
        projectName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                projectNameKeyReleased(evt);
            }
        });

        location.setText(org.openide.util.NbBundle.getMessage(FanTalesProjectPanel1.class, "FanTalesProjectPanel1.location.text")); // NOI18N
        location.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                locationKeyReleased(evt);
            }
        });

        browseButton.setText(org.openide.util.NbBundle.getMessage(FanTalesProjectPanel1.class, "FanTalesProjectPanel1.browseButton.text")); // NOI18N
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        folder.setEditable(false);
        folder.setText(org.openide.util.NbBundle.getMessage(FanTalesProjectPanel1.class, "FanTalesProjectPanel1.folder.text")); // NOI18N

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setText(org.openide.util.NbBundle.getMessage(FanTalesProjectPanel1.class, "FanTalesProjectPanel1.errorLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(folderLabel)
                            .addComponent(locationLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(location, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addGap(12, 12, 12)
                                .addComponent(browseButton))
                            .addComponent(projectName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(folder, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(projectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(browseButton)
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(folder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(folderLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(errorLabel)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void projectNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_projectNameActionPerformed
    {//GEN-HEADEREND:event_projectNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectNameActionPerformed

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_browseButtonActionPerformed
    {//GEN-HEADEREND:event_browseButtonActionPerformed
        int val = chooser.showDialog(this, "Select");
        if (val == JFileChooser.APPROVE_OPTION)
        {
            location.setText(chooser.getSelectedFile().getPath());
            updateFolder();
        }
    }//GEN-LAST:event_browseButtonActionPerformed

    private void projectNameKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_projectNameKeyReleased
    {//GEN-HEADEREND:event_projectNameKeyReleased
        // TODO add your handling code here:
        updateFolder();
    }//GEN-LAST:event_projectNameKeyReleased

    private void locationKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_locationKeyReleased
    {//GEN-HEADEREND:event_locationKeyReleased
        // TODO add your handling code here:
        updateFolder();
    }//GEN-LAST:event_locationKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTextField folder;
    private javax.swing.JLabel folderLabel;
    private javax.swing.JTextField location;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField projectName;
    // End of variables declaration//GEN-END:variables

    private void updateFolder()
    {
        String dir = location.getText();
        dir += (dir.endsWith(File.separator) ? "" : File.separator) + projectName.getText();
        folder.setText(dir);
        // will recheck that it's valid
        parent.fireChangeEvent();
    }

    private boolean checkName(String text)
    {
        if (text == null || text.length() == 0)
        {
            return false;
        }
        return VALID_NAME.matcher(text).matches();
    }

    String getProjectLocation()
    {
        return location.getText();
    }

    String getProjectName()
    {
        return projectName.getText();
    }

    @Override
    public boolean isValid()
    {
        if (folder == null)
        {
            return false;
        }

        String loc = location.getText();
        String dir = folder.getText();
        String err = "";

        if(! FanPlatform.getInstance().isTalesPresent())
        {
            err="Tales framework is not installed!";
        }

        if (loc == null || loc.length() < 1)
        {
            err = "Please choose a location.";
        } else
        {
            File locF = new File(loc);
            if (!locF.exists() || !locF.isDirectory() || !locF.canWrite())
            {
                err = "Location must be an existing, writable directory.";
            } else
            {
                String name = projectName.getText();
                if (!checkName(name))
                {
                    err = "Please enter a valid project name.";
                } else if (new File(dir).exists())
                {
                    err = "This folder already exists.";
                }
            }
        }
        errorLabel.setText(err);
        return err.length() == 0;
    }
}