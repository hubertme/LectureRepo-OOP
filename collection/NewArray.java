class NewArray{
	static void printArray(Object...args){
		for (Object obj: args){
			System.out.print(obj+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printArray(new String("Dimas"), new String("5"));
	}
}