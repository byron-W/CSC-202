public class Undergraduate extends Student {
	// Instance Variables
	private int level;

	public Undergraduate(String name, int studentNumber, int level) { // Constructor
		super(name, studentNumber);
		setLevel(level);
	}

	// Getter and Setter Methods
	public void setLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void writeOutput() { // Display all information for this object
		String str = "Class: Undergraduate\n";
		str += "Name: " + getName() + "\nStudent Number: " + getStudentNumber() + "\nLevel: " + level;
		System.out.println(str);
	}
	// Checks if the objects are the same
	public boolean equals(Undergraduate otherUndergraduate) {
		if (this.getStudentNumber() == otherUndergraduate.getStudentNumber())
			return true;
		else
			return false;
	}

	// Reset the object and set new values to data
	public void reset(String newName, int newStudentNumber, int newLevel) {
		setName(newName);
		setStudentNumber(newStudentNumber);
		setLevel(newLevel);
	}
}
