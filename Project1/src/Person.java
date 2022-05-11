public class Person {
	// Instance Variables
	private String name;

	public Person(String name) { // Constructor
		setName(name);
	}

	// Getter and Setter Methods
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void writeOutput() { // Display all information for this object
		String str = "Class: Person\n";
		str += "Name: " + name;
		System.out.println(str);
	}

	// Checks if the objects are the same
	public boolean hasSameName(Person otherPerson) {
		if (this.name.equals(otherPerson.name))
			return true;
		else
			return false;
	}
}
