class People{
	String name;
	int age;

	People(String nameInput, int ageInput){
		this.name = nameInput;
		this.age = ageInput;
	}
}

public class DataPassing{
	public static void main(String[] args) {
		People human = new People("Kawarimi",10);

		// PASSING BY REFERENCE
		// People newHuman = human;

		// PASSING BY VALUE
		People newHuman = new People(human.name, human.age);

		// Testing output
		// System.out.println(human);
		// System.out.println(newHuman);

		System.out.format("Normal: %s and %s\n",human.name,newHuman.name);
		human.name = "Azwikwa";
		System.out.format("First Change: %s and %s\n",human.name,newHuman.name);
		newHuman.name = "Barbara";
		System.out.format("Second Change: %s and %s\n",human.name,newHuman.name);
	}
}

