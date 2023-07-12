import java.util.Scanner;

public class prime2 {
   public void prime() {
	   int count=0;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("taking input from user");
	   int c=sc.nextInt();
	   for( int i=2;i<=c;i++)
	   {
		   //int ans=c%i;
		   if(c%i==0)
		   {
			  // System.out.println("it is not a prime no");
			    count++;
			   
		   }
		   //break;
	   }
	   if(count==2)
	   System.out.println("it is a prime no");
	   else
		   System.out.println("it is not aprime no");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime2 obj=new prime2();
        obj.prime();
	}

}
