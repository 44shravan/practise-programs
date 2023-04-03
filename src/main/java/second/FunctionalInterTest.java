package second;

public class FunctionalInterTest implements FunctionalInterface,FunctionalInter2{
public static void main(String[] args) {
	/*	FunctionalInterface fn = ()->{System.out.println("functn inter");
		return 0;};
		fn.testOnlyMeth();*/
	
	
}

@Override
public int testOnlyMeth() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void testDef() {
	// TODO Auto-generated method stub
	FunctionalInter2.super.testDef();
}
}
