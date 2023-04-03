package second;

public interface FunctionalInter2 {
	default void testDef() {
		System.out.println("fun default 2");
	}
 int testOnlyMeth();
}