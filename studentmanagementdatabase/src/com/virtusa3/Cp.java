package com.virtusa3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Cp {
	static Connection connection;

	public static Connection  createConnection()
	{
    Connection con=null;
    Statement st=null;
    try
    {
    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("driver loaded");
    String url="jdbc:mysql://localhost:3306/rakhi";
    String username="root";
    String password="root";
    con=DriverManager.getConnection(url,username,password);
    System.out.println("connection established");
    }
    catch(Exception e)
    {
    	
    System.out.println("sorry connection is not established");
    	e.printStackTrace();
    }
    return connection;
    }
}
