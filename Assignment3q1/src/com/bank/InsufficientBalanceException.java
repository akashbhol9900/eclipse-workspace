package com.bank;

public class InsufficientBalanceException extends RuntimeException {
	public InsufficientBalanceException (String desc) {
		super (desc);
	}
}
