class NullPointerExample{
	public static void main(String[] args) {
		try{
			String name = null;
			System.out.println(name.length());
		} catch (NullPointerException e){
			System.out.println(e);
		}
		System.out.println("Rest of code...");
	}
}