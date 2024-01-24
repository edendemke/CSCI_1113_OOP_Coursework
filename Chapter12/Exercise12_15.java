/* Author: Eden Demke
 * Date: 1/24/24
 * 
 * Write a program to create a file named Exercise12_15.txt
 * if it does not exist. Write 100 integers created randomly
 * into the file using text I/O. Integers are separated by
 * spaces in the file. Read the data back from the file and
 * display the data in increasing order.
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise12_15 {

	public static void main(String[] args) throws java.io.IOException {
		//create a new text file
		java.io.File file = new java.io.File("Exercise12_15.txt");
		
		//if the file already exists, don't make another one
		if (file.exists()) {
			System.out.println("File already exists.");
			System.exit(1);
		}
		
		//add 100 integers to the file with a space in between each
		try (java.io.PrintWriter printer = new java.io.PrintWriter(file);) {
		
			for (int i = 0; i < 100; i++) {
				printer.print(((int) (Math.random() * 101)) + " ");
			}
		}
		
		//read the data from the file. put in increasing order.
		ArrayList<Integer> integerList = new ArrayList<>();
				
		try (Scanner input = new Scanner(file);) {
			while (input.hasNext()) {
				integerList.add(input.nextInt());
			}
			
			java.util.Collections.sort(integerList);
				
			System.out.println(integerList);
		}
	}

}
