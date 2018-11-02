import java.io.*;

class ThrowsFunction{
	public static void firstFunction() throws IOException{
		System.out.println("Device error"); // Failed to compile
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
		ThrowsFunction.execute();
		System.out.println("Normal flow...");
	}
}