package com.virtusa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsDb {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		String qry="insert into akash.emp1(eno,ename,location,sal) values (1,'jeet','bpd',1000);";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class loaded.........");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=root");
			System.out.println("Connection established......");
			stmt=con.createStatement();
			System.out.println("platform Created");
			stmt.executeUpdate(qry);
			System.out.println("Data inserted Successfully");
		}
		catch(ClassNotFoundException| SQLException e)
		{
		e.printStackTrace();	
		}
       
	}

}
