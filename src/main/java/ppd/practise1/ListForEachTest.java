package ppd.practise1;

import java.util.ArrayList;
import java.util.List;

public class ListForEachTest {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		for(int i=1;i<5;i++) {
			Employee e = new Employee();
			e.setName(Integer.toString(i));
			empList.add(e);
		}
		System.out.println(empList);
		//empList.forEach(p -> {System.out.println(p.getName());});
		empList.forEach(System.out::println);
		Employee e1 = new Employee();
		e1.setName("test");
		Employee e2 = new Employee();
		System.out.println((null == e2.getJoiningDate()));
		
	}
}
