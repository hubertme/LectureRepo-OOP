import java.util.*;

class d{
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.format("Input a number: ");
		int limit = input.nextInt();

		for (int i=2; i<=limit; i++){
			int count = 0;

			int sqrt = (int)Math.sqrt(i);
			// System.out.println(sqrt);

			for (int j=2;j<=sqrt;j++){
				if (i%j==0){
					count+=1;
				}
			}

			if (count==0){
				System.out.println(i);
			}
		}
	}
}