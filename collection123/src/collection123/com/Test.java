package collection123.com;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Comparable<Integer> compereter=new Comparable<>();
		//Emp e=new Emp();
		ArrayList<Emp> li=new ArrayList<>();
		Emp e=new Emp();
		Scanner sc=new Scanner(System.in);
		System.out.println("taking the no of userdetails from user");
		int k=sc.nextInt();
		for(int i=0;i<k;i++)
		{
			System.out.println("taking user eno");
			int p=sc.nextInt();
			System.out.println("taking user ename");
			String s=sc.nextLine();
			sc.nextLine();
			System.out.println("taking user eadd");
			String s1=sc.nextLine();
			li.add(new Emp(p,s,s1));
		}
		//Collections.sort(li);
		for(Emp e1:li)
		{
			System.out.println(e1.getEno()+"  "+e1.getEname()+"  "+e1.getEadd());
		}
	}

}
