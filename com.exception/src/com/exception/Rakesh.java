package com.exception;
import java.io.*;
public class Rakesh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		System.out.println(rakesh());
	}
	public static int rakesh()
	{
		try
		{
			System.out.println("my name is akash");
			System.out.println(10/0);
			//System.exit(0);
			return 111;
		}
		catch(ArithmeticException e)
		{
		System.out.println("my bother name is teja");
		return 222;
		}
		finally
		{
			System.out.println("my another brother name rakesh");
			System.out.println("my another brother name rakesh");
			return 444;
		}
	}

}
