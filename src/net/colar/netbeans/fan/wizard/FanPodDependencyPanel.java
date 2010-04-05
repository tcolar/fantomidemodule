/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FanPodDependencyPanel.java
 *
 * Created on Apr 3, 2010, 11:47:02 AM
 */

package net.colar.netbeans.fan.wizard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.io.File;
import java.io.FilenameFilter;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import java.awt.*;
import net.colar.netbeans.fan.utils.DependencyPair;

/**
 * New Fan pod dependency wizard panel.
 * @author bheadley
 */
public class FanPodDependencyPanel extends JComponent {

    /** Creates new form FanPodDependencyPanel */
    public FanPodDependencyPanel() {
        super();
    }
    public int showDialog(Component parent, String title, final File[] directories, final String[] descriptions, final SortedSet<DependencyPair> selected)
        throws HeadlessException {
        dialog = createDialog(parent, title);
        dialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                returnValue = CANCEL_OPTION;
            }
        });
        returnValue = ERROR_OPTION;
        this.selected.addAll(selected);
        localInit(directories,descriptions);

        dialog.setVisible(true);

        dialog.dispose();
        dialog = null;
        return returnValue;
    }
    protected JDialog createDialog(Component parent, String title) throws HeadlessException {

        final Window window = SwingUtilities.getWindowAncestor(parent);
        final JDialog _dialog;
        if (window instanceof Frame) {
            _dialog = new JDialog((Frame)window, title, true);
        } else {
            _dialog = new JDialog((Dialog)window, title, true);
        }

        _dialog.setComponentOrientation(this.getComponentOrientation());

        final Container contentPane = _dialog.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(this, BorderLayout.CENTER);

        if (JDialog.isDefaultLookAndFeelDecorated()) {
            final boolean supportsWindowDecorations =
                UIManager.getLookAndFeel().getSupportsWindowDecorations();
            if (supportsWindowDecorations) {
                _dialog.getRootPane().setWindowDecorationStyle(JRootPane.FILE_CHOOSER_DIALOG);
            }
        }
        _dialog.pack();
        _dialog.setLocationRelativeTo(parent);

        return _dialog;
    }

    private void localInit(final File[] directories, final String[] descriptions) {
        initComponents();
        systemPodLabel.setText(descriptions[0]);
        userPodLabel.setText(descriptions.length > 1 ? descriptions[1] : "");
        systemPodList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        userPodList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        // Do a directory
        initDependencyList(systemPodList, directories[0]);
        initDependencyList(userPodList, directories.length > 1 ? directories[1] : null);

        // populate the text field with selected pods
        selectedToTextField();

        // set up listeners to keep text field && selected populated with
        // currently selected pods
        systemPodList.addListSelectionListener(new OurListSelectionListener());
        userPodList.addListSelectionListener(new OurListSelectionListener());
        this.setVisible(false);
        
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        systemPodList = new javax.swing.JList();
        systemPodList.setModel(new DefaultListModel());
        jScrollPane2 = new javax.swing.JScrollPane();
        userPodList = new javax.swing.JList();
        userPodList.setModel(new DefaultListModel());
        jTextField1 = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        systemPodLabel = new javax.swing.JLabel();
        userPodLabel = new javax.swing.JLabel();

        dialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(systemPodList);

        jScrollPane2.setViewportView(userPodList);

        jTextField1.setText(org.openide.util.NbBundle.getMessage(FanPodDependencyPanel.class, "FanPodDependencyPanel.jTextField1.text")); // NOI18N

        okButton.setText(org.openide.util.NbBundle.getMessage(FanPodDependencyPanel.class, "FanPodDependencyPanel.okButton.text")); // NOI18N
        okButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText(org.openide.util.NbBundle.getMessage(FanPodDependencyPanel.class, "FanPodDependencyPanel.cancelButton.text")); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        systemPodLabel.setText(org.openide.util.NbBundle.getMessage(FanPodDependencyPanel.class, "FanPodDependencyPanel.systemPodLabel.text")); // NOI18N

        userPodLabel.setText(org.openide.util.NbBundle.getMessage(FanPodDependencyPanel.class, "FanPodDependencyPanel.userPodLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(dialog.getContentPane());
        dialog.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(cancelButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(okButton)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(systemPodLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userPodLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(systemPodLabel)
                    .addComponent(userPodLabel))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addContainerGap())
        );

        dialog.pack();
    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        returnValue = CANCEL_OPTION;
        if(dialog != null) {
            dialog.setVisible(false);
        }
    }

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {
        returnValue = APPROVE_OPTION;
        if(dialog != null) {
            dialog.setVisible(false);
        }
    }
    private void initDependencyList(final javax.swing.JList list, final File rootDir) {
        final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
            @Override
            public Integer doInBackground() {
                final DefaultListModel model = (DefaultListModel) list.getModel();
                model.clear();
                if (rootDir != null && rootDir.exists() && rootDir.isDirectory() ) {
                    final File[] files = rootDir.listFiles(new FilenameFilter() {
                        @Override
                        public boolean accept(File file, String name) {
                            final int offset = name.lastIndexOf('.');
                            if (offset == -1) {
                                return false;
                            }
                            final String extension = name.substring(offset);
                            if (".pod".equalsIgnoreCase(extension)) {
                                return true;
                            }
                            return false;
                        }
                    });
                    if (null != files) {
                        for (int i = 0; i < files.length; i++) {
                            final String s = getPodShortDescription(files[i]);
                            model.add(i,s);
                            final String[] pair = s.split(" ");
                            final DependencyPair d = new DependencyPair(pair[0], pair[1]);
                            if (selected.contains(d)) {
                                list.setSelectedIndex(i);
                            }
                        }
                    }
                }
                return 0;
            }
        };
        sw.execute();
    }
    class OurListSelectionListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent event) {
            SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
                @Override
                public Integer doInBackground() {
                    selected.clear();
                    final javax.swing.JList[] lists = {systemPodList,userPodList};
                    for (int i = 0; i < lists.length; i++) {
                        final Object[] selections = lists[i].getSelectedValues();
                        for (int j = 0; j < selections.length; j++) {
                            final String s = selections[j].toString();
                            final String[] pair = s.split(" ");
                            final DependencyPair d = new DependencyPair(pair[0], pair[1]);
                            selected.add(d);
                        }
                    }
                    FanPodDependencyPanel.this.selectedToTextField();
                    return 0;
                }
            };
            sw.execute();
        }
    }
    public void selectedToTextField() {
        final SwingWorker<Integer,Integer> sw = new SwingWorker<Integer,Integer>() {
            @Override
            public Integer doInBackground() {
                final StringBuilder sb = new StringBuilder();
                for (final DependencyPair str : selected) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append("\"");
                    sb.append(str.getPodName());
                    sb.append(' ');
                    sb.append(str.getVersion());
                    sb.append("\"");
                }
                jTextField1.setText(sb.toString());
                return 0;
            }
        };
        sw.execute();
    }
    public SortedSet<DependencyPair> getSelected() {
        final SortedSet<DependencyPair> s = new TreeSet<DependencyPair>();
        s.addAll(selected);
        return s;
    }
    public String getPodShortDescription(File f) {
        String version = "";
        String podName = "";
        boolean hasVersion = false;
        boolean hasName = false;
        ZipFile zipFile = null;
        BufferedReader is = null;
        try {
            zipFile = new ZipFile(f.getPath());
            ZipEntry zipEntry = zipFile.getEntry("meta.props");
            if (zipEntry == null) {
                return "";
            }
            is = new BufferedReader(new InputStreamReader(
                    zipFile.getInputStream(zipEntry)));
            while (true) {
                final String line = is.readLine();
                if (line.startsWith("pod.version")) {
                    final String[] tokens = line.split("=");
                    version = tokens[1].trim();
                    hasVersion = true;
                }
                else if (line.startsWith("pod.name")) {
                    final String[] tokens = line.split("=");
                    podName = tokens[1].trim();
                    hasName = true;
                }
                if (hasName && hasVersion) {
                    return podName + " " + version ;
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (null != is) {
                try {is.close();} catch (Exception e1) {e1.printStackTrace();}
            }
            if (null != zipFile) {
                try {zipFile.close();} catch (Exception e1) {e1.printStackTrace();}
            }
        }
        return "";
    }

    private javax.swing.JButton cancelButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel systemPodLabel;
    private javax.swing.JList systemPodList;
    private javax.swing.JLabel userPodLabel;
    private javax.swing.JList userPodList;


    private final SortedSet<DependencyPair> selected = new TreeSet<DependencyPair>();
    public static final int CANCEL_OPTION = 1;
    public static final int APPROVE_OPTION = 0;
    public static final int ERROR_OPTION = -1;
    private int returnValue = ERROR_OPTION;
    private javax.swing.JDialog dialog = null;
}
