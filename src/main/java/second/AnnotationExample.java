package second;

class Animal{  
void eatSomething(){System.out.println("eating something");}  
}  
  
class Dog extends Animal{  
@Override  
void eatSomething(){System.out.println("eating foods");}//should be eatSomething  
}  

public class AnnotationExample {
public static void main(String[] args) {
	
}
}
