package unit2;

import java.util.Scanner;

/**
* Description: IfStatents2 worksheet
* Date: Nov 5 2024
* @author Alexander Guntayon
*/
public class IfStatements2 {
	/**
	* This is the entry point to the program.
	* @param args unused
	*/
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

	    System.out.println("What is your age?");
	    int userAge = in.nextInt();
	    /*
	    if (userAge > 18) { //If they're over 18, they are titled an adult
	      String title = "Adult";
	    } else {  //if they're not over 18, I don't want a title
	      System.out.println("Sorry, not quite yet.");
	    }

	    System.out.println(title);
	    */
	    //Looking at the logic above, why do you think the 
	    //program won't work? 
	    //Because if you try to print out the String title, it will only work if you are an adult, as it is only declared in the first if statement.

	    //Copy the code below, and try to find a solution.
	    //Comment the code above to avoid compilation errors.
	    String title = "";
	    
	    if (userAge > 18) { //If they're over 18, they are titled an adult
		      title = "Adult";
		} else {  //if they're not over 18, I don't want a title
			System.out.println("Sorry, not quite yet.");
			title = "Child";
		}
	    System.out.println(title);

	  }
	}