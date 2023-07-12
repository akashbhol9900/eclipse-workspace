package com.bank;

public class BankAcc {
	private double maxBalance = 500000 , minBalance = 3000 , bankBalance;
	private String accNo;

//	public BankAcc () {
//	}

	public BankAcc (String accNo , double bankBalance) {
		if (accNo == null|| accNo.trim ().equals ("")) throw new InvalidAccountNumberException ("Enter the account number:");
		else this.accNo = accNo;
		if (bankBalance < minBalance) System.out.println("Create minimum balance account:"); 
		else this.bankBalance=bankBalance;

//		if (d < maxBalance && d > minBalance)
//			bankBalance = bankBalance + d;
	}

	public double getBalance () {
		return bankBalance;
	}
	
	public String getAccNo () {
		return this.accNo;
	}

	public double deposit (double d) {
		bankBalance = bankBalance + d;
		if (d < minBalance|| bankBalance > maxBalance)
			System.out.println ("Balanced reached max limit, cannot deposit or invalid deposit");
		return bankBalance;
	}

	public void withdraw (double d) {
		if(d<0 || d>bankBalance || bankBalance <=minBalance)
			throw new InsufficientBalanceException ("Cannot withdraw, reached min balance");
		else {
			bankBalance = bankBalance - d;
			System.out.println ("after withdrawing amount "+d+" the balance is "+bankBalance);
		}
	}
	
	public String toString() {
		return "Acc No =" + accNo + "   Balance=" + bankBalance;
	}
}
