package com.atm;

public abstract class AtmMachine implements PinValidation{
	

	public void withdrawl(int j) {
		System.out.print("Successfully withdrawl:"+j);
	}

	public void diposite(int i) {
		// TODO Auto-generated method stub
		System.out.print("Successfully Deposited :"+i);
	}

}
