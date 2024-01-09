package com.cisco.session2.encaptulation;

public class Main {

	public static void main(String[] args) {
		Product pen= new Product();
		pen.setId(1);
		pen.setName("Pen");
		pen.setDesc("Easy to write with grip");
		pen.setPrice(15);
		pen.setRating(4.7);
		
		System.out.println("Pen Details");
		System.out.println(pen.getId()+" "+pen.getName()+" "+pen.getDesc()+" "+
				pen.getPrice()+" "+pen.getRating());
	}
}
