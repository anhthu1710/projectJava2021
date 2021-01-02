/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author AD
 */
public class RegisterAccount extends javax.swing.JFrame {

    /**
     * Creates new form RegisterAccount
     */
    public RegisterAccount() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtConfirmpassword = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbCombogender = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnReset1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setText("REGISTER ACCOUNT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 10, 240, 33);

        jLabel2.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(35, 47, 45, 32);
        getContentPane().add(txtName);
        txtName.setBounds(192, 52, 276, 22);

        jLabel3.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel3.setText("Username");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(35, 92, 77, 32);
        getContentPane().add(txtUsername);
        txtUsername.setBounds(192, 92, 276, 22);

        jLabel4.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(35, 142, 72, 32);
        getContentPane().add(txtPassword);
        txtPassword.setBounds(192, 142, 276, 22);

        jLabel5.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel5.setText("Comfirm password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(35, 192, 139, 32);
        getContentPane().add(txtConfirmpassword);
        txtConfirmpassword.setBounds(192, 192, 276, 22);
        getContentPane().add(txtPhone);
        txtPhone.setBounds(189, 287, 276, 22);

        jLabel6.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel6.setText("Email");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(32, 337, 41, 32);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(189, 337, 276, 22);

        jLabel7.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(32, 387, 62, 32);
        getContentPane().add(txtAddress);
        txtAddress.setBounds(189, 387, 276, 22);

        jLabel8.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel8.setText("Gender");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(32, 242, 55, 32);

        jLabel9.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        jLabel9.setText("Phone");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(32, 287, 46, 32);

        cbCombogender.setForeground(new java.awt.Color(255, 102, 102));
        cbCombogender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Female", "Male", "Other" }));
        getContentPane().add(cbCombogender);
        cbCombogender.setBounds(189, 247, 94, 22);

        btnSubmit.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubmit);
        btnSubmit.setBounds(280, 430, 81, 25);

        btnLogin.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnLogin.setText("login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(370, 430, 100, 25);

        btnReset1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnReset1.setText("Reset");
        btnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset1);
        btnReset1.setBounds(190, 430, 73, 25);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\AD\\Downloads\\sea.jpg")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(-2, 0, 600, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        dispose();
        LogIn li= new LogIn();
        li.setTitle("Login");
        li.setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
       
             String name= txtName.getText();
             String username= txtUsername.getText();
             String password= txtPassword.getText();
             String confirmPassword= txtConfirmpassword.getText();
             String gender=cbCombogender.getItemAt(cbCombogender.getSelectedIndex());
             String phone= txtPhone.getText();
             String email= txtEmail.getText();
             String address= txtAddress.getText();
            
             if(name.isEmpty() || username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() || gender.isEmpty() || phone.isEmpty()
                     || email.isEmpty() || address.isEmpty()){
                JOptionPane.showMessageDialog(this, "Các trường trong trang đăng kí không nên để trống", "Error !", JOptionPane.ERROR_MESSAGE);
             }else{
                userRegister(name, username, password, confirmPassword, gender, phone, email, address);
             }
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReset1ActionPerformed
    private void userRegister(String name, String username, String password, String confirmPassword, 
            String gender, String phone, String email, String address) {
        Connection conDB= DBConnection.connectDB();
        if(conDB!=null){
            try {
                PreparedStatement st= (PreparedStatement)conDB.prepareStatement("INSERT INTO register_account_qlhv (name, username, password, confirm_password, gender, phone, email, address) VALUE (?,?,?,?,?,?,?,?)") ;
                
                st.setString(1, name);
                st.setString(2, username);
                st.setString(3, password);
                st.setString(4, confirmPassword);
                st.setString(5, gender);
                st.setString(6, phone);
                st.setString(7, email);
                st.setString(8, address);
                
                
                int res= st.executeUpdate();
                JOptionPane.showMessageDialog(this, "Dữ liệu đăng kí thành công", "Success ^-^", JOptionPane.ERROR_MESSAGE);
                
            }catch (SQLException ex) {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Không thể kết nối database!");
        }
    }
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
            java.util.logging.Logger.getLogger(RegisterAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnReset1;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cbCombogender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtConfirmpassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    
}
