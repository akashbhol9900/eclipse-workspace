package jdbc1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.*;

public class Connectivy1 {

	public static void main(String[] args)throws Exception {
		Connection con=null;
		Statement st=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc://mysql:3306/raja,'root','root'");
			if(con!=null)
			{
				st= con.createStatement();
				int i=st.executeUpdate("insert into apu values(4,'akash','bangolore')");
				if(i>0)
					System.out.println("data insert sussessfully");
			}
			else
				System.out.println("connection invalid");
			con.close();
		}
		catch(Exception e)
		{
			//e.printStackTrace();
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
