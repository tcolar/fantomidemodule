/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.wizard;

import javax.swing.JPanel;

public final class FanVisualPanel1 extends JPanel {

    /** Creates new form FanVisualPanel1 */
    public FanVisualPanel1() {
        initComponents();
    }

    @Override
    public String getName() {
        return "New Fan Project";
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        folderLabel = new javax.swing.JLabel();
        mainCheckbox = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        podCheckbox = new javax.swing.JCheckBox();
        podLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        locationField = new javax.swing.JTextField();
        folderField = new javax.swing.JTextField();
        podField = new javax.swing.JTextField();
        podFolderLabel = new javax.swing.JLabel();
        podFolderField = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();

        org.openide.awt.Mnemonics.setLocalizedText(nameLabel, org.openide.util.NbBundle.getMessage(FanVisualPanel1.class, "FanVisualPanel1.nameLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(locationLabel, org.openide.util.NbBundle.getMessage(FanVisualPanel1.class, "FanVisualPanel1.locationLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(folderLabel, org.openide.util.NbBundle.getMessage(FanVisualPanel1.class, "FanVisualPanel1.folderLabel.text")); // NOI18N

        mainCheckbox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(mainCheckbox, org.openide.util.NbBundle.getMessage(FanVisualPanel1.class, "FanVisualPanel1.mainCheckbox.text")); // NOI18N
        mainCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainCheckboxActionPerformed(evt);
            }
        });

        podCheckbox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(podCheckbox, org.openide.util.NbBundle.getMessage(FanVisualPanel1.class, "FanVisualPanel1.podCheckbox.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(podLabel, org.openide.util.NbBundle.getMessage(FanVisualPanel1.class, "FanVisualPanel1.podLabel.text")); // NOI18N

        nameField.setText(org.openide.util.NbBundle.getMessage(FanVisualPanel1.class, "FanVisualPanel1.nameField.text")); // NOI18N

        locationField.setText(org.openide.util.NbBundle.getMessage(FanVisualPanel1.class, "FanVisualPanel1.locationField.text")); // NOI18N

        folderField.setEditable(false);
        folderField.setText(org.openide.util.NbBundle.getMessage(FanVisualPanel1.class, "FanVisualPanel1.folderField.text")); // NOI18N

        podField.setText(org.openide.util.NbBundle.getMessage(FanVisualPanel1.class, "FanVisualPanel1.podField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(podFolderLabel, org.openide.util.NbBundle.getMessage(FanVisualPanel1.class, "FanVisualPanel1.podFolderLabel.text")); // NOI18N

        podFolderField.setEditable(false);
        podFolderField.setText(org.openide.util.NbBundle.getMessage(FanVisualPanel1.class, "FanVisualPanel1.podFolderField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(browseButton, org.openide.util.NbBundle.getMessage(FanVisualPanel1.class, "FanVisualPanel1.browseButton.text")); // NOI18N
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(mainCheckbox)
                    .addComponent(podCheckbox)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(locationLabel)
                            .addComponent(folderLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(folderField, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(locationField, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(browseButton))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(podLabel)
                            .addComponent(podFolderLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(podFolderField, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(podField, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationLabel)
                    .addComponent(locationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(folderLabel)
                    .addComponent(folderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(podCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(podLabel)
                    .addComponent(podField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(podFolderLabel)
                    .addComponent(podFolderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mainCheckboxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mainCheckboxActionPerformed
    {//GEN-HEADEREND:event_mainCheckboxActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_mainCheckboxActionPerformed

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_browseButtonActionPerformed
    {//GEN-HEADEREND:event_browseButtonActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_browseButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JTextField folderField;
    private javax.swing.JLabel folderLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField locationField;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JCheckBox mainCheckbox;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JCheckBox podCheckbox;
    private javax.swing.JTextField podField;
    private javax.swing.JTextField podFolderField;
    private javax.swing.JLabel podFolderLabel;
    private javax.swing.JLabel podLabel;
    // End of variables declaration//GEN-END:variables
}

