public class Employee{
	private String name;
	private int age;

	public Employee(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String fetchName(){
		return this.name;
	}

	public int fetchAge(){
		return this.age;
	}

	public void haveBirthday(){
		age+=1;
	}
}