package com.virtusa;
import java.util.HashSet;
import java.util.TreeSet;
//import java.util.HashSetImpl;
public class TestProject {

	public static void main(String[] args) {
		
		Manager m1 = new Manager ("abcdc" , "production");
		Manager m2 = new Manager ("mnocdc" , "marketing");
		Manager m3 = new Manager ("xyzdc" , "sales");
		
		
		HashSetImpl hs = new HashSetImpl ();
		
		Project p1 = new Project (12131 , "java app" , "12/01/2021" , "02/03/2021" , 123200 , m3);
		Project p2 = new Project (12132 , "python app" , "12/10/2021" , "01/01/2022" , 2230000 , m1);
		Project p3 = new Project (12133 , "web app" , "12/12/2020" , "09/03/2022" ,451000 , m2);
		Project p4 = new Project (12134 , "mobile app" , "07/12/2021" , "12/03/2022" , 200000 , m3);
		
		
		
		System.out.println("Hash set operations on project class");
		
	    hs.addElement(p1);
		hs.addElement(p2);
		hs.addElement(p3);
		hs.addElement(p4);
		
		hs.addElement(p4);
		
		hs.getElements();
		
		Project p5 = new Project (12135 , "desktop app" , "08/12/2021" , "21/08/2023" , 320000 , m1);
		hs.getElement(p5);
		
		hs.removeElement(p4);
		
		hs.getElements();
		
		
//-------------------------------------------------------------------------------------------------------------------------------
		
		
		
		
//		TreeSetImpl ts = new TreeSetImpl ();
//		
//		System.out.println("Tree set operations on project class");
//
//		Project p1 = new Project (12131 , "java app" , "12/01/2021" , "02/03/2021" , 123200 , m3);
//		Project p2 = new Project (12132 , "python app" , "12/10/2021" , "01/01/2022" , 2230000 , m1);
//		Project p3 = new Project (12133 , "web app" , "12/12/2020" , "09/03/2022" ,451000 , m2);
//		Project p4 = new Project (12134 , "mobile app" , "07/12/2021" , "12/03/2022" , 200000 , m3);
//		
//		ts.addElement(p1);
//		ts.addElement(p2);
//		ts.addElement(p3);
//		ts.addElement(p4);
//		
//		ts.addElement(p4);
//		
//		//ts.getElements();
//		
//		Project p5 = new Project (12135 , "desktop app" , "08/12/2021" , "21/08/2023" , 320000 , m1);
//		ts.getElement(p5);
//		
//		ts.removeElement(p4);
//		
//		ts.getElements();
	}

}
