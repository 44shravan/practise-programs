package com.practise.practise_programs;

public class NoArgsConstructorTest {
	private String s;
	private NoArgsConstructorTest() {
		System.out.println("test no args");
	}
	public NoArgsConstructorTest(String s) {
		this();
		this.s = s;
		
	}
public static void main(String[] args) {
	//NoArgsConstructorTest nc = new NoArgsConstructorTest();
	NoArgsConstructorTest nc = new NoArgsConstructorTest("test");
}
}

/*
-> this is sued to call other constructor called constructor chaining

If parameterised constructors are defined explicitly in a program the Java compiler doesn't insert the implicit default constructor.
So, if you wish to make the object of the class without passing any initial values Employee president = new Employee();
This statement would throw an errorNo default constructor found; nested exception is java.lang.NoSuchMethodException:*/