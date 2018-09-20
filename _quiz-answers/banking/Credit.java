public class Credit extends Account{

	// double minBalance = 400.0;

	Credit(double balance){
		super(balance);
	}

	Credit (double balance, double minBalance){
		super(balance);
		this.minBalance = minBalance;
	}
}