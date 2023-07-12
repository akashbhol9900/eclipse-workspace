package com.atm;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Diposite";
		String s2 = "Withdrawl";
		AtmMachine at=new AtmMachine();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Diposite or Withdrawl");
		String s3 = sc.nextLine();
		if(s1.equals(s3)) {
			int i = sc.nextInt();
			at.diposite();
		}
		
		
		
		

	}

}
