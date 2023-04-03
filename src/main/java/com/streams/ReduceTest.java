package com.streams;

import java.util.Arrays;
import java.util.Optional;

public class ReduceTest {
public static void main(String[] args) {
	String[] array = { "Geeks", "for", "Geeks" };
	  
    // The result of the reduce() method is
    // an Optional because the list on which
    // reduce() is called may be empty.
    Optional<String> String_combine = Arrays.stream(array)
                                       .reduce((str1, str2)
                                       -> str1 + "-" + str2);
    //.reduce(0.0f,(sum, price)->sum+price); 
    String s2 = Arrays.stream(array)
    .reduce("",(str1, str2)
    -> str1 + "-" + str2);

    // Displaying the combined String
    if (String_combine.isPresent()) {
        System.out.println(String_combine.get());
    }
    
    System.out.println(s2);
}
}
