/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.view;

import ec.edu.espe.cinemaboxoffice.controller.LogInController;
import javax.swing.JOptionPane;

/**
 *
 * @author Josue Aleman, ESPE
 */
public class FrmAdminLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrmAdminLogin
     */
    public FrmAdminLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAdmin = new javax.swing.JLabel();
        lblAdminUser = new javax.swing.JLabel();
        lblAminkey = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        pwfPass = new javax.swing.JPasswordField();
        btnAdminLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        lblAdmin.setFont(new java.awt.Font("Comic Sans MS", 3, 20)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin.setText("Admin");

        lblAdminUser.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblAdminUser.setForeground(new java.awt.Color(255, 255, 255));
        lblAdminUser.setText("User:");

        lblAminkey.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblAminkey.setForeground(new java.awt.Color(255, 255, 255));
        lblAminkey.setText("Password:");

        btnAdminLogin.setText("Login");
        btnAdminLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminLoginMouseClicked(evt);
            }
        });
        btnAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminLoginActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/smallCinemaLogo.png"))); // NOI18N

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdminUser)
                    .addComponent(lblAminkey))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(lblAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(btnAdminLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblAdmin))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)))
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdminUser))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAminkey))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdminLogin)
                    .addComponent(btnExit))
                .addContainerGap(56, Short.MAX_VALUE))
        );

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminLoginMouseClicked

    }//GEN-LAST:event_btnAdminLoginMouseClicked

    private void btnAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminLoginActionPerformed
        // TODO add your handling code here:
        LogInController veryfier = new LogInController();
        String username = txtUsername.getText();
        String password = pwfPass.getText();

        if (username.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Please, enter an username",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );

            return;
        }
        if (password.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Please, enter a password",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        boolean accountFound = false;
        accountFound = veryfier.findUser(username, password);
        if (accountFound == true) {
            JOptionPane.showMessageDialog(
                    null,
                    "Correct account!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
            );
            this.setVisible(false);
            new FrmAdmin().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Incorrect Account",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            txtUsername.setText("");
            pwfPass.setText("");
            
        }
    }//GEN-LAST:event_btnAdminLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminLogin;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblAdminUser;
    private javax.swing.JLabel lblAminkey;
    private javax.swing.JPasswordField pwfPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
