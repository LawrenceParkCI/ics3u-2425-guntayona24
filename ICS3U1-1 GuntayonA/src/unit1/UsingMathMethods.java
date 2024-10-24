package unit1;

import java.util.Scanner;

/**
 * Description: Using Math Methods Worksheet
 * Date: Oct 10 2024
 * @author Alexander Guntayon
 */
public class UsingMathMethods {
	/**
	 * 
	 *@param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num;
  
		System.out.println("Part A");
  
		//Write code to ask the user for any real number to be input.
		//Store their input into the num variable
		
		System.out.println("Input Number:");
		num = sc.nextDouble();
  
		System.out.println(Math.round(num));
		System.out.println(Math.rint(num));
	    System.out.println(Math.sqrt(num));
	    System.out.println(Math.abs(num));
	    System.out.println(Math.pow(num, 2));
	    System.out.println(Math.pow(num, num));
	    System.out.println(Math.pow(num, 3));
	  
	  /*
	   * Run the program and write down the output that is produced
	   * when each of the following values are input:
	   * 
	   *      num = 16.75  | num = 4.0  | num = -23.45
	   *      -----------------------------------------------
	   * Math.round(num)  17   |   4  | -23
	   * Math.rint(num)   17.0  |  4.0   | -23.0
	   * Math.sqrt(num)   4.092676385936225  |  2.0  | NaN
	   * Math.abs(num)    16.75 |  4.0  | 23.45
	   * Math.pow(num, 2)   280.5625  |  16.0  | 549.9024999999999
	   * Math.pow(num, num)  3.178689376746782E20  |  256.0  | NaN
	   * Math.pow(num, 3)   4699.421875  |  64.0  | -12895.213624999999
	   * 
	   */
	  
	  //Why does the last value(-23.45) give strange output for Math.sqrt(num)?
	  //Nan stands for Not a number!
	  
	    //This is because you can't square root a negative
	    
	  //In your own words describe what the following Math methods does
	  /*
	   * round: Rounds to the nearest whole number and removes the floating point
	   * rint: Rounds to the nearest whole number and keeps the floating point
	   * sqrt: Square roots a number
	   * abs: If the number is negative, it becomes a positive
	   * pow: Multipilies the number by itself (The power of 2)
	   */
	  
	  //The methods round, sqrt and abs only have one parameter (which is in the brackets).
	    //Because it only needs to use the number you inputed for it to work
	  //Why does the pow method have 2 parameters? Explain the purpose of these 2 parameters.
	    //It takes second parameter, and turns it into the power of a number of the first number in the parameter.
	  
	  System.out.println("Part B");
	  //Ask the user for any real number and an integer to be input. Display the real number,
	  
	  //and its square root. Also determine and display the real number raised to the integer power.
	  //Use suitable headings, displaying the results across the screen.\
	  //
	  //Eg. If the real number 13.5 nad the integer 2 are input, display
	  //REAL NUMBER SQUARE ROOT  RAISED TO POWER 2 <- display power here
	  //   13.5     3.6742   182.25
	  
	  System.out.println("Input a real number:");
	  double num2 = sc.nextDouble();
	  System.out.println("Input another real number:");
	  double num3 = sc.nextDouble();
	  double num2Root = (Math.sqrt(num2));
	  double num2Root2 = (Math.pow(num2Root, num3));
	  System.out.printf("Real Number = " + num2 + " | Squareroot Number = " + num2Root + " | Squareroot Number to the power of the Int = " + num2Root2);
	  //Write down the results produced by your program when the real number 7.8985 and
	  //the integer 3 are input.
	  
	  //Real Number = 7.8985 | Squareroot Number = 2.8104270138183627 | Squareroot Number to the power of 2 = 22.198157768644336
	  
	  //Change your program so that instead of inputting an integer power, a real number
	  //power can be input.
	  //Write down the results produced by your program when the following are input:
	  //a) the number 16 and the real number power 0.5
	  //Real Number = 16.0 | Squareroot Number = 4.0 | Squareroot Number to the power of 2 = 2.0
	  
	  //b) the number 8 and the real number power 0.33
	  
	  //Real Number = 8.0 | Squareroot Number = 2.8284271247461903 | Squareroot Number to the power of 2 = 1.4093207551420195
	  
	  //Does your program give a different answer if 0.3333333 is input instead of 0.33 for the power?
	  
	  //yes, it gives 1.4142135133601887
	  
	  
	 }
	
}
