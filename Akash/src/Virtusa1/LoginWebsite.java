package Virtusa1;
import java.util.Scanner;
public class LoginWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("taking user name ");
		String username=sc.nextLine();
		System.out.println("taking password name ");
		String password=sc.nextLine();
		int count=0;
		int count1=0;
		for(int i=0;i<username.length();i++)
		{
			char ch=username.charAt(i);
			count++;
		}
		for(int i=0;i<password.length();i++)
		{
			char ch1=password.charAt(i);
			count1++;
		}
		if(count==5 && (count1>=6 &&count1<=12))
		{
			System.out.println("the user name password are valid");
		}
		else
		{
			System.out.println("the user name and password are invalid");
		}
	}

}
