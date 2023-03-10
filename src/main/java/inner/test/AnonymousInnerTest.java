package inner.test;

abstract class Person{  
	  abstract void eat();  
	}  

public class AnonymousInnerTest {
	 public static void main(String args[]){  
		  Person p=new Person(){  
		  void eat(){System.out.println("nice fruits");}  
		  };  
		  p.eat();  
		 }  
}
