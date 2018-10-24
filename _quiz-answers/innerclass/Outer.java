class Outer{

	// Non-static nested class
	class NonStaticInner{
		public void printHello(){
			System.out.println("Hello, non static!");
		}
		public void accessOuter(){
			Outer.this.printOuter();
		}
	}

	// Static nested class
	static class StaticInner{
		public void printHello(){
			System.out.println("Hello, static!");
		}
		public static void printHelloStatic(){
			System.out.println("Hello, static (without instance)!");
		}
		public static void accessOuter(){
			Outer myObject = new Outer();
			myObject.printOuter();
		}
	}

	public void printOuter(){
		System.out.println("Hello, from the other side!");
	}

	public void printOuterOnly(){
		System.out.println("Hello, from outside!");
	}
}