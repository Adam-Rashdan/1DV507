/**
 * 
 */
package Recursion_and_External;

import java.util.*;

/**
 * @author Adam
 *
 */
public class PascalMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter positive pascal triangle line number: ");
			int n = scan.nextInt();
			
			System.out.println("Line "+ n + " of Pascal's Triangle is " + Arrays.toString(pascalRow(n)));
			
			
			scan.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	public static int[] pascalRow(int n)  {

		if (n < 0) {
		
			throw new IllegalArgumentException("Row must be positive");
		}
		
		int[] number = new int[n + 1];
		int[] row = new int[number.length];

		number[0] = 1;
		number[n] = 1;

		if (n == 0) {
			return number;
		}
		
		row = pascalRow(n - 1);

		for (int i = 1; i < row.length; i++) {

			number[i] = row[i - 1] + row[i];
		}

		return number;
	}

}
