enum genderType{
	male,female;
}

class Person{
	String name;
	int age;
	genderType gender;
}

class GenderEnum{
	public static void main(String[] args) {
		Person dimas = new Person();
		dimas.name = "Dimas";
		dimas.age = 16;
		dimas.gender = genderType.male;

		System.out.println(dimas.gender);
	}
}