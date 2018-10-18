public class ImplementingClass extends AbstractClass{
	public void abstractMethod(){
		System.out.println("Running abstractMethod() in ImplementingClass");
	}

	public void implementingMethod(){
		System.out.println("Overriden!");
	}

	// public void finalMethod(){
	// 	System.out.println("Try to override");
	// }

	public static void main(String[] args) {
		ImplementingClass myObject = new ImplementingClass();
		myObject.implementingMethod();
		// myObject.super.implementingMethod();
		myObject.abstractMethod();
		myObject.finalMethod();
	}
}