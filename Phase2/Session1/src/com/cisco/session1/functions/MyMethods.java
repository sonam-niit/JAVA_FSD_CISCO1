package com.cisco.session1.functions;

public class MyMethods {

	//Reuse of Code
	public int getMax(int array[]) {
		int max=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int productPrices[]= {1200,560,3300,2345,1900};
		int cricketersScore[]= {75,23,67,55,20,11,34,29};
		int covidCases[]= {423432,245674,456782,876542};
		
		MyMethods obj= new MyMethods();
		System.out.println("Maximum Price of Product: "+obj.getMax(productPrices));
		System.out.println("Maximum Cricketers Score: "+obj.getMax(cricketersScore));
		System.out.println("Highest Covid Cases: "+obj.getMax(covidCases));
		
	}
}
