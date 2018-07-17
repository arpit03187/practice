package practice.ood;

public class TestPerson {

	public static void main(String[] args) {
		TestPerson test = new TestPerson();
		Person p = new Person();
		test.populatePerson(p);
		test.overridePerson(p);
		System.out.println(p.getName());
	}
	
	public void populatePerson(Person p) {
		p.setName("Arpit");
		p.setAge(22);
		p.setId(1);
	}
	
	public void overridePerson(Person p) {
		p.setName("Jon");
	}
}
