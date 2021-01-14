package libraryassistant;

@SuppressWarnings("serial")
public class MemberHome extends javax.swing.JFrame {
   
    public MemberHome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        issue_book = new javax.swing.JLabel();
        search_book = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        statistics = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        return_book = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Issue Book");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(780, 180, 90, 30);

        issue_book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/issue book.png"))); // NOI18N
        issue_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                issue_bookMouseClicked(evt);
            }
        });
        jPanel1.add(issue_book);
        issue_book.setBounds(770, 100, 90, 80);

        search_book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SearchBook.png"))); // NOI18N
        search_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_bookMouseClicked(evt);
            }
        });
        jPanel1.add(search_book);
        search_book.setBounds(570, 100, 80, 80);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Search Book");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(560, 190, 110, 20);

        statistics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/statistics.png"))); // NOI18N
        statistics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statisticsMouseClicked(evt);
            }
        });
        jPanel1.add(statistics);
        statistics.setBounds(590, 270, 70, 80);

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Statistics");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(590, 360, 80, 20);

        return_book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return book.png"))); // NOI18N
        return_book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                return_bookMouseClicked(evt);
            }
        });
        jPanel1.add(return_book);
        return_book.setBounds(760, 260, 110, 80);

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Return Book");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(780, 350, 102, 20);

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
        logoutBtn.setBounds(670, 430, 130, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home page.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 930, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(936, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void issue_bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issue_bookMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        IssueBook ib = new IssueBook();
        ib.setVisible(true);
    }//GEN-LAST:event_issue_bookMouseClicked

    private void search_bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_bookMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        SearchBook sb = new SearchBook();
        sb.setVisible(true);
    }//GEN-LAST:event_search_bookMouseClicked

    private void return_bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return_bookMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        ReturnBook rb = new ReturnBook();
        rb.setVisible(true);
    }//GEN-LAST:event_return_bookMouseClicked

    private void statisticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statisticsMouseClicked
        // TODO add your handling code here
        this.setVisible(false);
        this.dispose();
        MemberStatistics ms = new MemberStatistics();
        ms.setVisible(true);
    }//GEN-LAST:event_statisticsMouseClicked

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        Login lg=new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new MemberHome().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel issue_book;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel return_book;
    private javax.swing.JLabel search_book;
    private javax.swing.JLabel statistics;
    // End of variables declaration//GEN-END:variables
}
