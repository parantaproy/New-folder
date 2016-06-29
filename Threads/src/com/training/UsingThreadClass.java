package com.training;

public class UsingThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//new thread
		Thread t1=new MyThread("Ramesh");
		Thread t2=new MyThread("Sai");
		Thread t3=new MyThread("Ayan");
		t1.start();
		t3.start();
		t2.start();
		
	}

}
