package unit2;

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
  /*
   * Write code that simulates rolling two dice for the user and then two dice for the computer. 
   * The program should output the total of the two dice for both the user and the computer, 
   * then announce who won: the computer, the user, or say it was a tie.
   */
	 
	int diceUser1 = (int)(Math.random() * 6) + 1;
	int diceUser2 = (int)(Math.random() * 6);
	int diceComp1 = (int)(Math.random() * 6) + 1;
	int diceComp2 = (int)(Math.random() * 6);
	
	int userValue = diceUser1 + diceUser2;
	int compValue = diceComp1 + diceComp2;
	
	System.out.println("You got the value " + userValue);
	System.out.println("Computer got the value " + compValue);

 }

}
