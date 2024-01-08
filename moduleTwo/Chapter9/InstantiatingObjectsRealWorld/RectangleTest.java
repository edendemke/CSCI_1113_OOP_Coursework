/* Date: 1/8/2024
 * Author: Eden Demke
 * 
 * This is the instantiating objects skill - real world assignment.
 * I have already created the rectangle class. This class has been
 * created to test the rectangle class.
 */
public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle rectangleOne = new Rectangle(4, 40);
		Rectangle rectangleTwo = new Rectangle(3.5, 35.9);
		
		System.out.println("Rectangle One:\nWidth: " + rectangleOne.getWidth()
				+ "\nHeight: " + rectangleOne.getHeight() + "\nArea: " +
				rectangleOne.getArea() + "\nPerimeter: " + rectangleOne.getPerimeter());
		
		System.out.println("\nRectangle Two:\nWidth: " + rectangleTwo.getWidth()
		+ "\nHeight: " + rectangleTwo.getHeight() + "\nArea: " +
		rectangleTwo.getArea() + "\nPerimeter: " + rectangleTwo.getPerimeter());
	}

}
