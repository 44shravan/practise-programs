package com.streams;

import java.util.Arrays;
import java.util.List;

public class MinMax {
public static void main(String[] args) {
	 List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
	  
     // Using stream.min() to get minimum
     // element according to provided Integer Comparator
     Integer var = list.stream().sorted().limit(3).min(Integer::compare).get();

     System.out.print(var);
}
}
