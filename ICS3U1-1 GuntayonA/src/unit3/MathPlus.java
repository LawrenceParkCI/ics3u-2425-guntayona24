package unit3;

import java.util.Scanner;

public class MathPlus {
	/**
	Description: 
	 - Introduction
	 - Using Static methods
	 - Parts of a method
	Date:
	@author
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		//System.out.println(distance(10, 8, 4, 7));
		//System.out.println(hypotenuse(8, 9));
		
		int num0 = sc.nextInt();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int [] intArray = {num0, num1, num2};
		System.out.println(sum(intArray));
	}
	
	  /**
	  (Description: Returns the distance between two points)
	  @param x1 -> x value of first point
	  @param y1 -> y value of first point
	  @param x2 -> x value of second point
	  @param y2 -> y value of second point
	  @return distance between points
	  */
	public static double distance(int x1, int y1, int x2, int y2) {
		double d = Math.sqrt(Math.pow((x1 - y1), 2) + Math.pow((x2 - y2), 2));
		return d;
	}
	
	
	
	  /**
	  (Description: Finds the hypotenuse with the a and b value)
	  @param a -> value of first side
	  @param b -> value of second side
	  @return sum of the squareroot of a squared and b squared
	  */
	public static double hypotenuse(double a, double b) {
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return c;
	}
	
	
	  /**
	  (Description: Returns the number of factors of the given number)
	  @param factor -> number of which you are checking the factor
	  @return all the factors of the number
	  */
	
	public static int numOfFactors(int factor) {
		int divideNumber = 0;
		int factoredNum = factor;
		do {
			divideNumber ++;
			factor = factoredNum/divideNumber;
			if (factoredNum % divideNumber == 1) {
				return factor;
			}
		} while (factor > 0);
		return 0;
	}
	
	  /**
	  (Description: Returns true if the number given is prime, and false otherwise.)
	  @param number 2 -> The number that is used to check if it's a prime
	  @return true or false if a number is a prime
	  */
	
	public static boolean isPrime(int number2) {	
		int number = 1;
		boolean primeCheck = true;
		for (int i = 1; i <= number2; ++i) {
			number ++;
			if (number2 % number == 0);
				primeCheck = false;
		}
		
		return primeCheck;
	}
	
	  /**
	  (Description: Adds all the numbers in the array and returns the sum.)
	  @param array -> is the array used
	  @return the sum as an int
	  */
	
	public static int sum(int[] array) {
		int arraySum = 0;
		for (int i = 0; i <= 2; i ++) {
			arraySum += array[i];
		}
		
		return arraySum;
	}
	
	  /**
	  (Description: Adds all the numbers in the array and returns the sum.)
	  @param array -> is the array used
	  @return the sum as a double
	  */

	public static double sum(double[] array) {
		double arraySum = 0;
		for (int i = 0; i <= 2; i ++) {
			arraySum += array[i];
		}
		return arraySum;
	}
	
	  /**
	  (Description: Finds the index of the smallest number in an array.)
	  @param array -> is the array used
	  @return the index of the smallest integer
	  */
	
	public static int min(int[] array) {
		int arrayIndex = 0;
		int currentNum;
		int smallestNum;
		for (int i = 0; i <= 2; i++) {
			currentNum = array[i];
		}
		if ((array[0] < array[1]) && (array[0] < array[2])) {
			arrayIndex = 0;
		}
		else if ((array[1] < array[0]) && (array[1] < array[2])) {
			arrayIndex = 1;
		}
		else {
			arrayIndex = 2;
		}
		return arrayIndex;
	}
	
	
	  /**
	  (Description: Finds the index of the smallest number in an array.)
	  @param array -> is the array used
	  @return the index of the smallest float
	  */
	
	public static double min(double[] array) {
		int arrayIndex = 0;
		if ((array[0] < array[1]) && (array[0] < array[2])) {
			arrayIndex = 0;
		}
		else if ((array[1] < array[0]) && (array[1] < array[2])) {
			arrayIndex = 1;
		}
		else {
			arrayIndex = 2;
		}
		return arrayIndex;
	}
	
	  /**
	  (Description: Finds the index of largest number in an array.)
	  @param array -> is the array used
	  @return the index of the smallest int
	  */
	public static int max(int[] array) {
		int arrayIndex = 0;
		if ((array[0] > array[1]) && (array[0] > array[2])) {
			arrayIndex = 0;
		}
		else if ((array[1] > array[0]) && (array[1] > array[2])) {
			arrayIndex = 1;
		}
		else {
			arrayIndex = 2;
		}
		return arrayIndex;
	}
	
	  /**
	  (Description: Finds the index of the largest number in an array.)
	  @param array -> is the array used
	  @return the index of the largest float
	  */
	public static double max(double[] array) {
		int arrayIndex = 0;
		if ((array[0] > array[1]) && (array[0] > array[2])) {
			arrayIndex = 0;
		}
		else if ((array[1] > array[0]) && (array[1] > array[2])) {
			arrayIndex = 1;
		}
		else {
			arrayIndex = 2;
		}
		return arrayIndex;
	}
	
	public static int bigDifference(int[] array) {
		for (int i = 0; i < 2; i ++) {
			if (array[i] < array[i]);
		}
		return 0;
	}
}

