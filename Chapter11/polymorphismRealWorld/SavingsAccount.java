/* Author: Eden Demke
 * Date: 1/19/24
 * 
 * This is a subclass of the Account class. The 
 * Savings Account Class does not have an overdraft limit.
 * However, it cannot be overdrawn.
 */
public class SavingsAccount extends Account {

	private double withdrawalAmount;
	
	public SavingsAccount() {
		super();
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
		
		while(this.withdrawalAmount < 0 || this.withdrawalAmount > super.getBalance()) {
			if(this.withdrawalAmount < 0) {
				System.out.print("Error: input must be greater than zero.\nTry again. "
						+ "How much would you like to withdraw?: $");
			this.withdrawalAmount = input.nextDouble();
			} else if(this.withdrawalAmount > super.getBalance()) {
				System.out.print("Error: this account cannot be overdrawn.\nTry again. "
						+ "How much would you like to withdraw?: $");
				this.withdrawalAmount = input.nextDouble();
			}
		}
		super.setBalance(super.getBalance() - withdrawalAmount);
	}
	
	@Override
	public String toString() {
		return "\nThis Savings " + super.toString();
	}
}
