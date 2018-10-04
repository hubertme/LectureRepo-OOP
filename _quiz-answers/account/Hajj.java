public class Hajj extends Account{

	public Hajj(String name, long accountNumber, double initBalance){
		super(name, accountNumber);
		initAttributes();
		System.out.println(fetchMinimumBalance());
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

	@Override
	public void withdraw(double value){
		if ((value>0) && (fetchBalance()-value>=fetchMinimumBalance())){
			if (value>0.1*fetchBalance()){
				System.out.println("You will be charged 50,000 for this transaction!");
				setBalance(fetchBalance()-50000);
			}
			setBalance(fetchBalance()-value);
			System.out.println("Success withdrawing money! Your balance is now "+fetchBalance());
		}
		else{
			System.out.println("Sorry, your balance is not enough!");
		}
	}

	// TEST CASE FOR BUSINESS ACCOUNT
	// public static void main(String[] args) {
	// 	Haji acc = new Haji("Hubert",1922983,50000);
	// 	System.out.println(acc.fetchMinimumBalance()+" "+acc.fetchMinimumDeposit());
	// 	System.out.println(acc.fetchBalance());
	// 	acc.deposit(500000);
	// 	acc.withdraw(500000);
	// 	acc.withdraw(200000);
	// }
}