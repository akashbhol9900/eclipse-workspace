import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no you have wanted");
int v=sc.nextInt();
for(int i=1;i<=v;i++)
{
	fact=fact*i;
	//System.out.println(fact);
}
System.out.println(fact);
	}

}
