package com.cisco.session2.oops;

public class StaticVsNonStatic {

	public static void main(String[] args) {
		//Create Objects of Dish
		Dish dish1= new Dish();
		Dish dish2= new Dish("Pizza",300,2);
		
		dish1.incQuantity();
		dish1.incQuantity();
		dish1.showData();
		dish2.decQuantity();
		dish2.showData();
		
		Dish dish3= new Dish();
		dish3.incQuantity();
		dish3.showData();
		
		System.out.println(Dish.noOfDishes);
	}
}
