/* Author: Eden Demke
 * Date: 1/19/24
 * 
 * This is to test the Checking and Savings
 * subclasses that I created for the Account
 * class. Write a test program that creates 
 * objects of Account, SavingsAccount, and 
 * CheckingAccount and invokes their toString() 
 * methods.
 */
import java.util.Scanner;

public class SavingsCheckingAccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Account account1 = new Account();
		Account account2 = new CheckingAccount();
		Account account3 = new SavingsAccount();
		
		account1.withdraw();
		account2.withdraw();
		account3.withdraw();
		
		System.out.println(printAccount(account1));
		System.out.println(printAccount(account2));
		System.out.println(printAccount(account3));
	}
	
	public static String printAccount(Account account) {
			return account.toString();
	}
}
