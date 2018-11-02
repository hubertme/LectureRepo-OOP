class CheckedException{
	public static void firstFunction(){
		throw new java.io.IOException("Device error"); // Failed to compile
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
		CheckedException.execute();
		System.out.println("Normal flow...");
	}
}