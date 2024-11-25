package unit2;

/**
 * Description: DoWhile worksheet
 * Date: Nov 21 2024
 * @author Alexander Guntayon
*/


import java.util.Scanner;

public class DoWhile {
	/**
	* This is the entry point to the program.
	* @param args unused
	*/
  public static void main(String[] args) {
    /*
    A loop is another control structure that allows for repetition. It 
    does not make a decision on which branch to go on, like the 
    conditional.
    It makes a decision whether it should go back to redo a set of code.
    */
    Scanner in = new Scanner(System.in);
    String name;
    do {
      System.out.print("What is your name? ");
      name = in.nextLine();
    } while (!name.equals("Mr. Lee"));

    System.out.println("You are welcome into the secret secret pogchamp club.");


    //Run the code. Explain the code in your own words
    	//It runs the do, but runs again if name does not equal "Mr. Lee"

    //What code is repeated?
    	//Everything in the do parenthesis
    //When does it decide whether to repeat or not?
    	//While name does not equal "Mr. Lee" it repeats
    //What is the condition for repeating?
    	//While (!name.equals("Mr. Lee"));

    /*
     Note:Pay attention to the brackets, and the semicolon
    */

    /*
      When constructing a loop, there are many strategies. I like to 
      break down the problems this way:
        1. What commands am I going to repeat?
        2. How many times/until when will I repeat the code?
    */

    //Create a do-while loop that asks for a word, and 
    //prints it out 20 times.
    System.out.println("Type a word");
    int number = 20;
    String word = in.nextLine();
    do {
    	System.out.println(word);
    	number -= 1;
    }    while (number > 0);
    
  }
}