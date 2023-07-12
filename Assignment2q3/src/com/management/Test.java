package com.management;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
      System.out.println("Taking students details from");
      System.out.println("Enter student id");
      String id=sc.nextLine();
      System.out.println("Enter student sname");
      String name=sc.nextLine();
      System.out.println("Enter student sDOB");
      String DOB=sc.nextLine();
      System.out.println("Enter student sblood");
      String blood=sc.nextLine();
      System.out.println("Enter student sheight");
      double height=sc.nextDouble();
      System.out.println("Enter student matricmark");
      double matricmark=sc.nextDouble();
      System.out.println("Enter student sintermidatemar");
      double intermediatemark=sc.nextDouble();
      Student s=new Student();
      s.setId(id);
                                                                                                                                                                              
      s.setName(name);
      s.setDOB(DOB);
      s.setBlood(blood);
      s.setHeight(height);
      s.setMatricmark(matricmark);
      s.setIntermediatemark(intermediatemark);
      s.show();
      System.out.println("enter your name and id to show your details..");
      System.out.println("Enter your name");
      String name1=sc.nextLine();
      sc.nextLine();
      System.out.println("Enter your id");
      String id1=sc.nextLine();
      if(name1.equals(name1) && id1.equals(id1))
      {
    	  s.show();
     }
	}

}
