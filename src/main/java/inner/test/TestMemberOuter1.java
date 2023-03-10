package inner.test;

public class TestMemberOuter1 {
	private int data=30;  
	 class Inner{  
	  void msg(){System.out.println("data is "+data);}  
	 }  
	 public static void main(String args[]){  
	  TestMemberOuter1 outer=new TestMemberOuter1();  
	  TestMemberOuter1.Inner in=outer.new Inner();  
	  in.msg();  
	  //Inner i = new Inner();
	 }  
}
