public class PolymorphismDemo {
	public static void main(String[] args) {
		Person[] people = new Person[7];	//Instantiate a array of Persons
		people[0] = new Person("Cotty, Manny");
		people[1] = new Student("Debanque, Robin", 8812);
		people[2] = new Undergraduate("Kick, Anita", 9931, 2);
		people[3] = new Graduate("Bugg, June", 9901, 4);
		people[4] = new Employee("Smith, John", 40949, "Retail");
		people[5] = new Staff("Kusuo, Saiki", 54684, "IT", 20);
		people[6] = new Faculty("Kaido, Shun", 35478, "Human Resource", "Chief Human Resources Officer");
		for (Person p : people) {
			p.writeOutput();
			System.out.println();
		}
		//Testing the equals() method
		Employee dupli = new Employee("A real, person", 65496, "Marketing");
		Employee dupli2 = new Employee("A real, person", 65496, "Marketing");
		Graduate nonDupli = new Graduate("Fake, Person", 6874, 1);
		Graduate nonDupli2 = new Graduate("AnotherFake, Person", 8754, 6);
		if (dupli.equals(dupli2))
			System.out.println("These objects match");
		else
			System.out.println("These don't objects match");
		if (nonDupli.equals(nonDupli2))
			System.out.println("These objects match");
		else
			System.out.println("These don't objects match");
		System.out.println();
		//Testing the reset() method
		Faculty example = new Faculty("Random, Name", 98765, "Some department", "Some title");
		example.writeOutput();
		System.out.println();
		example.reset("Jet Black Wings", 12345, "World Defense", "Judgement Knight of Thunder");
		System.out.println("New values:");
		System.out.println();
		example.writeOutput();
	}
}