/* Date: 12/19/23
 * Author: Eden Demke
 * 
 * This assignment is a review of methods. It is used to determine if a
 * triangle is valid and also what the area of a valid triangle is.
 */
import java.util.Scanner;

public class Exercise_6_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of 3 sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		if (isValid(side1, side2, side3)) {
			System.out.println("Side 1: " + side1);
			System.out.println("Side 2: " + side2);
			System.out.println("Side 3: " + side3);
			System.out.printf("Area:\t%1.1f", area(side1, side2, side3));
		} else {
			System.out.println("That is not a valid triangle.");
		}
	}
	/** Return true if the sum of every two sides is greater than the third side.*/
	public static boolean isValid(double side1, double side2, double side3) {
		if((side1 + side2 > side3) && (side2 + side3 > side1) 
				&& (side1 + side3 > side2)) {
			return true;
		} else {
			return false;
		}
	}
	/** Return the area of the triangle. */
	public static double area(double side1, double side2, double side3) {
		double s = ((side1 + side2 + side3) / 2);
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		return area;
	}
}
