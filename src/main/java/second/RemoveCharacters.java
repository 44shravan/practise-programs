package second;

public class RemoveCharacters {
public static void main(String[] args) {
	String str= "This#string%contains^ 	special*characters&.";   
	str = str.replaceAll("[^a-zA-Z0-9]", "");  
	System.out.println(str);  
}
}
