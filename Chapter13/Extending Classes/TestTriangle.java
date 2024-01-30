/* Author: Eden Demke
 * Date: 1/29/2024
 * 
 * Write a test program that prompts the user
 * to enter three sides of the triangle, a color,
 * and a Boolean value to indicate whether the
 * triangle is filled. The program should create
 * a Triangle object with these sides and set the
 * color and filled properties using the input.
 * The program should display the area, perimeter,
 * color, and true or false to indicate whether
 * it is filled or not.
 */
import java.util.Scanner;

public class TestTriangle extends Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Triangle triangle = new Triangle();
		
		System.out.print("Enter 3 double numbers for the sides of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		triangle.setSide2(side2);
		triangle.setSide1(side1);
		triangle.setSide3(side3);
		
		System.out.print("Enter the color you would like your triangle to be: ");
		String color = input.next();
		
		triangle.setColor(color);
		
		System.out.print("Enter 'yes' for filled, or 'no' for not filled: ");
		String filled = input.next();
		String test = "yes";
		
		if (filled.equalsIgnoreCase(test)) {
			triangle.setFilled(true);
		} else {
			triangle.setFilled(false);
		}
		
		System.out.println(triangle);
	}

}
