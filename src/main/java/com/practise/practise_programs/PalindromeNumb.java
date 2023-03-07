package com.practise.practise_programs;

public class PalindromeNumb {
	void checkPalindrome(int num) {
		int n=num;
		int i=0,j;
		while(num != 0) {
			j = num % 10;
			i = i * 10 + j;
			num = num/10;
		}
		if(n == i) {
			System.out.println("pal");
		}else {
			System.out.println("not pal");
		}
	}
public static void main(String[] args) {
	PalindromeNumb pn= new PalindromeNumb();
	pn.checkPalindrome(22212);
}
}
