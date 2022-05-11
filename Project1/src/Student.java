public class Student extends Person {
	//Instance Variables
	private int studentNumber;

	public Student(String name, int studentNumber) { //Constructor
		super(name);
		setStudentNumber(studentNumber);
	}
	//Getter and Setter Methods
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void writeOutput() { //Display all information for this object
		String str = "Class: Student\n";
		str += "Name: " + getName() + "\nStudent Number: " + studentNumber;
		System.out.println(str);
	}
	//Checks if the objects are the same
	public boolean equals(Student otherStudent) {
		if (this.studentNumber == otherStudent.studentNumber)
			return true;
		else
			return false;
	}
	//Reset the object and set new values to data
	public void reset(String newName, int newStudentNumber) {
		setStudentNumber(newStudentNumber);
	}
}
