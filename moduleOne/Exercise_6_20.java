/* Date: 12/20/23
 * Author: Eden Demke
 * 
 * This is part of the review of methods. This program
 * counts the number of total characters in a string, and 
 * it also returns how many of those characters are just letters.
 */
import java.util.Scanner;

public class Exercise_6_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String myString = input.nextLine();
		
		System.out.println("There are " + countLetters(myString) 
			+ " letters in '" + myString + "'");
	}
	public static int countLetters(String s) {
		int justLetters = 0;
		
		/*create for loop (that only runs as many times as there are characters)
		to check each character, count++ if true*/
		for(int i = 0; i < s.length(); i++) {
			char currentCharacter = s.charAt(i);
			if (Character.isLetter(currentCharacter)) {
				justLetters++;
			}
		}
		
		return justLetters;
	}
}
