import java.lang.*;

class Main{
	public static void main(String[] args) throws java.lang.Exception{
		// Instantiated objects
		Outer outerObject = new Outer();
		Outer.NonStaticInner nonStaticInnerObject = outerObject.new NonStaticInner();
		Outer.StaticInner staticObject = new Outer.StaticInner();

		System.out.println("--- Testing for instances ---");
		Outer.StaticInner.printHelloStatic();
		staticObject.printHello();
		nonStaticInnerObject.printHello();
		outerObject.printOuterOnly(); 

		// Access outer class from inner class
		System.out.println("\n--- Accessing outer class from inner class ---");
		nonStaticInnerObject.accessOuter();
		staticObject.accessOuter();
		Outer.StaticInner.accessOuter();
	}
}