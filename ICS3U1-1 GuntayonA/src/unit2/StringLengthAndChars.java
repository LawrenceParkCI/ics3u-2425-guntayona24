package unit2;

import java.util.Scanner;

/**
Description: StringLengthAndChars Worksheet
Date: Nov 26 2024
@author Alexander Guntayon
*/

public class StringLengthAndChars {

/**
* @param args unused
*/

  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
    /*
      Goal: Using string methods with a for loop
        .length()
        .charAt(<position>)
    */
    
    String name = "Ms. Kemp";

    //write comments for the following code - what does it print out, and why?
    System.out.println(name.length());
    System.out.println(name.charAt(1));
    System.out.println(name.charAt(2));
    System.out.println(name.charAt(3));
  
    //.length() gets the Number of chars
    //.charAt(position) gets the Char at a position
        //counting starts at 0

    /**
      Ask for user input for name. Print out each individual letter of the name on separate lines, using a for loop
    */
    
    String name2 = sc.nextLine();
    
    for (int i = 0; i < name2.length(); i++) {
    	System.out.println(name2.charAt(i));
    }
    
    

  }
}