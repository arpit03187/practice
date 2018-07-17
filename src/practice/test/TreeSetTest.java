package practice.test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		Set<Integer> treeset = new TreeSet<>();
		
		treeset.add(4);
		treeset.add(2);
		treeset.add(4);
		treeset.add(4);
		
		System.out.println(treeset.size());
	}
}
