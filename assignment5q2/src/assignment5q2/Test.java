package assignment5q2;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Test {
	public static void main(String args[])
	{
	HashMap <String,String> hp=new HashMap<>();	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of country and capital name");
	int t=sc.nextInt();
	for(int i=0;i<=t;i++)
	{
		sc.nextLine();
		System.out.println("taking country name"); 
		String country=sc.nextLine();
		System.out.println(" capital name from user");
		String capital=sc.nextLine();
		hp.put(country,capital);
	}
	for (Map.Entry<String, String> entry : hp.entrySet()) {
        System.out.println("Country : " + entry.getKey() + "\tCapital : " + entry.getValue());
    }
	}

}
