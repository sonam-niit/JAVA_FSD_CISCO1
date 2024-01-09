package com.cisco.session2.interfaces;

public class MyPaymentPage implements 
RazorPay,Paypal,PayTMPaymentGateway{

	@Override
	public void payMoneyUsingPayTM(double amount) {
		System.out.println("Payment Done of Amount "
	+amount+" Using PayTM");
	}

	@Override
	public void payPalPay(double amount) {
		System.out.println("Payment Done of Amount "
	+amount+" Using PayPal");
	}

	@Override
	public void razorPayPaid(double amount) {
		System.out.println("Payment Done of Amount "
	+amount+" Using RazorPay");
	}

}
