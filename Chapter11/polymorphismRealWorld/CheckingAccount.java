/* Author: Eden Demke
 * Date: 1/19/24
 * 
 * This is a subclass of the Account class. The 
 * Checking Account Class has an overdraft limit.
 */
public class CheckingAccount extends Account {

	private int overdraftLimit = -25;
	private double withdrawalAmount = 0;
	
	public CheckingAccount() {
		super();
	}
	
	public CheckingAccount(int overdraftLimit) {
		super();
		this.overdraftLimit = overdraftLimit;
	}

	public int getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(int overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public double getWithdrawalAmount() {
		return withdrawalAmount;
	}

	public void setWithdrawalAmount(double withdrawalAmount) {
		this.withdrawalAmount = withdrawalAmount;
	}
	
	@Override
	public void withdraw() {
		System.out.print("Enter amount you want to withdraw: $");
				
		double withdrawalAmount = input.nextDouble();
		setWithdrawalAmount(withdrawalAmount);
		
		super.setBalance(super.getBalance() - withdrawalAmount);
	}
	
	public boolean isOverdrawn() {
		if(super.getBalance() - withdrawalAmount < 0) {
			return true;
		} else {		
		return false;
		}
	}
	
	public boolean overdraftReached() {
		if(super.getBalance() - withdrawalAmount >= overdraftLimit) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public String toString() {
		return "\nThis Checking " + super.toString() + 
				"\nOverdraft limit: " + this.overdraftLimit
				+ "\nAccount was overdrawn? " + isOverdrawn() + 
				((this.isOverdrawn()) ? "\nOverdraft limit was reached? " 
				+ overdraftReached() : "");
	}
	
}
