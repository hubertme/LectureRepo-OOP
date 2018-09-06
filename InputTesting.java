import java.util.*;

class InputTesting{
	public static void main(String[] args) throws java.lang.Exception {
		Scanner input = new Scanner(System.in);

		String userName = input.nextLine();
		System.out.format("Hi, %s!\n",userName);

		// try {
		// 	String userName = input.nextLine();
		// 	System.out.format("Hi, %s!\n",userName);
		// }
		// catch (Exception e){
		// 	System.out.format("Name invalid!");
		// 	return;
		// }

		try {
			double userNumber = input.nextDouble();
			System.out.format("Your number is: %.2f\n",userNumber);
		}
		catch (Exception e){
			System.out.println("Not a number!");
		}
		
	}
}