package com.bank;

public class Customer {
	private BankAcc acc;
	
	public Customer(BankAcc acc) {
		super();
		this.acc = acc;
	}
	public BankAcc getAcc() {
		return acc;
	}
	public void setAcc(BankAcc acc) {
		this.acc = acc;
	}
	
	
	
}
