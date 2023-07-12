package com.virtusa1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Cp {
 static Connection connection;
 public static Connection createConnection()
 {
	 Connection con=null;
	 Statement st=null;
 try
 {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 System.out.println("Driver is loaded");
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=root");
	 System.out.println("connection established sussesfully");
 } 
 catch(ClassNotFoundException| SQLException e)
 {
	System.out.println("connection is not established");
	e.printStackTrace();
 }
 return connection;
 }
}
