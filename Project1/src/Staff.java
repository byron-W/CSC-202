public class Staff extends Employee {
	// Instance Variables
	private int payGrade;

	public Staff(String name, int employeeID, String department, int payGrade) { // Constructor
		super(name, employeeID, department);
		setPayGrade(payGrade);
	}

	// Getter and Setter Methods
	public void setPayGrade(int payGrade) {
		this.payGrade = payGrade;
	}

	public int getPayGrade() {
		return payGrade;
	}

	public void writeOutput() { // Display all information for this object
		String str = "Class: Staff\n";
		str += "Name: " + getName() + "\nEmployee ID: " + getEmployeeID() + "\nDepartment: " + getDepartment()
				+ "\nPay grade: " + payGrade;
		System.out.println(str);
	}

	// Checks if the objects are the same
	public boolean equals(Staff otherStaff) {
		if (this.getEmployeeID() == otherStaff.getEmployeeID())
			return true;
		else
			return false;
	}

	// Reset the object and set new values to data
	public void reset(String newName, int newEmployeeID, String newDepartment, int newPayGrade) {
		setName(newName);
		setEmployeeID(newEmployeeID);
		setDepartment(newDepartment);
		setPayGrade(newPayGrade);
	}
}
