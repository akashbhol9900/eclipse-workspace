package com.virtusa3;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {
 public  boolean insertStudentToDb(Student student)
 {
	 boolean f=false;
	 try
	 {
		 Connection con=Cp.createConnection();
		// String query="insert into rakhii(StudenId,name,phno,city) values(?,?,?,?)";
		 PreparedStatement preparedstatement=con.prepareStatement("insert into rakhii(StudenId,name,phno,city) values(?,?,?,?)");
		 preparedstatement.setString(1,student.getStudenId());
		 preparedstatement.setString(2,student.getName());
		 preparedstatement.setString(3,student.getPhno());
		 preparedstatement.setString(4,student.getCity());
		 preparedstatement.executeUpdate();
		 f=true;
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	return f; 
 }
// public boolean showAllStudent()
// {
//	 
// }
// public boolean deleteStudent()
// {
//	 
// }
// public boolean updateStudent()
// {
//	 
// }
}
