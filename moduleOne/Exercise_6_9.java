/* Date: 12/19/23
 * Author: Eden Demke
 * 
 * This assignment is a review of methods. It is used to create
 * a table that converts feet to meters and meters to feet.
 */
public class Exercise_6_9 {

	public static void main(String[] args) {
		double feet = 1.0;
		double meter = 20.0;
		
		System.out.println("Feet    Meters          Meters  Feet   ");
		System.out.println("---------------------------------------");
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%1.1f\t%1.3f\t\t%1.1f\t"
					+ "%1.3f", feet, footToMeter(feet), meter, meterToFoot(meter));
			System.out.println("");
			
			feet += 1;
			meter += 5;
		}
	}
	/** Convert from feet to meters */
	public static double footToMeter(double foot) {
		double meter = 0.305 * foot;
		return meter;
	}
	/** Convert from meters to feet */
	public static double meterToFoot(double meter) {
		double foot = 3.279 * meter;
		return foot;
	}
}
