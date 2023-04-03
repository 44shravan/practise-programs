package third;

import java.util.HashMap;
import java.util.Map;

class Employee{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class HashmapDuplicateObj {
public static void main(String[] args) {
	Map<Employee,Employee> m = new HashMap<>();
	Employee e1 = new Employee();
	e1.setId(1);
	e1.setName("shr");
	Employee e2 = new Employee();
	e2.setId(2);
	e2.setName("msk");
	m.put(e1,e2);
	m.put(e1,e1);
	System.out.println(m.size());
	
	m.forEach((k,v)->System.out.println(k.getName()+"-"+v.getName()));
	
}
}
