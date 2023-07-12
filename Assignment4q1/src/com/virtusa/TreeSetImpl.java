package com.virtusa;

import java.util.*;

public class TreeSetImpl {
    TreeSet <Object> set  = new TreeSet<>();

	
	public void addElement (Object o) {
		boolean res = set.add (o);
		if (res == true) {
			System.out.println("element successfully added to treeset\n");
		}
		else System.out.println("dulpicate addition\n");
		set.add(o);
	}
	
	public void removeElement (Object o) {
		set.remove(o);
	}

	public void getElement (Object o) {
		ArrayList <Object> list = new ArrayList<> ();
		for (Object m : set) {
			list.add(m);
		}
		
		if (list.contains(o)) {
			System.out.println(list.get(list.indexOf(o))+"\n");
		}
		else System.out.println("Element not found\n");
	}
	
	public void getElements () {
		for(Object o:set) {
            System.out.println(o +"\n");
        }
	}

}


