package second;

public class FunctionalInterTest {
public static void main(String[] args) {
	FunctionalInterface fn = ()->{System.out.println("functn inter");};
	fn.testOnlyMeth();
}
}
