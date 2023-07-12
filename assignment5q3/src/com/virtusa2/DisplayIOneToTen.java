package com.virtusa2;

public class DisplayIOneToTen extends Thread {
 public void run()
 {
	 for(int i=1;i<=10;i++)
	 {
		 System.out.print(i+" ");
	 }
 }
}
