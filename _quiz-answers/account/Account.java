class Account{
	private String name;
	private long accountNumber;
	private double balance = 0;
	private double minimumBalance = 0;
	private double minimumDeposit = 0;

	public Account(){
		this.name = "No Name";
		this.accountNumber = 0;
		return;
	}

	public Account(String name, long accountNumber){
		this.name = name;
		this.accountNumber = accountNumber;
		return;
	}

	protected void setMinimumBalance(double value){
		if (this.balance<value){
			this.balance = value;
			this.minimumBalance = value;
			System.out.println("Your inputted value is higher than your balance!\nYour balance is automatically adjusted to "+value);
			return;
		}
		System.out.println("Success changing minimum balance!");
	}

	protected void setMinimumDeposit(double value){
		this.minimumDeposit = value;
		System.out.println("Success changing minimum deposit!");
	}

	public double fetchBalance(){
		return balance;
	}

	public void setBalance(double value){
		if (value>=minimumBalance){
			this.balance = value;
		}
	}

	public void deposit(double value){
		if (value>=this.minimumDeposit){
			this.balance+=value;
			System.out.println("Success saving money! Your balance is now "+fetchBalance());
		}
		else{
			System.out.println("Failed to save money! The minimum deposit is "+this.fetchMinimumDeposit());
		}
	}

	public void withdraw(double value){
		if ((value>0) && (this.balance-value>=minimumBalance)){
			this.balance-=value;
			System.out.println("Success withdrawing money! Your balance is now "+fetchBalance());
		}
		else{
			System.out.println("Sorry, your balance is not enough!");
		}
	}

	// Self added function
	public double fetchMinimumBalance(){
		return this.minimumBalance;
	}
	public double fetchMinimumDeposit(){
		return this.minimumDeposit;
	}


}