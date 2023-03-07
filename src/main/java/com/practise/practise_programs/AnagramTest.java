package com.practise.practise_programs;

import java.util.Arrays;

public class AnagramTest {
void checkAnagram(String s1,String s2) {
	char[] ch1 = s1.toLowerCase().toCharArray();
	char[] ch2 = s2.toLowerCase().toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	if(Arrays.equals(ch1, ch2)) {
		System.out.println("angram");
	}else {
		System.out.println("not angram");
	}
}
public static void main(String[] args) {
	AnagramTest ag = new AnagramTest();
	ag.checkAnagram("Listen","saleNt");
}
}
