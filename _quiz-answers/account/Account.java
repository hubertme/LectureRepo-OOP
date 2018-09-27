class Account{
	private String name;
	private long accountNumber;
	private double balance = 0;
	private double minimumBalance = 0;
	private double minimumDeposit = 0;

	public Tabungan(){
		this.name = "No Name";
		this.accountNumber = 0;
	}

	public Tabungan(String name, long accountNumber){
		this.name = name;
		this.accountNumber = accountNumber;
	}

	protected void setMinimumBalance(double value){
		this.minimumBalance = value;
	}

	protected void setMinimumDeposit(double value){
		this.minimumDeposit = value;
	}

	public double fetchBalance(){
		return balance;
	}

	public void setBalance(double value){
		this.balance = value;
	}

	public void deposit(double value){
		if (value>=this.minimumDeposit){
			this.balance+=value;
		}
	}

	public void withdraw(double value){
		if ((value>0) && (this.balance-value>=minimumBalance)){
			this.balance-=value;
		}
	}


}