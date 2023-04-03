package third;

public class StringTest {

	public static void main(String[] args) {
		
		//String s1 = new String(s2);//compile error
		String s2 = "msk";
		String s1 = new String(s2);
		
		System.out.println((s1==s2) + " - "+ s1.equals(s2));
		System.out.println(s1.equals(s2));
	}
	
}
