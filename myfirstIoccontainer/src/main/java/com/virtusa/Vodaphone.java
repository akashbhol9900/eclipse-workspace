package com.virtusa;

public class Vodaphone implements Sim{

	@Override
	public void calling() {
		System.out.println("vodaphone sim calling");
		
	}

	@Override
	public void data() {
		System.out.println("vodaphone data is used");
	}

}
