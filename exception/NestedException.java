class NestedException{
	public static void main(String[] args) {
		try{
			
			try{
				System.out.println("Going to divide");
				int b = 30/0;
			} catch (ArithmeticException e){
				System.out.println(e);
			}

			try{
				int[] data = new int[5];
				data[5] = 4;
			} catch (ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}

			try{
				int[] data = new int[5];
				data[5] = 4;
			} catch (NullPointerException e){
				System.out.println(e);
			}

			System.out.println("Other statements");
		} catch (Exception e){
			System.out.println("Other exceptions handled!");
		}
		System.out.println("Normal flow...");
	}
}