/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.wizard;

import java.io.File;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

/*
 * New Fan project/pod wizard panel
 *
 * @author thibautc
 */
public final class FanPodPanel1 extends JPanel
{

    private final String dir;
    private static final String DEFAULT_PRJ = "FanPrj1";
    private static final String DEFAULT_POD = "default";
    private final JFileChooser chooser;
    public final static Pattern VALID_NAME=Pattern.compile("[ a-zA-Z0-9_-]+");
    private FanPodWizardPanel1 parent;

    public FanPodPanel1(FanPodWizardPanel1 parent, String dir)
    {
	super();
	this.parent=parent;
	initComponents();
	nameField.setText(DEFAULT_PRJ);
	this.dir = dir;
	locationField.setText(dir);
	String loc = dir + (dir.endsWith(File.separator) ? "" : File.separator) + DEFAULT_PRJ;
	folderField.setText(loc);
	nameField.setText("");
	podDescField.setText("");
	chooser = new JFileChooser();
	chooser.setMultiSelectionEnabled(false);
	chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	chooser.setApproveButtonText("Select");
    }

    @Override
    public String getName()
    {
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
        buildFileCheckbox = new javax.swing.JCheckBox();
        podDescLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        locationField = new javax.swing.JTextField();
        podDescField = new javax.swing.JTextField();
        folderField = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();

        org.openide.awt.Mnemonics.setLocalizedText(nameLabel, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.nameLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(locationLabel, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.locationLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(folderLabel, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.folderLabel.text")); // NOI18N

        buildFileCheckbox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(buildFileCheckbox, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.buildFileCheckbox.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(podDescLabel, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.podDescLabel.text")); // NOI18N

        nameField.setText(org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.nameField.text")); // NOI18N
        nameField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                nameFieldCaretUpdate(evt);
            }
        });
        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameFieldKeyReleased(evt);
            }
        });

        locationField.setText(org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.locationField.text")); // NOI18N
        locationField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                locationFieldCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        locationField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                locationFieldKeyReleased(evt);
            }
        });

        podDescField.setText(org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.podDescField.text")); // NOI18N
        podDescField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                podDescFieldCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        podDescField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                podDescFieldKeyReleased(evt);
            }
        });

        folderField.setEditable(false);
        folderField.setText(org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.folderField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(browseButton, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.browseButton.text")); // NOI18N
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        errorLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        org.openide.awt.Mnemonics.setLocalizedText(errorLabel, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.errorLabel.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(podDescLabel)
                            .addComponent(nameLabel)
                            .addComponent(locationLabel)
                            .addComponent(folderLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(locationField, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(browseButton))
                            .addComponent(folderField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(podDescField, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)))
                    .addComponent(buildFileCheckbox))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(podDescLabel)
                    .addComponent(podDescField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buildFileCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(errorLabel))
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

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_browseButtonActionPerformed
    {//GEN-HEADEREND:event_browseButtonActionPerformed
	int val = chooser.showDialog(this, "Select");
	if (val == JFileChooser.APPROVE_OPTION)
	{
	    locationField.setText(chooser.getSelectedFile().getPath());
	    updateFolder();
	}
    }//GEN-LAST:event_browseButtonActionPerformed

    private void nameFieldCaretUpdate(javax.swing.event.CaretEvent evt)//GEN-FIRST:event_nameFieldCaretUpdate
    {//GEN-HEADEREND:event_nameFieldCaretUpdate
    }//GEN-LAST:event_nameFieldCaretUpdate

    private void locationFieldCaretPositionChanged(java.awt.event.InputMethodEvent evt)//GEN-FIRST:event_locationFieldCaretPositionChanged
    {//GEN-HEADEREND:event_locationFieldCaretPositionChanged
    }//GEN-LAST:event_locationFieldCaretPositionChanged

    private void podDescFieldCaretPositionChanged(java.awt.event.InputMethodEvent evt)//GEN-FIRST:event_podDescFieldCaretPositionChanged
    {//GEN-HEADEREND:event_podDescFieldCaretPositionChanged
    }//GEN-LAST:event_podDescFieldCaretPositionChanged

    private void nameFieldKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nameFieldKeyReleased
    {//GEN-HEADEREND:event_nameFieldKeyReleased
	String name=nameField.getText();
	podDescField.setText(name);
	updateFolder();
    }//GEN-LAST:event_nameFieldKeyReleased

    private void locationFieldKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_locationFieldKeyReleased
    {//GEN-HEADEREND:event_locationFieldKeyReleased
	// TODO add your handling code here:
	updateFolder();
    }//GEN-LAST:event_locationFieldKeyReleased

    private void podDescFieldKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_podDescFieldKeyReleased
    {//GEN-HEADEREND:event_podDescFieldKeyReleased
	// TODO add your handling code here:
	updateFolder();
    }//GEN-LAST:event_podDescFieldKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JCheckBox buildFileCheckbox;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTextField folderField;
    private javax.swing.JLabel folderLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField locationField;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField podDescField;
    private javax.swing.JLabel podDescLabel;
    // End of variables declaration//GEN-END:variables

    // custom
    public boolean isValid()
    {
	if (folderField == null)
	{
	    return false;
	}
	String loc = locationField.getText();
	String folder=folderField.getText();
	String err = "";
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
		String name = nameField.getText();
		if (!checkName(name))
		{
		    err = "Please enter a valid project name.";
		} else if (new File(folder).exists())
		{
		    err = "This folder already exists.";
		}
		else if(buildFileCheckbox.isSelected())
		{
		    if(!checkName(podDescField.getText()))
			err="Pod name contains invalid characters";
		}
	    }
	}
	errorLabel.setText(err);
	return err.length() == 0;
    }

    private void updateFolder()
    {
	String dir=locationField.getText();
	dir+=(dir.endsWith(File.separator)?"":File.separator)+nameField.getText();
	folderField.setText(dir);
	// will recheck that it's valid
	parent.fireChangeEvent();
    }

    private boolean checkName(String text)
    {
	return VALID_NAME.matcher(text).matches();
    }

    String getProjectFolder()
    {
	return folderField.getText();
    }

    String getProjectName()
    {
	return nameField.getText();
    }

    String getPodName()
    {
	if(!buildFileCheckbox.isSelected())
	    return null;
	return podDescField.getText();
    }

    String getPodDesc()
    {
	return podDescField.getText();
    }

    boolean getCreateBuildFile()
    {
	return buildFileCheckbox.isSelected();
    }

}

