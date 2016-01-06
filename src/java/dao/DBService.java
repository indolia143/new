package dao;

import java.sql.*;

public class DBService
{
 private static Connection con;

 static
 {
   try{
   Class.forName("com.mysql.jdbc.Driver");

   String url="jdbc:mysql://localhost:3306/onps";
   String user = "root";
   String pwd = "mysql";

   con = DriverManager.getConnection(url,user,pwd);
   }
   catch(Exception e)
   {
     System.err.println("CONNECTION ERROR : "+e.getMessage());
   }
 }

 //CALL TO GET DATABASE CONNECTION
 public static Connection getConnection()
 {
   return con;
 }

 //CALL TO PERFORM CUID OPERATION ON DB
 public static int updateData(String sql)
 {
   try{
   Statement st = con.createStatement();
   int ur = st.executeUpdate(sql);
   return ur;
   }
   catch(Exception e)
   {
  System.err.println("UPDATE ERROR : "+e.getMessage());
    return 0;
   }
 }

 //CALL TO PERFORM PROJECTION/SELECT OPERATION ON DB
 public static ResultSet selectData(String sql)
 {
   try{
   Statement st = con.createStatement();
   ResultSet rs = st.executeQuery(sql);
   return rs;
   }
   catch(Exception e)
   {
  System.err.println("SELECT ERROR : "+e.getMessage());
    return null;
   }
 }

}