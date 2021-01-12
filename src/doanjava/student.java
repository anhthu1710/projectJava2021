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
    
    
    
    public void fillRegisterStudent(JTable tableStudents, String valueToSearch){
        Connection con=DBConnection.connectDB();
        PreparedStatement ps;
        
        try {
               
                
                ps = con.prepareStatement("SELECT *  From student_hocvien Where CONCAT("
                        + "idstudent_hocvien"
                        + ",name_student,"
                        + "sex,"
                        + "born,"
                        + "number_phone,"
                        + "email,"
                        + "address) like ?");
                ps.setString(1,"%"+valueToSearch+"%");
                
                ResultSet rs= ps.executeQuery();
                DefaultTableModel model = (DefaultTableModel)tableStudents.getModel();
                 
                Object[] row;
            
                while(rs.next()){
                    row = new Object[7];
                    row[0] = rs.getInt(1);
                    row[1] = rs.getString(2);
                    row[2] = rs.getString(3);
                    row[3] = rs.getString(4);
                    row[4] = rs.getString(5);
                    row[5] = rs.getString(6);
                    row[6] = rs.getString(7);
                    model.addRow(row);
                }
        } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
    } 
}
