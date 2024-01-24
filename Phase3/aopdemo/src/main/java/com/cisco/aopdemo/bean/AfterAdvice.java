package com.cisco.aopdemo.bean;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		
		if(method.getName().equals("purchaseProduct")) {
			System.out.println("[After Advice] after returning executed "+method.getName());
			System.out.println("Notifying in Action" );
			Product product= (Product) target;
			
			//Notification
			System.out.println("Notifying "+args[2]+" through email with Invoice of amount "+product.getPrice());
			System.out.println("Product "+product.getBrand()+" "+product.getName()
			+" will be delivered at "+args[0]+" by "+
			args[1]);
			System.out.println("Notify the shipment and dispatch department for the purchase of "+product.getName());
		}
		
	}

}
