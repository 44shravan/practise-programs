package second;

public interface FunctionalInterface {
	default void testDef() {
		System.out.println("fun default");
	}
 int testOnlyMeth();
}
