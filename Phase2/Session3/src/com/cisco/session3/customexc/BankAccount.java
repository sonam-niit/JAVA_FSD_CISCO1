package com.cisco.session3.customexc;

class InsufficientFundsException extends Exception{
	public InsufficientFundsException() {
		super("Insufficient funds for the Requsted Withdrawal");
	}
}

public class BankAccount {

	private double balance;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	public void withdraw(double amount) throws InsufficientFundsException{
		if(amount>balance) {
			throw new InsufficientFundsException();
		}else {
			balance-=amount;
			System.out.println("Withdrawal Successful. Remaining balance: "+balance);
		}
	}
	
}
