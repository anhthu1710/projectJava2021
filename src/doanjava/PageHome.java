/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanjava;

/**
 *
 * @author AD
 */
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
public class PageHome extends javax.swing.JFrame {

    /**
     * Creates new form PageHome
     */
    public PageHome() {
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

        jPanel2 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                ImageIcon im=new ImageIcon("school.png");
                Image i=im.getImage();

                g.drawImage(i, 0, 0, this.getSize().height, this.getSize().width, this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnDangkihocvien = new javax.swing.JButton();
        btnQuanlyhocvien = new javax.swing.JButton();
        btnDangkimonhoc = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblStudents = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Page home");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanjava/Images/Dream with you.png"))); // NOI18N

        jPanel5.setBackground(new java.awt.Color(204, 102, 0));

        btnDangkihocvien.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnDangkihocvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanjava/Images/Student-id-icon (1).png"))); // NOI18N
        btnDangkihocvien.setText("Đăng kí học viên");
        btnDangkihocvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangkihocvienActionPerformed(evt);
            }
        });

        btnQuanlyhocvien.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnQuanlyhocvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanjava/Images/Teacher-icon.png"))); // NOI18N
        btnQuanlyhocvien.setText("Quản lý học viên");
        btnQuanlyhocvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanlyhocvienActionPerformed(evt);
            }
        });

        btnDangkimonhoc.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnDangkimonhoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doanjava/Images/rss-edit-icon.png"))); // NOI18N
        btnDangkimonhoc.setText("Đăng kí môn học");
        btnDangkimonhoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangkimonhocActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 102, 0));

        lblStudents.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblStudents.setForeground(new java.awt.Color(255, 255, 255));
        lblStudents.setText("Account join=");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStudents)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStudents)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDangkimonhoc)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnQuanlyhocvien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDangkihocvien, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(69, 69, 69))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnDangkihocvien)
                .addGap(18, 18, 18)
                .addComponent(btnQuanlyhocvien)
                .addGap(18, 18, 18)
                .addComponent(btnDangkimonhoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuanlyhocvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanlyhocvienActionPerformed
        // TODO add your handling code here:
        QuanLyHocVien quanly=new QuanLyHocVien();
        quanly.setVisible(true);
        quanly.setTitle("Manager students");
        dispose();
    }//GEN-LAST:event_btnQuanlyhocvienActionPerformed

    private void btnDangkihocvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangkihocvienActionPerformed
        // TODO add your handling code here:
        Register_Students dkhv=new Register_Students();
        dkhv.setVisible(true);
        dkhv.setTitle("Register student");
        dispose();
    }//GEN-LAST:event_btnDangkihocvienActionPerformed

    private void btnDangkimonhocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangkimonhocActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnDangkimonhocActionPerformed

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
            java.util.logging.Logger.getLogger(PageHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PageHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PageHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PageHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangkihocvien;
    private javax.swing.JButton btnDangkimonhoc;
    private javax.swing.JButton btnQuanlyhocvien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JLabel lblStudents;
    // End of variables declaration//GEN-END:variables
}
