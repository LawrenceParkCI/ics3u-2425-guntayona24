package unit2;

import java.util.Scanner;

/**
 * Description: DoubleDiceContest
 * Date: Nov 18 2024
 * @author Alexander Guntayon
 */
public class DoubleDiceContest {
  /**
	* This is the entry point to the program.
	* @param args unused
	*/
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
  /*
   * Write code that simulates rolling two dice for the user and then two dice for the computer. 
   * The program should output the total of the two dice for both the user and the computer, 
   * then announce who won: the computer, the user, or say it was a tie.
   */
	 
	System.out.println("Type anything to roll a die");
	String roll = sc.nextLine();
	 
	int diceUser1 = (int)(Math.random() * 6) + 1;
	int diceUser2 = (int)(Math.random() * 6) + 1;
	int diceComp1 = (int)(Math.random() * 6) + 1;
	int diceComp2 = (int)(Math.random() * 6) + 1;
	
	// Adds the dice together
	int userValue = diceUser1 + diceUser2;
	int compValue = diceComp1 + diceComp2;
	
	// display 2 dices rolled by computer and user
	System.out.println("You rolled " + diceUser1 +" and "+ diceUser2);
	System.out.println("Computer rolled " + diceComp1 +" and "+ diceComp2);
	System.out.println();
	
	System.out.println("You got the value " + userValue);
	System.out.println("Computer got the value " + compValue);
	System.out.println();
	
	// Prints statements depending if userValue is bigger, smaller, or the same as compValue
	if (userValue > compValue) {
		System.out.println("You win!");
	}
	else if (userValue < compValue) {
		System.out.println("You lose!");
	}
	else {
		System.out.println("It's a tie!");
	}

 }

}
