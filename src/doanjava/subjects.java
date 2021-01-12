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
public class subjects {
    public void insertUpdateDeleteStudentSubject(char operation, Integer id, String name_student_subject, String born_student_subject, String codeStudent, String number_phone, String name_subject_one, String name_subject_two, String name_subject_three, 
                                                String class_subject_one, String class_subject_two, String class_subject_three){
        Connection con=DBConnection.connectDB();
        PreparedStatement ps;
        
        if(operation == 'i'){
            try {
                ps = con.prepareStatement("Insert into subject_hocvien(name_student_subject, "
                        + "born_student_subject, codeStudent, number_phone, "
                        + "name_subject_one,name_subject_two,name_subject_three,"
                                            + "class_subject_one,"
                        + "class_subject_two,class_subject_three) Values(?,?,?,?,?, ?,?,?,?,?)");
                ps.setString(1, name_student_subject);
                ps.setString(2, born_student_subject);
                ps.setString(3, codeStudent);
                ps.setString(4, number_phone);
                ps.setString(5, name_subject_one);
                ps.setString(6, name_subject_two);
                ps.setString(7, name_subject_three);
                ps.setString(8, class_subject_one);
                ps.setString(9, class_subject_two);
                ps.setString(10, class_subject_three);
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "Success!! register subject for student...");
                }
            } catch (SQLException ex) {
                Logger.getLogger(subjects.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        
    }
    
    public void fillStudentRegister(JTable table, String valueToSearch){
        Connection con=DBConnection.connectDB();
        PreparedStatement ps;
        
        try {
               
                
                ps = con.prepareStatement("SELECT *  From subject_hocvien Where CONCAT("
                        + "name_student_subject"
                        + ",born_student_subject,"
                        + "codeStudent,"
                        + "number_phone,"
                        + "name_subject_one,"
                        + "name_subject_two,"
                        + "name_subject_three,"
                        + "class_subject_one,class_subject_two,class_subject_three) like ?");
                ps.setString(1,"%"+valueToSearch+"%");
                
                ResultSet rs= ps.executeQuery();
                 DefaultTableModel model = (DefaultTableModel)table.getModel();
                 
                Object[] row;
            
                while(rs.next()){
                    row = new Object[11];
                    row[0] = rs.getInt(1);
                    row[1] = rs.getString(2);
                    row[2] = rs.getString(3);
                    row[3] = rs.getString(4);
                    row[4] = rs.getString(5);
                    row[5] = rs.getString(6);
                    row[6] = rs.getString(7);
//                    row[7] = rs.getString(8);
                    row[8] = rs.getString(9);
                    row[9] = rs.getString(10);
                    row[10] = rs.getString(11);
                    model.addRow(row);
                }
        } catch (SQLException ex) {
                Logger.getLogger(subjects.class.getName()).log(Level.SEVERE, null, ex);
            }
    } 
}
