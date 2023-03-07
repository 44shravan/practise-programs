package com.practise.practise_programs;

public class SingletonTest {
	
private static SingletonTest sObj = new SingletonTest();

private SingletonTest() {
}

public static SingletonTest getSingletonObj() {
	return sObj;
}


/*public static A getA(){  
	   if (obj == null){  
	      synchronized(Singleton.class){  
	        if (obj == null){  
	            obj = new Singleton();//instance will be created at request time  
	        }  
	    }              
	    }  
	  return obj;  
	 }  */

public void doSomething() {
	System.out.println("singleton class meth called");
}
}
