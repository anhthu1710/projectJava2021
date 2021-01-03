/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doanjava;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AD
 */
public class MyFunction {
    public static int countData(String tableName){
        int total=0;
        Connection con= DBConnection.connectDB();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs= st.executeQuery("SELECT COUNT(*) FROM register_account_qlhv");
            while(rs.next()){
                total=rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return total;
    }
}
