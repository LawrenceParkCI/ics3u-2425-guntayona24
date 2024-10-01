package unit1;
/**
 * Date: Oct 1 2024
 * Description: Math Operators Worksheet
 * @author Alexander Guntayon
*/
public class MathOperators {
/**
 *
 * @param
 */
   public static void main (String [] args) {
      /*
         Pre: Kind of Math, but not really
         What do you notice is happening?
         //It prints out ints and strings and combines them with + sign
      */
      
      //      System.out.println("Butter" + "fly");
      
      //      System.out.println("1 + 2 + 3 + 4 + 5");
      
      //      System.out.println(1 + 2 + 3 + 4 + 5);
      
      //      System.out.println(1 + 2 + "3 + 4 + 5");
      
      //      System.out.println("1 + 2 + 3" + 4 + 5);
      
      
      //Why do you think the last two outputs act so differently?
	   // It combines strings and ints in a line
      
      
      //Summary: What are two possible roles of the + operator?
	   // To add numbers and add a variable value with a string
     
      
      /*
         Part 1 
         Figure out what is the meaning of each operator. Use print statements
         to verify your answer and explain.
      */
         
      // + means:
	   System.out.println(9 + 1 + " It adds numbers together");
      
      // - means:
	   System.out.println(7 - 4 + " It substracts numbers together");
      
      // * means:
	   System.out.println(3 * 4 + " It multiplies numbers together");
      
      // / means:
	   System.out.println(10 / 5 + " It devides numbers");
      
      
      
      //Print the following expression: (3 + 2) * 5
      //Print the following expression: 3 + 2 * 5
	   System.out.println((3 + 2) * 5);
	   System.out.println(3 + 2 * 5);
      
      //Was this expected? Why or why not?
	   System.out.println("This was expected beacuse it follows the rules of bedmas");
      /*
         Part 2 - Calculate Using Operators
         Print out, using one println statement, what 45 degrees Celsius is in Fahrenheit
         
         Print out, using a print and a println statement, what 900 Fahrenheit is in Celsius
      */     
      System.out.println((45 * 9/5) + 32);
      System.out.println((900 - 32) * 5/9);

      /*
         Part 3
         Figure out what is the meaning of % as a math operator. Use print statements
         to check your answer.
      */
      System.out.println(10 % 4);
      //I think % means: 
      
   }
}