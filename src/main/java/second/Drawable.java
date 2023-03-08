package second;

public interface Drawable {
void draw();
default void msg() {
	System.out.println("default method");
}
default void msgTest() {
	System.out.println("default method");
}
}
