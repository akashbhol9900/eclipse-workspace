package co.virtusa;
import  java.util.LinkedList;
import java.io.*;
public class Test {

	public static void main(String[] args) throws IOException
	      {
		// TODO Auto-generated method stub
		LinkedList <String> epn = new LinkedList<String> ();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<=5;i++)
		{
			System.out.println("please give your phno");
			//int k=Integer.parseInt(br.readLine());
			String h=br.readLine();
			epn.add(h);
		}
//		epn.add("9876543210");
//		epn.add("9123456789");
//		epn.add("9678543210");
//		epn.add("9432167801");
//		epn.add("9123459876");
		//System.out.println(epn+"\n");
		
		for (String e: epn) {
			System.out.println(e);
		}
	}

}
