package com.virtusa4;
import java.util.ArrayList;
import java.util.Scanner;
public class Thread2 extends Thread{
 public void run()
 {
	 ArrayList lii=new ArrayList();
	 Scanner sc=new Scanner(System.in);
	 //int p=6;
	 for(int i=0;i<5;i++)
	 {
		 int s=sc.nextInt();
		 //System.out.print(i);
		 lii.add(s);
	 }
	 for(int i=lii.size();i>0;i--)
	 {
		 //int s=sc.nextInt();
		 System.out.print(i);
	 }
}
  
}
