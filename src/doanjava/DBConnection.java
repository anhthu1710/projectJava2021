/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanjava;
import java.sql.*;

/**
 *
 * @author AD
 */
public class DBConnection {
    static final String DB_URL="jdbc:mysql://localhost:3306/quanlyhocvien";
    static final String USER="root";
    static final String PASS="123456";
    
    public static Connection connectDB() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(DB_URL,USER,PASS);
            return con;
        }catch(SQLException ex){
            System.out.println("Đó là lỗi trong khi kết nối database");
            return null;
        }
    }    
 }
