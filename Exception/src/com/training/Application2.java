package com.training;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=49;
		int den=Integer.parseInt(args[0]);
		try{
			System.out.println(num/den);
		} catch (ArithmeticException e){
		
		System.err.println("Exception-Denominator zero");
	}
 catch (ArrayIndexOutOfBoundsException e)
		{
	 System.err.println("Pass command line Agreement");
		}
catch (Exception e)
		{
	System.err.println("Invalid command line argument");
		}
	
	}
}
 