/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegekart.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBConnection {
    private static Connection conn;
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/college_kart","root","");
            JOptionPane.showMessageDialog(null,"Connected To Database");
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "cannot connect to database");
        }
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void closeConnection(){
        try{
            conn.close();
            JOptionPane.showMessageDialog(null,"Disconnected successfuly ");
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "cannot close to connection");
        }
    }
    
}

