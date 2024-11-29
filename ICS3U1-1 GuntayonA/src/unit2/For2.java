package unit2;

/**
Description: For2 Worksheet
Date: Nov 25 2024
@author Alexander Guntayon
*/

public class For2 {
	/**
	* This is the entry point to the program.
	* @param args unused
	*/
  public static void main(String[] args) {
    //Recall - create a for loop printing 1 to 10:
	  for (int i = 1; i <= 10; i++) {
		  System.out.println(i);
	  }

    //though we are repeating a certain number of times, we can use variables in our for loops as well

    int times = 20;

    for (int i = 15; i < times; i++) {
      System.out.println(i);
    }

    //In addition, the counter doesn't necessarily have to be an integer
    double increment = 0.1;
    for (double i = 0; i < 2; i += increment) {
      System.out.println(i);
    }

    //create a variable to store the starting number, and use it in a for loop. Be able to use a double value:
    double num = 5.5;
    for (double i = num; i <= 11.5; i++) {
    	System.out.println(i);
    }
    
    

   //Look at the following code. Explain what is happening?

    int sum = 0; // Declares variable

    for (int i = 1; i < 10; i++) { // Int i is 1, if i is less than 10, run the for loop, and i increases by one each time the for loop is ran
      sum += i; // Adds i to sum each time the for loop i ran
    }

    System.out.println(sum); // Prints out sum


    
  }
}