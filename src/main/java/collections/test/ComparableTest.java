package collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	private int rollNo;
	private String name;
	public Student(int rollNo,String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public int compareTo(Student sObj) {
		if(rollNo == sObj.rollNo) {
			return 0;
		}else if(rollNo > sObj.rollNo) {
			return 1;
		}else {
			return -1;
		}
	}
	
	@Override
	public String toString() {
		return "Student rNo - "+rollNo+" Student Name - "+name;
	}
}

public class ComparableTest {
public static void main(String[] args) {
	List<Student> ls = new ArrayList<Student>();
	ls.add(new Student(43,"msk"));
	ls.add(new Student(68,"hsk"));
	ls.add(new Student(32,"ksk"));
	ls.add(new Student(10,"csk"));
	
	Collections.sort(ls);
	System.out.println(ls);
	
}
}
