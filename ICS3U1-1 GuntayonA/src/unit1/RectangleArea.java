package unit1;

import java.util.Scanner;

public class RectangleArea {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declare variables
		int length, width, depth;
		
		//get the user input
		System.out.println("AREA PROGRAM");
		System.out.print("Type in the lenfth of the rectangle and <Enter>: ");
		length = sc.nextInt();
		
		System.out.println("Type in the width of the rectangle and <Enter>: ");
		width = sc.nextInt();
		
		System.out.println("Type in the depth of the rectangle and <Enter>: ");
		depth = sc.nextInt();
		
		
		//calculate the area
		int area = length * width * depth;
		
		//print the output
		System.out.println("The area of your rectangle is " + area);
		sc.close();
		
	}

}
