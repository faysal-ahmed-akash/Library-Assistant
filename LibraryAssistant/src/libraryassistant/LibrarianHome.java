package libraryassistant;

import javax.swing.UIManager;

@SuppressWarnings("serial")
public class LibrarianHome extends javax.swing.JFrame {

    public LibrarianHome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        newBook = new javax.swing.JLabel();
        newMember = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        statistics = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("New Book");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(530, 220, 90, 20);

        newBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new book.png"))); // NOI18N
        newBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newBookMouseClicked(evt);
            }
        });
        jPanel1.add(newBook);
        newBook.setBounds(530, 130, 70, 80);

        newMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/h_about.png"))); // NOI18N
        newMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newMemberMouseClicked(evt);
            }
        });
        jPanel1.add(newMember);
        newMember.setBounds(660, 40, 80, 80);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("New Member");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(650, 120, 110, 30);

        statistics.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        statistics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/statistics.png"))); // NOI18N
        statistics.setText("jLabel1");
        statistics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statisticsMouseClicked(evt);
            }
        });
        jPanel1.add(statistics);
        statistics.setBounds(820, 130, 70, 70);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Statistics");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(820, 210, 80, 20);

        logoutBtn.setBackground(new java.awt.Color(0, 102, 204));
        logoutBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Logout");
        logoutBtn.setBorderPainted(false);
        logoutBtn.setFocusPainted(false);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(logoutBtn);
        logoutBtn.setBounds(660, 280, 130, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home page.png"))); // NOI18N
        jLabel2.setText("ABCD");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 961, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(936, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newBookMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        NewBook nb = new NewBook();
        nb.setVisible(true);
    }//GEN-LAST:event_newBookMouseClicked

    private void newMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newMemberMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        NewMember nm = new NewMember();
        nm.setVisible(true);
    }//GEN-LAST:event_newMemberMouseClicked

    private void statisticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statisticsMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        Statistics s=new Statistics();
        s.setVisible(true);
    }//GEN-LAST:event_statisticsMouseClicked

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        Login lg=new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

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
            new LibrarianHome().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel newBook;
    private javax.swing.JLabel newMember;
    private javax.swing.JLabel statistics;
    // End of variables declaration//GEN-END:variables
}
