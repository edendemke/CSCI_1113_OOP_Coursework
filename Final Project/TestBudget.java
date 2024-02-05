/* Author: Eden Demke
 * Date: 2/5/2024
 * 
 * This is my final project for the first Object Oriented programming
 * course. I was required to include at least one custom object.
 * I chose to create a program that helps you to come up with a 
 * zero-balance budget. The idea is that you are required to plan 
 * where every dollar of your income is going, so the program doesn't
 * allow you to exit until every dollar is accounted for.
 */
package project;

import java.util.Scanner;
import java.util.ArrayList;

public class TestBudget {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Income> incomeList = new ArrayList<>();
		ArrayList<Expenses> expenseList = new ArrayList<>();
		int control = 0;
		
		printMenu(incomeList, expenseList, control);		
	}
	
	public static void printMenu(ArrayList<Income> incomeList, ArrayList<Expenses> expenseList,
			int control) {
		
		boolean isZero = false;
		if (Income.getLeftOverIncome() < 0.0100000000) {
			isZero = true;
		}
		
		System.out.print("\nMenu:\n1. Add Income\n2. Add Expense\n3. Print Report");
		
		//if there is still money to budget, do not allow user to exit
		if(isZero ^ control == 0) {
			System.out.print("\n4. Exit\n\nEnter number: ");
		} else {
			System.out.print("\n\nEnter number: ");
		}

		int userChoice = input.nextInt();
				
		switch (userChoice) {
			case 1: control++; addIncome(incomeList, expenseList, control); break;
			case 2: control++; addExpense(incomeList, expenseList, control); break;
			case 3: control++; printReport(incomeList, expenseList, control); break;
			case 4: if(!isZero || control == 0) {
					System.out.print("\nYou cannot exit until every dollar has been budgeted.");
					printMenu(incomeList, expenseList, control);
					} else {
						control = 0;
						printReport(incomeList, expenseList, control);
					} break;
			default: System.out.println("Error: Incorrect input. Try again.");
					printMenu(incomeList, expenseList, control); break;
		}
	}
	
	public static void addIncome(ArrayList<Income> incomeList, ArrayList<Expenses> expenseList,
			int control) {
		
		//loop to add as many income objects as desired
		String loopControl = "yes";
		String userContinue = "no";
		String name = "";
		double plannedIncome = 0;
		
		do {
		System.out.print("\nEnter the name (only one word) of your expected income (ex. paycheck): ");
		name = input.next();
		//how can I make it so they can input multiple words, but not let the next line automatically feed?
		
		System.out.print("Enter the amount of your expected income(ex. $20.34): $");
		plannedIncome = input.nextDouble();
				
		incomeList.add(new Income(plannedIncome, name));
		
		System.out.print("Enter another income, yes or no? ");
		userContinue = input.next();
		} while (loopControl.equalsIgnoreCase(userContinue));
		
		printMenu(incomeList, expenseList, control);
	}
	
	public static void addExpense(ArrayList<Income> incomeList, ArrayList<Expenses> expenseList,
			int control) {		
		
		//loop to add as many expenses objects as desired
		String loopControl = "yes";
		String userContinue = "yes";
		String name = "";
		double plannedExpense = 0;
		
		//fix so that they can't go over budget
		do {
			System.out.print("\nEnter the name (only one word) of your expected expense (ex. rent): ");
			name = input.next();
			//how can I make it so they can input multiple words, but not let the next line automatically feed?
			
			System.out.print("Enter the amount of your expected expense(ex. $20.34): $");
			plannedExpense = input.nextDouble();
			
			if (Income.getTotalIncome() - (Expenses.getTotalExpenses() + plannedExpense) < 0) {
				System.out.println("ERROR: you only have $" + Income.getLeftOverIncome() +
						" left in your budget. Try again.");
				continue;
			} else {
				expenseList.add(new Expenses(name, plannedExpense));
			}	
			
			//add if statement to tell user how much they have left in budget and when they reach zero
			if(Income.getLeftOverIncome() < 0.0100000000) {
				System.out.println("\nYou have successfully budgeted all of your money!");
				userContinue = "no";
				continue;
			} else {
				System.out.println("\nYou have $" + Income.getLeftOverIncome() + " left to budget.");
			}
			
			System.out.print("Enter another expense, yes or no? ");
			userContinue = input.next();
		} while (loopControl.equalsIgnoreCase(userContinue));
		
		printMenu(incomeList, expenseList, control);
	}
	
	public static void printReport(ArrayList<Income> incomeList, ArrayList<Expenses> expenseList, int control) {
		System.out.println("\nIncome\t\tPlanned Amount");
		System.out.println("-------------------------------\n");
		
		//for loop to print Income Array
		for (Income individual: incomeList) {
			individual.formattedPrint();
			System.out.println();
		}
		
		System.out.println("\nExpense\t\tPlanned Budget");
		System.out.println("-------------------------------\n");
		
		//for loop to print Expense Array
		for (Expenses individual: expenseList) {
			individual.formattedPrint();
			System.out.println();
		}
		
		//print totals
		System.out.print("\nTotal Expenses: $");
		System.out.printf("%1.2f", Expenses.getTotalExpenses());
		System.out.print("\nTotal Income: $");
		System.out.printf("%1.2f", Income.getTotalIncome());
		System.out.print("\nLeftover to Budget: $");
		System.out.printf("%1.2f", Income.getLeftOverIncome());
		System.out.println("");
		
		if (control == 0) {
			System.out.println("\nThanks for making the decision to budget!");
		} else {
			printMenu(incomeList, expenseList, control);
		}
	}
}
