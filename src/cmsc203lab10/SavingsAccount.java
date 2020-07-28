package cmsc203lab10;

public class SavingsAccount extends BankAccount {
	
	// 2.5% annual interest rate
	private double rate = 0.025;
	
	private static int savingsNumber = 0;
	
	private String accountNumber;
	
	// Constructor to create a savings account for the first time
	public SavingsAccount(String name, double amount) {
		super(name, amount); // Assign owner's name and initial amount to bank account
		// Assign account number of checking account with savings number suffix
		savingsNumber = 0; // Reset savings number count to zero for first-time savings account
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber; 
	}
	
	// Constructor to create new savings accounts for the same person
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount); // Assign owner's name and initial amount to bank account
		// Assign account number of checking account with new savings number suffix
		this.accountNumber = super.getAccountNumber() + "-" + ++savingsNumber;
	}
	
	// Calculate and add monthly interest to current balance
	public void postInterest() {
		setBalance(getBalance() + (getBalance() * (rate/12)));
	}
	
	// This method gets the account number of savings account
	public String getAccountNumber() {
		return accountNumber;
	}
}
