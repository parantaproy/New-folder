package com.training;

public class BillManager {
	private MeterReading reading;
	

	
	public BillManager() {
		super();
		// TODO Auto-generated constructor stub
		
		
	}



	public BillManager(MeterReading reading) {
		super();
		this.reading = reading;
	}



	public double caculateBillAmount(MeterReading reading)
	{
		double amount=0;
		double unitConsumed = reading.getCurrentReading()-reading.getLastReading();
		
		if(reading.getConsumerType().equals("COM"))
		{
			if(unitConsumed>200)
			{
			amount=unitConsumed*4.0;	
			}
			
			else
			{
				amount=unitConsumed*2.0;
			}
		}
		return amount;
		/**
		 * Overloaded method
		 * @return
		 */
		
	}
	
	public double calculateBillAmount(){
		
		double amount=0;
		return amount;
	}
}
