package second;

public class SystemExitTest {
public static void main(String[] args) {
	try {
		System.out.println("inside try");
		System.exit(1);
	}catch (Exception e) {
		// TODO: handle exception
	}finally {
		System.out.println("Inside finally");
	}
}
}
