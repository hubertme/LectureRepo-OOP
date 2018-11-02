class JavaExceptionExample {
	public static void main(String[] args) {
		try{
			int data = 100/0;
			System.out.println("Data= "+data);
		} catch (ArithmeticException e){
			System.out.println("Division by zero!");
			System.out.println(e);
		}
		System.out.println("Rest of code...");
	}
}