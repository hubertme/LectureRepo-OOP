class CallEnum{
	public static void main(String[] args) {
		level spicinessLevel = level.littleSpicy;

		//Print to String and Int
		System.out.println(spicinessLevel);
		System.out.println(spicinessLevel.toString());
		System.out.println(spicinessLevel.ordinal());
		System.out.println();

		switch (spicinessLevel){
			case not: 
				System.out.println("Not spicy at all");
				break;
			case littleSpicy:
				System.out.println("Little bit spicy");
				break;
			case spicy:
				System.out.println("Standard spicy");
				break;
			case verySpicy:
				System.out.println("Really-really Spicy");
				break;
			default:
				System.out.println("Undefined");
				break;
		}
	}
}