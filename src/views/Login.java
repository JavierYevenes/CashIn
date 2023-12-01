package views;
import models.Conection;
import models.Encodecrip;
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Javier Yévenes
 */
public class Login extends javax.swing.JFrame {
       private Encodecrip encrip;
    
    public static String user = "";
    String pass = "";
    
    public Login() {
        initComponents();
        setSize(300,250);
        setResizable(false);
        setTitle("CashIn | Login");
        setLocationRelativeTo(null);
        Image icono=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/Logo-remove.png"));
        this.setIconImage(icono);
        this.BtnViewnot.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtPass = new javax.swing.JPasswordField();
        TxtUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnOk = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BtnView = new javax.swing.JLabel();
        BtnViewnot = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(TxtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 90, -1));
        getContentPane().add(TxtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 90, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Login");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        BtnOk.setText("Ingresar");
        BtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOkActionPerformed(evt);
            }
        });
        getContentPane().add(BtnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel4.setText("Creado por Javier Yévenes - NebuLabs ®");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        BtnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/HeroiconsEye.png"))); // NOI18N
        BtnView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnViewMousePressed(evt);
            }
        });
        getContentPane().add(BtnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        BtnViewnot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/HeroiconsEyeSlash.png"))); // NOI18N
        BtnViewnot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnViewnotMousePressed(evt);
            }
        });
        getContentPane().add(BtnViewnot, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOkActionPerformed
        user = TxtUser.getText().trim();
        pass = encrip.encode(TxtPass.getText().trim());
        
        try{
            Connection cn = Conection.Conection();
            PreparedStatement pst = cn.prepareStatement(
            "SELECT Usuario_login, Usuario_pass WHERE username = '" + user + "' and password = '" + pass + "'"
            );
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){}else{
                JOptionPane.showMessageDialog(null, 
                        "Los datos ingresados están incorrectos. \n \n "
                        + "Verifique que su Nombre de usuario y/o Contraseña estén Correctos.");
            }
        }catch(SQLException e){
            System.err.println("Error al Acceder.");
            JOptionPane.showMessageDialog(null, "Error de conexión, Vuelva a intentarlo. ");
        }
    }//GEN-LAST:event_BtnOkActionPerformed

    private void BtnViewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnViewMousePressed
        BtnViewnot.setVisible(true);
        BtnView.setVisible(false);
        TxtPass.setEchoChar((char)0);        
    }//GEN-LAST:event_BtnViewMousePressed

    private void BtnViewnotMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnViewnotMousePressed
        BtnView.setVisible(true);
        BtnViewnot.setVisible(false);
        TxtPass.setEchoChar('*'); 
    }//GEN-LAST:event_BtnViewnotMousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnOk;
    private javax.swing.JLabel BtnView;
    private javax.swing.JLabel BtnViewnot;
    private javax.swing.JPasswordField TxtPass;
    private javax.swing.JTextField TxtUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
