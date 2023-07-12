package com.bank;

import java.util.ArrayList;

public class ManageBank {
	
	private ArrayList<Customer> list = new ArrayList<Customer> ();

	
	public void addCustomer (Customer e) {
		
		list.add(e);
	}
	
	public void removeCustomer (Customer e) {
		list.remove(e);
		
	}
	
	public void getCustomer (Customer e) {
		if (list.contains(e)) {
			System.out.println(list.get(list.indexOf(e)));
		}
		System.out.println("Customer not found");
	}
	
	public void getCustomers () {
		for(Customer e:list) {
	        System.out.println(e.getAcc()+"-------"+e.getAcc().getBalance());
	    }
	}

}
