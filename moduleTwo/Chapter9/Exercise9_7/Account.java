/* Date: 1/8/2024
 * Author: Eden Demke
 * 
 * This is the Exercise 9-7: planning assignment.
 * The point is to create an Account class with various actions
 * that you can implement on the balance.
 */
package Exercise9_7;

import java.util.Scanner;

public class Account {

	Scanner input = new Scanner(System.in);
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated = new java.util.Date();
	
	Account(){
	}
	
	Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public java.util.Date getDate(){
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12;
	}
	
	public double getMonthlyInterest() {
		return getMonthlyInterestRate() * balance;
	}
	
	public void withdraw() {
		System.out.print("Enter amount you want to withdraw: $");
		
		double withdrawalAmount = input.nextDouble();
		
		while(withdrawalAmount < 0 || withdrawalAmount > balance) {
			System.out.print("Incorrect input. Try again.\nHow much would you"
					+ " like to withdraw?: $");
			withdrawalAmount = input.nextDouble();
		}
		
		this.balance = balance - withdrawalAmount;
	}
	
	public void deposit() {
		System.out.print("Enter amount you want to deposit: $");
		
		double depositAmount = input.nextDouble();
		
		while(depositAmount < 0) {
			System.out.print("Incorrect input. Number must be positive. " +
					"Try again.\nHow much would you like to deposit?: $");
			depositAmount = input.nextDouble();
		}
		
		this.balance = balance + depositAmount;
	}
}
