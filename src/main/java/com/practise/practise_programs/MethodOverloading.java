package com.practise.practise_programs;

public class MethodOverloading
{
	
	public String method1(int a) {
        System.out.println("meth1 - short");
		return null;
        
   }
 public String method1(short a) {
         System.out.println("meth1 - int");
		return null;
         
    }
public void method1(Integer a){
     System.out.println("meth1 - integer");
}
public void method1(long a){
    System.out.println("meth1 - Long");
}

void MethodOverloading() {
	
}

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        MethodOverloading h = new MethodOverloading();
        h.method1(1);
        h.method1(new Long(100));
        
    }
}

/*
 Method signature is used by the compiler to differentiate the methods. Method signature consist of three things.

a) Method name

b) Number of arguments

c) Types of arguments

-> Method overloading has nothing to do with return-type.

Yes, we can overload main() method. A class can have any number of main() methods but execution starts from public static void main(String[] args) only.

 https://javaconceptoftheday.com/important-java-interview-questions-on-method-overloading/
 
 Overloaded methods can be either static or non static.
 
 No, compiler will give duplicate method error. Compiler checks only method signature for duplication not the return types. If two methods have same method signature, straight away it gives compile time error.
 
 
2
3
4
5
6
7
8
9
10
11
12
public class A
{
    public A()
    {
        //-----> (1)
    }
 
    void A()
    {
        //-----> (2)
    }
}
None of them. It is neither constructor overloaded nor method overloaded. First one is a constructor and second one is a method.
 
 */