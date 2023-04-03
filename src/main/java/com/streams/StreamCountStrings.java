package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCountStrings {

	
	
	public static void main(String[] args) {
		// String a[] =  { "A", "B", "C", "D" };
		List<String> sList = new ArrayList<>();
		sList = Arrays.asList(new String[]{ "shr", "msk", "msk", "oil" });
		sList.stream().collect(Collectors.groupingBy(S->S)).forEach((k,v)->System.out.println(k+"-"+v.size()));
		sList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((k,v)->System.out.println(k+"-"+v));;
	}
}
