package second;

 class Rectangle implements Drawable{

	@Override
	public void draw() {
		// TODO Auto-generated method stubR&
		
		System.out.println("drawing rectangle"); 
	}

}

public class DefaultTest{
public static void main(String[] args) {
	Drawable d=new Rectangle();  
	d.draw();  
	d.msg();  
	d.msgTest();
}
}
