package unit1;

/**
* Description: Casting Variables 3
* Date: Oct 16 2024
* @author Alexander Guntayon
*/
public class Casting3 {
  
  /**
   * This is the entry point to the program.
   * @param args unused
   */
 public static void main(String[] args) {
    /* 
    * Strings and Back Again
    */
    //Recall:
    System.out.println("Part 1");
    System.out.println("1 + 2 + 3" + 4 + 5);
    //why did it print out this way?
    
    //Because there is a string in the print with ints, it doesn't add them together, and instead combines them
    
    //Demonstrate casting a double value to a String in this way
    
    System.out.println("1 + 2 + 3" + 4.2 + 5.3);
    
    //Demonstrate casting a boolean value to a String in this way
    
    System.out.println("1 + 2 + 3" + true + false);
    
    //Demonstrate casting a char value to a String in this way

    System.out.println("1 + 2 + 3" + 'a' + 'b');
    
    System.out.println("Part 2");
    //In order to change a String into an integer, we need another set of code
    
    String strNum = "25";
    int myNum = Integer.parseInt(strNum);

    System.out.println(strNum + " x 2 = " + (myNum + myNum));

    /*Change strNum to the following values, and see if they work:
     * "25.2"
     * "23c"
     * "2 3"
     * "Lol23"
     * "-5"
    */
    //What can you say about how we can use the function, Integer.parseInt()?

  //Can convert a type not a int if its valid to do so
    
    strNum = "25.2";
    myNum = Integer.parseInt(strNum);
    
    strNum = "25c";
    myNum = Integer.parseInt(strNum);
    
    strNum = "2 3";
    myNum = Integer.parseInt(strNum);
    
    strNum = "Lol23";
    myNum = Integer.parseInt(strNum);
    
    strNum = "-5";
    myNum = Integer.parseInt(strNum);
    
    
    // What do you think the code to change a String to double would look like?
    //Similarly, test out the code and write down what instructions
  
    
    String strNum2 = "10.0";
    double myNum2 = Double.parseDouble(strNum);

    //When do you think it might be necessary to change a string value into an integer value/double value?
    
    //Converting numbers in string to add to other ints/double
  }
}