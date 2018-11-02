class MultipleException{
	public static void main(String[] args) {
		try{
			int[] myData = new int[5];
			myData[3]/=0;
			myData[10] = 50;
			System.out.println(myData[0]);
		} catch (ArithmeticException exception){
			System.out.println(exception);
		} catch (ArrayIndexOutOfBoundsException arrayException){
			System.out.println(arrayException);
		} catch (Exception e){
			System.out.println("Other exception: "+e);
		}
	}
}