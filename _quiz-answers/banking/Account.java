public class Account{
	private double balance = 0.0;
	double minBalance = 400.0;
	final double minSave = 10.0;

	public Account(double balance){
		this.balance = balance;
	}

	public double fetchBalance(){
		return balance;
	}

	public boolean saveAmount(double value){
		if (value>=minSave){
			this.balance+=value;
			System.out.format("Success saving to your account! Your balance is now %.2f\n",balance);
			return true;
		}
		System.out.println("The minimum saving is 10!");
		return false;
	}

	public boolean withdrawAmount(double value){
		if (this.balance-value>=minBalance){
			this.balance-=value;
			System.out.format("Success withdrew your money! Your balance is now %.2f\n",balance);
			return true;
		}
		System.out.println("You will have reached minimum value by withdrawing this!");
		return false;
	}

	public void multiplier(double val){
		balance*=val;
		System.out.format("Success adding interest! Your balance is now %.2f\n",balance);
	}
}