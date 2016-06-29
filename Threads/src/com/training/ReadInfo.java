package com.training;

public class ReadInfo extends Thread {

	
	
	public void run(){
		
		System.out.println("Reading");
		try {
			System.in.read();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		System.out.println("Finished Reading");
	}
}
