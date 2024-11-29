package unit2;

import java.util.Scanner;
/**
 * Description: Rates user's name
 * Date: Nov 19 2024
 * @author Alexander Guntayon
 */
public class NameGame {
  /**
	* This is the entry point to the program.
	* @param args unused
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is your name?: ");
		String name = sc.nextLine(); // Prompts user for their name
		
		int randomChance = (int) (Math.random() * 10) + 1;
		System.out.println();
		
		// 30% chance it outputs a hateful message, 70% chance it outputs a nice message
		if (randomChance <= 3) {
			System.out.println("You have an ugly name.");
		}
		else {
			System.out.println("Your name is my favorite!");
		}
		
	}

}
