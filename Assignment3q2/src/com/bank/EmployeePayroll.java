package com.bank;

import java.util.Scanner;
class InvalidCredentailsException extends RuntimeException {
	public InvalidCredentailsException (String desc) {
		super (desc);
	}
}

public class EmployeePayroll {
	
	public static boolean findSpace(String str) {
	    for(int i=0;i<str.length();i++) {
	       if(str.charAt(0) ==' ' || str.charAt(i) ==' ' && str.charAt(i+1)!=' ') {
                 return true;
	       }	
	     }
		return false;
	}
	
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		System.out.println("Welcome to Employee Payroll Management Portal\n\nEnter Username:");
		
		String userName = in.nextLine ();
		if (userName == null|| userName.trim ().equals ("") || findSpace (userName)) {
			throw new InvalidCredentailsException("Login Failed due to invalid Username");
		}
		else {
			System.out.println("Enter Password:");
			String pwd = in.nextLine ();
			if (pwd.equals("1234qwer$")) {
				System.out.println("login successfull");
			}
			else {
				throw new InvalidCredentailsException("Login Failed due to invalid Password");
			}
		}
	}
}
