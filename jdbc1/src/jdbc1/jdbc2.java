package jdbc1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class jdbc2 {
   static
   {
	   try
	   {
		   Class.forName("com.mysql.jdbc.driver");
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement st=null;
		int eno;
		String ename;
		String eaddress;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raja","root","root");
			if(con!=null)
			{
				st=con.createStatement();
				System.out.println("Enter employee details");
				eno=Integer.parseInt(br.readLine());
				ename=br.readLine();
				eaddress=br.readLine();
				int i=st.executeUpdate("insert into raku values("+eno+",'"+ename+"','"+eaddress+"')");
				if(i>0)
				{
					System.out.println("data insert successfully");
				}
				con.close();
			}
			
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
	}

}
