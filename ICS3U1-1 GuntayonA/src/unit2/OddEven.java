package unit2;

import java.util.Scanner;

/**
* Description: Determines if a number is odd or even
* Date: Nov 1 2024
* @author Alexander Guntayon
*/

public class OddEven {
	/**
	* This is the entry point to the program.
	* @param args unused
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		//Checks if int is odd, else it is even
		int input = sc.nextInt();
		if (input % 2 == 1) {
			System.out.println("This is an odd number");
		}
		else {
			System.out.println("This is an even number");
		}

	}

}
