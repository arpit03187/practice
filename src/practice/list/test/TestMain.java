package practice.list.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMain {

	public static void main(String[] args) {
		
		
		TestMain main = new TestMain();
		OptionalTest op = new OptionalTest();
		Person pp = op.personPresent(main.populateSinglePerson());
		//System.out.println(pp.getName());
	//	System.out.println(pp.getId());
	//	System.out.println(pp.getSalary());
		List<Person> showPersons = main.populatePersons();
		
		showPersons.stream().forEach( person -> {
			System.out.println(person.getName());
		});
		
//		System.out.println(op.getSalaryGreaterThan2000(showPersons));
//		
//		showPersons.stream().forEach( person -> {
//			AnotherPerson another = new AnotherPerson(person.getId(), person.getName());
//		});
//		 
//		List<AnotherPerson> anotherList = showPersons.stream().filter(person -> person != null).map( person -> 
//		new AnotherPerson(person.getId(), person.getName())).collect(Collectors.toList());
//		
//		for(AnotherPerson p: anotherList) {
//			System.out.println(p.getId());
//			System.out.println(p.getName());
//		}
//		
//		Predicate<Person> p1 = e -> e.getName().equals("John");
//		
//		System.out.println(showPersons.stream().allMatch(e -> e.getName().equals("John")));
//		
//		if(showPersons.size() > 0) {
//			
//			System.out.println("True");
//		}
//		else {
//			System.out.println("FalseX");
//		}
//		
//		if(showPersons.stream().count() > 0) {
//			System.out.println("True");
//		}
//		else {
//			System.out.println("FalseX");
//		}
		
		
	}
	
	public Optional<Person> populateSinglePerson() {
		
		Person p1 = new Person();
		
		p1.setId(1);
		p1.setName("John");
		p1.setSalary(2000f);
		
		return Optional.ofNullable(null);
		
		
	}
	
	
	public List<Person> populatePersons() {
		
		Person p1 = new Person();
		
		p1.setId(1);
		p1.setName("John");
		p1.setSalary(2000f);
		
		Person p2 = new Person();
		
		p2.setId(2);
		p2.setName("Josh");
		p2.setSalary(3000f);
		
		Person p3 = new Person();
		
		p3.setId(3);
		p3.setName("Josh");
		p3.setSalary(6000f);
		
		return Stream.of(p1, p2, p3).collect(Collectors.toList());
	}
	
	
	
}
