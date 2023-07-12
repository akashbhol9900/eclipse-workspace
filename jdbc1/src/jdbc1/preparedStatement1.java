package jdbc1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.SQLException;
import java.sql.SQLException;


public class preparedStatement1 {

	public static void main(String[] args) throws Exception {
		String eno;
		String ename;
		String location;
		String sal;
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		Connection con=null;
		PreparedStatement pst=null;
		//String qry="insert into akash.emp2(eno,ename,location,sal) values(?,?,?,?)";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&&password=root");
			System.out.println("connection established");
			System.out.println("enter the eno");
			eno=br.readLine();
			System.out.println("enter the ename");
			ename=br.readLine();
			System.out.println("enter the location");
			location =br.readLine();
			System.out.println("enter the sal");
			sal=br.readLine();
			pst=con.prepareStatement("insert into akash.emp2(eno,ename,location,sal) values(?,?,?,?)");
			pst.setString(1, eno);
			
			pst.setString(2, ename);
			pst.setString(3, location);
			pst.setString(4, sal);
			
			//pst=(PreparedStatement) con.createStatement();
			System.out.println("platfrom created");
			pst.executeUpdate();
			System.out.println("data inserted sussesfully");
			
			pst.close();
		}
		catch(ClassNotFoundException| SQLException e)
		{
			e.printStackTrace();
			
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}

	}

}
