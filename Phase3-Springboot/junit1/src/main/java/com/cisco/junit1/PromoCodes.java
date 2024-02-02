package com.cisco.junit1;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class PromoCodes {

	List<String> promocodes;
	TreeMap<String, Double> promoCodesWithDiscount;
	
	public PromoCodes() {
		promocodes=Arrays.asList("FIRST50","SUNDAY","HAPPY","BINGO","NEWYEAR");
		promoCodesWithDiscount= new TreeMap<String,Double>();
		promoCodesWithDiscount.put(promocodes.get(0), 0.50);
		promoCodesWithDiscount.put(promocodes.get(1), 0.20);
		promoCodesWithDiscount.put(promocodes.get(2), 0.30);
		promoCodesWithDiscount.put(promocodes.get(3), 0.25);
		promoCodesWithDiscount.put(promocodes.get(4), 0.15);
	}
	
	public double getDiscount(String code) {
		return promocodes.contains(code)?promoCodesWithDiscount.get(code):0.05;
	}
	public double getDiscountedAmount(String code,double amount) {
		double discount= getDiscount(code);
		return amount- (amount*discount);
	}
	public double getDiscountedAmountWithGST(String code,double amount) {
		double discounted= getDiscountedAmount(code, amount);
		return discounted+ (discounted*0.18);
		
	}
	public boolean checkPromoCode(String code) {
		return promocodes.contains(code.toUpperCase());
	}
}


