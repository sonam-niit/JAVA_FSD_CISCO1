package com.cisco.session3.synchronization;

public class DeskTop extends Thread {

	Printer pRef;
	void attachPrinter(Printer p) {
		pRef=p;
	}
	@Override
	public void run() {
		synchronized (pRef) {
			pRef.printDocument("Chetana's Resume.pdf", 5);
		}
	}
}
