package com.training.domains;

import com.training.ifaces.Automobile;

public class Bike implements Automobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 900000.00D;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Harley";
	}

}
