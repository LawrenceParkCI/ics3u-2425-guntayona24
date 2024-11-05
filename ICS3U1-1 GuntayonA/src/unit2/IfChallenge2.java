package unit2;

import java.util.Scanner;

/**
* Description: Program asks user for 3 numbers, and determines if they are in order
* Date: Nov 5 2024
* @author Alexander Guntayon
*/
public class IfChallenge2 {
	/**
	* This is the entry point to the program.
	* @param args unused
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    //This is for the portfolio

	    /*Create a program that asks for three numbers.
	    Tell the user if the numbers are strictly in order.
	    ie.  2 5 11 or 5 6 7 are strictly in order.
	    ie.  6 5 7 or 5 5 7 are not
	    */
		System.out.println("Give me a number");
		int num1 = sc.nextInt();
		System.out.println("Give me another number");
		int num2 = sc.nextInt();
		System.out.println("Give me a last number");
		int num3 = sc.nextInt();
		
		//Checks if numbers are in order
		if (num1 < num2 & num2 < num3) {
			System.out.println("This is in order");
		}
		else {
			System.out.println("This is not in order");
		}
	  }
	}

