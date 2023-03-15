package second;

public class CamelCase {
String camelCase(String s) {
	char[] ca = s.toCharArray();
	String s2="";
	for(int i=0;i<s.length();i++) {
		 if (ca[i] == ' ')
         {
             // conversion into upper case
             ca[i + 1] = Character.toUpperCase(ca[i + 1]);
         }
		 else {
			 s2=s2+String.valueOf(ca[i]);
		 }
	}
	return s2;
}

public static void main(String[] args) {
	CamelCase cs = new CamelCase();
	String str = "I get intern at geeksforgeeks";
    System.out.println(cs.camelCase(str));
}
}
