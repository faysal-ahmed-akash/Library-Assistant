package libraryassistant;

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

public class ReturnBook extends javax.swing.JFrame {

    private Connection con;
    private ResultSet rs, rs3, rs4;
    private PreparedStatement ps, ps2, ps3, ps4, ps6;
    private String query, query1, query2, query3, query4, q;
    private String ReturnId, BookId, MemberId, ReturnDate, Rating1, Rating2, bookId;
    private float Rating, Fine, fineCalc, ratingCalc, rm, fn;

    private Random rd;
    private String r;

    public ReturnBook() {
        initComponents();
        Random();
        nonEditableDateChooser();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bookIdTf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        returnIdTf = new javax.swing.JTextField();
        memberIdTf = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        returnBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 153), 2), "Return Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(0, 153, 204))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Return Id");

        bookIdTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Book Id");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Member Id");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Return Date");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Rating");

        returnIdTf.setEditable(false);
        returnIdTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        memberIdTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        returnBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        returnBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        returnBtn.setText("Return");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Increased by", "Decreased by" }));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0.1", "0.2", "0.3", "0.4", "0.5", "0.6", "0.7", "0.8", "0.9", "1.0" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bookIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(returnIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(91, 91, 91)
                                .addComponent(memberIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(returnBtn)
                        .addGap(51, 51, 51)
                        .addComponent(backBtn)
                        .addGap(39, 39, 39))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(returnIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bookIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(memberIdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(returnBtn))
                .addGap(27, 27, 27))
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

        setSize(new java.awt.Dimension(432, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        // TODO add your handling code here:
        ReturnId = returnIdTf.getText();
        BookId = bookIdTf.getText();
        MemberId = memberIdTf.getText();
        ReturnDate = ((JTextComponent) jDateChooser1.getDateEditor().getUiComponent()).getText();
        Rating1 = jComboBox1.getSelectedItem().toString();
        Rating2 = jComboBox2.getSelectedItem().toString();
        //System.out.println();
        //System.out.println();
        if (ReturnId.isEmpty() || BookId.isEmpty() || MemberId.isEmpty() || ReturnDate.isEmpty() || Rating1.isEmpty() || Rating2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fill all Fields");
        } else {
            try {
                fineCalc = fineCalculate(Rating1, Float.parseFloat(Rating2));
                ratingCalc = ratingModification(Rating1, Float.parseFloat(Rating2));
                con = MyConnection.getConnection();

                query1 = "INSERT INTO `RETURN_BOOK` (`ReturnId`, `BookId`, `MemberId`,`ReturnDate`,`RatingModification`,`Fine`) VALUES (?,?,?,?,?,?)";
                ps = con.prepareStatement(query1);
                ps.setString(1, ReturnId);
                ps.setString(2, BookId);
                ps.setString(3, MemberId);
                ps.setString(4, ReturnDate);
                ps.setFloat(5, ratingCalc);
                ps.setFloat(6, fineCalc);

                query2 = "SELECT * FROM `BOOK` WHERE `BookId`=?";
                ps2 = con.prepareStatement(query2);
                ps2.setString(1, BookId);
                rs = ps2.executeQuery();
                boolean b = rs.next();

                query3 = "SELECT * FROM `Member` WHERE `MemberId`=?";
                ps3 = con.prepareStatement(query3);
                ps3.setString(1, MemberId);
                rs3 = ps3.executeQuery();
                boolean c = rs3.next();

                query4 = "SELECT * FROM `RETURN_BOOK` WHERE `BookId`=?";
                ps4 = con.prepareStatement(query4);
                ps4.setString(1, BookId);
                rs4 = ps4.executeQuery();
                boolean a = rs4.next();
                if (a) {
                    bookId = String.valueOf(rs4.getInt(2));
                    rm = rs4.getFloat(5);
                    fn = rs4.getFloat(6);
                }

                if (!b) {
                    JOptionPane.showMessageDialog(null, "Book Doesn't Exist!");
                } else if (!c) {
                    JOptionPane.showMessageDialog(null, "Member Doesn't Exist!");
                } else{
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Book returned!");
                    formClear();
                    Random();
                    q = "UPDATE `RETURN_BOOK` SET `RatingModification`=? ,`Fine`=? WHERE `BookId`=?";
                    try {
                        ps6 = con.prepareStatement(q);
                        ps6.setFloat(1, rm + ratingCalc);
                        ps6.setFloat(2, fn + fineCalc);
                        ps6.setInt(3, Integer.parseInt(BookId));
                        ps6.executeUpdate();
                    } catch (SQLException ex) {
                        Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_returnBtnActionPerformed

    private void formClear() {
        bookIdTf.setText("");
        memberIdTf.setText("");
        ((JTextComponent) jDateChooser1.getDateEditor().getUiComponent()).setText("");
    }

    private float fineCalculate(String R1, float R2) {
        switch (R1) {
            case "Increased by":
                Fine = 0;
                break;
            case "Decreased by":
                Fine = 100 * R2;
                break;
        }
        return Fine;
    }

    private float ratingModification(String R1, float R2) {
        switch (R1) {
            case "Increased by":
                Rating = R2;
                break;
            case "Decreased by":
                Rating = (-1) * R2;
                break;
        }
        return Rating;
    }

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        MemberHome mh = new MemberHome();
        mh.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewLibrarian.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new ReturnBook().setVisible(true);
        });
    }

    private void nonEditableDateChooser() {
        ((JTextComponent) jDateChooser1.getDateEditor().getUiComponent()).setEnabled(false);
        jDateChooser1.setDateFormatString("yyyy-MM-dd");
    }

    private void Random() {
        rd = new Random();
        r = String.valueOf(rd.nextInt(1000));
        query = "SELECT * FROM `RETURN_BOOK` WHERE `ReturnId` =?";
        try {
            con = MyConnection.getConnection();
            if (con != null) {
                ps = con.prepareStatement(query);
                ps.setString(1, r);
                rs = ps.executeQuery();
                if (rs.next()) {
                    Random();
                } else {
                    returnIdTf.setText(r);
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
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField memberIdTf;
    private javax.swing.JButton returnBtn;
    private javax.swing.JTextField returnIdTf;
    // End of variables declaration//GEN-END:variables
}
