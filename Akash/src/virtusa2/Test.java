package virtusa2;
import java.util.Scanner;
import java.lang.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Departmaent department=new Departmaent();
		System.out.println("taking the for Departeament table");
		int dno=sc.nextInt();
		sc.nextLine();
		String dname=sc.nextLine();
		String loc=sc.nextLine();
		 department.setDno(dno);
		 department.setDname(dname);
		 department.setLoc(loc);
		System.out.println("showing Emp details");
		Emp e=new Emp();
		e.setEmpcode(101);
		e.setName("Akash");
		e.setPosition("balasore");
		e.setSal(10000);
		e.setDepartment(department);
	}

}
