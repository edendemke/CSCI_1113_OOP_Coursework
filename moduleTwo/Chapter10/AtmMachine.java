/* Date: 1/12/2024
 * Author: Eden Demke
 * 
 * This is designed to function like an ATM and
 * test the Account class I created earlier.
 */

import java.util.Scanner;

public class AtmMachine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Account[] atmAccounts = new Account[10];
		
		for(int i = 0; i < 10; i++) {
			atmAccounts[i] = new Account(i, 100);
		}
		
		enterId(atmAccounts);
	}
	
	public static void enterId(Account[] atmAccounts) {
		Scanner input = new Scanner(System.in);
		
		int id = -1;
		
		do {
			System.out.print("Enter an id: ");
			id = input.nextInt();
			
			if(id < 10 && id >= 0) {
				printMenu(id, atmAccounts);
			} else {
				System.out.println("Error: must be between 0 and 9");
			}
		} while (id >= 10 || id < 0);
	}
	
	public static void printMenu(int id, Account[] atmAccounts) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n\nMain Menu\n1: Check balance\n2: Withdraw"
				+ "\n3: Deposit\n4: Exit\n\n\nEnter a choice: ");
		int userInput = input.nextInt();
		
		switch (userInput) {
			case 1: System.out.print("\n$" + atmAccounts[id].getBalance()); 
				printMenu(id, atmAccounts); break;
			case 2: atmAccounts[id].withdraw(); 
				printMenu(id, atmAccounts); break;
			case 3: atmAccounts[id].deposit(); 
				printMenu(id, atmAccounts); break;
			case 4: enterId(atmAccounts); break;
			default: System.out.println("Error: invalid option");
				printMenu(id, atmAccounts); break;
		}
	}
	
	
}
