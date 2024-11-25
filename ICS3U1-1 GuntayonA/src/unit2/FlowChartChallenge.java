package unit2;

import java.util.Scanner;

/**
 * Description: FlowChartChallenge
 * Date: Nov 22 2024
 * @author Alexander Guntayon
*/

class FlowChartChallenge {
	/**
	* This is the entry point to the program.
	* @param args unused
	*/
  public static void main(String[] args) {
    /*Create a flow chart for this program. Add the Share link
    to your flowchart as a comment in this program.
    How would the flow chart of the do-while loop
     and while loop differ?
    */
    
    Scanner sc = new Scanner(System.in);
    String name;
    do {
      System.out.print("What is your name? ");
      name = sc.nextLine();
    } while (!name.equals("Ms. Kemp"));

    System.out.println("You are welcome into the secret secret pogchamp club.");

    sc.close();
    
    // LINK    https://drive.google.com/file/d/1rNGyCUuEW2g0Stj6EiBI5BxEJN-wCdWs/view?usp=sharing
    
  }
}