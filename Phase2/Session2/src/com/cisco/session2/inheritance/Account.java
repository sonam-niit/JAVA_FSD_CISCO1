package com.cisco.session2.inheritance;

public class Account {

	String accHolderName;
	String accNo;
	double balance;
	public Account(String accHolderName, String accNo, double balance) {
		super();
		this.accHolderName = accHolderName;
		this.accNo = accNo;
		this.balance = balance;
	}
	public void showAccData() {
		System.out.println("Account No: "+accNo);
		System.out.println("Account Holder Name: "+accHolderName);
		System.out.println("Available Balance: "+balance);
	}
	public void disposit(double amount) {
		balance+=amount;
		System.out.println("Available Balance is "+balance);
	}
}
