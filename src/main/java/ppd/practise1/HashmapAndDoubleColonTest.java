package ppd.practise1;

import java.util.*;
import java.util.stream.Collectors;



public class HashmapAndDoubleColonTest {
public static void main(String[] args) {
	Employee1 e1= new Employee1(93,"shra");
	Employee1 e2= new Employee1(53,"kkr");
	Employee1 e3= new Employee1(59,"msk");
	Employee1 e4= new Employee1(59,"msk");
	/*
	 * Map<Long, Employee1> qsTransMap = new HashMap<Long, Employee1>();
	 * qsTransMap.put((long) 3, e1); qsTransMap.put((long) 77, e2);
	 * qsTransMap.put((long) 36, e3); TreeMap<Long,Employee1> values = new
	 * TreeMap<>(qsTransMap);
	 */
	//System.out.println(values.values());
	HashSet<Employee1> setExample = new HashSet<Employee1>();
	setExample.add(e1);
	setExample.add(e2);
	setExample.add(e3);
	setExample.add(e4);
	setExample.forEach(s ->{s.setName(s.getName()+"test");
	});
	setExample.forEach(s -> System.out.println(s.getName()));
	
	System.out.println("=============================================================");
	
	for(Employee1 e:setExample) {
		System.out.println(e);
	}
	
	System.out.println("=============================================================");
	
	setExample.forEach(Employee1 :: getName);
	
	List<Employee1> childQuestions = new ArrayList<Employee1>();
	childQuestions.add(e4);
	childQuestions.add(e3);
	/*System.out.println(childQuestions.isEmpty());
	System.out.println(childQuestions.size());
	System.out.println(childQuestions.get(0));*/
	
	
}
}
