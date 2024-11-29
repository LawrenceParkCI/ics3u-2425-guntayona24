package unit2;
/**
* Description: IfStatents1 worksheet
* Date: Nov 5 2024
* @author Alexander Guntayon
*/
public class IfStatements1 {
	/**
	* This is the entry point to the program.
	* @param args unused
	*/
	public static void main(String[] args) {
	    int firstNum = 10;
	    int secondNum = 30;
	    
	    System.out.println("Part 1: If");
	    System.out.println("----------");
	    if (firstNum > secondNum) {
	      System.out.println("KEKW");
	      System.out.println("OMEGLUL");
	    }    

	    //What prints out? Why?
	    //Nothing as firstNum is not greater than secondNum

	    System.out.println("\nPart 2: If, Else");
	    System.out.println("----------------");
	    if (firstNum > secondNum) {
	      System.out.println("KEKW");
	      System.out.println("OMEGALUL");
	    } else {
	      System.out.println("XQCL");
	    }

	    //What prints out? Why?
	    //Prints XQCL because it runs the else statement as firstNum is not greater than secondNum

	    System.out.println("\nPart 3: If, Else if, Else");
	    System.out.println("-------------------------");
	    if (firstNum > secondNum) {
	      System.out.println("KEKW");
	      System.out.println("OMEGALUL");
	    } else if (firstNum % 2 == 0 && secondNum % 3 == 0){
	      System.out.println("sykSHY");
	    } else {
	      System.out.println("XQCL");
	    }

	    //What prints out? Why?
	    //sykSHY as the first if line condition is not met, but the else if statement is met, so it prints out that

	    System.out.println("\nPart 4: What's the difference?");
	    System.out.println("------------------------------");
	    System.out.println(1);
	    if (firstNum < secondNum) {
	      System.out.println("KEKW");
	      System.out.println("OMEGALUL");
	    } else if (firstNum % 2 == 0 && secondNum % 3 == 0){
	      System.out.println("sykSHY");
	    } else {
	      System.out.println("XQCL");
	    }

	    System.out.println(2);
	    if (firstNum < secondNum) {
	      System.out.println("KEKW");
	      System.out.println("OMEGALUL");
	    }

	    if (firstNum % 2 == 0 && secondNum % 3 == 0){
	      System.out.println("sykSHY");
	    }

	    if (!(firstNum < secondNum)) {
	      System.out.println("XQCL");
	    }

	    //What prints out? Why?
	    //1 prints out KEKW and OMAGALUL because firstNum is smaller than secondNum
	    //2 prints out KEKW and OMAGALUL because firstNum is smaller than secondNum
	    //3 Prints out sykSHY because firstNum is divisible by 2 and secondNUm is divisble by 3
	    //4 doesn't print out anything as the ! means checks if it is not equal to the condition, and firstNum IS smaller than secondNum
	    
	    //What is the difference between the first and second part?
	    //1 contains else if and else statements, while second only has a if statement

	}

}
