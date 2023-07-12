package jdbc1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class PrepareStatementDemo {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pst=null;
		int eno;
		String ename,address;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raja","root","root");
			if(con!=null) {
				pst=con.prepareStatement("insert into raku values(?,?,?)");
				for(int i=0;i<5;i++) {
					System.out.println("enter the emp"+(i+1)+"details");
					eno=Integer.parseInt(br.readLine());
					ename=br.readLine();
					address =br.readLine();
					pst.setInt(1, eno);
					pst.setString(2, ename);
					pst.setString(3,address);
					int i1=pst.executeUpdate();
					if(i1>0)
						System.out.println("data inserted successfully");
					
					
				}
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	}


