package com.practise.practise_programs;

public class PrimeCheck {
void checkPrime(int num) {
	int flag = 0;
	if(num == 0 || num == 1) {
		System.out.println("Not prime");
	}else {
		for(int i=2;i<=(num/2);i++) {
			if(num%i == 0) {
				System.out.println("Not prime");
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("prime");
		}
	}
}
public static void main(String[] args) {
	PrimeCheck pc = new PrimeCheck();
	pc.checkPrime(27);
}
}
