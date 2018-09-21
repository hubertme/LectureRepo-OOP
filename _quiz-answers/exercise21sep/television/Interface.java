import java.util.*;

class Interface{
	static void mainMenu(){
		System.out.println("Main menu is here");

		System.out.println("1. Press on/off");
		System.out.println("2. Check TV status");

		System.out.println("3. Increase channel");
		System.out.println("4. Decrease channel");
		System.out.println("5. Set channel");

		System.out.println("6. Increase volume");
		System.out.println("7. Decrease volume");

		System.out.println("Other input than integer type will terminate the app");
	}

	public static void main(String[] args) {
		Television myTelevision = new Television();
		Scanner input = new Scanner(System.in);

		while (true){
			mainMenu();

			int menuChoice = 0;
			try{
				menuChoice = input.nextInt();
			} catch (Exception e){
				System.out.println("Thanks for playing, come again!");
				break;
			}

			switch (menuChoice){
				case 1:
					myTelevision.onOffTelevision();
					continue;
				case 2:
					myTelevision.fetchStatus();
					continue;
				case 3:
					myTelevision.increaseChannel();
					continue;
				case 4:
					myTelevision.decreaseChannel();
					continue;
				case 5:
					System.out.println("What channel?");
					try{
						int channelInput = input.nextInt();
						myTelevision.setChannel(channelInput);
					} catch (Exception e){
						System.out.println("Invalid number!");
					}
					continue;
				case 6:
					myTelevision.increaseVolume();
					continue;
				case 7:
					myTelevision.decreaseVolume();
					continue;
				default:
					System.out.println("Invalid number!\nPlease enter between 1 and 7");
			}
		}
	}
}