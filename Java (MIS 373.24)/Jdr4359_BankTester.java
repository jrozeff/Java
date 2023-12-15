class Jdr4359_BankTester {
	public static void main (String [] args) {
		Jdr4359_BankAccount b1 = new Jdr4359_BankAccount("Savings");
		b1.depositMoney(10250.67);
		b1.depositMoney(100);

		Jdr4359_BankAccount b2 = new Jdr4359_BankAccount("Checking");
		b2.depositMoney(217.38);
		b2.withdrawMoney(220);
		b2.getBalance();

	}	
}