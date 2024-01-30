/* Author: Eden Demke
 * Date: 1/30/24
 * 
 * Write a test program that creates an Octagon object.
 * Clone the first octagon into a second, then use the
 * .compareTo method to compare the two objects.
 */
public class TestOctagon extends Octagon {

	public static void main(String[] args) {
		Octagon octagon1 = new Octagon(((int) Math.random() * 10));
		
		Octagon octagon2 = (Octagon)octagon1.clone();
		
		System.out.println(octagon1.compareTo(octagon2));
	}

}
