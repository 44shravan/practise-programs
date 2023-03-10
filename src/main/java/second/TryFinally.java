package second;

public class TryFinally {
public static void main(String[] args) {
	try {
		int i = 100/0;
		System.out.println("try");
	} /*catch(Exception e){
		System.out.println(e.toString());
		}*/
	finally{
		System.out.println("final");
	}
}
}
