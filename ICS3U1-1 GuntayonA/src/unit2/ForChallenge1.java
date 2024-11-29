package unit2;

import java.util.Scanner;


/**
Description: ForChallenge1 Worksheet
Date: Nov 25 2024
@author Alexander Guntayon
*/


public class ForChallenge1 {
	/**
	* This is the entry point to the program.
	* @param args unused
	*/
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
    /*
      Create a program that asks for the starting number, the ending number, and how much you should count by. Then print out the numbers using a for loop.  You should be able to count by decimals.
      ie.

      Starting Num: 
        0
      Ending Num: 
        1
      Count by: 
        0.1
      Result: 
        0 0.1 0.2 0.3 0.4 0.5 0.6 0.7 0.8 0.9 1.0
    */
	  System.out.print("Starting Number: "); // Starting number for for loop
	  double startingNum = sc.nextDouble();
	  
	  System.out.print("Ending Number: "); // Ending number for for loop
	  double endingNum = sc.nextDouble();
	  
	  System.out.print("Counting Number: "); // Counting number for for loop
	  double countingNum = sc.nextDouble();
	  
	  for (double i = startingNum; i <= endingNum; i += countingNum) { // Uses values in for loop
		  System.out.println(i);
	  }
	  
	  
  }
}