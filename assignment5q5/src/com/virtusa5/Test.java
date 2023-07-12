package com.virtusa5;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		HashMap<Employee,Department> hs=new LinkedHashMap<Employee,Department>();
		for(int i=0;i<=2;i++)
		{
			System.out.println("please enter the employeeid");
			String eid=sc.nextLine();
			System.out.println("please enter the employeename");
			String ename=sc.nextLine();
			System.out.println("please enter the employeesal");
			int esal=sc.nextInt();
		Employee e=new Employee(eid,ename,esal,d);
		//hs.put(new Employee());
		}
		for(int i=0;i<=2;i++)
		{
			System.out.println("please enter the departmentid");
			String eid1=sc.nextLine();
			System.out.println("please enter the departmentname");
			String ename1=sc.nextLine();
			System.out.println("please enter the departmentloc");
			String esal1=sc.nextLine();
		Department d= new Department(eid1,ename1,esal1,Department);
		}
//		for (Map.Entry<Employee, Department> entry : Map.entrySet()) {
//	            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
//	        }
		 //hs.put(e, d);
	} 

}
