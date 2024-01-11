package com.cisco.session3.multithreading;

public class ThreadDemo2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread Started");
	}
	public static void main(String[] args) {
		ThreadDemo2 target1= new ThreadDemo2();
		//Created Thread with Runnable Target
		Thread thread1= new Thread(target1, "first");
		Thread thread2= new Thread(target1, "second");
		thread1.start();
		thread2.start();
	}
}
