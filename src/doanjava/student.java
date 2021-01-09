/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanjava;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AD
 */
public class student {
    public void insertUpdateDeleteStudent(char operation, Integer id, String name_student, String sex, String born, String number_phone, String email, String address){
        Connection con=DBConnection.connectDB();
        PreparedStatement ps;
        
        if(operation == 'i'){
            try {
                ps = con.prepareStatement("Insert into student_hocvien(name_student,sex,born,number_phone,email,address) Values(?,?,?,?,?,?)");
                ps.setString(1, name_student);
                ps.setString(2, sex);
                ps.setString(3, born);
                ps.setString(4, number_phone);
                ps.setString(5, email);
                ps.setString(6, address);
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "New student adds");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
