package com.practise.practise_programs;

public class A {
	static void staticMeth() {
		System.out.println("class A static meth");
	}
	
public void testMeth() {                 //public String testMeth() {compile time error
	System.out.println("class A");
}
public void aMeth() {
	System.out.println("class A only meth");
}
}
