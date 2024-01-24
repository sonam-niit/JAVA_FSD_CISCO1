package com.cisco.aopdemo.bean;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		if(method.getName().equals("purchaseProduct")) {
			System.out.println("[Before Advice]-before Executed "+method.getName());
			Product product=(Product) target;
			if(product.getStock()<=0) {
				product.setCanBuy(false);
				System.out.println("[Before Advice]- We are out of the Stocks for "+product.getName());
			}else {
				product.setCanBuy(true);
				System.out.println("[Before Advice]- Initiating transaction for amount of  "+product.getPrice()+"...");
			}
		}
	}

}
