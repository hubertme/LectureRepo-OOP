class Interface{
	protected static void initialiseMenu(){
		System.out.println("Welcome!");
		System.out.println("Please select your account!");
		System.out.println("1. Normal account");
		System.out.println("2. Business account");
		System.out.println("3. Hajj account");
		System.out.println("Any input other than integer will terminate the programme");
	}

	protected static void displayMainMenu(){
		System.out.println("Welcome to the main menu!");
		System.out.println("Please enter one of the following things to do!");
		System.out.println("1. Fetch current balance");
		System.out.println("2. Set balance to a value");
		System.out.println("3. Deposit money");
		System.out.println("4. Withdraw money");
		System.out.println("5. Set minimum balance");
		System.out.println("6. Set minimum deposit");
		System.out.println("Any input other than integer will terminate the programme");
	}

	static java.util.Scanner input = new java.util.Scanner(System.in);

	protected static void inGame(Account parsedAccount) throws java.lang.Exception {
		while (true){
			displayMainMenu();
			int userChoice;
			try{
				System.out.println("\nPlease enter your choice:");
				userChoice = input.nextInt();
			} catch (Exception e){
				System.out.println("Thanks for playing!");
				return;
			}
			switch (userChoice){
				case 1:
					System.out.println("Your current account balance is: "+parsedAccount.fetchBalance());
					continue;
				case 2:
					try{
						System.out.println("Please enter new balance value! (Min: "+parsedAccount.fetchMinimumBalance()+")");
						double value = input.nextDouble();
						parsedAccount.setBalance(value);
						System.out.println("Success! Your new balance is "+parsedAccount.fetchBalance());
					} catch (Exception e){
						System.out.println("Thanks for playing!");
						return;
					}
					continue;
				case 3:
					try{
						System.out.println("How much you want to deposit?");
						double value = input.nextDouble();
						parsedAccount.deposit(value);
						// System.out.println("Success! Your new balance is "+parsedAccount.fetchBalance());
					} catch (Exception e){
						System.out.println("Thanks for playing!");
						return;
					}
					continue;
				case 4:
					try{
						System.out.println("How much you want to withdraw?");
						double value = input.nextDouble();
						parsedAccount.withdraw(value);
					} catch (Exception e){
						System.out.println("Thanks for playing!");
						return;
					}
					continue;
				case 5:
					try{
						System.out.println("Please input new minimum balance value");
						double value = input.nextDouble();
						parsedAccount.setMinimumBalance(value);
					} catch (Exception e){
						System.out.println("Thanks for playing!");
						return;
					}
					continue;
				case 6:
					try{
						System.out.println("Please input new minimum deposit value");
						double value = input.nextDouble();
						parsedAccount.setMinimumDeposit(value);
					} catch (Exception e){
						System.out.println("Thanks for playing!");
						return;
					}
					continue;
				default:
					System.out.println("Invalid input! Please enter integer 1-6!");
			}
		}
	}

	public static void main(String[] args) throws java.lang.Exception {

		initialiseMenu();
		int userChoice;
		while (true){
			try{
				System.out.println("\nPlease enter your choice:");
				userChoice = input.nextInt();
			} catch (Exception e){
				System.out.println("Thanks for playing!");
				return;
			}

			String name;
			long accountNumber;
			double initBalance;
			switch (userChoice){
				case 1:
					try{
						System.out.println("Any input other than integer will terminate the programme");
						System.out.println("Please enter account name:");
						input.nextLine();
						name = input.nextLine();
						System.out.println("Please enter account number:");
						accountNumber = input.nextLong();
						// System.out.println("Please enter initial account balance:");
						// initBalance = input.nextDouble();
					} catch (Exception e){
						System.out.println("Thanks for playing!");
						return;
					}

					Account myAccount = new Account(name,accountNumber);
					inGame(myAccount);			
					return;
				
				case 2:	
					try{
						System.out.println("Any input other than integer will terminate the programme");
						System.out.println("Please enter account name:");
						input.nextLine();
						name = input.nextLine();
						System.out.println("Please enter account number:");
						accountNumber = input.nextLong();
						System.out.println("Please enter initial account balance:");
						initBalance = input.nextDouble();
					} catch (Exception e){
						System.out.println("Thanks for playing!");
						return;
					}

					Business busAccount = new Business(name,accountNumber,initBalance);
					inGame(busAccount);
					return;
				
				case 3:
					try{
						System.out.println("Any input other than integer will terminate the programme");
						System.out.println("Please enter account name:");
						input.nextLine();
						name = input.nextLine();
						System.out.println("Please enter account number:");
						accountNumber = input.nextLong();
						System.out.println("Please enter initial account balance:");
						initBalance = input.nextDouble();
					} catch (Exception e){
						System.out.println("Thanks for playing!");
						return;
					}

					Hajj hajjAccount = new Hajj(name,accountNumber,initBalance);
					inGame(hajjAccount);
					return;
				
				default:
					System.out.println("Invalid input! Please enter integer 1-3!");
			}
		}	
	}
}