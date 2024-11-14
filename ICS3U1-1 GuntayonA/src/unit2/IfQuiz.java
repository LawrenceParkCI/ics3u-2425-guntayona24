package unit2;

import java.util.Scanner;

import java.text.NumberFormat;

/**
 * Description: An animal quiz which prints out the result afterwards
 * Date: Nov 13 2024
 * @author Alexander Guntayon
*/

public class IfQuiz {
   /**
	* This is the entry point to the program.
	* @param args unused
	*/
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  NumberFormat percent = NumberFormat.getPercentInstance();
    //This is for the portfolio

    /*
    Write an interactive quiz. It should ask the user three 
    multiple-choice or true/false questions about something. 
    It must keep track of how many they get wrong, and print 
    out a "score" at the end.

    Sample:

    Are you ready for a quiz?  N
    Okay, here it comes!

    Q1) What is the capital of Alaska?
      1) Melbourne
      2) Anchorage
      3) Juneau

    > 3

    That's right!
    */
	  double finalScore = 0; // Combined score points
	  
	  System.out.println("----------ANIMAL QUIZ---------- \n");
	  System.out.println("Out of 5 points \n");
	  System.out.print("Student Name: ");
	  String studentName = sc.nextLine(); // Takes student name to print out on the results
	  System.out.println();
	  System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

	  System.out.println("How many legs does a spider have?"); // First question
	  System.out.println("1) 6 legs");
	  System.out.println("2) 10 legs");
	  System.out.println("3) 7 legs");
	  System.out.println("4) 8 legs");
	  System.out.print("\nAnswer: ");
	  int quesSpider = sc.nextInt();
	  if (quesSpider != 4) {
		  System.out.println("\nNo! Spiders have 8 legs. The answer is 4!"); //Incorrect answer
	  }
	  else {
		  System.out.println("\nNice! Spider have 8 legs."); //Correct answer
		  finalScore += 1;
	  }
	  
	  System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
	  System.out.println("\nHow long do tortoises generally live for?"); // Second question
	  System.out.println("1) 50 - 75 years");
	  System.out.println("2) 20 - 30 years");
	  System.out.println("3) 100 - 150 years");
	  System.out.println("4) 200 - 200 years");
	  System.out.print("\nAnswer: ");
	  int quesTortoise = sc.nextInt();
	  if (quesTortoise != 3) {
		  System.out.println("\nNo, it is number 3, tortoises can live for around 100 - 150 years normally."); // Incorrect answer
	  }
	  else {
		  System.out.println("\nYes! Tortoises live generally for 100 to 150 years."); //Correct answer
		  finalScore += 1;
	  }
	  
	  System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
	  System.out.println("\nTRUE or FALSE (T or F): Is the blue whale the biggest living animal currently?"); //Third question
	  System.out.print("\nAnswer: ");
	  String quesWhale = sc.next();
	  if (quesWhale.equalsIgnoreCase("T")) {
		  System.out.println("\nYes, It's True. The blue whale is the biggest animal right now."); // Correct answer
		  finalScore += 1;
	  }
	  else {
		  System.out.println("\nIncorrect, It's true, the blue whale is the biggest animal currently"); // Incorrect answer
	  }
	  
	  System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
	  System.out.println("\nTRUE or FALSE (T or F): The great white shark has the strongest bite force currently out of all animals"); // Forth question
	  System.out.print("\nAnswer: ");
	  String quesShark = sc.next();
	  if (quesShark.equalsIgnoreCase("T")) {
		  System.out.println("\nYes, It's True. The great white shark has the strongest bite force."); // Correct answer
		  finalScore += 1;
	  }
	  else {
		  System.out.println("\nIncorrect, It's true, the great white shark has the strongest bite force"); // Incorrect answer
	  }
	  
	  System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
	  System.out.println("\nFINAL QUESTION");
	  System.out.println("What do cows drink?"); // Fifth and final question
	  System.out.println("1) Milk");
	  System.out.println("2) Water");
	  System.out.println("3) Orange Juice");
	  System.out.println("4) 1 and 2 are correct");
	  System.out.print("\nAnswer: ");
	  int quesCows = sc.nextInt();
	  if (quesCows == 3) {
		  System.out.println("\nWrong, cows drink water, and milk when they are younger."); // Incorrect answer
	  }
	  else if (quesCows == 1 || quesCows == 2) {
		  System.out.println("\nHalf-Point! Cows can drink both water and milk, but milk when they are younger..."); // Half correct answer
		  finalScore += 0.5;
	  }
	  else {
		  System.out.println("\nYes! Cows drink water, and milk when they are younger"); // Correct answer
		  finalScore += 1;
	  }
	  System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
	  
	  // Quiz Score
	  System.out.println("\n-----QUIZ SCORE-----");
	  System.out.printf("\nYou got: " + finalScore + " out of 5.0! \n\n"); // Prints final score compared to max
	  double percentScore = (finalScore / 5.0);
	  System.out.println(percent.format(percentScore) + " / 100% \n");
	  
	  // Print statements based on score
	  if (finalScore == 0) {
		  System.out.println("You Failed badly,	" + studentName);
		  System.out.println("Letter Grade: F-");
	  }
	  else if (finalScore < 3) {
		  System.out.println("You need to study alot more, " + studentName);
		  System.out.println("Letter Grade: D");
	  }
	  else if (finalScore < 3.5) {
		  System.out.println("You need to study more, " + studentName);
		  System.out.println("Letter Grade: C");
	  }
	  else if (finalScore < 4) {
		  System.out.println("Not too bad, " + studentName);
		  System.out.println("Letter Grade: B-");
	  }
	  else if (finalScore < 4.5) {
		  System.out.println("Nice work!");
		  System.out.println("Letter Grade: A-, " + studentName);
	  }
	  else if (finalScore < 5) {
		  System.out.println("Excellent!");
		  System.out.println("Letter Grade: A+, " + studentName);
	  }
	  else if (finalScore == 5) {
		  System.out.println("Perfect!");
		  System.out.println("Letter Grade: A++, " + studentName);
	  }
  }
}