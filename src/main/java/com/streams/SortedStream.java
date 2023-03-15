package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Point
{
    Integer x, y;
    Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
      public int getx() {
    	  return this.x;
      }
    public String toString() { 
        return this.x + ", "+ this.y;
    } 
}

public class SortedStream {
	 public static void main(String[] args)
	    {
	  
	        List<Point> aList = new ArrayList<>();
	        aList.add(new Point(10, 20));
	        aList.add(new Point(5, 10));
	        aList.add(new Point(1, 100));
	        aList.add(new Point(50, 2000));
	  
	        // displaying the stream with elements
	        // sorted according to x coordinate
	        aList.stream()
	        .sorted((p1, p2)->p1.x.compareTo(p2.x))
	        .forEach(System.out::println);
	        System.out.println("llllllllllllllllllllll");
	        aList.stream()
	        .sorted(Comparator.comparingInt(Point::getx).reversed())
	        .forEach(System.out::println);
	    }
}
