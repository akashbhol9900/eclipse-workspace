package com.virtusa4;

import java.util.LinkedList;
import java.util.Scanner;

public class Thread1 extends Thread{
	public void run()
	{
		LinkedList<Integer> li=new LinkedList<>();
	     Scanner sc=new Scanner(System.in);
	     for(int i=0;i<5;i++)
	     {
	    	int a=sc.nextInt();
	    	li.add(a);
	     }
	     System.out.print(li);	
	}

}
