package com.training.apps;

import java.util.*;

import com.training.domains.*;
import com.training.ifaces.Automobile;





public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s = new Scanner(System.in);
 String ch="Y";
 do{
	 
 
 System.out.println("Enter 1 for Maruti 2 for Toyota");
 
 int key=s.nextInt();
 
 ShowRooms obj = new NewShowRoom();
 Automobile polyAuto = obj.getModel(key);
 
 if (polyAuto==null)
 {
	 System.out.println("Invalid Input");
 }
 else
 {
 obj.printQuote(polyAuto);
}
 System.out.println("Y to continue N to Exit");
 ch=s.next();
       }
 while(ch.equalsIgnoreCase("Y"));
	
	s.close();
	}
}
 
