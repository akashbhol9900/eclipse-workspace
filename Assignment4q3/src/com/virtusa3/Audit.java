package com.virtusa3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Audit {
	
	static HashMap <Integer , Double> map = new HashMap <> ();
	static Properties p = new Properties ();
	static Scanner in = new Scanner (System.in);
	
	public static void hashmapImpl () {
		
		System.out.println("Enter assesment Year");
		int year = in.nextInt ();
		
		System.out.println("Enter balance amount");
		double bal = in.nextDouble ();
		
		map.put(year, bal);
	}
	
	public static void displayHashMap () {
		for (Map.Entry <Integer , Double> m : map.entrySet()) {
			System.out.println(m.getKey()+"\t\t"+m.getValue());
		}
	}
	
	public static void propertiesImpl () throws IOException {
		System.out.println("Enter assesment Year");
		int year = in.nextInt ();
		String strYear = String.valueOf(year);
		
		System.out.println("Enter balance amount");
		double bal = in.nextDouble ();
		String strBal = String.valueOf(bal);
		
		p.setProperty(strYear, strBal);
		p.store(new FileWriter("audit.properties"), "Audit Details");
	}
	
	public static void Displayproperties () {
		Set s  = p.entrySet();
		
		Iterator itr = s.iterator();
        while (itr.hasNext()) {
  
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
			
		
	}

	public static void main(String[] args) throws IOException {
		
		/*hashmapImpl ();
		hashmapImpl ();
		hashmapImpl ();
		displayHashMap ();*/
		
		propertiesImpl ();
		propertiesImpl ();
		propertiesImpl ();
		Displayproperties ();
		
		
		
	}

}
