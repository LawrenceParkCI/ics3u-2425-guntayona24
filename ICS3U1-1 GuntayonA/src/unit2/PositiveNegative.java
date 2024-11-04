package unit2;

import java.util.Scanner;

/**
* Description: Determines if a number is positive or negative and divisible by 7
* Date: Nov 1 2024
* @author Alexander Guntayon
*/

public class PositiveNegative {
	/**
	* This is the entry point to the program.
	* @param args unused
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a int:");
		int input = sc.nextInt();
		if (input < 0) {
			System.out.println("This is a negative number");
		}
		else {
			System.out.println("This is a positive number");
			
		int inputPos = Math.abs(input);
		
		if (inputPos % 7 == 0) {
			System.out.println("Divisible by 7");
		}
		else {
			System.out.println("not divisible by 7");
		}
		}
		
	}

}
