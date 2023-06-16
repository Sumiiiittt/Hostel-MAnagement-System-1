/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbConnection;

import java.sql.*;
/**
 *
 * @author ACER
 */
public class myConnection {
    public static Connection myDatabase()
    {
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hmsdb","root","database");
                    System.out.println("Database Connected!");
                    return conn;
        }
        catch (Exception e)
        
        {
        return null;    
        }
    }

    
}