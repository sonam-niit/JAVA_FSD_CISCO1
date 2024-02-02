package com.cisco.junit1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PromoCodeTest {
	
	PromoCodes obj;

	@BeforeEach
	void setUp() throws Exception {
		obj= new PromoCodes();
	}
	@AfterEach
	void tearDown() throws Exception {
		obj=null;
	}
	@Test
	public void checkPromoCode() {
		assertTrue(obj.checkPromoCode("Bingo"));
		assertFalse(obj.checkPromoCode("HELLO"));
	}
	@Test
	public void checkDiscount() {
		assertEquals(0.30, obj.getDiscount("HAPPY"));
	}
	@Test
	public void checkDiscountedAmount() {
		assertEquals(700, obj.getDiscountedAmount("HAPPY",1000));
	}
	@Test
	public void checkDiscountedAmountWithGST() {
		assertEquals(826, obj.getDiscountedAmountWithGST("HAPPY",1000));
	}

}
