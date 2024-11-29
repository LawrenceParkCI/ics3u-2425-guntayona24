package unit2;

import java.util.Scanner;

/**
 * Description: StringChallenge Program: Asks the user for strings to check and manipulate them and their values
 * Date: Nov 11 2024
 * @author Alexander Guntayon
*/

public class StringChallenge {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
    //This is for the portfolio

    /*
    Create a program that demonstrates the use of .equals(), .equalsIgnoreCase(), .compareTo().  You should be using if statements for this program.

    Also, include an example of explicit and implicit casting.

    Comment to explain:
      -when you use the different String functions
      -when you are casting and how the value is changed
    */
	  System.out.println("Type in a word");
	  String word = sc.nextLine();
	  System.out.println();
	  System.out.println("Type in the word \"hello\"");
	  String hello = sc.nextLine();
	  System.out.println();
	  
	  // Checks to see if the user typed hello with the right casing
	  if (hello.equals("hello")) {
		  System.out.println("You have the proper casing");
	  }
	  else {
		  System.out.println("You dont have the proper casing");
	  }
	  
	  // Checks to see if the user typed hello, no matter the casing
	  if (hello.equalsIgnoreCase("hello")) {
		  System.out.println("The word is grammatically correct");
	  }
	  else {
		  System.out.println("The word is not grammatically correct");
	  }
	  
	  int difference = word.compareTo(hello); // This finds the difference of value between the first word the user entered, and the second
	  
	  System.out.println("The difference of value between the first to the second word is: " + difference);
	  
	  // Checks for if the difference is positive, negative, or equals to 0
	  if (difference < 0) {
		  System.out.println("The first word has a lower value than the second");
	  }
	  else if (difference > 0) {
		  System.out.println("The first word has a greater value than the second");
	  }
	  else {
		  System.out.println("You type the same word with the same casing twice!");
	  }
	  
	  System.out.println();
	  System.out.println("Type in a number (with or without decimals)");
	  
	  double doubleNum = sc.nextDouble();
	  
	  double doubleDifference;
	  
	  System.out.println();
	  doubleDifference = difference + doubleNum; // implicitly converts difference to a double to add it to doubleNum
	  
	  System.out.println("This number added to the difference of value between the first to the second letter is " + doubleDifference);
	  
	  int intNum;
	  
	  intNum = (int) doubleDifference; // explicitly converts doubleDifference to an int
	  
	  System.out.println();
	  System.out.println("Without the decimal, it would look like this: " + intNum);
	  
	  }
	  
  }
