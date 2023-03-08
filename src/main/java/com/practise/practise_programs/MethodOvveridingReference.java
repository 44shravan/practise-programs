package com.practise.practise_programs;

public class MethodOvveridingReference {
public static void main(String[] args) {
	A a= new B();
	a.staticMeth();
	B b= new B();
	b.staticMeth();
	a.testMeth();
	b.testMeth();
	// a.bmeth(); - sub class methods cannot accessed by a reference
	
	/* Static methods cannot be overridden since they are bonded at compile time and
	 method overriding relies on dynamic binding at runtime. If static methods are
	 redefined by a derived class, then it is not Method Overriding but Method
	 Hiding.
	 // final methods cannot be overridden compile time error
	  *   // private methods are not overridden but no compile time error
	  *
	 */
	 
}
}
