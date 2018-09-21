public class NumberHolder{
	public int anInt;
	public float aFloat;

	public static void main(String[] args) {
		// Instantiate Object
		NumberHolder thisObject = new NumberHolder();
		
		// Initialise attributes
		thisObject.anInt = 10;
		thisObject.aFloat = 10.71f;
		
		// Display the values of "anInt" and "aFloat"
		System.out.println(thisObject.anInt);
		System.out.println(thisObject.aFloat);
	}
}