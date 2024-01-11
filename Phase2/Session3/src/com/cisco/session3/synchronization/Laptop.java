package com.cisco.session3.synchronization;

public class Laptop extends Thread{

	Printer pRef;
	
	void attachPrinter(Printer p) {
		pRef=p;
	}
	@Override
	public void run() {
		synchronized (pRef) {
			pRef.printDocument(Thread.currentThread().getName()
					+" Resume.pdf", 5);
		}
	}
}
