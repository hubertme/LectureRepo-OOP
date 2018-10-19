public class Teacher{
	// Attribute declaration
	String name;
	int age;
	private double salary;

	// Overloading constructor
	Teacher(String name, int age){
		this.name = name;
		this.age = age;
		this.salary = 3000000;
	}
	Teacher(String name, int age, double salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	// Encapsulation
	// Set method for salary
	public void setSalary(double value){
		salary=value;
	}
	// Get method for salary
	public double fetchSalary(){
		return salary;
	}
	// Simple salary print function
	public void printSalary(){
		System.out.format("This teacher's salary is %.2f\n",fetchSalary());
	}
}