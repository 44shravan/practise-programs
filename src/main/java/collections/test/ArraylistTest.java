package collections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArraylistTest {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<>();
	al.add("testing");
	ArrayList<String> al2 = new ArrayList<String>();
	List<String> al3 = new LinkedList<String>();
	al2.add("test");
	System.out.println(al);
	System.out.println(al2);

    // create list
    List<String> crunchifyList = new ArrayList<String>();
    // add 4 different values to list
    crunchifyList.add("Facebook");
    crunchifyList.add("Paypal");
    crunchifyList.add("Google");
    crunchifyList.add("Yahoo");
    crunchifyList.add(null);   //allows null multiple
    crunchifyList.add(null);
    // Other way to define list is - we will not use this list :)
    List<String> crunchifyListNew = Arrays.asList("Facebook", "Paypal", "Google", "Yahoo");
    // Simple For loop
    System.out.println("==============> 1. Simple For loop Example.");
    for (int i = 0; i < crunchifyList.size(); i++) {
        System.out.println(crunchifyList.get(i));
    }
    // New Enhanced For loop
    System.out.println("\n==============> 2. New Enhanced For loop Example..");
    for (String temp : crunchifyList) {
        System.out.println(temp);
    }
    // Iterator - Returns an iterator over the elements in this list in proper sequence.
    System.out.println("\n==============> 3. Iterator Example...");
    Iterator<String> crunchifyIterator = crunchifyList.iterator();
    while (crunchifyIterator.hasNext()) {
        System.out.println(crunchifyIterator.next());
    }
    // ListIterator - traverse a list of elements in either forward or backward order
    // An iterator for lists that allows the programmer to traverse the list in either direction, modify the list during iteration,
    // and obtain the iterator's current position in the list.
    System.out.println("\n==============> 4. ListIterator Example...");
    ListIterator<String> crunchifyListIterator = crunchifyList.listIterator();
    while (crunchifyListIterator.hasNext()) {
        System.out.println(crunchifyListIterator.next());
    }
    // while loop
    System.out.println("\n==============> 5. While Loop Example....");
    int i = 0;
    while (i < crunchifyList.size()) {
        System.out.println(crunchifyList.get(i));
        i++;
    }
    // Iterable.forEach() util: Returns a sequential Stream with this collection as its source
    System.out.println("\n==============> 6. Iterable.forEach() Example....");
    crunchifyList.forEach((temp) -> {
    	temp = temp + "test";
        System.out.println(temp);
    });
    // collection Stream.forEach() util: Returns a sequential Stream with this collection as its source
    System.out.println("\n==============> 7. Stream.forEach() Example....");
    crunchifyList.stream().forEach((crunchifyTemp) -> System.out.println(crunchifyTemp));

    crunchifyList.remove("Google");
    System.out.println(crunchifyList);


    /*
     * 
     * If you use the first form, you are saying all you are ever going to use is the functionality of the List interface - nothing else,
    especially nothing extra added by any implementation of it.
    This means you can easily change the implementation used (e.g. just substitute LinkedList for ArrayList in the instantiation),
    and not worry about it breaking the rest of the code because you might have used something specific to ArrayList.*/
}
}
