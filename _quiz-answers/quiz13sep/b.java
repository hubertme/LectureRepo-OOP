import java.util.*;

class b{

	public static void main(String[] args) {
		Random random = new Random();

		for (int i=0;i<25;i++){
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