package collections.test;

import java.util.HashMap;

public class HashmapTest {
public static void main(String[] args) {
	 HashMap<String, Integer> mapcon   
     = new HashMap<>();   
 mapcon.put("k1", 100);   
 mapcon.put("k2", 200);   
 mapcon.put("k3", 300);   
 mapcon.put("k4", 400);   
 System.out.println("HashMap values :\n " + mapcon);  
 mapcon.computeIfAbsent("k5", k -> 200 + 300);
 
 mapcon.forEach((k,v)->System.out.println("key - "+k+" value - "+v));
 mapcon.entrySet().forEach(e->System.out.println("key - "+e.getKey()+" value - "+e.getValue()));
}
}
