/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.wizard;

import java.io.File;
import java.util.regex.Pattern;
import java.util.TreeSet;
import java.util.SortedSet;
import java.util.Set;
import java.util.HashSet;

import net.colar.netbeans.fan.platform.FanPlatform;

import java.awt.Window;
import java.awt.Dialog;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultListModel;
import javax.swing.tree.*;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.SwingWorker;
import javax.swing.SwingUtilities;
import org.openide.util.NbBundle;

/*
 * New Fan project/pod wizard panel
 *
 * @author thibautc
 */
public final class FanPodPanel1 extends JPanel
{

        public FanPodPanel1(FanPodWizardPanel1 parent, String directory)
	{
		super();
		this.parent = parent;
		initComponents();
                dependencies.put("sys", "1.0");
                dependenciesTable.setModel(new DefaultTableModel(
                    new Object [][] {
                        {"sys", "1.0"}
                    }   ,
                    new String [] {
                        "PodFile", "Version"
                    }
                ));

		nameField.setText(DEFAULT_PRJ);
		this.dir = directory.replaceAll(File.pathSeparator, "/");
		locationField.setText(dir);
		String loc = this.dir + (this.dir.endsWith("/") ? "" : "/") + DEFAULT_PRJ;
		folderField.setText(loc);
		podDescField.setText("");
                podVersionField.setText("");
                outputDirectoryField.setText("lib/fan/");
                indexList.setModel(new DefaultListModel());
                metaList.setModel(new DefaultListModel());
                initTree(sourceDirectoryTree, this.dir, sourceDirs);
                initTree(resourceDirectoryTree, this.dir, resourceDirs);
                
                browseButton.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.browseButton.tooltip"));
                dependenciesTable.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.dependenciesTable.tooltip"));
                docApiCheckBox.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.docApiCheckBox.tooltip"));
                docSrcCheckBox.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.docSrcCheckBox.tooltip"));
                editListButton.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.editListButton.tooltip"));
                folderField.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.folderField.tooltip"));
                indexEditButton.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.indexEditButton.tooltip"));
                indexList.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.indexList.tooltip"));
                locationField.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.locationField.tooltip"));
                mainClassCheckbox.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.mainClassCheckbox.tooltip"));
                mainClassField.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.mainClassField.tooltip"));
                metaList.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.metaList.tooltip"));
                nameField.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.nameField.tooltip"));
                outDirButton.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.outDirButton.tooltip"));
                outputDirectoryBrowseButton.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.outputDirectoryBrowseButton.tooltip"));
                outputDirectoryField.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.outputDirectoryField.tooltip"));
                podDescField.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.podDescField.tooltip"));
                podVersionField.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.podVersionField.tooltip"));
                resDirsButton.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.resDirsButton.tooltip"));
                resourceDefaultButton.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.resourceDefaultButton.tooltip"));
                resourceDirectoryBrowseButton.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.resourceDirectoryBrowseButton.tooltip"));
                resourceDirectoryTree.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.resourceDirectoryTree.tooltip"));
                sourceDefaultButton.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.sourceDefaultButton.tooltip"));
                sourceDirectoryBrowseButton.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.sourceDirectoryBrowseButton.tooltip"));
                sourceDirectoryTree.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.sourceDirectoryTree.tooltip"));
                dependenciesButton.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.dependenciesButton.tooltip"));
                nextPageButton.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.nextPageButton.tooltip"));
                previousPageButton.setToolTipText(NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.prevPageButton.tooltip"));
                resDirsButton.setSelected(true);
                outDirButton.setSelected(true);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        podInfoPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        folderLabel = new javax.swing.JLabel();
        podDescLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        locationField = new javax.swing.JTextField();
        podDescField = new javax.swing.JTextField();
        folderField = new javax.swing.JTextField();
        errorLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        mainClassCheckbox = new javax.swing.JCheckBox();
        mainClassLabel = new javax.swing.JLabel();
        mainClassField = new javax.swing.JTextField();
        podVersionLabel = new javax.swing.JLabel();
        podVersionField = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        pathsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sourceDirectoryTree = new javax.swing.JTree();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resourceDirectoryTree = new javax.swing.JTree();
        jLabel3 = new javax.swing.JLabel();
        outputDirectoryField = new javax.swing.JTextField();
        outputDirectoryBrowseButton = new javax.swing.JButton();
        resourceDirectoryBrowseButton = new javax.swing.JButton();
        sourceDirectoryBrowseButton = new javax.swing.JButton();
        docApiCheckBox = new javax.swing.JCheckBox();
        docSrcCheckBox = new javax.swing.JCheckBox();
        sourceDefaultButton = new javax.swing.JButton();
        resourceDefaultButton = new javax.swing.JButton();
        outDirButton = new javax.swing.JCheckBox();
        resDirsButton = new javax.swing.JCheckBox();
        dependencyPanel = new javax.swing.JPanel();
        dependenciesScrollPane = new javax.swing.JScrollPane();
        dependenciesTable = new javax.swing.JTable();
        dependenciesLabel = new javax.swing.JLabel();
        dependenciesButton = new javax.swing.JButton();
        indexLabel = new javax.swing.JLabel();
        indexScrollPane = new javax.swing.JScrollPane();
        indexList = new javax.swing.JList();
        indexEditButton = new javax.swing.JButton();
        metaLabel = new javax.swing.JLabel();
        metaScrollPane = new javax.swing.JScrollPane();
        metaList = new javax.swing.JList();
        editListButton = new javax.swing.JButton();
        nextPageButton = new javax.swing.JButton();
        previousPageButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(600, 400));

        podInfoPanel.setName("podVersionField"); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(nameLabel, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.nameLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(locationLabel, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.locationLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(folderLabel, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.folderLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(podDescLabel, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.podDescLabel.text")); // NOI18N

        nameField.setText(org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.nameField.text")); // NOI18N
        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameFieldKeyReleased(evt);
            }
        });

        locationField.setText(org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.locationField.text")); // NOI18N
        locationField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                locationFieldKeyReleased(evt);
            }
        });

        podDescField.setText(org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.podDescField.text")); // NOI18N
        podDescField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                podDescFieldKeyReleased(evt);
            }
        });

        folderField.setEditable(false);
        folderField.setText(org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.folderField.text")); // NOI18N

        errorLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        org.openide.awt.Mnemonics.setLocalizedText(errorLabel, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.errorLabel.text")); // NOI18N

        mainClassCheckbox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(mainClassCheckbox, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.mainClassCheckbox.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(mainClassLabel, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.mainClassLabel.text_1")); // NOI18N

        mainClassField.setText(org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.mainClassField.text")); // NOI18N
        mainClassField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mainClassFieldKeyReleased(evt);
            }
        });

        podVersionLabel.setLabelFor(podVersionField);
        org.openide.awt.Mnemonics.setLocalizedText(podVersionLabel, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.podVersionLabel.text_1")); // NOI18N

        podVersionField.setText(org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.podVersionField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(browseButton, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.browseButton.text")); // NOI18N
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout podInfoPanelLayout = new org.jdesktop.layout.GroupLayout(podInfoPanel);
        podInfoPanel.setLayout(podInfoPanelLayout);
        podInfoPanelLayout.setHorizontalGroup(
            podInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(podInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(podInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(errorLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                    .add(podInfoPanelLayout.createSequentialGroup()
                        .add(podInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, locationLabel)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, podInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, podInfoPanelLayout.createSequentialGroup()
                                    .add(podInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(nameLabel)
                                        .add(folderLabel)
                                        .add(podVersionLabel)
                                        .add(podDescLabel)
                                        .add(mainClassLabel))
                                    .add(48, 48, 48)
                                    .add(podInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(mainClassField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                                        .add(podInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                            .add(org.jdesktop.layout.GroupLayout.LEADING, podVersionField)
                                            .add(org.jdesktop.layout.GroupLayout.LEADING, podDescField)
                                            .add(org.jdesktop.layout.GroupLayout.LEADING, podInfoPanelLayout.createSequentialGroup()
                                                .add(locationField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 320, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .add(browseButton))
                                            .add(org.jdesktop.layout.GroupLayout.LEADING, nameField)
                                            .add(org.jdesktop.layout.GroupLayout.LEADING, folderField))))
                                .add(org.jdesktop.layout.GroupLayout.LEADING, mainClassCheckbox)))
                        .add(59, 59, 59))
                    .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 531, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        podInfoPanelLayout.setVerticalGroup(
            podInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(podInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(podInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(nameLabel)
                    .add(nameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(podInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(locationLabel)
                    .add(locationField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(browseButton))
                .add(18, 18, 18)
                .add(podInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(folderField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(folderLabel))
                .add(18, 18, 18)
                .add(podInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(podDescLabel)
                    .add(podDescField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(podInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(podVersionField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(podVersionLabel))
                .add(18, 18, 18)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(5, 5, 5)
                .add(mainClassCheckbox, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(podInfoPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(mainClassField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(mainClassLabel))
                .add(261, 261, 261)
                .add(errorLabel)
                .addContainerGap())
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.podInfoPanel.TabConstraints.tabTitle"), podInfoPanel); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.jLabel1.text_1")); // NOI18N

        jScrollPane1.setViewportView(sourceDirectoryTree);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.jLabel2.text")); // NOI18N

        jScrollPane2.setViewportView(resourceDirectoryTree);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.jLabel3.text")); // NOI18N

        outputDirectoryField.setText(org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.outputDirectoryField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(outputDirectoryBrowseButton, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.outputDirectoryBrowseButton.text")); // NOI18N
        outputDirectoryBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputDirectoryBrowseButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(resourceDirectoryBrowseButton, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.resourceDirectoryBrowseButton.text")); // NOI18N
        resourceDirectoryBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resourceDirectoryBrowseButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(sourceDirectoryBrowseButton, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.sourceDirectoryBrowseButton.text")); // NOI18N
        sourceDirectoryBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceDirectoryBrowseButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(docApiCheckBox, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.docApiCheckBox.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(docSrcCheckBox, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.docSrcCheckBox.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(sourceDefaultButton, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.sourceDefaultButton.text")); // NOI18N
        sourceDefaultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceDefaultButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(resourceDefaultButton, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.resourceDefaultButton.text")); // NOI18N
        resourceDefaultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resourceDefaultButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(outDirButton, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.outDirButton.text")); // NOI18N
        outDirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outDirButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(resDirsButton, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.resDirsButton.text")); // NOI18N
        resDirsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resDirsButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout pathsPanelLayout = new org.jdesktop.layout.GroupLayout(pathsPanel);
        pathsPanel.setLayout(pathsPanelLayout);
        pathsPanelLayout.setHorizontalGroup(
            pathsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pathsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(pathsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(resDirsButton)
                    .add(pathsPanelLayout.createSequentialGroup()
                        .add(pathsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(pathsPanelLayout.createSequentialGroup()
                                .add(jLabel2)
                                .add(45, 45, 45)
                                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                            .add(pathsPanelLayout.createSequentialGroup()
                                .add(jLabel1)
                                .add(62, 62, 62)
                                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 273, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(outDirButton)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, pathsPanelLayout.createSequentialGroup()
                                .add(jLabel3)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 74, Short.MAX_VALUE)
                                .add(outputDirectoryField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 276, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(pathsPanelLayout.createSequentialGroup()
                                .add(46, 46, 46)
                                .add(docApiCheckBox)
                                .add(69, 69, 69)
                                .add(docSrcCheckBox)))
                        .add(18, 18, 18)
                        .add(pathsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(pathsPanelLayout.createSequentialGroup()
                                .add(outputDirectoryBrowseButton)
                                .add(241, 241, 241))
                            .add(pathsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, resourceDirectoryBrowseButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, resourceDefaultButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(sourceDirectoryBrowseButton)
                            .add(sourceDefaultButton))))
                .addContainerGap())
        );
        pathsPanelLayout.setVerticalGroup(
            pathsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pathsPanelLayout.createSequentialGroup()
                .add(pathsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pathsPanelLayout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(jLabel1))
                    .add(pathsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(pathsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(pathsPanelLayout.createSequentialGroup()
                                .add(sourceDirectoryBrowseButton)
                                .add(18, 18, 18)
                                .add(sourceDefaultButton))
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(resDirsButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(pathsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2)
                    .add(pathsPanelLayout.createSequentialGroup()
                        .add(resourceDirectoryBrowseButton)
                        .add(14, 14, 14)
                        .add(resourceDefaultButton))
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pathsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(pathsPanelLayout.createSequentialGroup()
                        .add(outDirButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(pathsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(outputDirectoryField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel3)))
                    .add(outputDirectoryBrowseButton))
                .add(18, 18, 18)
                .add(pathsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(docSrcCheckBox)
                    .add(docApiCheckBox))
                .add(24, 24, 24))
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.pathsPanel.TabConstraints.tabTitle"), pathsPanel); // NOI18N

        dependenciesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dependenciesScrollPane.setViewportView(dependenciesTable);

        org.openide.awt.Mnemonics.setLocalizedText(dependenciesLabel, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.dependenciesLabel.text_1")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(dependenciesButton, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.dependenciesButton.text")); // NOI18N
        dependenciesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dependenciesButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(indexLabel, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.indexLabel.text")); // NOI18N

        indexList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        indexScrollPane.setViewportView(indexList);

        org.openide.awt.Mnemonics.setLocalizedText(indexEditButton, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.indexEditButton.text")); // NOI18N
        indexEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indexEditButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(metaLabel, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.metaLabel.text")); // NOI18N

        metaList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        metaScrollPane.setViewportView(metaList);

        org.openide.awt.Mnemonics.setLocalizedText(editListButton, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.editListButton.text")); // NOI18N
        editListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editListButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout dependencyPanelLayout = new org.jdesktop.layout.GroupLayout(dependencyPanel);
        dependencyPanel.setLayout(dependencyPanelLayout);
        dependencyPanelLayout.setHorizontalGroup(
            dependencyPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(dependencyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(dependencyPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(dependenciesLabel)
                    .add(indexLabel)
                    .add(metaLabel))
                .add(18, 18, 18)
                .add(dependencyPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(indexScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, dependenciesScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .add(metaScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(dependencyPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(editListButton)
                    .add(indexEditButton)
                    .add(dependenciesButton))
                .addContainerGap())
        );
        dependencyPanelLayout.setVerticalGroup(
            dependencyPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(dependencyPanelLayout.createSequentialGroup()
                .add(dependencyPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(dependencyPanelLayout.createSequentialGroup()
                        .add(27, 27, 27)
                        .add(dependencyPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(dependenciesButton)
                            .add(dependenciesScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(dependencyPanelLayout.createSequentialGroup()
                        .add(50, 50, 50)
                        .add(dependenciesLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(18, 18, 18)
                .add(dependencyPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(indexLabel)
                    .add(indexEditButton)
                    .add(indexScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(17, 17, 17)
                .add(dependencyPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(metaLabel)
                    .add(dependencyPanelLayout.createSequentialGroup()
                        .add(1, 1, 1)
                        .add(dependencyPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(editListButton)
                            .add(metaScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.dependencyPanel.TabConstraints.tabTitle"), dependencyPanel); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(nextPageButton, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.nextPageButton.text")); // NOI18N
        nextPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPageButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(previousPageButton, org.openide.util.NbBundle.getMessage(FanPodPanel1.class, "FanPodPanel1.previousPageButton.text")); // NOI18N
        previousPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousPageButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(24, 24, 24)
                .add(previousPageButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 375, Short.MAX_VALUE)
                .add(nextPageButton)
                .add(27, 27, 27))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 571, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 366, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(17, 17, 17)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(previousPageButton)
                    .add(nextPageButton))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nameFieldKeyReleased
    {//GEN-HEADEREND:event_nameFieldKeyReleased
        String name = nameField.getText();
        podDescField.setText(name);
        updateFolder();
    }//GEN-LAST:event_nameFieldKeyReleased

    private void locationFieldKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_locationFieldKeyReleased
    {//GEN-HEADEREND:event_locationFieldKeyReleased
        updateFolder();
    }//GEN-LAST:event_locationFieldKeyReleased

    private void podDescFieldKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_podDescFieldKeyReleased
    {//GEN-HEADEREND:event_podDescFieldKeyReleased
        updateFolder();
    }//GEN-LAST:event_podDescFieldKeyReleased

	private void mainClassFieldKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_mainClassFieldKeyReleased
	{//GEN-HEADEREND:event_mainClassFieldKeyReleased
            updateFolder();
	}//GEN-LAST:event_mainClassFieldKeyReleased

        private void dependenciesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dependenciesButtonActionPerformed
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                @Override
                public Integer doInBackground() {
                    String outDir = FanPodPanel1.this.getOutputDirectory().replaceAll("`", "");
                    outDir = outDir.replaceAll(File.pathSeparator, "/");
                    final File f = new File(outDir);
                    final File[] directories = new File[] {
                        new File(FanPlatform.getInstance().buildSysPodPath()),
                        new File((f.exists() && f.isAbsolute()) ? outDir : getProjectFolder() + "/" + outDir )
                    };

                    final java.awt.Window window = SwingUtilities.getWindowAncestor(FanPodPanel1.this);
                    final FanPodDependencyPanel podChooser;

                    if (window instanceof java.awt.Frame) {
                        podChooser = new FanPodDependencyPanel((java.awt.Frame) window, "Select Dependencies");
                    }
                    else {
                        podChooser = new FanPodDependencyPanel((java.awt.Dialog) window, "Select Dependencies");
                    }
                    int val = podChooser.showDialog(directories, dependencies);
                    if (val == JFileChooser.APPROVE_OPTION)
                    {
                        dependencies.clear();
                        dependencies.putAll(podChooser.getSelected());
                        final StringBuilder sb = new StringBuilder();
                        for (Map.Entry<String,String> s : dependencies.entrySet()) {
                            if (sb.length() != 0) {
                                sb.append(", ");
                            }
                            sb.append(s.getKey());
                            sb.append(' ');
                            sb.append(s.getValue());
                        }
                        setDependencies(sb.toString());
                    }
                    return 0;
                }
            };
            sw.execute();
        }//GEN-LAST:event_dependenciesButtonActionPerformed

        private void indexEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indexEditButtonActionPerformed
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                @Override
                public Integer doInBackground() {
                    SortedSet<String> set = new TreeSet<String>();
                    final DefaultListModel model = (DefaultListModel)indexList.getModel();
                    for (int i = 0; i < model.getSize(); i++) {
                        set.add(model.get(i).toString());
                    }
                    final Window window = SwingUtilities.getWindowAncestor(FanPodPanel1.this);
                    final FanPodIndexForm podChooser = new FanPodIndexForm((Dialog)window, "Choose Index Values", true);
                    int val = podChooser.showDialog(set);
                    if (val == FanPodIndexForm.APPROVE_OPTION)
                    {
                        set = podChooser.getValues();
                        model.clear();
                        int i = 0;
                        for (String str : set) {
                            model.add(i++, str);
                        }
                    }
                    return 0;
                }
            };
            sw.execute();
        }//GEN-LAST:event_indexEditButtonActionPerformed

        private void editListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editListButtonActionPerformed
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                @Override
                public Integer doInBackground() {
                    SortedSet<String> set = new TreeSet<String>();
                    final DefaultListModel model = (DefaultListModel)metaList.getModel();
                    for (int i = 0; i < model.getSize(); i++) {
                        set.add(model.get(i).toString());
                    }
                    final Window window = SwingUtilities.getWindowAncestor(FanPodPanel1.this);
                    final FanPodIndexForm podChooser = new FanPodIndexForm((Dialog)window, "Choose Meta Values", true);
                    int val = podChooser.showDialog(set);
                    if (val == FanPodIndexForm.APPROVE_OPTION)
                    {
                        set = podChooser.getValues();
                        model.clear();
                        int i = 0;
                        for (String str : set) {
                            model.add(i++, str);
                        }
                    }
                    return 0;
                }
            };
            sw.execute();
        }//GEN-LAST:event_editListButtonActionPerformed

        private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    final JFileChooser chooser = new JFileChooser();
                    chooser.setMultiSelectionEnabled(false);
                    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                    chooser.setApproveButtonText("Select");
                    int val = chooser.showDialog(FanPodPanel1.this, "Select");
                    if (val == JFileChooser.APPROVE_OPTION)
                    {
                        String s = chooser.getSelectedFile().getPath().replaceAll(File.pathSeparator, "/");
                        if (!s.endsWith("/")) {
                            s += "/";
                        }
                        locationField.setText(s);
                        updateFolder();
                    }
                    return 0;
                }
            };
            sw.execute();
        }//GEN-LAST:event_browseButtonActionPerformed

        private void nextPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageButtonActionPerformed
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    currentTab++;
                    if (currentTab > MAX_TAB) {
                        currentTab = MIN_TAB;
                    }
                    jTabbedPane1.setSelectedIndex(currentTab);
                    return 0;
                }
            };
            sw.execute();
        }//GEN-LAST:event_nextPageButtonActionPerformed

        private void previousPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousPageButtonActionPerformed
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    currentTab--;
                    if (currentTab < MIN_TAB) {
                        currentTab = MAX_TAB;
                    }
                    jTabbedPane1.setSelectedIndex(currentTab);
                    return 0;
                }
            };
            sw.execute();
        }//GEN-LAST:event_previousPageButtonActionPerformed

        private void sourceDirectoryBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceDirectoryBrowseButtonActionPerformed
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    String l = folderField.getText().replaceAll(File.pathSeparator, "/");
                    if (!l.endsWith("/")) {
                        l += "/";
                    }
                    final java.awt.Window window = SwingUtilities.getWindowAncestor(FanPodPanel1.this);
                    final FanPodSourcesPanel podChooser;
                    if (window instanceof java.awt.Frame) {
                        podChooser = new FanPodSourcesPanel((java.awt.Frame) window, "Select Source Directories");
                    }
                    else {
                        podChooser = new FanPodSourcesPanel((java.awt.Dialog) window, "Select Source Directories");
                    }
                    int val = podChooser.showDialog(new File(folderField.getText()), sourceDirs);
                    if (val == JFileChooser.APPROVE_OPTION)
                    {
                        sourceDirs.clear();
                        sourceDirs.addAll(podChooser.getSelected());
                        final DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(l);
                        for (String s : sourceDirs) {
                            s = s.replaceAll(File.pathSeparator, "/");
                            s = s.replaceAll(l, "");
                            rootNode.add(new DefaultMutableTreeNode(s));
                        }
                        sourceDirectoryTree.setModel(new DefaultTreeModel(rootNode));
                    }
                    return 0;
                }
            };
            sw.execute();
        }//GEN-LAST:event_sourceDirectoryBrowseButtonActionPerformed

        private void resourceDirectoryBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resourceDirectoryBrowseButtonActionPerformed
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    String l = folderField.getText().replaceAll(File.pathSeparator, "/");
                    if (!l.endsWith("/")) {
                        l += "/";
                    }
                    final java.awt.Window window = SwingUtilities.getWindowAncestor(FanPodPanel1.this);
                    final FanPodSourcesPanel podChooser;
                    if (window instanceof java.awt.Frame) {
                        podChooser = new FanPodSourcesPanel((java.awt.Frame) window, "Select Resource Directories");
                    }
                    else {
                        podChooser = new FanPodSourcesPanel((java.awt.Dialog) window, "Select Resource Directories");
                    }
                    int val = podChooser.showDialog(new File(folderField.getText()), resourceDirs);
                    if (val == JFileChooser.APPROVE_OPTION)
                    {
                        resourceDirs.clear();
                        resourceDirs.addAll(podChooser.getSelected());
                        final DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(l);
                        for (String s : resourceDirs) {
                            s = s.replaceAll(File.pathSeparator, "/");
                            s = s.replaceAll(l, "");
                            rootNode.add(new DefaultMutableTreeNode(s));
                        }
                        resourceDirectoryTree.setModel(new DefaultTreeModel(rootNode));
                    }
                    return 0;
                }
            };
            sw.execute();
        }//GEN-LAST:event_resourceDirectoryBrowseButtonActionPerformed

        private void outputDirectoryBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputDirectoryBrowseButtonActionPerformed
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    String l = folderField.getText().replaceAll(File.pathSeparator, "/");
                    if (!l.endsWith("/")) {
                        l += "/";
                    }
                    final File p = new File(l);
                    if (!p.exists()) {
                        p.mkdirs();
                    }
                    final JFileChooser chooser = new JFileChooser();
                    chooser.setMultiSelectionEnabled(false);
                    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                    chooser.setApproveButtonText("Select");
                    int val = chooser.showDialog(FanPodPanel1.this, "Select");
                    if (val == JFileChooser.APPROVE_OPTION)
                    {
                        String s = chooser.getSelectedFile().getPath().replaceAll(File.pathSeparator, "/");
                        if (!s.endsWith("/")) {
                            s += "/";
                        }
                        if (!s.endsWith("lib/fan/")) {
                            s += "lib/fan/";
                        }
                        final File f = new File(s);
                        if (!f.exists()) {
                            f.mkdirs();
                        }
                        s = s.replaceAll(l,"");
                        outputDirectoryField.setText(s);
                        updateFolder();
                    }
                    return 0;
                }
            };
            sw.execute();
        }//GEN-LAST:event_outputDirectoryBrowseButtonActionPerformed

        private void sourceDefaultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceDefaultButtonActionPerformed
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    String l = folderField.getText().replaceAll(File.pathSeparator, "/");
                    if (!l.endsWith("/")) {
                        l += "/";
                    }
                    sourceDirs.clear();
                    final String[] dirs = { "fan/", "test/" };
                    for (String d : dirs) {
                        d = l + "/" + d;
                        final File f = new File(d);
                        if (!f.exists()) {
                            f.mkdirs();
                        }
                        sourceDirs.add(d);
                    }
                    final DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(l);
                    for (String str : sourceDirs) {
                        str = str.replaceAll(File.pathSeparator, "/");
                        str = str.replaceAll(l, "");
                        rootNode.add(new DefaultMutableTreeNode(str));
                    }
                    sourceDirectoryTree.setModel(new DefaultTreeModel(rootNode));
                    return 0;
                }
            };
            sw.execute();
        }//GEN-LAST:event_sourceDefaultButtonActionPerformed

        private void resourceDefaultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resourceDefaultButtonActionPerformed
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    String l = folderField.getText().replaceAll(File.pathSeparator, "/");
                    if (!l.endsWith("/")) {
                        l += "/";
                    }
                    resourceDirs.clear();
                    final String[] dirs = { "res/" };
                    for (String d : dirs) {
                        d = l + "/" + d;
                        final File f = new File(d);
                        if (!f.exists()) {
                            f.mkdirs();
                        }
                        resourceDirs.add(d);
                    }
                    final DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(l);
                    for (String str : resourceDirs) {
                        str = str.replaceAll(File.pathSeparator, "/");
                        str = str.replaceAll(l, "");
                        rootNode.add(new DefaultMutableTreeNode(str));
                    }
                    resourceDirectoryTree.setModel(new DefaultTreeModel(rootNode));
                    return 0;
                }
            };
            sw.execute();
        }//GEN-LAST:event_resourceDefaultButtonActionPerformed

        private void resDirsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resDirsButtonActionPerformed
            boolean b = resDirsButton.isSelected();
            resourceDirs.clear();
            resourceDirectoryTree.setEnabled(b);
            resourceDirectoryBrowseButton.setEnabled(b);
            resourceDefaultButton.setEnabled(b);
            updateFolder();
        }//GEN-LAST:event_resDirsButtonActionPerformed

        private void outDirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outDirButtonActionPerformed
            boolean b = outDirButton.isSelected();
            outputDirectoryField.setText("");
            outputDirectoryBrowseButton.setEnabled(b);
            outputDirectoryField.setEnabled(b);
        }//GEN-LAST:event_outDirButtonActionPerformed

	@Override
	public String getName()
	{
            return "New Fantom Project";
	}
        private void initTree(final javax.swing.JTree tree, final String path, final Set<String> set) {
            final DefaultMutableTreeNode node = new DefaultMutableTreeNode(path);
            node.add(new DefaultMutableTreeNode("(empty)"));
            tree.setModel(new DefaultTreeModel(node));
            set.clear();
        }
	// custom
        @Override
	public boolean isValid()
	{
		if (folderField == null)
		{
			return false;
		}
		String loc = locationField.getText();
		String folder = folderField.getText();
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
                                if (!checkName(podDescField.getText()))
                                {
                                        err = "Pod name contains invalid characters";
                                }
			}
			if (mainClassCheckbox.isSelected())
			{
				if (!checkName(mainClassField.getText()))
				{
					err = "Main class name is invalid";
				}
			}
		}
		errorLabel.setText(err);
		return err.length() == 0;
	}

	private void updateFolder()
	{
            dir = locationField.getText();
            dir += (dir.endsWith("/") ? "" : "/") + nameField.getText();
            folderField.setText(dir);
            initTree(sourceDirectoryTree, dir, sourceDirs);
            initTree(resourceDirectoryTree, dir, resourceDirs);
            // will recheck that it's valid
            parent.fireChangeEvent();
	}

	private boolean checkName(final String text)
	{
            if(text==null || text.length()==0) {
                return false;
            }
            return VALID_NAME.matcher(text).matches();
	}

	public String getProjectFolder()
	{
            return folderField.getText();
	}
        public void setProjectFolder(final String val) {
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    folderField.setText(val);
                    return 0;
                }
            };
            sw.execute();
        }
	public String getPodName()
	{
            return nameField.getText();
	}
        public void setPodName(final String val) {
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    nameField.setText(val);
                    return 0;
                }
            };
            sw.execute();
        }
	public String getPodDesc()
	{
            return podDescField.getText();
	}
        public void setPodDesc(final String val) {
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    podDescField.setText(val);
                    return 0;
                }
            };
            sw.execute();
        }
        public String getPodVersion() {
            return podVersionField.getText();
        }
        public void setPodVersion(final String val) {
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    podVersionField.setText(val);
                    return 0;
                }
            };
            sw.execute();
        }
        public String getOutputDirectory() {
            String s = outputDirectoryField.getText();
            if (null == s || "".equals(s)) {
                return "";
            }
            s = s.replaceAll(File.pathSeparator, "/");
            if (!s.endsWith("/")) {
                s += "/";
            }
            if (!s.endsWith("lib/fan/")) {
                s += "lib/fan/";
            }
            final File f = new File(s);
            if (!f.exists()) {
                f.mkdirs();
            }
            return "`" + s + "`";
        }
        public void setOutputDirectory(final String val) {
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    String s= val.replaceAll(File.pathSeparator, "/");
                    s = s.replaceAll("`","");
                    outputDirectoryField.setText(s);
                    boolean b = !"".equals(s);
                    outDirButton.setSelected(b);
                    outputDirectoryField.setEnabled(b);
                    outputDirectoryBrowseButton.setEnabled(b);
                    return 0;
                }
            };
            sw.execute();
        }
        public String getDependencies() {
            final StringBuilder sb = new StringBuilder();
            for (final Map.Entry<String,String> pair : dependencies.entrySet()) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append("\"");
                sb.append(pair.getKey());
                sb.append(" ");
                sb.append(pair.getValue());
                sb.append("\"");
            }
            return sb.toString();
        }
        public void setDependencies(final String val) {
            if (null == val) {
                return;
            }
            dependencies.clear();
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    final DefaultTableModel tm = (DefaultTableModel)dependenciesTable.getModel();
                    for (int i = tm.getRowCount() -1; i >= 0; i--) {
                        tm.removeRow(i);
                    }
                    final String v = val.replaceAll("\"","");
                    final String[] deps = v.split(",");
                    for (int i = 0; i < deps.length; i++) {
                        final String[] line = deps[i].trim().split(" ");
                        if (line.length == 2) {
                            tm.addRow(new Object[]{line[0], line[1]});
                            dependencies.put(line[0], line[1]);
                        }
                    }
                    return 0;
                }
            };
            sw.execute();
        }
	public String getMainClassName()
	{
            return mainClassCheckbox.isSelected()?mainClassField.getText():null;
	}
        public void setMainClassName(final String val) {
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    boolean b = false;
                    String s = "";
                    if (val != null && !"".equals(val)) {
                        s = val;
                        b = true;
                    }
                    mainClassCheckbox.setSelected(b);
                    mainClassField.setText(s);
                    return 0;
                }
            };
            sw.execute();

        }
        public void setIndex(final String var) {
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    ((DefaultListModel)indexList.getModel()).clear();
                    String str = var.trim().replaceAll("\"", "");
                    final String[] indexes = str.split(",");
                    for (int i = 0; i < indexes.length; i++) {
                        ((DefaultListModel)indexList.getModel()).add(i, indexes[i]);
                    }
                    return 0;
                }
            };
            sw.execute();
        }
        public String getIndex() {
            final StringBuilder sb = new StringBuilder();
            for (int i = 0; i < indexList.getModel().getSize(); i++ ) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append("\"");
                final String[] elems = indexList.getModel().getElementAt(i).toString().split(":");
                if (elems.length > 2) {
                    for (int j = 3; j < elems.length; j++) {
                        elems[2] += elems[j];
                    }
                    elems[1] += "::" + elems[2];
                }
                sb.append(elems[0].trim());
                sb.append("\" : \"");
                sb.append(elems[1].trim());
                sb.append("\"");
            }
            return sb.toString();
        }
        public void setMeta(final String var) {
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    ((DefaultListModel)metaList.getModel()).clear();
                    final String str = var.trim().replaceAll("\"", "");
                    final String[] metas = str.split(",");
                    for (int i = 0; i < metas.length; i++) {
                        ((DefaultListModel)metaList.getModel()).add(i, metas[i]);
                    }
                    return 0;
                }
            };
            sw.execute();
        }
        public String getMeta() {
            final StringBuilder sb = new StringBuilder();
            for (int i = 0; i < metaList.getModel().getSize(); i++ ) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append("\"");
                final String[] elems = metaList.getModel().getElementAt(i).toString().split(":");
                if (elems.length > 2) {
                    for (int j = 3; j < elems.length; j++) {
                        elems[2] += elems[j];
                    }
                    elems[1] += "::" + elems[2];
                }
                sb.append(elems[0].trim());
                sb.append("\" : \"");
                sb.append(elems[1].trim());
                sb.append("\"");
            }
            return sb.toString();
        }
        public boolean getDocApi() {
            return docApiCheckBox.isSelected();
        }
        public boolean getDocSrc() {
            return docSrcCheckBox.isSelected();
        }
        public void setDocApi(final boolean var) {
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    docApiCheckBox.setSelected(var);
                    return 0;
                }
            };
            sw.execute();

        }
        public void setDocSrc(final boolean var) {
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    docSrcCheckBox.setSelected(var);
                    return 0;
                }
            };
            sw.execute();
        }
        public String getSourceDirs() {
            final StringBuilder sb = new StringBuilder();
            String rootDir = getProjectFolder().replaceAll(File.pathSeparator, "/");
            if (!rootDir.endsWith("/")) {
                rootDir += "/";
            }
            for (String s : sourceDirs) {
                s = s.replaceAll(rootDir, "");
                if (s.startsWith("/")) {
                    s = s.substring("/".length());
                }
                if (!s.endsWith("/")) {
                    s += "/";
                }
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append("`");
                sb.append(s);
                sb.append("`");
            }
            return sb.toString();
        }
        public void setSourceDirs(final String s) {
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    String p = s.replaceAll(File.pathSeparator, "/");
                    p = p.replaceAll("`", "");
                    String rootDir = getProjectFolder().replaceAll(File.pathSeparator, "/");
                    if (!rootDir.endsWith("/"))  {
                        rootDir += "/";
                    }
                    final String[] elems = p.split(",");
                    if (!rootDir.endsWith("/")) {
                        rootDir += "/";
                    }
                    sourceDirs.clear();
                    for (int i = 0; i < elems.length; i++) {
                        String str = elems[i].trim();
                        if (!str.endsWith("/")) {
                            str += "/";
                        }
                        sourceDirs.add(str);
                    }
                    initTree(sourceDirectoryTree, rootDir, sourceDirs);
                    return 0;
                }
            };
            sw.execute();
        }
        public String getResourceDirs() {
            final StringBuilder sb = new StringBuilder();
            String rootDir = getProjectFolder().replaceAll(File.pathSeparator, "/");
            for (String s : resourceDirs) {
                s = s.replaceAll(File.pathSeparator, "/");
                s = s.replaceAll(rootDir, "");
                if (s.startsWith("/")) {
                    s = s.substring("/".length());
                }
                if (!s.endsWith("/")) {
                    s += "/";
                }
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append("`");
                sb.append(s);
                sb.append("`");
            }
            return sb.toString();
        }
        public void setResourceDirs(final String s) {
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    String p = s.replaceAll(File.pathSeparator, "/");
                    p = p.replaceAll("`", "");
                    String rootDir = getProjectFolder().replaceAll(File.pathSeparator, "/");
                    final String[] elems = p.split(",");
                    if (!rootDir.endsWith("/")) {
                        rootDir += "/";
                    }
                    resourceDirs.clear();
                    for (int i = 0; i < elems.length; i++) {
                        String str = elems[i].trim();
                        if (!str.endsWith("/")) {
                            str += "/";
                        }
                        resourceDirs.add(str);
                    }
                    boolean b = (resourceDirs.size() != 0);
                    resourceDirectoryTree.setEnabled(b);
                    resourceDirectoryBrowseButton.setEnabled(b);
                    resDirsButton.setEnabled(b);
                    initTree(resourceDirectoryTree, rootDir, resourceDirs);
                    return 0;
                }
            };
            sw.execute();
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JButton dependenciesButton;
    private javax.swing.JLabel dependenciesLabel;
    private javax.swing.JScrollPane dependenciesScrollPane;
    private javax.swing.JTable dependenciesTable;
    private javax.swing.JPanel dependencyPanel;
    private javax.swing.JCheckBox docApiCheckBox;
    private javax.swing.JCheckBox docSrcCheckBox;
    private javax.swing.JButton editListButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTextField folderField;
    private javax.swing.JLabel folderLabel;
    private javax.swing.JButton indexEditButton;
    private javax.swing.JLabel indexLabel;
    private javax.swing.JList indexList;
    private javax.swing.JScrollPane indexScrollPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField locationField;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JCheckBox mainClassCheckbox;
    private javax.swing.JTextField mainClassField;
    private javax.swing.JLabel mainClassLabel;
    private javax.swing.JLabel metaLabel;
    private javax.swing.JList metaList;
    private javax.swing.JScrollPane metaScrollPane;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton nextPageButton;
    private javax.swing.JCheckBox outDirButton;
    private javax.swing.JButton outputDirectoryBrowseButton;
    private javax.swing.JTextField outputDirectoryField;
    private javax.swing.JPanel pathsPanel;
    private javax.swing.JTextField podDescField;
    private javax.swing.JLabel podDescLabel;
    private javax.swing.JPanel podInfoPanel;
    private javax.swing.JTextField podVersionField;
    private javax.swing.JLabel podVersionLabel;
    private javax.swing.JButton previousPageButton;
    private javax.swing.JCheckBox resDirsButton;
    private javax.swing.JButton resourceDefaultButton;
    private javax.swing.JButton resourceDirectoryBrowseButton;
    private javax.swing.JTree resourceDirectoryTree;
    private javax.swing.JButton sourceDefaultButton;
    private javax.swing.JButton sourceDirectoryBrowseButton;
    private javax.swing.JTree sourceDirectoryTree;
    // End of variables declaration//GEN-END:variables

        private Set<String> sourceDirs = new HashSet<String>();
        private Set<String> resourceDirs = new HashSet<String>();
        private Map<String,String> dependencies = new HashMap<String,String>();
	private String dir;
	private static final String DEFAULT_PRJ = "FanPrj1";
	public final static Pattern VALID_NAME = Pattern.compile("[ a-zA-Z0-9_-]+");
	private FanPodWizardPanel1 parent;
        private int currentTab = 0;
        private static final int MIN_TAB = 0;
        private static final int MAX_TAB = 2;

}

