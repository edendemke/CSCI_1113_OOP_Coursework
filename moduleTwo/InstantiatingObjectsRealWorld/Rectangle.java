/* Date: 1/8/2024
 * Author: Eden Demke
 * 
 * This is the Instantiating Objects Skill - Fundamental.
 * I have to make a Rectangle class with getArea and getPerimeter
 * methods.
 */
 
public class Rectangle {
	
	private double width = 1.0;
	private double height = 1.0;
	
	public Rectangle(){	
	}
	
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return this.width * this.height;
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}
}
