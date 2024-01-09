package com.cisco.session2.inheritance;

public class SavingAccount extends Account {

	double target;
	public SavingAccount(String accHolderName, String accNo, double balance,double target) {
		super(accHolderName, accNo, balance);
		//Passing Data to Parent class Constructor
		this.target=target;
	}
	public void showAccData() {
		super.showAccData();//parent function
		System.out.println("Target balance: "+target);
	}
	public void withdraw(double amount) {
		if(balance>amount) {
			double charge=amount*0.02;
			balance=balance-amount-charge;
			System.out.println(amount+" Withdrawn Avaliable balance"+balance);
		}else {
			System.out.println("No sufficient Balance");
		}
	}
	
	public static void main(String[] args) {
		SavingAccount sonam= new SavingAccount("Sonam Soni", "SCB000000111", 5000,10000);
		SavingAccount zaneshvar= new SavingAccount("Zaneshvar", "SCB000000897", 50000,10000);
		sonam.showAccData();zaneshvar.showAccData();
		sonam.disposit(3000);
		sonam.withdraw(1500);
	}
	
}
