package unit1;

/**
* Description: Casting Variables 2
* Date: Oct 15 2024
* @author Alexander Guntayon
*/
public class Casting2 {
  
  /**
   * This is the entry point to the program.
   * @param args unused
   */
  public static void main(String[] args) {
    /*
    Char and int
    */
    char myChar = 'a';
    System.out.println(myChar);
    System.out.println(myChar + 1);

    char myChar2 = (char) (myChar + 1);

    System.out.println(myChar2);

    //Explain what is happening in the code. Where is there explicit casting, where is there implicit casting?
    	//char myChar2 = (char) (myChar + 1)  is the explicit casting
    	//This code seems to combine myChar and + 1 into a char type. It prints our a, 98, and b
    //Why do you think this happens?
    
    	//It probably prints the letter than the ASCII value + 1, and it prints b because when it gets converted to a char, one because a
    
    //Investigate what is ASCII. What is it?
    
    	//ASCII is a character encoding format.
    
    //Can you find the number value for 'a'? Does it match with your findings above?
    	
    	//Yes, its 97, and when it was printed it was 98 because it added a one
    
    //create a new character myCharCap, and transform myChar into a capital 'A' and print it
    	
    char myCharCap = 'A';
    
    myChar = (char) myCharCap;
    
    System.out.println(myChar);
    System.out.println(((char) myChar));
    

  }
}