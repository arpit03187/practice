package practice.test;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		
		Customer c1 = new Customer("A");
		Customer c2 = new Customer("B");
		Customer c3 = new Customer("C");
		
		Set<Customer> c = new HashSet<>();
		
		c.add(c1);
		c.add(c2);
		c.add(c3);
		
		System.out.println(c.size());
	}
	
}

