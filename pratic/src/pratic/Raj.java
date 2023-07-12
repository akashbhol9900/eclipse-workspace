package pratic;
import java.util.Scanner;
public class Raj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("taking input from user");
	int n=sc.nextInt();
	int i;
	int space;
	int j;
	for(i=1;i<=n;i++)
	{
		for(space=i;space<=(n-i);space++)
		{
			System.out.print("");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println("  ");
	}
	 
	
}

}
