package collections.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashsetTest {
public static void main(String[] args) {
	HashSet<String> set=new HashSet();  
	 set.add("One");    
     set.add("Two");    
     set.add("Three");   
     set.add("Four");  
     set.add(null);  
     set.add(null);
     System.out.println(set);
     
     LinkedHashSet<String> lset=new LinkedHashSet();  
     lset.add("One");    
     lset.add("Two");    
     lset.add(null);   
     lset.add(null);  
     lset.add("Five"); 
     System.out.println(lset);
     
     TreeSet<String> al=new TreeSet<String>();  
     al.add("Ravi");  
     al.add("Vijay");  
     al.add("Ravi");  
     //al.add(null);  //null oitner exception
     System.out.println(al);
}
}
/*
HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.
The initial default capacity of HashSet is 16, and the load factor is 0.75.

*
*Java TreeSet class contains unique elements only like HashSet.
Java TreeSet class access and retrieval times are quiet fast.
Java TreeSet class doesn't allow null element.
Java TreeSet class is non synchronized.
Java TreeSet class maintains ascending order.
*/