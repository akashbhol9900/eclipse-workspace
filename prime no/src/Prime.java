import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		System.out.println("enter 2nd num:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int j;
		for(int i=n1;i<=n2;i++) {
			for(j=2;j<=i;j++)
			{
				if(i%j==0)
					break;
			}
			if(i==j)
				System.out.println(j+" ");
		}

	}

}
