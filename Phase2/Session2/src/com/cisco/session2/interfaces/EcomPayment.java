package com.cisco.session2.interfaces;

import java.util.Scanner;

public class EcomPayment {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Select an amount to Pay");
		double amount= sc.nextDouble();
		System.out.println("Enter 1 for Razor Pay, Enter 2 for PayTm and Enter 3 for"
				+ "PayPal");
		int selected=sc.nextInt();
		switch(selected){
		case 1:
			RazorPay pay=new MyPaymentPage(); //Abstraction
			pay.razorPayPaid(amount);
			break;
		case 2:
			PayTMPaymentGateway pay1= new MyPaymentPage();
			pay1.payMoneyUsingPayTM(amount);
			break;
		case 3:
			Paypal p= new MyPaymentPage();
			p.payPalPay(amount);
			break;
		default:
			System.out.println("Kindly select proper payment options");
		}
		sc.close();
	}
}
