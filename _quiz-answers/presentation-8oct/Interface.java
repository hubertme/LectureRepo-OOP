class Interface{
	static java.util.Scanner input = new java.util.Scanner(System.in);
	static Doctor doctor = new Doctor("A Doctor",50,0);
	static Nurse nurse = new Nurse("A Nurse",35,0);

	private static void inGame(){
		while (true){
			System.out.println("Welcome to the main menu!");
			System.out.println("Please enter account to be managed!\n1. Doctor\n2. Nurse");
			int userInput;
			try{
				userInput = input.nextInt();
				if (userInput == 1){
					doctorMainMenu();
				}	
				else{
					nurseMainMenu();
				}
			} 
			catch (Exception e){
				System.out.println("Thanks for playing!");
				// return;
				System.exit(0);
			}
		}
	}

	private static void doctorMainMenu(){
		while (true){
			System.out.println("1. Get salary");
			System.out.println("2. Get amount of operated patient");
			System.out.println("3. Operate one patient");
			System.out.println("4. Set operated patient");
			System.out.println("5. Change to nurse account");
			System.out.println("Any input aside from integer will terminate the programme!");

			int userInput;
			try{
				userInput = input.nextInt();
				switch (userInput){
					case 1:
						doctor.printSalary();
						continue;
					case 2:
						doctor.printPatient();
						continue;
					case 3:
						doctor.addPatient();
						System.out.println("Operation success!");
						doctor.printPatient();
						continue;
					case 4:
						try{
							System.out.println("Please enter new amount of operated patient!\nMake sure the value is higher than current value!");
							userInput = input.nextInt();
							doctor.setPatient(userInput);
						} catch (Exception e){
							System.out.println("Thanks for playing!");
							// return;
							System.exit(0);
						}
						continue;
					case 5:
						System.out.println("\nChanged to nurse account!");
						nurseMainMenu();
						continue;
					default:
						System.out.println("Please enter number between 1 and 5!");
				}
			} 
			catch(Exception e){
				System.out.println("Thanks for playing!");
				// return;
				System.exit(0);
			}
		}
	}

	private static void nurseMainMenu(){
		while (true){
			System.out.println("1. Get salary");
			System.out.println("2. Get amount of working days");
			System.out.println("3. Check-in for today");
			System.out.println("4. Set working days");
			System.out.println("5. Change to doctor account");
			System.out.println("Any input aside from integer will terminate the programme!");
			
			int userInput;
			try{
				userInput = input.nextInt();
				switch (userInput){
					case 1:
						nurse.printSalary();
						continue;
					case 2:
						nurse.printDaysIn();
						continue;
					case 3:
						nurse.addDay();
						System.out.println("Checked in for today!");
						nurse.printDaysIn();
						continue;
					case 4:
						try{
							System.out.println("Please enter new amount of working days!\nMake sure the value is higher than current value!");
							userInput = input.nextInt();
							nurse.setWorkingDays(userInput);
						} catch (Exception e){
							System.out.println("Thanks for playing!");
							// return;
							System.exit(0);
						}
						continue;
					case 5:
						System.out.println("\nChanged to doctor account!");
						doctorMainMenu();
						continue;
					default:
						System.out.println("Please enter number between 1 and 5!");
				}	
			} 
			catch(Exception e){
				System.out.println("Thanks for playing!");
				// return;
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		inGame();
	}
}