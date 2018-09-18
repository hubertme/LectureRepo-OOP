import java.util.*;

class c{

	public static void main(String[] args) {
		Random random = new Random();

		while (true){
			int numberOne = random.nextInt(200);
			int numberTwo = random.nextInt(200);

			if (numberOne>numberTwo){
				System.out.format("%d is greater than %d\n", numberOne, numberTwo);
			}
			else if (numberOne==numberTwo){
				System.out.format("%d is equal to %d\n", numberOne, numberTwo);
			}
			else{
				System.out.format("%d is less than %d\n", numberOne, numberTwo);
			}
		}
	}
}