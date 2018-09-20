class Interface{
	public static void main(String[] args) {

		Credit creditAccount = new Credit(2000.0, 900.0);
		Credit holdingAccount = new Credit(3000.0, 2900);
		Debit debitAccount = new Debit(1000.0, 5.0);

		System.out.println("Balance in each account:");
		System.out.println(creditAccount.fetchBalance());
		System.out.println(holdingAccount.fetchBalance());
		System.out.println(debitAccount.fetchBalance());
		System.out.println();

		creditAccount.withdrawAmount(200);
		creditAccount.saveAmount(300);
		System.out.println();

		holdingAccount.withdrawAmount(300);
		holdingAccount.saveAmount(100);
		System.out.println();

		debitAccount.saveAmount(200);
		debitAccount.withdrawAmount(500);
		System.out.println();
	}
}