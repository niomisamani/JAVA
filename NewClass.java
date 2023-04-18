/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.JavaDatabase;
import java.sql.*;

/**
 *
 * @author niomi
 */
public class NewClass {
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","niomi");
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from studentinfo");
            while(rs.next())
            {
                System.out.println(rs.getString(1) +" "+ rs.getString(2) +" "+ rs.getString(3) +" "+ rs.getString(4) +" "+ rs.getString(5) +" " + rs.getString(6) +" " + rs.getString(7) +" " + rs.getString(8) +" " );
                
            }
            con.close();
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Exception found" + e);
        }
    }
            
    
}
