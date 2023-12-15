class BankAccount {
    private static int bankAccountCount;
    private int balance;
    public BankAccount() {
        this(0);
    }
    public BankAccount( int balance ) {
        bankAccountCount++;
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
    public void deposit ( int amount ) {
        balance += amount;
    }
    public void withdraw ( int amount ) {
        balance -= amount;
    }
    public static int getAccountCount () {
        return bankAccountCount;
    }
}
//----------------------------------------
class BankAccountTester {
    public static void main(String [] args) {

        System.out.println ( "ACCT COUNT 1: " + BankAccount.getAccountCount() );

        BankAccount ba1 = new BankAccount();
        ba1.deposit ( 99 );
        System.out.println ( "ACCT COUNT 2: " + ba1.getAccountCount() );

        BankAccount ba2 = new BankAccount( 500 );

        System.out.println ( "ACCT COUNT 3: " + ba1.getAccountCount() );
        System.out.println ( "ACCT COUNT 3: " + ba2.getAccountCount() );
        System.out.println ( "ACCT COUNT 3: " + BankAccount.getAccountCount() );
    }
}
