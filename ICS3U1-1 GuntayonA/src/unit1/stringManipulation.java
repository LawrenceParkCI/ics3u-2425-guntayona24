package unit1;

import java.util.Scanner;

/**
 * Description:  <br>
 * 
 * Date: Oct 8, 2024 <br>
 * @author Alexander Guntayon
 */
public class stringManipulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Manipulates string
		System.out.println("Input String");
		String myString = sc.nextLine();
		System.out.println(myString);
		System.out.println(myString.toUpperCase());
		System.out.println(myString.toLowerCase());
		System.out.println(myString.length());
		System.out.println(myString.charAt(5));
		System.out.println(myString.charAt(0)); 

	}

}
