package com.practise.practise_programs;

public class RecursiveTest {
	void tesMeth() {
		tesMeth();
	}
public static void main(String[] args) {
	RecursiveTest rt =new RecursiveTest();
	rt.tesMeth();
}
}


/*Recursion in java is a process in which a method calls itself continuously. 
A method in java that calls itself is called recursive method.*/