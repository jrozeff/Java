class Jdr4359_BankAccount {
	private double balance;
	private String accountName;

	public Jdr4359_BankAccount (String accountName) {
		this.balance = 0;
		this.accountName = accountName;
	}

	public void depositMoney (double amount) {
		balance = balance + amount;
		System.out.println(amount + " has been deposited in your account.");
		System.out.println("New account balance is: $" + balance);
	}

	public void withdrawMoney (double amount) {
		balance = balance - amount;
		System.out.println(amount + " has been withdrawn from your account.");
		System.out.println("New account balance is: $" + balance);
	}

	public double getBalance () { 
		System.out.println(accountName + " balance is: $" + balance);
		return balance;
	}
}