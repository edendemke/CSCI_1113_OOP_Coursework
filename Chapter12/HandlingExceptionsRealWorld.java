/* Author: Eden Demke
 * Date: 1/24/24
 * 
 * Write a program that meets the following requirements:
 * -Creates an array with 100 randomly chosen integers.
 * -Prompts the user to enter the index of the array,
 * then displays the corresponding element value. If the
 * specified index is out of bounds, display the message
 * "Out of Bounds".
 */
import java.util.Scanner;

public class HandlingExceptionsRealWorld {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] integerArray = new int[100];
		
		for (int i = 0; i < integerArray.length; i++) {
			integerArray[i] = ((int)(Math.random() * 101));
		}
		
		try {
			System.out.print("Enter an index number to see the integer at that index: ");
			int userIndexChoice = input.nextInt();
			System.out.println("The number at index [" + userIndexChoice + "] is: "
					+ returnIndex(userIndexChoice, integerArray));
		}
		catch (IndexOutOfBoundsException ex) {
			System.out.println("Error: Index Out of Bounds");
		}
	}
	
	public static int returnIndex(int userInput, int[] integerArray)
			throws IndexOutOfBoundsException {
		if (userInput < 0 || userInput > 99) {
			throw new IndexOutOfBoundsException("Index Out of Bounds");
		} else {
			return integerArray[userInput];
		}
	}

}
