package unit2;

/**
 * Description: While worksheet
 * Date: Nov 21 2024
 * @author Alexander Guntayon
*/

import java.util.Scanner;

public class While {
	/**
	* This is the entry point to the program.
	* @param args unused
	*/
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("How many people are you planning to see?");

    //Why do you think I coded it this way?
    //To ask the user for the names of the people until you asked for them all
    int numPeople = Integer.parseInt(in.nextLine());

    while (numPeople > 0) {
      System.out.print("What is this person's name? ");

      //Why do you think the variable is declared here?
      //Because each time it runs it redeclares the variable to reuse it
      String name = in.nextLine();
      System.out.println("Welcome, " + name + "!");

      numPeople = numPeople - 1;
    }
    

 
    //Run the code Using the debugger. 
    //Explain the code in your own words
    	//Asks user for number of people, while the number of people are bigger than 0, it asks for the name of the person, then prints out a welcome message, and substracts one from the numPeople.

    //What code is repeated?
    	//everything in the while loop
    //When does it decide whether to repeat or not?
    	//If numPeople is bigger than 0, it repeats
    //What is the condition for repeating?
    	//While numPeople > 0

    //What is the difference between a while loop and a do-while loop?
    	//While loop continues a loop until conditions are met, and Do-While loops makes sure that the loop is executed at least once


    //Create a while loop that asks for a word, 
    //and prints it out 20 times.
    System.out.println("Type a word");
    int number = 20;
    String word = in.nextLine();
    
    while (number > 0) {
    	System.out.println(word);
    	number -= 1;
    }
    
  }
}