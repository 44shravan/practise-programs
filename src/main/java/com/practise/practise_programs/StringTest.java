package com.practise.practise_programs;

public class StringTest {
public static void main(String[] args) {
	
	String  s1 = "xyz";
	String s2 = new String("xyz");
	String s3 = new String("2");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	Long l1 = new Long(2);
	Long l2 = new Long("2");
	Integer i1= new Integer("2");
	System.out.println(l1==l2);
	System.out.println(l1.equals(l2));
	System.out.println(l1.equals(i1));
	System.out.println(s3.equals(l1));
}
}
