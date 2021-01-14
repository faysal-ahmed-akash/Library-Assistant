package libraryassistant;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

@SuppressWarnings("serial")
public class SearchBook extends javax.swing.JFrame {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private String query;
    private int i;
    private String search;
    private DefaultTableModel dm;

    public SearchBook() {
        initComponents();
        jTable1();
    }

    private void jTable1() {

        query = "SELECT BookId,ISBN,BookName,BookPublisher,BookEdition,Stock FROM BOOK";
        try {
            con = MyConnection.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);

            JTableHeader header = jTable1.getTableHeader();
            header.setBackground(Color.decode("#1E90FF"));
            jTable1.setFont(new Font("Tahoma", Font.PLAIN, 16));
            for (i = 0; i < jTable1.getColumnCount(); i++) {
                jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dataScrollPanel = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        issueBookBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        searchTf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 153), 2), "Books", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(0, 153, 204))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        dataScrollPanel.setViewportView(jTable1);

        issueBookBtn.setBackground(new java.awt.Color(0, 0, 0));
        issueBookBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        issueBookBtn.setForeground(new java.awt.Color(255, 255, 255));
        issueBookBtn.setText("Want to issue a book?");
        issueBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBookBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.setFocusPainted(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        searchTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTfKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(issueBookBtn)
                .addGap(61, 61, 61)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dataScrollPanel)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchTf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(dataScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issueBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(778, 563));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        setVisible(false);
        dispose();
        MemberHome mh = new MemberHome();
        mh.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void issueBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBookBtnActionPerformed
        this.setVisible(false);
        this.dispose();
        IssueBook ib = new IssueBook();
        ib.setVisible(true);
    }//GEN-LAST:event_issueBookBtnActionPerformed

    private void searchTfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTfKeyReleased
        // TODO add your handling code here:
         search = searchTf.getText();
        filter(search);
    }//GEN-LAST:event_searchTfKeyReleased

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new SearchBook().setVisible(true);
        });
    }

    private void filter(String search) {
        dm = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JScrollPane dataScrollPanel;
    private javax.swing.JButton issueBookBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField searchTf;
    // End of variables declaration//GEN-END:variables
}
