public class Class implements Schedule{
	// Attribute declaration and definition
	String className;
	private int classNumber;
	Teacher myTeacher = new Teacher ("No name",0);
	
	// Overloading constructor
	Class(String name, int number, String teacherName, int teacherAge){
		this.className = name;
		this.classNumber = number;
		myTeacher.name = teacherName;
		myTeacher.age = teacherAge;
	}
	Class(String name, int number, String teacherName, int teacherAge, double salary){
		this.className = name;
		this.classNumber = number;
		myTeacher.name = teacherName;
		myTeacher.age = teacherAge;
		myTeacher.setSalary(salary);
	}

	// Implements method from interface (set-get -> Encapsulation)
	// Function to change classNumber
	public void changeClassNumber(int value){
		classNumber = value;
	}
	// Method to return the value of classNumber
	public int fetchClassNumber(){
		return classNumber;
	}

}