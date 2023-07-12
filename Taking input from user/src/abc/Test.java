package abc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
public class Test {

	public static void main(String[] args) throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int eno;
		String name;
		String address;
		TreeSet<Emp> t=new TreeSet<>();
		//Emp emp=new Emp();
		for(int i=0;i<=1;i++)
		{
			System.out.println("Enter Employee"+(i+1)+"details");
			eno=Integer.parseInt(br.readLine());
			name=br.readLine();
			address=br.readLine();
			t.add(new Emp(eno,name,address));
		}
		System.out.println(t);
	}

}
