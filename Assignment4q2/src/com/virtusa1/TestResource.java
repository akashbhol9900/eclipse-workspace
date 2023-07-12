package com.virtusa1;

public class TestResource {

	public static void main(String[] args) {
		TreeSetImpl ts = new TreeSetImpl ();
		
		Resource r1 = new Resource ("r121" , "xyz" , "12/12/2020" , "java development" , "20000");
		Resource r2 = new Resource ("r122" , "mno" , "11/10/2021" , "c# development" , "18000");
		
		ts.addElement(r1);
		ts.addElement(r2);
		
		ts.getElements();
		
		ts.addElement(r2);
		
		ts.removeElement(r2);
		
		ts.getElements();
		
		Resource r3 = new Resource ("r121" , "xyz" , "12/12/2020" , "java development" , "20000");
		
		ts.getElement(r3);
		
		
	}

}
