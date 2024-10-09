package unit1;
/**
 * Description: Prints floats of user input <br> 
 * 
 * Date: Oct 3, 2024 <br>
 * @author Alexander Guntayon
 */

import java.util.Scanner;


public class InputFP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1, num2;
		
		System.out.println("What's Num1?");
		num1 = sc.nextDouble();
		System.out.println("What's Num2?");
		num2 = sc.nextDouble();
		System.out.println();
		System.out.println("The first number entered was " + num1);
		System.out.println("The second number entered was " + num2);
				
		
		

	}

}
