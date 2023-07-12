
package Virtusa5;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		Emp emp = new Emp();
		
		int empcode = scn.nextInt(); 
		
		scn.nextLine();
		
		String position = scn.nextLine();
		
		String name = scn.nextLine();
		
		int sal = scn.nextInt();
		
		emp.setEmpcode(empcode);
		
		emp.setPosition(position);
		
		emp.setSal(sal);
		
		emp.setName(name);
		
		Address address = new Address();
		
		String cityname = scn.nextLine();
		
		String streetName = scn.nextLine();
		
		scn.nextLine();
		
		String pinCode = scn.nextLine();
		
		
		address.setCityname(cityname);
		
		address.setStreetname(streetName);
		
		address.setPincode(pinCode);
		
		scn.close();
		
		System.out.println(emp.getEmpcode()+" "+emp.getName()+" "+emp.getPosition()+" "+emp.getSal());
		System.out.println(emp.getAddress());
		
		
		
		
	}

}
