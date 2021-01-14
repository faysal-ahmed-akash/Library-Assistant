package libraryassistant;

import javax.swing.UIManager;

@SuppressWarnings("serial")
public class Loading extends javax.swing.JFrame implements Runnable {

    private final Thread th;
    private String a;
    private int i;

    public Loading() {
        initComponents();
        th = new Thread((Runnable) this);
    }

    public void loading(String actor) {
        th.start();
        this.a = actor;
    }

    @Override
    public void run() {
        try {
            for (i = 1; i <= 100; i++) {
                jProgressBar1.setValue(i);
                Thread.sleep(20);
            }
            this.setVisible(false);
            this.dispose();
            switch (a) {
                case "Admin":
                    AdminHome ah = new AdminHome();
                    ah.setVisible(true);
                    break;
                case "Librarian":
                    LibrarianHome lh = new LibrarianHome();
                    lh.setVisible(true);
                    break;
                case "Member":
                    MemberHome mh = new MemberHome();
                    mh.setVisible(true);
                    break;
            }
        } catch (Exception e) {
        }
    }

    @SuppressWarnings({"unchecked", "Convert2Lambda"})
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Loading.....");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 80, 150, 41);

        jProgressBar1.setForeground(new java.awt.Color(0, 153, 102));
        jProgressBar1.setOpaque(true);
        jProgressBar1.setStringPainted(true);
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(90, 130, 360, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loading.gif"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 530, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(715, 554));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

                UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");

            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Loading().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables

}
