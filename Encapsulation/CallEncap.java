public class CallEncap{
	public static void main(String[] args) {
		Encapsulation newEncap = new Encapsulation();

		// Error because file is private
		// System.out.println(newEncap.myProtectedNumber);

		newEncap.setMyProtectedNumber();
		System.out.println(newEncap.getMyProtectedNumber());
		newEncap.setMyProtectedNumber(56);
		System.out.println(newEncap.getMyProtectedNumber());
	}
}