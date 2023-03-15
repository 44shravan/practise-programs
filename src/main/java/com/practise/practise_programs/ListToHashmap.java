package com.practise.practise_programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ppd.practise1.Employee1;

public class ListToHashmap {
public static void main(String[] args) {
	List<Employee1> empList = new ArrayList<Employee1>();
	empList.add(new Employee1(1,"msk"));
	empList.add(new Employee1(2,"pillo"));
	empList.add(new Employee1(55,"mise"));
	empList.add(new Employee1(130,"kile"));
	Map<Integer, Employee1> empMap = new HashMap<Integer, Employee1>();
	empList.forEach(e -> empMap.put(e.getId(), e));
	System.out.println(empMap);
	Map<Integer, Employee1> empMap1 = new HashMap<Integer, Employee1>();
	empMap1 = empList.stream().collect(Collectors.toMap(e->e.getId(), e->e));
	System.out.println(empMap1);
	
	empList.stream().map(p->p.getId()).forEach(System.out::println);
	
}
}
