package com.practise.practise_programs;

import java.util.Random;

public class RandonNumbTest {
public static void main(String[] args) {
	Random r = new Random();
	int rn = r.nextInt(30);
	System.out.println(rn);
	int max = 10,min = 1;
	int rn1 = (int) (Math.random()*(max-min+1)+min);
	System.out.println(rn1);
}
}
