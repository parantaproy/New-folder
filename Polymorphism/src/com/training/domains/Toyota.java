package com.training.domains;

import com.training.ifaces.Automobile;

public class Toyota implements Automobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1200000.00D;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Etios";
	}

}
