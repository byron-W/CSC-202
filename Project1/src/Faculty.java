public class Faculty extends Employee {
	// Instance Variables
	private String title;

	public Faculty(String name, int employeeID, String department, String title) { // Constructor
		super(name, employeeID, department);
		setTitle(title);
	}

	// Getter and Setter Methods
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void writeOutput() { // Display all information for this object
		String str = "Class: Faculty\n";
		str += "Name: " + getName() + "\nEmployee ID: " + getEmployeeID() + "\nDepartment: " + getDepartment()
				+ "\nTitle: " + title;
		System.out.println(str);
	}

	// Checks if the objects are the same
	public boolean equals(Faculty otherFaculty) {
		if (this.getEmployeeID() == otherFaculty.getEmployeeID())
			return true;
		else
			return false;
	}

	// Reset the object and set new values to data
	public void reset(String newName, int newEmployeeID, String newDepartment, String newTitle) {
		setName(newName);
		setEmployeeID(newEmployeeID);
		setDepartment(newDepartment);
		setTitle(newTitle);
	}
}
