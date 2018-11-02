class TestExceptionPropagation{
	public static void firstFunction(){
		int data = 50/0;
	}
	public static void secondFuction(){
		firstFunction();
	}
	public static void execute(){
		try{
			secondFuction();
		} catch (Exception e){
			System.out.println("Exception handled!");
		}
	}
	public static void main(String[] args) {
		// TestExceptionPropagation exceptionObj = new TestExceptionPropagation();
		// exceptionObj.execute();
		TestExceptionPropagation.execute();
		System.out.println("Normal flow...");
	}
}