package unit1;
/**
 * Description: Gets input from user to calculate days alive and hours slept <br>
 * 
 * Date: Oct 7, 2024 <br>
 * @author Alexander Guntayon
 */

import java.util.Scanner;

public class Alive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Takes your birth year, month, and day
		System.out.println("Enter Your Birth year, month, and day");
		System.out.println("Year:");
		int birthYear = sc.nextInt();
		System.out.println("Month:");
		int birthMonth = sc.nextInt();
		System.out.println("Day:");
		int birthDay = sc.nextInt();
		int dailySleep = 8;
		
		//Takes the present year, month, and day
		System.out.println("Enter The Present year, month, and day");
		System.out.println("Year:");
		int presentYear = sc.nextInt();
		System.out.println("Month:");
		int presentMonth = sc.nextInt();
		System.out.println("Day:");
		int presentDay = sc.nextInt();
		
		//Calculates days alive 
		
		int daysAlive = ((presentYear - birthYear) * 365) + ((presentMonth - birthMonth) * 30) + (presentDay - birthDay);
		
		//Calculates hours slept
		int hoursSlept = dailySleep * daysAlive;
		
		//Prints days alive and hours slept
		System.out.println();
		System.out.println("You've beeing living for " + daysAlive + " days in total");
		System.out.println("You've slept for " + hoursSlept + " hours in total");
		
		System.out.println();
		

	}

}
