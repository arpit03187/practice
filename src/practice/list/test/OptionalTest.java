package practice.list.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest {
	
	public Float getSalaryGreaterThan2000(List<Person> persons) {
		
		return persons.stream()
	            .filter(person -> person.getName().equals("Dennis"))
	            .findFirst().map(person -> {
	                return new Float(person.getSalary());
	    }).orElse(null);
		
	}
	
	public Person personPresent(Optional<Person> p) {
		
		return p.filter(person -> person != null).map( person -> {
			return person;
		}).orElseGet(() -> {
			Person p1 = new Person();
			p1.setName("Kevin");
			return p1;
		});
	}

}
