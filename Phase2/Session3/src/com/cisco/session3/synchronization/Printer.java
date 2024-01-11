package com.cisco.session3.synchronization;

public class Printer {
	
	String status="Available";
	//Synchronize this method
	 void printDocument(String docName,int copies) {
		status="Busy";
		System.out.println("[Printer] is print the document "+docName);
		showPrinterStatus();
		for(int i=1;i<=copies;i++) {
			System.out.println("[Printer] "+docName+" copy #"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		status="Available";
	}
	void showPrinterStatus() {
		System.out.println("[Printer] Status: "+status);
	}
}
