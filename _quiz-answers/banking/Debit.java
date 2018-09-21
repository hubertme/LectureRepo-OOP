public class Debit extends Account{
	final double minSave = 10.0;
	double interestRate = 0.0;

	public Debit(double balance, double interestRate){
		super(balance);
		this.interestRate = interestRate;
	}

	public void addInterest(){
		double interest = (1+0.01*interestRate);
		multiplier(interest);
		return;
	}
}