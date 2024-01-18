/* Author:/ Eden Demke
 * Date:1/18/24 
 * 
 * This program is to test the Triangle class I created 
 * (extending GeometricObject.java).
 */
import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 3 double numbers for each side of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		Triangle triangle = new Triangle(side1, side2, side3);
		
		changeColor(triangle);
		
		fillTriangle(triangle);
		
		printTriangle(triangle);
	}

	public static void changeColor(Triangle triangle) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string for the color of the triangle: ");
		String color = input.nextLine();
		triangle.setColor(color);
	}
	
	public static void fillTriangle(Triangle triangle) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("If you want triangle to be filled, enter 'yes'.\nOtherwise, "
				+ "enter 'no': ");
		String yesOrNo = input.nextLine();
		String filled = "yes";
		String notFilled = "no";
		
		boolean vazhdo = true;
		while(vazhdo) {
			if (yesOrNo.equalsIgnoreCase(filled)) {
				triangle.setFilled(true);
				vazhdo = false;
			} else if(yesOrNo.equalsIgnoreCase(notFilled)) {
				triangle.setFilled(false);
				vazhdo = false;
			} else {
				System.out.println("Incorrect input. Must enter 'yes' or 'no'");
			}
		}
	}
	
	public static void printTriangle(Triangle triangle) {
		System.out.println(triangle);
	}
}
