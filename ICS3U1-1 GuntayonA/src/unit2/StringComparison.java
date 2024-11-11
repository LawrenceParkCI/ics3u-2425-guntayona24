package unit2;

import java.util.Scanner;

/**
 * Description: StringComparison worksheet
 * Date: Nov 11 2024
 * @author Alexander Guntayon
*/

class StringComparison {
	/**
	* This is the entry point to the program.
	* @param args unused
	*/
	public static void main(String[] args) {

	    Scanner in = new Scanner(System.in);
	    
	    String answer;
	
	    System.out.println("What is the capital of Ontario?");
	    answer = in.nextLine();
	
	    if (answer.equals("Toronto")) {
	      System.out.println("Correct!");
	    } else {
	      System.out.println("Sorry, that's incorrect.");
	    }
	    
	    //Run the code. What happens when you type the correct answer? The incorrect answer?
	    	//If you type Toronto, it prints "Correct!", if not, "Sorry, that's incorrect."
	    /*
	      Strings are objects, not primitives and as such are a 
	      *reference* data type. These variables hold an address 
	      to the value. (Scanner is also a reference data type)
	
	      int, double, char, etc. are all *primitive* data types. 
	      These variables hold the actual value.
	
	      Look at the website:
	      https://www.javatpoint.com/string-comparison-in-java
	
	      Demonstrate the use of the functions:
	        .compareTo()
	        .equals()
	        .equalsIgnoreCase()
	    */
	    String s = "hello";
	    String t = "Hello";
	    System.out.println(s.compareTo(t));
	    System.out.println(s.equals(t));
	    System.out.println(s.equalsIgnoreCase(t));
	
	    //What values does compareTo() return? How can we 
	    //interpret the value?
	    	//It returns the lexicographic value of the first letter difference with the second
	
	    //what value does equals() and equalsIgnoreCase() return? 
	    	//boolean
	    //What is the difference between these two functions?
	    	//equals is a boolean and check if the strings are the exact same. equalsIgnoreCase is the same, except the casing of the letter do not matter.
	  }
}