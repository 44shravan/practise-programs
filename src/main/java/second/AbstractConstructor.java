package second;

abstract class AbstractClass {
    public AbstractClass() {  //private compiletime error
        System.out.println("Initializing AbstractClass");
    }
}



 class ConcreteClassB extends AbstractClass {
    public ConcreteClassB() {
        System.out.println("Initializing ConcreteClassB");
    }
}

public class AbstractConstructor {
public static void main(String[] args) {
	new ConcreteClassB();
		
}
}
