package com.practise.practise_programs;

import java.util.HashMap;

public class StringOccurancesHashmap {
	void getOccurances(String s) {
		char[] chArray = s.toUpperCase().toCharArray();
		int l = 0;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		while(l<chArray.length) {
			if(hm.containsKey(chArray[l])) {
				hm.put(chArray[l],hm.get(chArray[l])+1);
			}else {
				hm.put(chArray[l],1);
			}
			l++;
		}
		hm.forEach((k,v) -> System.out.println(String.valueOf(k)+" - "+String.valueOf(v)));
	}
public static void main(String[] args) {
	StringOccurancesHashmap so = new StringOccurancesHashmap();
	so.getOccurances("GeeksForGeeks");
}
}
