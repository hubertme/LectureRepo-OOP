public class Business extends Account{

	public Business(String name, long accountNumber, double initBalance){
		super(name, accountNumber);
		initAttributes();
		if (initBalance>=fetchMinimumBalance()){
			this.setBalance(initBalance);
		}
		else{
			this.setBalance(this.fetchMinimumBalance());
			System.out.println("Not enough balance! Your account is automatically set to "+this.fetchMinimumBalance());
		}
	}

	private void initAttributes(){
		this.setMinimumBalance(1000000);
		this.setMinimumDeposit(50000);
	}

	// TEST CASE FOR BUSINESS ACCOUNT
	// public static void main(String[] args) {
	// 	Business acc = new Business("Hubert",1922983,50000);
	// 	System.out.println(acc.fetchMinimumBalance()+" "+acc.fetchMinimumDeposit());
	// 	System.out.println(acc.fetchBalance());
	// 	acc.deposit(500000);
	// 	acc.withdraw(500000);
	// 	acc.withdraw(200000);
	// }
}