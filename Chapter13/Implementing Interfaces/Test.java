/* Author: Eden Demke
 * Date: 1/30/24
 * 
 * Write a test program that creates an array of
 * five GeometricObjects. For each object in the
 * array, display its area and invoke its howToColor
 * method if it is colorable.
 */
import java.util.ArrayList;

public class Test extends Triangle {
	public static void main(String[] args) {
		ArrayList<Triangle> triangles = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			triangles.add(new Triangle((i + 1),
					(i + 2), (i + 3)));
		}
		
		for (Triangle loop: triangles) {
			System.out.print("\nArea: " + loop.getArea() +
					"\nColorable? ");
			if (loop instanceof Colorable) {
				loop.howToColor();
			}
		}
	}
}
