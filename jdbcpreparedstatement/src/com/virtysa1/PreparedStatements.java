package com.virtysa1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatements {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
      Connection con=null;
      PreparedStatement pst=null;
      String eno;
      String ename;
      String location;
      String sal;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      //String qry="insert into emp2(eno,ename,location,sal) values(?,?,?,?)";
      try
      {
    	  Class.forName("com.mysql.cj.jdbc.Driver");
    	  System.out.println("driver is loaded");
    	  con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=root");
    	  System.out.println("connection established");
    	  pst=con.prepareStatement("insert into akash.emp2(eno,ename,location,sal) values(?,?,?,?)");
    	  for(int i=0;i<=2;i++)
    	  {
    		System.out.println("enter the "+(i+1)+"employeedetails");  
    	  
    	  System.out.println("enter the eno");
    	  eno=br.readLine();
    	  System.out.println("enter the ename");
    	  ename=br.readLine();
    	  System.out.println("enter the location");
    	  location=br.readLine();
    	  System.out.println("enter the sal");
    	  sal=br.readLine();
    	  pst.setString(1, eno);
    	  pst.setString(2, ename);
    	  pst.setString(3, location);
    	  pst.setString(4, sal);
    	 	pst.executeUpdate();
    	 	System.out.println("data inserted sussesfully");
    	  }  
      }
      catch(ClassNotFoundException| SQLException e)
      {
    	  e.printStackTrace();
      }
      
	}

}
