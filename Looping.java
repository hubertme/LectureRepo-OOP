public class Looping{
	
	static boolean checkRandom(){
		double myNumber = Math.random();
		System.out.println(myNumber);
		return myNumber<=0.99;
	}

	static int randomInteger(int min, int max){
		int range = Math.abs(max-min);
		return (int)(Math.random() * range) + (min<=max ? min : max);
	}

	public static void main(String[] args) {
		int a = 0;
		while(checkRandom()){
			System.out.println("True");
		}
		System.out.println("False\n");

		do{
			System.out.println("True");
		} while(checkRandom());
		System.out.println("False\n");

		for (int i=0;i<8;i++){
			System.out.println(randomInteger(2,10));
		}
		
	}
} 