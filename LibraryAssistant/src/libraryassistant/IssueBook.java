package libraryassistant;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.text.JTextComponent;

@SuppressWarnings("serial")
public class IssueBook extends javax.swing.JFrame {

    private Connection con;
    private PreparedStatement ps, ps1, ps2, ps3, ps4, ps6;
    private ResultSet rs, rs2, rs3, rs4;
    String IssueId;
    String BookId;
    String MemberId;
    String IssuedDate;
    String ExpiryDate;
    String query, query1, query2, query3, query4, query5, q;
    String r;
    String bookId;
    int stock, issued;
    Random rd;

    public IssueBook() {
        initComponents();
        Random();
        nonEditableDateChooser();
    }

    @SuppressWarnings({"unchecked", "Convert2Lambda"})
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        memberIdTf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bookIdTf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        searchBookBtn = new javax.swing.JButton();
        issueBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        issueIdTf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dateOfIssueTf = new com.toedter.calendar.JDateChooser();
        dateOfReturnTf = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 153), 2), "Issue Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(0, 153, 204))); // NOI18N

        memberIdTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Member Id");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Book Id");

        bookIdTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bookIdTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookIdTfActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Date of issue");

        searchBookBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchBookBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchB.png"))); // NOI18N
        searchBookBtn.setText("Search for Books");
        searchBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookBtnActionPerformed(evt);
            }
        });

        issueBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        issueBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/issue.png"))); // NOI18N
        issueBtn.setText("Issue");
        issueBtn.setFocusPainted(false);
        issueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBtnActionPerformed(evt);
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

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Issue Id");

        issueIdTf.setEditable(false);
        issueIdTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        issueIdTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueIdTfActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Date of return");

        dateOfIssueTf.setBackground(new java.awt.Color(255, 255, 255));
        dateOfIssueTf.setForeground(new java.awt.Color(255, 255, 255));
        dateOfIssueTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        dateOfReturnTf.setBackground(new java.awt.Color(255, 255, 255));
        dateOfReturnTf.setForeground(new java.awt.Color(255, 255, 255));
        dateOfReturnTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel12)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bookIdTf, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(memberIdTf, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(issueIdTf, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(dateOfIssueTf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dateOfReturnTf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchBookBtn)
                .addGap(55, 55, 55)
                .addComponent(issueBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(issueIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateOfIssueTf, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateOfReturnTf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(issueBtn)
                    .addComponent(backBtn))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(468, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bookIdTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookIdTfActionPerformed

    }//GEN-LAST:event_bookIdTfActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        this.dispose();
        MemberHome mh = new MemberHome();
        mh.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void issueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBtnActionPerformed

        IssueId = issueIdTf.getText();
        BookId = bookIdTf.getText();
        MemberId = memberIdTf.getText();
        IssuedDate = ((JTextComponent) dateOfIssueTf.getDateEditor().getUiComponent()).getText();
        ExpiryDate = ((JTextComponent) dateOfReturnTf.getDateEditor().getUiComponent()).getText();

        try {
            if (IssueId.isEmpty() || BookId.isEmpty() || MemberId.isEmpty() || IssuedDate.isEmpty() || ExpiryDate.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill all Fields");
            } else {
                con = MyConnection.getConnection();

                query1 = "INSERT INTO `ISSUE_BOOK` (`IssueId`, `BookId`, `MemberId`,`IssuedDate`,`ExpiryDate`) VALUES (?,?,?,?,?)";
                ps1 = con.prepareStatement(query1);
                ps1.setString(1, IssueId);
                ps1.setString(2, BookId);
                ps1.setString(3, MemberId);
                ps1.setString(4, IssuedDate);
                ps1.setString(5, ExpiryDate);

                query2 = "SELECT * FROM `ISSUE_BOOK` WHERE `MemberId`=?";
                ps2 = con.prepareStatement(query2);
                ps2.setString(1, MemberId);
                rs2 = ps2.executeQuery();
                boolean a = rs2.next();
                if (a) {
                    bookId = String.valueOf(rs2.getInt(2));
                }
                query3 = "SELECT * FROM `BOOK` WHERE `BookId`=?";
                ps3 = con.prepareStatement(query3);
                ps3.setString(1, BookId);
                rs3 = ps3.executeQuery();
                boolean b = rs3.next();
                if (b) {
                    stock = rs3.getInt(6);
                    issued = rs3.getInt(7);
                }

                query4 = "SELECT * FROM `MEMBER` WHERE `MemberId`=?";
                ps4 = con.prepareStatement(query4);
                ps4.setString(1, MemberId);
                rs4 = ps4.executeQuery();
                boolean c = rs4.next();

                if (!b) {
                    JOptionPane.showMessageDialog(null, "Book Doesn't Exist!");
                } else if (!c) {
                    JOptionPane.showMessageDialog(null, "Member Doesn't Exist!");
                } else if (stock <= 0) {
                    JOptionPane.showMessageDialog(null, "Stock out!");
                } else if (a && bookId.equals(BookId)) {
                    JOptionPane.showMessageDialog(null, "Book Already Issued by you!");
                } else if (a) {
                    JOptionPane.showMessageDialog(null, "Return book first!");
                } else {
                    ps1.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Book issued!");
                    formClear();
                    Random();
                    q = "UPDATE `BOOK` SET `Stock`=? ,`Issued`=? WHERE `BookId`=?";
                    try {
                        ps6 = con.prepareStatement(q);
                        ps6.setInt(1, (stock - 1));
                        ps6.setInt(2, (issued + 1));
                        ps6.setInt(3, Integer.parseInt(BookId));
                        ps6.executeUpdate();
                    } catch (SQLException ex) {
                        Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (HeadlessException | SQLException e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_issueBtnActionPerformed

    private void searchBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookBtnActionPerformed
        this.setVisible(false);
        this.dispose();
        SearchBook sb = new SearchBook();
        sb.setVisible(true);
    }//GEN-LAST:event_searchBookBtnActionPerformed

    private void issueIdTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueIdTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_issueIdTfActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new IssueBook().setVisible(true);
        });
    }

    private void nonEditableDateChooser() {
        ((JTextComponent) dateOfIssueTf.getDateEditor().getUiComponent()).setEnabled(false);
        ((JTextComponent) dateOfReturnTf.getDateEditor().getUiComponent()).setEnabled(false);
        dateOfIssueTf.setDateFormatString("yyyy-MM-dd");
        dateOfReturnTf.setDateFormatString("yyyy-MM-dd");
    }

    private void formClear() {
        issueIdTf.setText("");
        bookIdTf.setText("");
        memberIdTf.setText("");
        ((JTextComponent) dateOfIssueTf.getDateEditor().getUiComponent()).setText("");
        ((JTextComponent) dateOfReturnTf.getDateEditor().getUiComponent()).setText("");
        Random();
    }

    private void Random() {
        rd = new Random();
        r = String.valueOf(rd.nextInt(1000));
        query = "SELECT * FROM `ISSUE_BOOK` WHERE `IssueId` = ?";
        try {
            con = MyConnection.getConnection();
            if (con != null) {
                ps = con.prepareStatement(query);
                ps.setString(1, r);
                rs = ps.executeQuery();
                if (rs.next()) {
                    Random();
                } else {
                    issueIdTf.setText(r);  //generating random issue IDs automatically
                }
            } else {
                JOptionPane.showMessageDialog(null, "Communiations link failure!!");
            }
        } catch (SQLException ex) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField bookIdTf;
    private com.toedter.calendar.JDateChooser dateOfIssueTf;
    private com.toedter.calendar.JDateChooser dateOfReturnTf;
    private javax.swing.JButton issueBtn;
    private javax.swing.JTextField issueIdTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField memberIdTf;
    private javax.swing.JButton searchBookBtn;
    // End of variables declaration//GEN-END:variables
}
