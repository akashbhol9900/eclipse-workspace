package virtusa3;

import java.util.Scanner;

import java.util.regex.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidData v = new ValidData();
		
		
		Scanner sc = new Scanner(System.in);
		String firstname=sc.nextLine();
		String lastname=sc.nextLine();
		//sc.nextLine();
		v.setFirstname(firstname);
		v.setLastname(lastname);
		String pno= sc.nextLine();
		
		
		sc.nextLine();
		Pattern p = Pattern.compile("[6-9][0-9]{9}");
		
		Matcher m = p.matcher(pno);
		
		boolean res = m.matches();
		
//		System.out.println(res);
		
		if(res==true) {
			
			v.setPno(pno);
			
			
			
		}
		else 
		{
			System.out.println("It is a invalid number");
		}
		//System.out.println(v.getPno());
		
		
		
		
		String email = sc.nextLine();
		
        Pattern pa = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
		
		Matcher ma = pa.matcher(email);
		
		boolean result = ma.matches();
		
		//System.out.println(result);
		if(result==true)
		{
			v.setEmail(email);
		}
		else
		{
			System.out.println("it is invalid email");
		}
		sc.nextLine();
		
		
		System.out.println(v.getFirstname()+" "+v.getLastname()+" "+v.getPno()+" "+v.getEmail());
	}

}
