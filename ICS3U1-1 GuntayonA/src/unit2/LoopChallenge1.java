package unit2;

import java.util.Scanner;

/**
 * Description: LoopChallenge1
 * Date: Nov 21 2024
 * @author Alexander Guntayon
*/

public class LoopChallenge1 {
	/**
	* This is the entry point to the program.
	* @param args unused
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    /*
	      Create a program that will ask for the password.  If they answer 
	      incorrectly, tell them, and repeat. If they answer correctly, 
	      welcome them in.
	      
	      Extra: if they don't give a proper answer within 3 
	      Decide on whether you should use the while or do while loop.
	    */
		
		System.out.println("What is the password?");
		
		String password = "Chicken";
		String inputPass = sc.nextLine();
		while (!inputPass.equals(password)){
			System.out.println("Wrong try again.");
			inputPass = sc.nextLine();
		}
		
		System.out.println("Correct");
		
		

	}

}
