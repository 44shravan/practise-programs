package ppd.practise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DistinctStreamTest {

	public static void main(String[] args) {
		List<Employee1> elements = new ArrayList<Employee1>();
		Employee1 e1 = new Employee1(0, "l");
		Employee1 e2 = new Employee1(1, "saaa");
		Employee1 e3 = new Employee1(2, "k");
		Employee1 e4 = new Employee1(3, "saaa");
		elements.add(e1);
		elements.add(e2);
		elements.add(e3);
		elements.add(e4);
		List<Employee1> elementsStream = elements.stream()
                .distinct()
                .collect(Collectors.toList());
		
		Map<Object, List<Employee1>> elementsStream1 = elements.stream()
        //operators to remove duplicates based on person name
        .collect(Collectors.groupingBy(p -> p.getName()));
		
		List<Employee1> elementsStream2 = elements.stream()
		        //operators to remove duplicates based on person name
		        .collect(Collectors.groupingBy(p -> p.getName()))
		        .values()
		        .stream()
		        //cut short the groups to size of 1
		        .flatMap(group -> group.stream())
		        //collect distinct users as list
		        .collect(Collectors.toList());
		elementsStream2.forEach(e -> System.out.println(e.getName()));
		System.out.println("==========================");
		
		
		elementsStream.forEach(e -> System.out.println(e.getName()));
		List<Employee1> distinctElements = elements.stream()
        //operators to remove duplicates based on person name
        .collect(Collectors.groupingBy(p -> p.getName()))
        .values()
        .stream()
        //cut short the groups to size of 1
        .flatMap(group -> group.stream().limit(1)).sorted((a, b) -> b.getName().length() - a.getName().length())
        //collect distinct users as list
        .collect(Collectors.toList());
		System.out.println(distinctElements);
		distinctElements.forEach(e -> System.out.println(e.getName()));
		System.out.println("==========================");
		
		List<Employee1> distinctElementsSorted =
		distinctElements.stream().sorted((a, b) -> b.getName().length() - a.getName().length()).collect(Collectors.toList());
		distinctElementsSorted.forEach(e -> System.out.println(e.getName()));
	}
	
	/*
https://www.geeksforgeeks.org/stream-flatmap-java-examples/

public static void main(String[] args)
    {   
        // Creating a list of Prime Numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);
          
        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
          
        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);
  
        List<List<Integer>> listOfListofInts =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
  
        System.out.println("The Structure before flattening is : " +
                                                  listOfListofInts);
          
        // Using flatMap for transformating and flattening.
        List<Integer> listofInts  = listOfListofInts.stream()
                                    .flatMap(list -> list.stream())
                                    .collect(Collectors.toList());
  
        System.out.println("The Structure after flattening is : " +
                                                         listofInts);
    }
*/
}
