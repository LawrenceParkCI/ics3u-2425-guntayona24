package unit2;

import java.util.Scanner;

/**
Description: Switch1 Worksheet
Date: Nov 11 2024
@author Alexander Guntayon
*/

public class Switch1 {
  /**
	* This is the entry point to the program.
	* @param args unused
	*/
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("What number day is it?");
    int day = in.nextInt();

    switch(day) {
      case 1:
        System.out.println("Sunday");
        break;
      case 2:
        System.out.println("Monday");
        break;
      case 3:
        System.out.println("Tuesday");
        break;
      case 4:
        System.out.println("Wednesday");
        break;
      case 5:
        System.out.println("Thursday");
        break;
      case 6:
        System.out.println("Friday");
        break;
      case 7:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("We don't have that day yet");
        break;
    }

    //Run the program. Type in a number between 1-7, and then a number bigger than that. What is the result?
    	// It says We don't have that day yet
    //What do you think default means?
    	//Just means any number that's not in case
    //What do you think break means? What happens when you remove a break?
    	// Break means that it break stops the switch. If you remove the breaks, it will keep on adding 

    //Create another program, this time asking what day it is (String), and printing out how many days until the weekend
    
    System.out.println("What day is it today?");
    String dayString = in.next();
    dayString = dayString.toLowerCase();
    		
    switch(dayString) {
	    case "monday":
	      System.out.println("5 more days");
	      break;
	    case "tuesday":
	      System.out.println("4 more days");
	      break;
	    case "wednesday":
	      System.out.println("3 more days");
	      break;
	    case "thursday":
	      System.out.println("2 more days");
	      break;
	    case "friday":
	      System.out.println("1 more day");
	      break;
	    case "saturday":
	      System.out.println("It's saturday");
	      break;
	    case "sunday":
	      System.out.println("It's sunday");
	      break;
	    default:
	      System.out.println("We don't have that day yet");
	      break;
  }
  }
}