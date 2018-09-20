import animalPackage.*;

class CallPackage{
	public void feed(){
		System.out.println("The animal now eats");
	}

	public void move(){
		System.out.println("Move your as*!");
	}

	public static void main(String[] args) {
		CallPackage animal = new CallPackage();
		animal.feed();
		animal.move();
	}
}