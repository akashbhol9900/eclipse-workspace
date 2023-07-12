package com.virtusa2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     DisplayOneToTen t=new DisplayOneToTen();
     t.run();
    //DisplayOneToTen t1=new DisplayOneToTen();
     System.out.println(" ");
     DisplayTenTo1 p=new DisplayTenTo1();
     p.start();
     
     Runnable r=new DisplayOneToTen();
     r.run();
     System.out.println(" ");
     Runnable r1=new TenToOne();
     System.out.println(" ");
     r1.run();
     
	}

}
