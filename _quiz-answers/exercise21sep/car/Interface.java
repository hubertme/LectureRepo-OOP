import java.util.*;

class Interface{
	static void displayMainMenu(){
		System.out.println("Main Menu...");
		System.out.println("1. Check Odometer");
		System.out.println("2. Check fuel");
		System.out.println("3. Drive your car");
		System.out.println("4. Refill Fuel");
		System.out.println("5. Sound your horn!");
		System.out.println("6. Change Oil");
		System.out.println("Aside from integer input, this programme will terminate\n");
		System.out.println("Your input?");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Car myCar = new Car();

		// Beginning of game
		System.out.println("Welcome, how would you like your car's km per litre?");
		System.out.println("1. Default: 14.0 km/litre");
		System.out.println("2. Custom");
		try{
			int numberInputted = input.nextInt();
			if (numberInputted==2){
				System.out.println("What's your car km per litre?");
				try{
					double userInput = input.nextDouble();
					myCar.kmPerLitre = userInput;
				} catch (Exception e){
					System.out.println("Thanks for playing!");
				}
			}
		} catch (Exception e){
			System.out.println("Thanks for playing!");
		}

		System.out.println("Success! Your car's km per litre is "+myCar.kmPerLitre);

		boolean flag = true;
		while (flag){
			displayMainMenu();
			
			try{
				int numberInputted = input.nextInt();
				switch (numberInputted){
					case 1:
						System.out.println("You have travelled "+myCar.checkOdometer());
						continue;
					case 2:
						System.out.println("You have "+myCar.checkFuel()+" litre of fuel");
						continue;
					case 3:
						System.out.println("Enter distance to be travelled!");
						numberInputted = input.nextInt();
						myCar.drive(numberInputted);
						continue;
					case 4:
						System.out.println("Enter amount of petrol to be refilled");
						double userInput = input.nextDouble();
						myCar.refillFuel(userInput);
						continue;
					case 5:
						myCar.horn();
						continue;
					case 6:
						myCar.changeOil();
						continue;
					default:
						System.out.println("Invalid input!");
						continue;
				}

			} catch (Exception e){
				System.out.println("Thanks for playing!");
				break;
			}
		}
	}
}