package jdbc1;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import java.io.*;
public class Connectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raja","root","root");
			if(con!=null)
			{
				st=con.createStatement();
				int i=st.executeUpdate("insert into apu values(3,'rakesh','hyd')");
				if(i>0)
					System.out.println("data inserted sussesfully");
			}
			else
			{
				System.out.println("connection not established");
			}
			con.close();
		}
		
		catch(Exception e)
		{
			try
			{
				con.close();
			}
			catch(SQLException e1)
			{
				e1.printStackTrace();
			}
		}
		finally
		{
			try
			{
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
