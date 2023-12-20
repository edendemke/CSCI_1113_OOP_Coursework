/* Date: 12/20/23
 * Author: Eden Demke
 * 
 * Last assignment to review methods. This program determines if a
 * password is valid or not using 3 parameters:
 * 
 * -has at least 8 characters
 * -contains only letters and digits
 * -has at least 2 digits
 */
import java.util.Scanner;

public class Exercise_6_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a password: ");
		
		String userPassword = input.next();
		
		if(isValid(userPassword)) {
			System.out.println("Valid Password");
		} else {
			System.out.println("Invalid Password");
		}
	}
	public static boolean isValid(String s) {
		int digitCount = 0;
		boolean isValid = false;
		int correctCount = 0;
		
		if(s.length() >= 8) { //password has at least 8 characters
			for(int i = 0; i < s.length(); i++) {
				if(Character.isDigit(s.charAt(i))) { //counting digits
						digitCount++;
				}
			}
			for(int i = 0; i < s.length(); i++) { //checks if input is only letters or digits
				if((Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))) {
				correctCount++;
				} else {
					break;
				}
			}
			if(correctCount == (s.length()) && (digitCount >= 2)) {
				isValid = true;
			}
		}
		return isValid;
	}
}
