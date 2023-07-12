package com.virtusa1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudDao {
   public boolean insertDb(Student student)
   {
	   boolean f=false;
	   try
	   {
		   Connection con=Cp.createConnection();
		   PreparedStatement psts=con.prepareStatement("insert into akash.emp2(eno,ename,location,sal) values(?,?,?,?)");
		   psts.setString(1,student.getEno());
		   psts.setString(2, student.getEname());
		   psts.setString(3,student.getLocation());
		   psts.setString(4, student.getSal());
		   psts.executeUpdate();
		   System.out.println("data inserted sussesfully");
	   }
	   catch(Exception e)
	   {
		   System.out.println("data insertd not sussesfully");
	   }
	   return f;
	   
   }
}
