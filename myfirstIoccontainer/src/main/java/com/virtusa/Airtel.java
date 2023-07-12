package com.virtusa;

public class Airtel implements Sim {
	public Airtel()
	{
		System.out.println("construcer calles");
	}

	@Override
	public void calling() {
		System.out.println("Airtel sim is calling");
		
	}

	@Override
	public void data() {
		System.out.println("Aritel sim data");
		
	}

}
