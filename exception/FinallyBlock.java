class FinallyBlock{
	public static void main(String[] args) {
		try{
			int data = 25/5;
			System.out.println(data);
			
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e){
			System.out.println("Handled exception: "+e);
		} finally {
			System.out.println("Finally block is always executed");
			// int a = 5/0;
			// System.out.println(a);
		}
		System.out.println("Rest of code...");
	}
}