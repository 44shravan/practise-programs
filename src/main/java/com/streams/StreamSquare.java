package com.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamSquare {
public static void main(String[] args) {
	List<Integer> ls = new ArrayList<>();
	ls.add(12);
	ls.add(13);
	ls.add(7);
	ls.add(2);
	ls.add(15);
	ls.add(10);
	ls.stream().map(num->num*num).filter(n->n>100).forEach(a->System.out.println(a.toString()));
	//Given list of integers using streams find square of each integer and integersgreter than 100
}
}
