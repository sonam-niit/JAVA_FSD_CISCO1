package com.cisco.junit1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calc;
	@BeforeAll
	public static void beforeAll() {
		System.out.println("BeforeAll Method Executed");
	}
	@AfterAll
	public static void afterAll() {
		System.out.println("AfterAll Method Executed");
	}
	@BeforeEach
	public void setUp() {
		calc=new Calculator();
		System.out.println("Calculator Object Created");
	}
	@AfterEach
	public void tearDown() {
		calc=null;
		System.out.println("Calculator Object Destroyed");
	}
	
	@Test
	public void testAdd() {
		int expected=10;
		int actual= calc.add(5, 5);
		assertEquals(expected, actual);
	}
	@Test
	public void testSub() {
		int expected=10;
		int actual= calc.sub(15, 5);
		assertEquals(expected, actual);
	}
	@Test
	public void testMul() {
		int expected=25;
		int actual= calc.mul(5, 5);
		assertEquals(expected, actual);
	}
	@Test
	public void testDiv() {
		assertEquals(10, calc.div(20, 2));
	}
}
