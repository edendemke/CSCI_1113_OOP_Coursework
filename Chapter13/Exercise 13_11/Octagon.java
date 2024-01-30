
public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	private double side1;
	
	public Octagon() {
	}
	
	public Octagon(double side1) {
		this.side1 = side1;
	}
	
	public Octagon(double side1, String color, boolean filled) {
		super(color, filled);
		this.side1 = side1;
	}
	
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	@Override
	public double getArea() {
		double area = (2 + (4 / Math.sqrt(2)) * side1 * side1);
		
		return area;
	}

	@Override
	public double getPerimeter() {
		return side1 * 8;
	}

	@Override
	public int compareTo(Octagon o) {
		if(this.getArea() < o.getArea()) {
			return -1;
		} else if (this.getArea() > o.getArea()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	@Override
	public Object clone() {
		try {
			return super.clone();
		}
		catch (CloneNotSupportedException ex) {
			return null;
		}
	}
}
