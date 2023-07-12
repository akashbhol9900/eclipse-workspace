package com.virtusa6;
import java.util.Scanner;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
public class ReadAndWriteColor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
        
	    System.out.print("Enter the color to write to File: ");
        String color = in.nextLine();
        System.out.println(" ");
        
        try {
	            FileWriter fw = new FileWriter("D:\\eclipse-workspace\\assignment6q2\\src\\com\\virtusa6\\akash1.properties" , true);
	 
	            for (int i = 0; i < color.length(); i++)
	                fw.write(color.charAt(i));

	            System.out.println("Successfully written");
	  
	            fw.close();
	        }
	        catch (Exception e) {
	            e.getStackTrace();
	        }
        
        
        String line = null;
        try {
        	FileReader fr = new FileReader ("D:\\eclipse-workspace\\assignment6q2\\src\\com\\virtusa6\\akash1.properties");
            BufferedReader br = new BufferedReader(fr);
            
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
	}

}
