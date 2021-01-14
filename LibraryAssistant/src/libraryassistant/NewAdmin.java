package libraryassistant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class NewAdmin extends javax.swing.JFrame {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;

    public NewAdmin() {
        initComponents();
    }

    @SuppressWarnings({"unchecked", "Convert2Lambda"})
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        createBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idTf = new javax.swing.JTextField();
        nameTf = new javax.swing.JTextField();
        passwordTf = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        confirmPasswordTf = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        emailTf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        phoneTf = new javax.swing.JTextField();
        addressTf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 153), 2), "New Admin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(0, 153, 204))); // NOI18N

        createBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        createBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/create.png"))); // NOI18N
        createBtn.setText("Create");
        createBtn.setFocusPainted(false);
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("password");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Address");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Id");

        idTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        nameTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        passwordTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Confirm Password");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Phone");

        phoneTf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 159, Short.MAX_VALUE)
                        .addComponent(createBtn)
                        .addGap(53, 53, 53)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneTf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(confirmPasswordTf)
                                .addComponent(passwordTf)
                                .addComponent(nameTf, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(idTf)
                                .addComponent(emailTf)
                                .addComponent(addressTf)))
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordTf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(confirmPasswordTf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(phoneTf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(addressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(emailTf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBtn)
                    .addComponent(backBtn))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(442, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        setVisible(false);
        dispose();
        Login ob = new Login();
        ob.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        String id = idTf.getText();
        String name = nameTf.getText();
        String password = String.valueOf(passwordTf.getPassword());
        String confirmPassword = String.valueOf(confirmPasswordTf.getPassword());
        String phone = phoneTf.getText();
        String address = addressTf.getText();
        String email = emailTf.getText();
        if (id.isEmpty() || name.isEmpty() || password.isEmpty() || phone.isEmpty() || address.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required");
        } else if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "Passwords not matched");
        } else if (checkId(id)) {
            JOptionPane.showMessageDialog(null, "Username Already Exist");
        } else if (checkPhone(phone)) {
            JOptionPane.showMessageDialog(null, "Phone Already Exist");
        } else if (checkEmail(email)) {
            JOptionPane.showMessageDialog(null, "Email Already Exist");
        } else {
            String query = "INSERT INTO `ADMIN_TABLE` (`AdminId`, `name`, `password`, `phone`, `address`, `email`) VALUES (?,?,?,?,?,?)";
            try {
                con = MyConnection.getConnection();
                ps = con.prepareStatement(query);

                ps.setString(1, id);
                ps.setString(2, name);
                ps.setString(3, password);
                ps.setString(4, phone);
                ps.setString(5, address);
                ps.setString(6, email);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Registraion successfull");
                    formClear();
                    Login lg = new Login();
                    lg.setVisible(true);
                    this.setVisible(false);
                    this.dispose();
                }
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_createBtnActionPerformed

    private void formClear() {
        idTf.setText("");
        emailTf.setText("");
        nameTf.setText("");
        addressTf.setText("");
        phoneTf.setText("");
        passwordTf.setText("");
        confirmPasswordTf.setText("");
    }

    public boolean checkId(String id) {

        boolean checkId = false;
        String query = "SELECT * FROM `ADMIN_TABLE` WHERE `AdminId` = ?";

        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, id);

            rs = ps.executeQuery();

            if (rs.next()) {
                checkId = true;
            }
        } catch (SQLException ex) {
        }
        return checkId;
    }

    public boolean checkPhone(String phone) {
        boolean checkPhone = false;
        String query = "SELECT * FROM `ADMIN_TABLE` WHERE `phone` = ?";

        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, phone);

            rs = ps.executeQuery();

            if (rs.next()) {
                checkPhone = true;
            }
        } catch (SQLException ex) {
        }
        return checkPhone;
    }

    public boolean checkEmail(String email) {
        boolean checkEmail = false;
        String query = "SELECT * FROM `ADMIN_TABLE` WHERE `email` = ?";

        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, email);

            rs = ps.executeQuery();

            if (rs.next()) {
                checkEmail = true;
            }
        } catch (SQLException ex) {
        }
        return checkEmail;
    }
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new NewAdmin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTf;
    private javax.swing.JButton backBtn;
    private javax.swing.JPasswordField confirmPasswordTf;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField emailTf;
    private javax.swing.JTextField idTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameTf;
    private javax.swing.JPasswordField passwordTf;
    private javax.swing.JTextField phoneTf;
    // End of variables declaration//GEN-END:variables

}
