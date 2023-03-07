package com.practise.practise_programs;

public class Fibonnaci {
	
	void getFibonnaci(int range) {
		int r = range;
		int i = 0,j = 1,k=0;
		while(r>0) {
			System.out.println(k);
			k = i + j;
			i=j;
			j=k;
			r--;
			
		}
	}
public static void main(String[] args) {
	Fibonnaci fb = new Fibonnaci();
	fb.getFibonnaci(6);
}
}
