package com.cisco.session3.multithreading;

class PrintingTask extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+ " printing "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreadApp {

	public static void main(String[] args) {
		
		PrintingTask thread= new PrintingTask();
		thread.start();
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+ " printing "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
