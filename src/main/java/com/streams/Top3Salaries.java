package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	
	private int id;
	private int salary;
	private String department;
	
	
	public Employee(int id, int salary, String department) {
		super();
		this.id = id;
		this.salary = salary;
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public int getSalary() {
		return salary;
	}
	public String getDepartment() {
		return department;
	}
	
	@Override
	public String toString() {
		return String.valueOf(salary);
	}
}

public class Top3Salaries {
	
public static void main(String[] args) {
	
	List<Employee> empList = new ArrayList<>();
	empList.add(new Employee(1,100,"IT"));
	empList.add(new Employee(2,400,"CSE"));
	empList.add(new Employee(3,200,"ECE"));
	empList.add(new Employee(4,600,"IT"));
	empList.add(new Employee(5,500,"CSE"));
	empList.add(new Employee(6,700,"ECE"));
	empList.add(new Employee(7,300,"IT"));
	empList.add(new Employee(8,900,"CSE"));
	empList.add(new Employee(9,800,"ECE"));
	empList.add(new Employee(10,400,"IT"));
	empList.add(new Employee(11,200,"CSE"));
	empList.add(new Employee(12,300,"ECE"));
	
	Map<String, List<Employee>> empMap = new HashMap<>();
	
	empList.forEach(e->{
		if(empMap.containsKey(e.getDepartment())){
			List<Employee> em  = empMap.get(e.getDepartment());
			em.add(e);
		empMap.put(e.getDepartment(),em );
		}else {
			List<Employee> em  = new ArrayList<Employee>();
			em.add(e);
			empMap.put(e.getDepartment(),em );
		}
	});
	empMap.forEach((k,v) -> System.out.println(String.valueOf(k)+" - "+String.valueOf(v)));
	
	empMap.forEach((k,v) -> 
	{
	System.out.println(String.valueOf(k));
	v.stream()
    .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
    .limit(3)
    .forEach(System.out::println);
	}
			);
	
	Map<String, List<Employee>> empMap2 = empList.stream().collect(Collectors.groupingBy(s->s.getDepartment()));
	empMap2.forEach((k,v) -> 
	{
	System.out.println(String.valueOf(k));
	v.stream()
    .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
    .limit(3)
    .forEach(System.out::println);
	}
			);
	
}



}

/*Map<String, List<Student>> studentsBySubject = students
.stream()
.collect(
    Collectors.groupingBy(Student::getSubject)
);*/
