package com.virtusa4;
import java.io.*;
import java.util.Properties;
import java.util.Scanner;
public class Test  {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your nmae");
		String name3=sc.nextLine();
		System.out.println("enter the password");
		String pass=sc.nextLine();
		// TODO Auto-generated method stub
		Properties p=new Properties();
//      FileInputStream fis=new FileInputStream("D:\\eclipse-workspace\\serilazation\\src\\com\\virtusa4\\abcd.Properties");
//      p.load(fis);
//      String name=p.getProperty("name");
//      String name1=p.getProperty("name1");
//      String name2=p.getProperty("name2");
//      
//      System.out.println(name+"\t"+name1+"\t"+name2);
      FileOutputStream fos=new FileOutputStream("D:\\eclipse-workspace\\serilazation\\src\\com\\virtusa4\\abcd.Properties");
//      p.setProperty("company", "virtusa");
//      p.setProperty("company1", "tcs");
//      p.setProperty("rollno", "7");
      p.setProperty("name3", name3);
      p.setProperty("pass", pass);
      p.store(fos, "extraproperty");
//      System.out.println();
//      String company=p.getProperty("company");
//      String company1=p.getProperty("company1");
//      String rollno=p.getProperty("rollno");
      name3=p.getProperty("name3");
      name3=p.getProperty("pass");
      System.out.println(name3+"\t"+pass);
	}

}
