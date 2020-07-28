package cmsc203lab10;

public class CheckingAccount extends BankAccount {
	
	// 15-cent for check clearing
	private static final double FEE = 0.15;
	
	// Constructor that creates 
	public CheckingAccount(String name, double amount) {
		super(name, amount); // Assign owner's name and initial amount to bank account
		// Assign account number of checking account with -10 suffix
		setAccountNumber(getAccountNumber() + "-10");
	}
	
	/* This method allows to withdraw money
	 *  if the amount is less than or equal to the current balance */
	public boolean withdraw(double amount) {
		if (amount <= getBalance()) {
			amount += FEE;
			setBalance(getBalance() - amount);
			return true;
		} else {
			return false;
		}
	}
}
