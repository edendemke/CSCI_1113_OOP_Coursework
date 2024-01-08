
public class Rectangle {
	
	private double width = 1.0;
	private double height = 1.0;
	
	public Rectangle(){	
	}
	
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return this.width * this.height;
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}
}
