abstract class AbstractClass{
	abstract void abstractMethod();
	public void implementingMethod(){
		System.out.println("Running implementingMethod()");
	}
	final public void finalMethod(){
		System.out.println("Running finalMethod()");
	}
}