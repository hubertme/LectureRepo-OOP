public class Nurse extends Employee implements Salary{
	private double salaryAmount = baseSalary;
	private int daysIn = 0;

	public Nurse(String name, int age, int daysIn){
		super(name,age);
		this.daysIn = daysIn;
		updateSalary(daysIn);
	}

	// From interface
	public double fetchSalaryAmount(){
		return this.salaryAmount;
	}
	public void printSalary(){
		System.out.println("This nurse salary is: "+fetchSalaryAmount());
	}
	private void updateSalary(int value){
		salaryAmount+=(value*50000);
	}

	public int fetchDaysIn(){
		return daysIn;
	}
	public void printDaysIn(){
		System.out.println("This nurse has come to work for "+fetchDaysIn()+" days");
	}
	public void addDay(){
		daysIn+=1;
		updateSalary(1);
	}
	public void setWorkingDays(int value){
		if (value>daysIn){
			updateSalary(value-daysIn);
			daysIn = value;
			return;
		}
		System.out.println("Please enter a value higher than "+fetchDaysIn());
	}
}