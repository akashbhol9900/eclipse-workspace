package Virtusa1;
import java.util.Scanner;
public class SalaryStructer {
	//int bsal;
	public int hra(int bsal)
	{
		int a=bsal*1/10;
		//System.out.println(a);
		return a;
	}
	public int ca(int bsal)
	{
		int b=bsal*1/20;
		//System.out.println(b);
		return b;
	}
	public int pf(int bsal)
	{
		int c=bsal*12/100;
		//System.out.println(c);
		return c;
	}
	public int  ptax(int bsal)
	{
		int d=bsal*1/50;
		//System.out.println(d);
		return d;
	}
	public void grossSalary(int bsal)
	{
		 SalaryStructer e=new SalaryStructer();
	    int A= e.hra(bsal);
	     //System.out.println(A);
	     int B= e.ca(bsal);
	     //System.out.println(B);
	    int  grosssal=bsal+(A+B);
	    System.out.println(grosssal);
	}
	public void netSalary(int bsal)
	{
		 SalaryStructer e=new SalaryStructer();
		    int A= e.hra(bsal);
		     //System.out.println(A);
		     int B= e.ca(bsal);
		     //System.out.println(B);
		    int  grosssal=bsal+(A+B);
		   // System.out.println(grosssal);
		    int C=e.pf(bsal);
		    int D=e.ptax(bsal);
		    int netsal=grosssal-(C+D);
		    System.out.println(netsal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("taking basic salaty from user");
     int bsal=sc.nextInt();
     
     SalaryStructer e=new SalaryStructer();
//      e.HRA(bsal);
     e.grossSalary(bsal);
     e.netSalary(bsal);
	}

}
