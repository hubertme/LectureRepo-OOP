class TestThrow{
	static void validate(int age){
		if (age<18){
			throw new ArithmeticException();
		}
		System.out.println("Welcome, folks!");
		return;
	}

	public static void main(String[] args) {
		try{
			TestThrow.validate(20);
		}  catch (ArithmeticException e){
			System.out.println("Not enough age!");
		}
	}
}