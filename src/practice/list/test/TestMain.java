package practice.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestMain {

	public static void main(String[] args) {
		
		
		TestMain main = new TestMain();
		List<Person> showPersons = main.populatePerson();
		
//		showPersons.stream().forEach( person -> {
//			AnotherPerson another = new AnotherPerson();
//			another.setId(person.getId());
//			another.setName(person.getName());
//		});
//		 
		List<AnotherPerson> anotherList = showPersons.stream().filter(person -> person != null).map( person -> 
		new AnotherPerson(person.getId(), person.getName())).collect(Collectors.toList());
		
		for(AnotherPerson p: anotherList) {
			System.out.println(p.getId());
			System.out.println(p.getName());
		}
		
		//Predicate<Person> p1 = e -> e.getName().equals("John");
		
		System.out.println(showPersons.stream().allMatch(e -> e.getName().equals("John")));
		
		if(showPersons.size() > 0) {
			
			System.out.println("True");
		}
		else {
			System.out.println("FalseX");
		}
		
		if(showPersons.stream().count() > 0) {
			System.out.println("True");
		}
		else {
			System.out.println("FalseX");
		}
		
		
	}
	
	
	public List<Person> populatePerson() {
		
		List<Person> persons = new ArrayList<>();
		
		Person p1 = new Person();
		
		p1.setId(1);
		p1.setName("John");
		
		Person p2 = new Person();
		
		p2.setId(2);
		p2.setName("Josh");
		
		persons.add(p1);
		persons.add(p2);
		
		return persons;
	}
	
	
	
}
