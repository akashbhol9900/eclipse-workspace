package com.virtusa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert2Db {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Connection con=null;
       Statement smpt=null;
       String qry1="insert into akash.emp2(eno,ename,location,sal) values(12,'rakesh','hyd',2000);";
       try
       {
    	   Class.forName("com.mysql.jdbc.Driver");
    	   System.out.println("Driver loaded");
    	   con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=root");
    	   System.out.println("connection esatblished");
    	   smpt=con.createStatement();
    	   System.out.println("platfrom created");
    	   smpt.executeUpdate(qry1);
    	   System.out.println("data inserted sussesfully");
       }
       catch(ClassNotFoundException| SQLException e)
       {
    	  e.printStackTrace(); 
       }
	}

}
