public class Doctor extends Employee implements Salary{
	private int patientOperated = 0;
	private double salaryAmount = baseSalary;
	
	public Doctor(String name, int age, int patient){
		super(name,age);
		this.patientOperated = patient;
		updateSalary(patient);
	}

	// From interface
	public double fetchSalaryAmount(){
		return this.salaryAmount;
	}
	public void printSalary(){
		// System.out.println("This doctor salary is: "+fetchSalaryAmount());
		System.out.printf("This doctor salary is %.2f\n",fetchSalaryAmount());
	}
	private void updateSalary(int value){
		salaryAmount+=(value*500000);
	}

	public int fetchPatient(){
		return patientOperated;
	}
	public void printPatient(){
		System.out.println("This doctor has operated "+fetchPatient()+" patient(s)");
	}
	public void setPatient(int value){
		if (value>patientOperated){
			updateSalary(value-patientOperated);
			patientOperated = value;
			return;
		}
		System.out.println("Please enter a higher value than "+fetchPatient());
	}
	public void addPatient(){
		patientOperated+=1;
		updateSalary(1);
	}
}