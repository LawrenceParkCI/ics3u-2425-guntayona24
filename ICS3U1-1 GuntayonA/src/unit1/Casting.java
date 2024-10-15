package unit1;

import java.util.Scanner;

/**
* Description: Casting Variables
* Date: Oct 10 2024
* @author Alexander Guntayon
*/
public class Casting {
	/**
	  * This is the entry point to the program.
	  * @param args unused
	  */
	  public static void main(String[] args) {
	    /*
	    *Casting* means to change data from one type to another.
	
	    Implicit casting - changing of data types without specifically writing extra code
	
	    Explicit casting - changing of data types by specifically writing extra code
	    */
	
	    System.out.println("Part 1");
	
	    int intNum;
	    intNum = 10;
	
	    double doubleNum;
	    
	    //implicit casting
	    doubleNum = intNum;
	
	    //What type of data is printed here? Why?
	    System.out.println(doubleNum);
	    //A double is printed because the int was assigned to doubleNum which became an Double
	    
	    
	    //can you explain what is happening in this code?
	    doubleNum = doubleNum + 2.2;
	    //Adds 2.2 to doubleNum
	    	
	    //explicit casting
	    intNum = (int) doubleNum;
	
	    //What type of data is printed here? Why?
	    System.out.println(intNum);
	    //It is an int as it casts a double to an int
	    
	    /*
	    Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
	      int to double
	      double to int
	      int to long
	      long to int
	
	    Why do you think these are implicit/explicit? (Hint: Think about the size of each data and the type of data)
	    */
	    
	    // implicit usually just turns something into another type, while explicit does the same but the variable that was converted seems to lose its original type
	    
	    int myInt = 10;
	    double myDouble = 0;
	    
	    myInt = (int) myDouble;
	    
	    myDouble = (double) myInt;
	    
	    int myInt2 = 20;
	    long mylong = 0;
	    
	    
	    myInt2 = (int) mylong;
	    
	    mylong = (long) myInt2;
	    
	    
	   //int myInt = 10;
	   //double myDouble = 10.0;
	    System.out.println("Part 2");
	
	    //understanding what you can do with casting, can you round the following variable to the nearest 10th?
	    double myNum = 12.2921;
	    short myNum2 = (short) Math.rint(myNum);
	    
	    
	    System.out.println(myNum);
	    
	    
	    Scanner in = new Scanner(System.in);
	    System.out.println("Give me decimal number up to the hundredth");
	    //code
	    
	    double theNum = in.nextDouble();
	    short theShort = 0;
	    
	    
	    System.out.print("Rounding down to the nearest tenth, it is: ");
	    theShort = (short) theNum;
	    System.out.println(Math.rint(theNum));
	  }
}