package com.training;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
	

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Consumer Number");
	
	Long consumerNumber = sc.nextLong();
	
	System.out.println("Consumer Name");
	String consumerName = sc.next();
	
	System.out.println("Last Reading");
	double lastReading = sc.nextDouble();
	
	System.out.println("Current reading");
	double currentReading = sc.nextDouble();
	
	
	
	BillManager mgr1 = new BillManager();
	mgr1.calculateBillAmount();
	
	
	BillManager mgr2 = new BillManager(new MeterReading(102,"roy",300,500,"COM"));
	mgr2.calculateBillAmount();
	}
	
}
