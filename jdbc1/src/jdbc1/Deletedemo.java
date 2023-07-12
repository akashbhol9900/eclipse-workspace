package jdbc1;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
public class Deletedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement pst=null;
		try
		{
			
		   Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raja","root","root");
			if(con!=null)
			{
				pst=con.prepareStatement("delete from raku where eno=?");
				pst.setInt(1, 11);
				int i=pst.executeUpdate();
				if(i>0)
					System.out.println("Delete successfully");
			}
			else
			{
				System.out.println("connection is not establised");
			}
			con.close();
	     }
		catch(Exception e)
		{
			e.printStackTrace();
		}

    }
}
