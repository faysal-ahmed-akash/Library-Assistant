package libraryassistant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class Login extends javax.swing.JFrame {

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection con;
    private String actor;
    static String id;
    private String password;
    private String query;
    private boolean[] checkActor;

    public Login() {
        initComponents();
        checkAdmin();
    }

    @SuppressWarnings({"unchecked", "Convert2Lambda"})
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        passwordTf = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        idTf = new javax.swing.JTextField();
        signupBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        forgotPassBtn = new javax.swing.JButton();
        actors = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 153), 2), "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(0, 153, 204))); // NOI18N

        passwordTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        idTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTfActionPerformed(evt);
            }
        });

        signupBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        signupBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/signup.gif"))); // NOI18N
        signupBtn.setText("Signup");
        signupBtn.setFocusPainted(false);
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Id");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Password");

        loginBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.jpg"))); // NOI18N
        loginBtn.setText("Login");
        loginBtn.setFocusPainted(false);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        forgotPassBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        forgotPassBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/forgot password.png"))); // NOI18N
        forgotPassBtn.setText("Forgot Password");
        forgotPassBtn.setFocusPainted(false);
        forgotPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPassBtnActionPerformed(evt);
            }
        });

        actors.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        actors.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Librarian", "Member" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Login as");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(actors, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordTf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(loginBtn)
                                .addGap(56, 56, 56)
                                .addComponent(signupBtn)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(forgotPassBtn)
                        .addGap(55, 55, 55))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(actors, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn)
                    .addComponent(signupBtn))
                .addGap(18, 18, 18)
                .addComponent(forgotPassBtn)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(479, 415));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTfActionPerformed

    }//GEN-LAST:event_idTfActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed

        actor = actors.getSelectedItem().toString();
        id = idTf.getText();
        password = String.valueOf(passwordTf.getPassword());

        if (id.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required");
        } else {
            checkActor = new boolean[2];
            checkActor = check(actor, id, password);
            if (checkActor[0] && checkActor[1]) {
                this.setVisible(false);
                this.dispose();
                Loading ld = new Loading();
                ld.loading(actor);
                ld.setVisible(true);
            } else if (!checkActor[1]) {
                JOptionPane.showMessageDialog(null, "Communiations link failure!!");
                formClear();

            } else if (!checkActor[0] && checkActor[1]) {
                JOptionPane.showMessageDialog(null, "Incorrect Id or Password");
            }
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void forgotPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPassBtnActionPerformed

    }//GEN-LAST:event_forgotPassBtnActionPerformed

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        this.setVisible(false);
        this.dispose();
        NewAdmin su = new NewAdmin();
        su.setVisible(true);
    }//GEN-LAST:event_signupBtnActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    boolean[] check(String actor, String id, String password) {

        checkActor = new boolean[2];

        switch (actor) {
            case "Admin":
                try {
                    query = "SELECT * FROM `ADMIN_TABLE` WHERE `AdminId` =? AND `password`=?";
                    con = MyConnection.getConnection();
                    if (con != null) {

                        ps = con.prepareStatement(query);

                        ps.setString(1, id);
                        ps.setString(2, password);

                        rs = ps.executeQuery();

                        checkActor[0] = rs.next();
                        checkActor[1] = true;
                    } else {
                        checkActor[1] = false;
                    }
                } catch (SQLException ex) {
                }
                break;
            case "Librarian":
                try {
                    query = "SELECT * FROM `LIBRARIAN` WHERE `LibrarianId` =? AND `LibrarianPassword`=?";
                    con = MyConnection.getConnection();
                    if (con != null) {

                        ps = con.prepareStatement(query);

                        ps.setString(1, id);
                        ps.setString(2, password);

                        rs = ps.executeQuery();

                        checkActor[0] = rs.next();
                        checkActor[1] = true;
                    } else {
                        checkActor[1] = false;
                    }
                } catch (SQLException ex) {
                }
                break;
            case "Member":
                try {
                    query = "SELECT * FROM `MEMBER` WHERE `MemberId` =? AND `MemberPassword`=?";
                    con = MyConnection.getConnection();
                    if (con != null) {

                        ps = con.prepareStatement(query);

                        ps.setString(1, id);
                        ps.setString(2, password);

                        rs = ps.executeQuery();

                        checkActor[0] = rs.next();
                        checkActor[1] = true;
                    } else {
                        checkActor[1] = false;
                    }
                } catch (SQLException ex) {
                }
                break;
        }
        return checkActor;
    }

    private void formClear() {
        idTf.setText("");
        passwordTf.setText("");
    }

    private void checkAdmin() {
        try {
            query = "SELECT * FROM `ADMIN_TABLE`";
            con = MyConnection.getConnection();
            if (con != null) {

                ps = con.prepareStatement(query);

                rs = ps.executeQuery();

                if (rs.next()) {
                    signupBtn.setEnabled(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Communiations link failure!!");
            }
        } catch (SQLException ex) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox actors;
    private javax.swing.JButton forgotPassBtn;
    private javax.swing.JTextField idTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordTf;
    private javax.swing.JButton signupBtn;
    // End of variables declaration//GEN-END:variables
}
