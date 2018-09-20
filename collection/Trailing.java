class Trailing{

	static void printTrailing(String...trailing){
		for (String item: trailing){
			System.out.print(item+" ");
		}
		System.out.println();
		// System.out.println();
	}

	public static void main(String[] args) {
		printTrailing("Hubert","Vito","Stanley","Max","Dimas","Aji");
		printTrailing("One","Two","Three","Four","Five");
	}
}