package propertiess;
import java.io.*;
//import java.util.Properties;
public class Akash  {
 public static void main(String args[]) throws IOException
 {
	 //File f=new File("D:\\eclipse-workspace\\Taking input from user\\src\\propertiess\\abc.properties");
	 //File f1=new File("D:\\eclipse-workspace\\Taking input from user\\src\propertiess\\cricket.txt");
	 
	 FileReader f1=new FileReader("D:\\eclipse-workspace\\Taking input from user\\src\\propertiess\\bca.properties");
	 char[]ch= {'a'};
	// char [] ch=new char[(int)f1.length];
	 f1.read(ch);
	//f1.flush();	
	 for(char ch1:ch)
	 {
		 System.out.println(ch1);
	 }
	f1.close();
 }
 }
 

