import java.util.Scanner;

public class primeno3 {
	public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("user please enter ano ");
int n=sc.nextInt();
if(checkPrime(n))
	System.out.println("it is not prime");
else
	System.out.println("it is a prime no");
	
	}
	static boolean checkPrime(int n)
	{
		if(n<=1)return false;
		for(int i=2;i<=n;i++)
		{
			if(i%n==0)
				return false;
		}
		return true;
	}
}
