public class Main{
	// Initialise Class
	static Class classOne = new Class ("English",1,"Robert Tan",40);
	static Class classTwo = new Class ("Chinese",2,"Yulia Liu",29,5000000);

	// Main function
	public static void main(String[] args) {
		// Change both classes' number
		System.out.println("Class one number before: "+classOne.fetchClassNumber());
		System.out.println("Class two number before: "+classTwo.fetchClassNumber());
		classOne.changeClassNumber(10);
		classTwo.changeClassNumber(100);
		System.out.println("Class one number: "+classOne.fetchClassNumber());
		System.out.println("Class two number: "+classTwo.fetchClassNumber());

		// Check teacher's salary (encapsulation)
		printTeacherSalary();

		// Change teachers' salary
		classOne.myTeacher.setSalary(1500000);
		classTwo.myTeacher.setSalary(11500000);
		printTeacherSalary();
	}

	// Simple print function
	private static void printTeacherSalary(){
		System.out.print("Class one: ");
		classOne.myTeacher.printSalary();
		System.out.print("Class two: ");
		classTwo.myTeacher.printSalary();
	}
}