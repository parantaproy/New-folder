package com.training.ifaces;

/**
 * 
 * @author proy3
 * Top level Interface for
 * representing Automobile
 * 
 * @version 1.0
 */


public interface Automobile {
	
	public static final String SHOWROOM_NAME="RAMESH CARS";
	
	
	/*
	 * All the methods in the Interface are implicitly Public and Abstract
	 * 
	 */
	
	public abstract double getPrice();
	public String getColor();
	String getModel();
	
	

}

