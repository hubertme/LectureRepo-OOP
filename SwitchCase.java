import java.util.*;
import java.lang.*;

class SwitchCase{
	static Scanner input = new Scanner(System.in);
	static int userChoice;

	static void readUserInput() throws java.lang.Exception {
		userChoice = input.nextInt();
	}

	public static void main(String[] args) throws java.lang.Exception {
		System.out.format("1. Noodle\n2. Rice\n3. Spaghetti\n4. Macaroni\n");
		try{
			readUserInput();
		} catch (Exception e){
			System.out.println("Not an integer!");
			return;
		}

		// System.out.println(userChoice);
		switch(userChoice){
			case 1: System.out.println("You have ordered noodle!"); break;
			case 2: System.out.println("You have ordered rice!"); break;
			case 3: System.out.println("You have ordered spaghetti!"); break;
			case 4: System.out.println("You have ordered macaroni!"); break;
			default: System.out.println("Invalid order!");
		}
	}
}