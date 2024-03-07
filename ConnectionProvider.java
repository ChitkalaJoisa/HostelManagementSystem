/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;

/**
 *
 * @author Administrator
 */
public class ConnectionProvider {
    public static Connection getcon(){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel2","root","123456");
            return conn;
        }
        catch(Exception e)
        {
            return null;
        }
    } 
     public static void main(String[] args){

        getcon();
        
        
    }
}
