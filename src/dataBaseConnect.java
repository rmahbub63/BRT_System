/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author MAHBUB
 */
import java.sql.*;
import javax.swing.*;
public class dataBaseConnect {
    
    public static Connection connectdb()
    {
        Connection conn=null;
        try{
            Class.forName("org.sqlite.JDBC");
            conn =DriverManager.getConnection("jdbc:sqlite:BRTDB.sqlite");
            //JOptionPane.showMessageDialog(null, "Connection Established");
            return conn;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    
    
}
