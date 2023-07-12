package com.virtusa6;
import java.io.*;
import java.io.FileReader;

public class CheckFile {
 public static void main(String args[]) throws IOException
 {
	 File f1=new File("D:\\eclipse-workspace\\assignment6q1\\src\\com\\virtusa6\\akash.properties");
	System.out.println(f1.exists());
	FileReader f2=new FileReader("D:\\eclipse-workspace\\assignment6q1\\src\\com\\virtusa6\\akash.properties");
	FileReader f3=new FileReader("D:\\eclipse-workspace\\assignment6q1\\src\\com\\virtusa6\\akash.properties");
	char[]ch= {'a','b','c','d',};
	String []s= {"akash","prakasha","teja"};
	f2.read(ch);
	//f3.read(s);
	for(char ch1:ch)
	{
		System.out.println(ch1);
	}
	f2.close();
 }
}
