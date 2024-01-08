/* Date: 1/8/2024
 * Author: Eden Demke
 * 
 * This is the implementation of the Exercise 9-7 assignment.
 * This class has been created to test the account class
 * created.
 */
package Exercise9_7;

public class AccountTest {

	public static void main(String[] args) {
		Account accountObjectOne = new Account();
		
		accountObjectOne.setId(1122);
		accountObjectOne.setBalance(20000);
		accountObjectOne.setAnnualInterestRate(4.5);
		accountObjectOne.withdraw(); //enter $2,500
		accountObjectOne.deposit(); //enter $3,000
		
		System.out.println("Balance: " + accountObjectOne.getBalance());
		System.out.println("Monthly Interest: " + accountObjectOne.getMonthlyInterest());
		System.out.println("Date Created: " + accountObjectOne.getDate());
	}

}
