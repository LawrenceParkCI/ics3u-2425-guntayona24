package unit2;

/**
* Description: BasicBoolean worksheet
* Date: Nov 4 2024
* @author Alexander Guntayon
*/

public class BasicBoolean {
	/**
	* This is the entry point to the program.
	* @param args unused
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //we've declared a variable called isPurple of boolean type
	    //Recall: boolean holds either True or False
	    boolean isPurple = false;


	    /*
	      Boolean Operators, Expressions
	    */

	    //boolean expressions are ways we can "calculate" whether
	    //something is true or false

	    int firstNum = 5;
	    int secondNum = 10;
	    double thirdNum = 5.5;

	    //this prints out true because firstNum is 5 which is less than secondNum
	    System.out.println("1: " + (firstNum < secondNum)); 

	    //this prints out false because firstNum is 5 which is not more than secondNum
	    System.out.println("2: " + (firstNum > secondNum)); 

	    //this prints out true because firstNum is 5 which is less or = to thirdNum as an int
	    System.out.println("3: " + (firstNum <= (int)thirdNum)); 
	    //this prints out ________ because ________________
	    System.out.println("4: " + (firstNum <= thirdNum)); 

	    /*Test out these boolean operators. Figure out the meaning
	      * > means: greater than
	      * < means: less than
	      * <= means: less or equals to
	      * >= means: greater or equals to
	      * == means: equals to
	      * != means: doesn't equal to
	    */

		}

}
