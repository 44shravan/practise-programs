package com.practise.practise_programs;

abstract class Bike{  
	  abstract void run();  
		/* default void show()
		   {
		     System.out.println("Default Method Executed");     //no default methods in abstract class
		   }*/
	}  
abstract class Cycle extends Bike{  
	  abstract void brake();  
	}  

public class AbstractTest extends Cycle{

	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void brake() {
		// TODO Auto-generated method stub
		
	}

}
