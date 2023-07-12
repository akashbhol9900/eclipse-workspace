package com.bank;

public class TestBank {

	public static void main(String[] args) { 
		
		ManageBank m = new ManageBank ();
		
		BankAcc b1 = new BankAcc ("accno001" , 101);
		BankAcc b2 = new BankAcc ("accno002" , 1001);
		
		b1.withdraw(5000);

		Customer c1 = new Customer (b1);
		Customer c2 = new Customer (b2);
		
		m.addCustomer(c1);
		m.addCustomer(c2);
		
		//m.getCustomers();
	}

}
