/*
 * Thibaut Colar Aug 13, 2009
 */

/*
 * FanProjectPropertiesPanel.java
 *
 * Created on Aug 13, 2009, 2:21:31 PM
 */
package net.colar.netbeans.fan.wizard;

import java.io.File;
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
import javax.swing.SwingWorker;
import javax.swing.SwingUtilities;
import org.openide.util.NbBundle;

/**
 * Main UI panel for project/pod properties
 * @author thibautc
 */
public class FanProjectPropertiesPanel extends javax.swing.JPanel
{

	/** Creates new form FanProjectPropertiesPanel */
	public FanProjectPropertiesPanel(final String dir)
	{
            super();
            this.dir = dir;

            initComponents();
            localInit();
	}
        private void localInit() {
                dependenciesTable.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.dependenciesTable.tooltip"));
                docApiCheckBox.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.docApiCheckBox.tooltip"));
                docSrcCheckBox.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.docSrcCheckBox.tooltip"));
                metaEditButton.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.metaEditButton.tooltip"));
                indexEditButton.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.indexEditButton.tooltip"));
                indexList.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.indexList.tooltip"));
                mainMethodField.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.mainMethodField.tooltip"));
                metaList.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.metaList.tooltip"));
                podNameField.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.podNameField.tooltip"));
                outDirButton.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.outDirButton.tooltip"));
                outputDirectoryEditButton.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.outputDirectoryEditButton.tooltip"));
                outputDirectoryField.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.outputDirectoryField.tooltip"));
                podDescriptionField.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.podDescriptionField.tooltip"));
                podVersionField.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.podVersionField.tooltip"));
                resDirsButton.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.resDirsButton.tooltip"));
                resourceDefaultsButton.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.resourceDefaultsButton.tooltip"));
                resourceEditButton.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.resourceEditButton.tooltip"));
                resourceTree.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.resourceTree.tooltip"));
                sourceDefaultsButton.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.sourceDefaultsButton.tooltip"));
                sourceEditButton.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.sourceEditButton.tooltip"));
                sourceTree.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.sourceTree.tooltip"));
                dependenciesEditButton.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.dependenciesEditButton.tooltip"));
                nextTabButton.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.nextTabButton.tooltip"));
                prevTabButton.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.prevTabButton.tooltip"));
                runtimeArgumentsField.setToolTipText(NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.runtimeArgumentsField.tooltip"));
        }
	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        outputDirectoryLabel1 = new javax.swing.JLabel();
        outputDirectoryField = new javax.swing.JTextField();
        outputDirectoryEditButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        podNameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        podDescriptionField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        podVersionField = new javax.swing.JTextField();
        outDirButton = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sourceTree = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        resourceTree = new javax.swing.JTree();
        jLabel1 = new javax.swing.JLabel();
        sourceEditButton = new javax.swing.JButton();
        sourceDefaultsButton = new javax.swing.JButton();
        resourceEditButton = new javax.swing.JButton();
        resourceDefaultsButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        docApiCheckBox = new javax.swing.JCheckBox();
        docSrcCheckBox = new javax.swing.JCheckBox();
        resDirsButton = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dependenciesTable = new javax.swing.JTable();
        dependenciesEditButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        indexList = new javax.swing.JList();
        indexEditButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        metaList = new javax.swing.JList();
        metaEditButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        mainMethodLbl2 = new javax.swing.JLabel();
        mainMethodField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        runtimeArgumentsField = new javax.swing.JTextField();
        prevTabButton = new javax.swing.JButton();
        nextTabButton = new javax.swing.JButton();

        outputDirectoryLabel1.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.outputDirectoryLabel1.text")); // NOI18N

        outputDirectoryField.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.outputDirectoryField.text")); // NOI18N

        outputDirectoryEditButton.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.outputDirectoryEditButton.text")); // NOI18N
        outputDirectoryEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputDirectoryEditButtonActionPerformed(evt);
            }
        });

        jLabel4.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.jLabel4.text")); // NOI18N

        podNameField.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.podNameField.text")); // NOI18N

        jLabel5.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.jLabel5.text")); // NOI18N

        podDescriptionField.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.podDescriptionField.text")); // NOI18N

        jLabel6.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.jLabel6.text")); // NOI18N

        podVersionField.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.podVersionField.text")); // NOI18N

        outDirButton.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.outDirButton.text")); // NOI18N
        outDirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outDirButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel4)
                    .add(jLabel5)
                    .add(jLabel6)
                    .add(outputDirectoryLabel1)
                    .add(outDirButton))
                .add(40, 40, 40)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(outputDirectoryField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(outputDirectoryEditButton))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, podNameField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, podDescriptionField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .add(podVersionField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(podNameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(podDescriptionField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(podVersionField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(outDirButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(outputDirectoryField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(outputDirectoryLabel1)
                    .add(outputDirectoryEditButton))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.jPanel1.TabConstraints.tabTitle"), jPanel1); // NOI18N

        jScrollPane1.setViewportView(sourceTree);

        jScrollPane2.setViewportView(resourceTree);

        jLabel1.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.jLabel1.text")); // NOI18N

        sourceEditButton.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.sourceEditButton.text_1")); // NOI18N
        sourceEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceEditButtonActionPerformed(evt);
            }
        });

        sourceDefaultsButton.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.sourceDefaultsButton.text")); // NOI18N
        sourceDefaultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceDefaultsButtonActionPerformed(evt);
            }
        });

        resourceEditButton.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.resourceEditButton.text")); // NOI18N
        resourceEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resourceEditButtonActionPerformed(evt);
            }
        });

        resourceDefaultsButton.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.resourceDefaultsButton.text")); // NOI18N
        resourceDefaultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resourceDefaultsButtonActionPerformed(evt);
            }
        });

        jLabel2.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.jLabel2.text")); // NOI18N

        docApiCheckBox.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.docApiCheckBox.text")); // NOI18N

        docSrcCheckBox.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.docSrcCheckBox.text")); // NOI18N

        resDirsButton.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.resDirsButton.text")); // NOI18N
        resDirsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resDirsButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(resDirsButton)
                    .add(jLabel2)
                    .add(jLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(docApiCheckBox)
                        .add(46, 46, 46)
                        .add(docSrcCheckBox))
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
                .add(18, 18, 18)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, resourceDefaultsButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, resourceEditButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(sourceDefaultsButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(sourceEditButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(jPanel2Layout.createSequentialGroup()
                            .add(jLabel1)
                            .add(69, 69, 69))
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2Layout.createSequentialGroup()
                            .add(sourceEditButton)
                            .add(18, 18, 18)
                            .add(sourceDefaultsButton)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))))
                .add(12, 12, 12)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                        .add(resDirsButton)
                        .add(28, 28, 28)
                        .add(jLabel2)
                        .add(29, 29, 29))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                        .add(resourceEditButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 40, Short.MAX_VALUE)
                        .add(resourceDefaultsButton))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(26, 26, 26)
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 68, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(docApiCheckBox)
                    .add(docSrcCheckBox))
                .addContainerGap())
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.jPanel2.TabConstraints.tabTitle"), jPanel2); // NOI18N

        jLabel3.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.jLabel3.text")); // NOI18N

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
        jScrollPane3.setViewportView(dependenciesTable);

        dependenciesEditButton.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.dependenciesEditButton.text_1")); // NOI18N
        dependenciesEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dependenciesEditButtonActionPerformed(evt);
            }
        });

        jLabel7.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.jLabel7.text")); // NOI18N

        indexList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(indexList);

        indexEditButton.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.indexEditButton.text_1")); // NOI18N
        indexEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indexEditButtonActionPerformed(evt);
            }
        });

        jLabel8.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.jLabel8.text")); // NOI18N

        metaList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(metaList);

        metaEditButton.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.metaEditButton.text_1")); // NOI18N
        metaEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metaEditButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jLabel3)
                        .add(49, 49, 49))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jLabel7)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jLabel8, 0, 0, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(metaEditButton)
                    .add(indexEditButton)
                    .add(dependenciesEditButton))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3)
                    .add(dependenciesEditButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel7)
                    .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(indexEditButton))
                .add(14, 14, 14)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(metaEditButton)
                    .add(jLabel8)
                    .add(jScrollPane5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.jPanel3.TabConstraints.tabTitle"), jPanel3); // NOI18N

        mainMethodLbl2.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.mainMethodLbl2.text")); // NOI18N

        mainMethodField.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.mainMethodField.text")); // NOI18N

        jLabel9.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.jLabel9.text")); // NOI18N

        runtimeArgumentsField.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.runtimeArgumentsField.text")); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(mainMethodLbl2)
                    .add(jLabel9))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(mainMethodField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                    .add(runtimeArgumentsField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(37, 37, 37)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(mainMethodLbl2)
                    .add(mainMethodField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(44, 44, 44)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(runtimeArgumentsField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.jPanel4.TabConstraints.tabTitle"), jPanel4); // NOI18N

        prevTabButton.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.prevTabButton.text_1")); // NOI18N
        prevTabButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevTabButtonActionPerformed(evt);
            }
        });

        nextTabButton.setText(org.openide.util.NbBundle.getMessage(FanProjectPropertiesPanel.class, "FanProjectPropertiesPanel.nextTabButton.text")); // NOI18N
        nextTabButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextTabButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(prevTabButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 480, Short.MAX_VALUE)
                        .add(nextTabButton))
                    .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 268, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(prevTabButton)
                    .add(nextTabButton))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

        private void outputDirectoryEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputDirectoryEditButtonActionPerformed
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    final String l = dir;
                    final File p = new File(l);
                    if (!p.exists()) {
                        p.mkdirs();
                    }
                    final JFileChooser chooser = new JFileChooser();
                    chooser.setMultiSelectionEnabled(false);
                    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                    chooser.setApproveButtonText("Select");
                    int val = chooser.showDialog(FanProjectPropertiesPanel.this, "Select");
                    if (val == JFileChooser.APPROVE_OPTION)
                    {
                        String s = chooser.getSelectedFile().getPath();
                        s.replaceAll(File.pathSeparator, "/");
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
                        s = s.replace(l, "");
                        outputDirectoryField.setText(s);
                    }
                    return 0;
                }
            };
            sw.execute();
        }//GEN-LAST:event_outputDirectoryEditButtonActionPerformed

        private void nextTabButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextTabButtonActionPerformed
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
        }//GEN-LAST:event_nextTabButtonActionPerformed

        private void prevTabButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevTabButtonActionPerformed
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
        }//GEN-LAST:event_prevTabButtonActionPerformed

        private void dependenciesEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dependenciesEditButtonActionPerformed
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                @Override
                public Integer doInBackground() {
                    final String outDir = FanProjectPropertiesPanel.this.getOutputDirectory().replaceAll("`", "");
                    final File f = new File(outDir);
                    final File[] directories = new File[] {
                        new File(FanPlatform.getInstance().buildSysPodPath()),
                        new File((f.exists() && f.isAbsolute()) ? outDir : dir + "/" + outDir )
                    };

                    final java.awt.Window window = SwingUtilities.getWindowAncestor(FanProjectPropertiesPanel.this);
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
                        for (final Map.Entry<String,String> s : dependencies.entrySet()) {
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
        }//GEN-LAST:event_dependenciesEditButtonActionPerformed

        private void indexEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indexEditButtonActionPerformed
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                @Override
                public Integer doInBackground() {
                    SortedSet<String> set = new TreeSet<String>();
                    final DefaultListModel model = (DefaultListModel)indexList.getModel();
                    for (int i = 0; i < model.getSize(); i++) {
                        set.add(model.get(i).toString());
                    }
                    final Window window = SwingUtilities.getWindowAncestor(FanProjectPropertiesPanel.this);
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

        private void metaEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metaEditButtonActionPerformed
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                @Override
                public Integer doInBackground() {
                    SortedSet<String> set = new TreeSet<String>();
                    final DefaultListModel model = (DefaultListModel)metaList.getModel();
                    for (int i = 0; i < model.getSize(); i++) {
                        set.add(model.get(i).toString());
                    }
                    final Window window = SwingUtilities.getWindowAncestor(FanProjectPropertiesPanel.this);
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
        }//GEN-LAST:event_metaEditButtonActionPerformed

        private void sourceEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceEditButtonActionPerformed
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    String l = dir.replaceAll(File.pathSeparator, "/");
                    final java.awt.Window window = SwingUtilities.getWindowAncestor(FanProjectPropertiesPanel.this);
                    final FanPodSourcesPanel podChooser;
                    if (window instanceof java.awt.Frame) {
                        podChooser = new FanPodSourcesPanel((java.awt.Frame) window, "Select Source Directories");
                    }
                    else {
                        podChooser = new FanPodSourcesPanel((java.awt.Dialog) window, "Select Source Directories");
                    }
                    int val = podChooser.showDialog(new File(dir), sourceDirs);
                    if (val == JFileChooser.APPROVE_OPTION)
                    {
                        sourceDirs.clear();
                        sourceDirs.addAll(podChooser.getSelected());
                        final DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(dir);
                        for (String s : sourceDirs) {
                            s = s.replaceAll(l, "");
                            rootNode.add(new DefaultMutableTreeNode(s));
                        }
                        sourceTree.setModel(new DefaultTreeModel(rootNode));
                    }
                    return 0;
                }
            };
            sw.execute();
        }//GEN-LAST:event_sourceEditButtonActionPerformed

        private void sourceDefaultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceDefaultsButtonActionPerformed
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    sourceDirs.clear();
                    final String l = dir.replaceAll(File.pathSeparator, "/");
                    final String[] dirs = { "fan/", "test/" };
                    for (String d : dirs) {
                        d = l + "/" + d;
                        final File f = new File(d);
                        if (!f.exists()) {
                            f.mkdirs();
                        }
                        sourceDirs.add(d);
                    }
                    final DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(dir);
                    for (String str : sourceDirs) {
                        str = str.replaceAll(l, "");
                        rootNode.add(new DefaultMutableTreeNode(str));
                    }
                    sourceTree.setModel(new DefaultTreeModel(rootNode));
                    return 0;
                }
            };
            sw.execute();
        }//GEN-LAST:event_sourceDefaultsButtonActionPerformed

        private void resourceEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resourceEditButtonActionPerformed
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    final String l = dir.replaceAll(File.pathSeparator, "/");
                    final java.awt.Window window = SwingUtilities.getWindowAncestor(FanProjectPropertiesPanel.this);
                    final FanPodSourcesPanel podChooser;
                    if (window instanceof java.awt.Frame) {
                        podChooser = new FanPodSourcesPanel((java.awt.Frame) window, "Select Resource Directories");
                    }
                    else {
                        podChooser = new FanPodSourcesPanel((java.awt.Dialog) window, "Select Resource Directories");
                    }
                    int val = podChooser.showDialog(new File(dir), resourceDirs);
                    if (val == JFileChooser.APPROVE_OPTION)
                    {
                        resourceDirs.clear();
                        resourceDirs.addAll(podChooser.getSelected());
                        final DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(dir);
                        for (String s : resourceDirs) {
                            s = s.replaceAll(l, "");
                            rootNode.add(new DefaultMutableTreeNode(s));
                        }
                        resourceTree.setModel(new DefaultTreeModel(rootNode));
                    }
                    return 0;
                }
            };
            sw.execute();
        }//GEN-LAST:event_resourceEditButtonActionPerformed

        private void resourceDefaultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resourceDefaultsButtonActionPerformed
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    sourceDirs.clear();
                    final String l = dir.replaceAll(File.pathSeparator, "/");
                    final String[] dirs = { "res/" };
                    for (String d : dirs) {
                        d = l + "/" + d;
                        final File f = new File(d);
                        if (!f.exists()) {
                            f.mkdirs();
                        }
                        resourceDirs.add(d);
                    }
                    final DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(dir);
                    for (String str : resourceDirs) {
                        str = str.replaceAll(l, "");
                        rootNode.add(new DefaultMutableTreeNode(str));
                    }
                    resourceTree.setModel(new DefaultTreeModel(rootNode));
                    return 0;
                }
            };
            sw.execute();
        }//GEN-LAST:event_resourceDefaultsButtonActionPerformed

        private void resDirsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resDirsButtonActionPerformed
            boolean b = resDirsButton.isSelected();
            resourceDirs.clear();
            resourceTree.setEnabled(b);
            resourceEditButton.setEnabled(b);
            resourceDefaultsButton.setEnabled(b);

        }//GEN-LAST:event_resDirsButtonActionPerformed

        private void outDirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outDirButtonActionPerformed
            boolean b = outDirButton.isSelected();
            outputDirectoryField.setText("");
            outputDirectoryField.setEnabled(b);
            outputDirectoryEditButton.setEnabled(b);
        }//GEN-LAST:event_outDirButtonActionPerformed

        private void initTree(final javax.swing.JTree tree, final String path, final Set<String> set) {
            final DefaultMutableTreeNode node = new DefaultMutableTreeNode(path);
            node.add(new DefaultMutableTreeNode("(empty)"));
            tree.setModel(new DefaultTreeModel(node));
            set.clear();
        }
	public String getPodName()
	{
            return podNameField.getText();
	}
        public void setPodName(final String val) {
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    podNameField.setText(val);
                    return 0;
                }
            };
            sw.execute();
        }
	public String getPodDescription()
	{
            return podDescriptionField.getText();
	}
        public void setPodDescription(final String val) {
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    podDescriptionField.setText(val);
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
            String s = outputDirectoryField.getText().replaceAll(File.pathSeparator, "/");
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
                    String s = val.replaceAll(File.pathSeparator, "/");
                    s = s.replaceAll("`","");
                    boolean b = !"".equals(s);
                    outDirButton.setSelected(b);
                    outputDirectoryField.setEnabled(b);
                    outputDirectoryField.setText(s);
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
            return mainMethodField.getText();
	}
        public void setMainClassName(final String val) {
            final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                public Integer doInBackground() {
                    mainMethodField.setText(val);
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
            final String rootDir = dir.replaceAll(File.pathSeparator, "/");
            for (String s : sourceDirs) {
                s = s.replaceAll(rootDir, "");
                s = s.replaceAll(File.pathSeparator, "/");
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
                    String p = s.replaceAll("`", "");
                    p = p.replaceAll(File.pathSeparator, "/");
                    final String[] elems = p.split(",");
                    sourceDirs.clear();
                    for (int i = 0; i < elems.length; i++) {
                        String str =  elems[i].trim();
                        if (!str.endsWith("/")) {
                            str += "/";
                        }
                        sourceDirs.add(str);
                    }
                    initTree(sourceTree, dir, sourceDirs);
                    return 0;
                }
            };
            sw.execute();
        }
        public String getResourceDirs() {
            final StringBuilder sb = new StringBuilder();
            final String rootDir = dir;
            for (String s : resourceDirs) {
                s = s.replaceAll(rootDir, "");
                s = s.replace(File.pathSeparator, "/");
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
                    String p = s.replaceAll("`", "");
                    p = p.replace(File.pathSeparator, "/");
                    final String[] elems = p.split(",");
                    resourceDirs.clear();
                    for (int i = 0; i < elems.length; i++) {
                        String str = elems[i].trim();
                        if (!str.endsWith("/")) {
                            str += "/";
                        }
                        resourceDirs.add(str);
                    }
                    boolean b = resourceDirs.size() != 0;
                    resDirsButton.setSelected(b);
                    resourceDefaultsButton.setEnabled(b);
                    resourceEditButton.setEnabled(b);
                    resourceTree.setEnabled(b);
                    initTree(resourceTree, dir, resourceDirs);
                    return 0;
                }
            };
            sw.execute();
        }
        public void setRuntimeArguments(final String var) {
            runtimeArgumentsField.setText(var);
        }
        public String getRuntimeArguments() {
            return runtimeArgumentsField.getText();
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dependenciesEditButton;
    private javax.swing.JTable dependenciesTable;
    private javax.swing.JCheckBox docApiCheckBox;
    private javax.swing.JCheckBox docSrcCheckBox;
    private javax.swing.JButton indexEditButton;
    private javax.swing.JList indexList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField mainMethodField;
    private javax.swing.JLabel mainMethodLbl2;
    private javax.swing.JButton metaEditButton;
    private javax.swing.JList metaList;
    private javax.swing.JButton nextTabButton;
    private javax.swing.JCheckBox outDirButton;
    private javax.swing.JButton outputDirectoryEditButton;
    private javax.swing.JTextField outputDirectoryField;
    private javax.swing.JLabel outputDirectoryLabel1;
    private javax.swing.JTextField podDescriptionField;
    private javax.swing.JTextField podNameField;
    private javax.swing.JTextField podVersionField;
    private javax.swing.JButton prevTabButton;
    private javax.swing.JCheckBox resDirsButton;
    private javax.swing.JButton resourceDefaultsButton;
    private javax.swing.JButton resourceEditButton;
    private javax.swing.JTree resourceTree;
    private javax.swing.JTextField runtimeArgumentsField;
    private javax.swing.JButton sourceDefaultsButton;
    private javax.swing.JButton sourceEditButton;
    private javax.swing.JTree sourceTree;
    // End of variables declaration//GEN-END:variables

        private Set<String> sourceDirs = new HashSet<String>();
        private Set<String> resourceDirs = new HashSet<String>();
        private Map<String,String> dependencies = new HashMap<String,String>();
	private String dir;
	//private final JFileChooser chooser;
        private int currentTab = 0;
        private static final int MIN_TAB = 0;
        private static final int MAX_TAB = 3;
}
