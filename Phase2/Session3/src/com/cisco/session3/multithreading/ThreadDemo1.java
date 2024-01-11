package com.cisco.session3.multithreading;

public class ThreadDemo1 extends Thread{

	@Override
	public void run()  {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName() +" Value "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ThreadDemo1 thread1= new ThreadDemo1();
		
		thread1.start();//when the thread started it will run its run method automatically
		
		ThreadDemo1 thread2= new ThreadDemo1();
		thread2.start();
	}
}
