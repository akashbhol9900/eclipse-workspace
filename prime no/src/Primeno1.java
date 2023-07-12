import java.util.Scanner;

public class Primeno1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter two no");
 int n1=sc.nextInt();
 int n2=sc.nextInt();
 for(i=n1;i<=n2;i++)
 {
	 for(j=2;j<=i;j++)
	 {
		 if(i%j==0)
		 {
			 break;
		 }
	 }
	 if(i==j)
	 {
		System.out.println(j); 
	 }
 }
	}

}
