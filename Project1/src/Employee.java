public class Employee extends Person {
	// Instance Variables
	private int employeeID;
	private String department;

	public Employee(String name, int employeeID, String department) { // Constructor
		super(name);
		setEmployeeID(employeeID);
		setDepartment(department);
	}

	// Getter and Setter Methods
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public String getDepartment() {
		return department;
	}

	public void writeOutput() { // Display all information for this object
		String str = "Class: Employee\n";
		str += "Name: " + getName() + "\nEmployee ID: " + employeeID + "\nDepartment: " + department;
		System.out.println(str);
	}
	// Checks if the objects are the same
	public boolean equals(Employee otherEmployee) {
		if (this.employeeID == otherEmployee.employeeID)
			return true;
		else
			return false;
	}

	// Reset the object and set new values to data
	public void reset(String newName, int newEmployeeID, String newDepartment) {
		setName(newName);
		setEmployeeID(newEmployeeID);
		setDepartment(newDepartment);
	}
}
