package com.virtusa2;

public class DisplayTenTo1 extends Thread
{
	public void run()
	 {
		 for(int i=10;i>=0;i--)
		 {
			 System.out.print(i+" ");
		 }
	 }
}
