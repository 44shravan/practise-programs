package collections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Tution{
	 int rollNo;
	 String name;
	 int age;
	public Tution(int rollNo,String name,int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Student rNo - "+rollNo+" Student Name - "+name+" Student age - "+age;
	}
}

class AgeComparator implements Comparator<Tution>{

	@Override
	public int compare(Tution t1, Tution t2) {
		if(t1.rollNo == t2.rollNo) {
			return 0;
		}else if(t1.rollNo > t2.rollNo) {
			return 1;
		}else {
			return -1;
		}
	}
	
}

class NameComparator implements Comparator<Tution>{

	@Override
	public int compare(Tution t1, Tution t2) {
		return t1.name.compareTo(t2.name);
	}
	
}

public class ComparatorTest {
public static void main(String[] args) {
	List<Tution> ls = new ArrayList<Tution>();
	ls.add(new Tution(43,"msk",21));
	ls.add(new Tution(68,"hsk",11));
	ls.add(new Tution(32,"ksk",30));
	ls.add(new Tution(10,"csk",28));
	Collections.sort(ls, new AgeComparator());
	System.out.println(ls);
	Collections.sort(ls, new NameComparator());
	System.out.println(ls);
}
}
