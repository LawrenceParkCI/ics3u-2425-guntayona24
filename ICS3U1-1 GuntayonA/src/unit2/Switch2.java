package unit2;

import java.util.Scanner;

/**
Description: Programs prints days in a month
Date: Nov 12 2024
@author Alexander Guntayon
*/


public class Switch2 {
  public static void main(String[] args) {
	  
	  Scanner sc = new Scanner(System.in);

    /*Create a program that asks for a month, and print out how many days there are in that month. (For "February", just put 28). This will be a part of your portfolio.

    Challenge: Ask for the year, and change "February" to 29 if the year is a leap year (divisible by 4)
    */

    //Can you create it such that you can remove some breaks?
	  
	  System.out.println("Input a month");
	  String month = sc.nextLine();
	  month = month.toLowerCase();
	  
	  System.out.println("Input a year");
	  int year = sc.nextInt();
	  
			  
	  switch (month) {
	  case "january":
		  System.out.println("There are 31 days");
		  break;
	  case "febuary":
		  if (year % 4 == 0) {
			  System.out.println("There are 29 days");
		  }
		  else {
			  System.out.println("There are 28 days");
		  }
		  break;
	  case "march":
		  System.out.println("There are 31 days");
		  break;
	  case "april":
		  System.out.println("There are 30 days");
		  break;
	  case "may":
		  System.out.println("There are 31 days");
		  break;
	  case "june":
		  System.out.println("There are 30 days");
		  break;
	  case "july":
		  System.out.println("There are 31 days");
		  break;
	  case "august":
		  System.out.println("There are 31 days");
		  break;
	  case "september":
		  System.out.println("There are 30 days");
		  break;
	  case "november":
		  System.out.println("There are 30 days");
		  break;
	  case "december":
		  System.out.println("There are 31 days");
		  break;
	  default:
		  System.out.println("The month does not exist or you made a typing mistake");
		  
	  }
  }
}