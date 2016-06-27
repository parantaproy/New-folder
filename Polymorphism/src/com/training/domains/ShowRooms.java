package com.training.domains;

import com.training.ifaces.Automobile;

public class ShowRooms {
	
	public Automobile getModel(int key){
		
		
		switch (key){
		case 1:
			return new MarutiCar();
		case 2:
			return new Toyota();
		default:
			return null;
			
		}
	}

	/**
	 *Method is used to place Quotation for vehicle 
	 * @param polyAuto
	 */
	
	
	public void printQuote(Automobile polyAuto)
	
	{
		System.out.println(Automobile.SHOWROOM_NAME);
	
	
		System.out.println(polyAuto.getModel());
		System.out.println(polyAuto.getColor());
		System.out.println(polyAuto.getPrice());
		
	}

}