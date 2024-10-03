package unit1;
/**
 * Description: Prints Label <br>
 * 
 * Date: Oct 2, 2024 <br>
 * @author Alexander Guntayon
 */

import java.util.Scanner;



public class MakeLabels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String subject;
		String name;
		
		System.out.println("Type in the subject and press <Enter>");
		name = sc.nextLine();
		subject = sc.nextLine();
		
		
		System.out.println();
		System.out.println("*************************");
		System.out.println(name);
		System.out.println(subject);
		System.out.println("*************************");
		sc.close();
		

	}

}
