package practice.list.test;

import java.util.HashSet;
import java.util.Set;

public class TestBadHashSet {
	
	public static void main(String[] args) {
		
		TestBadHashSet badHashSet = new TestBadHashSet();
		
		Set<Person> personSet = new HashSet<>();
		
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("Jon");
		p1.setSalary(200f);
		
		Person p2 = new Person();
		p1.setId(2);
		p1.setName("Jon");
		p1.setSalary(200f);
		
		personSet.add(p1);
		personSet.add(p2);
		
		
	}

}
