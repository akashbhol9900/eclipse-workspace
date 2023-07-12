package com.virtusa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Connection con=null;
      Statement smpt=null;
      String qry="delete from akash.emp1 where eno=12;";
      try
      {
    	  Class.forName("com.mysql.jdbc.Driver");
    	  System.out.println("the driver loaded");
    	  con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=root");
    	  System.out.println("connection established");
    	  smpt=con.createStatement();
    	  System.out.println("platfrom created");
    	  smpt.executeUpdate(qry);
    	  System.out.println("data deleted sussesfylly");
      }
      catch(ClassNotFoundException| SQLException e)
      {
    	  e.printStackTrace();
      }
	}

}
