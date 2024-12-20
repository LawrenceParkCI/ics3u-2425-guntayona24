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
		
		//int num0 = sc.nextInt();
		//int num1 = sc.nextInt();
		//int num2 = sc.nextInt();
		//int [] intArray = {num0, num1, num2};
		//System.out.println(maxInt(intArray));
		
		double num0 = sc.nextDouble();
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double [] intArray = {num0, num1, num2};
		System.out.println(maxDouble(intArray));
		
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
			if (factoredNum % divideNumber == 0) {
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
	
	public static int minInt(int[] array) {
		int minValue = 0;
		int indexValue = 0;
		for (int i = 0; i < array.length; i++) {  
			if(array[i] > minValue)  
				minValue = array[i];
				indexValue = (int) i;
		}
		return indexValue;
	}
	
	
	  /**
	  (Description: Finds the index of the smallest number in an array.)
	  @param array -> is the array used
	  @return the index of the smallest float
	  */
	
	public static double minDouble(double[] array) {
		double minValue = 0;
		int indexValue = 0;
		for (int i = 0; i < array.length; i++) {  
			if(array[i] > minValue)  
				minValue = array[i];
				indexValue = (int) i;
		}
		return indexValue;
	}
	
	  /**
	  (Description: Finds the index of largest number in an array.)
	  @param array -> is the array used
	  @return the index of the smallest int
	  */
	public static int maxInt(int[] array) {
		int maxValue = 0;
		int indexValue = 0;
		for (int i = 0; i < array.length; i++) {  
			if(array[i] < maxValue)  
				maxValue = array[i];
				indexValue = (int) i;
		}
		return indexValue;
	}
	
	  /**
	  (Description: Finds the index of the largest number in an array.)
	  @param array -> is the array used
	  @return the index of the largest float
	  */
	public static double maxDouble(double[] array) {
		double maxValue = 0;
		int indexValue = 0;
		for (int i = 0; i < array.length; i++) {  
			if(array[i] < maxValue)  
				maxValue = array[i];
				indexValue = (int) i;
		}
		return indexValue;
	}
	
	  /**
	  (Description: Finds the largest and smallest int values and finds the difference
	  @param array -> is the array used
	  @return the difference of the numbers
	  */
	public static int bigDifference(int[] array) {	
		int minValue = array[0];  
		int maxValue = array[0];  
		
		// Checks for the smallest int
		for (int i = 0; i < array.length; i++) {  
			if(array[i] < minValue)  
				minValue = array[i];  
		}
		
		// Checks for biggest int
		for (int i = 0; i < array.length; i++) {  
			if(array[i] > maxValue)  
				maxValue = array[i];  
		}
		
		// Grabs maxValue and substracts minValue
		int difference = maxValue - minValue;
		return difference;
	}
	
	  /**
	  (Description: Finds the largest and smallest int values and finds the difference
	  @param array -> is the array used
	  @return the difference of the numbers
	  */
	public static double bigDifference(double[] array) {	
		double minValue = array[0];  
		double maxValue = array[0];  
		
		// Checks for the smallest double
		for (int i = 0; i < array.length; i++) {  
			if(array[i] < minValue)  
				minValue = array[i];  
		}
		
		// Checks for biggest double
		for (int i = 0; i < array.length; i++) {  
			if(array[i] > maxValue)  
				maxValue = array[i];  
		}
		
		// Grabs maxValue and substracts minValue
		double difference = maxValue - minValue;
		return difference;
	}

}

