package collections.test;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;

public class HashtableTest {
public static void main(String[] args) {
	Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
	  
	  hm.put(100,"Amit");  
	  hm.put(102,"Ravi");  
	  hm.put(101,"Vijay");  
	  hm.put(103,"Rahul");  
	  
	  hm.forEach((k,v)->System.out.println("key - "+k.toString()+" value - "+v.toString()));
	  hm.replaceAll((k,v)->k.toString()+""+v.toString());
	  hm.forEach((k,v)->System.out.println("key - "+k.toString()+" value - "+v.toString()));
}
}

/*
public class Hashtable<K,V>
    extends Dictionary<K,V>
    implements Map<K,V>, Cloneable, java.io.Serializable {*/

