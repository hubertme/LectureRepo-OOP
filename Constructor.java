class MethodOverloading{
	static void satu(){
		System.out.println("No input for this method");
	}

	static void satu(String sender){
		System.out.println(sender);
	}

	public static void main(String[] args) {
		satu();
		satu("Print me!");
	}
}