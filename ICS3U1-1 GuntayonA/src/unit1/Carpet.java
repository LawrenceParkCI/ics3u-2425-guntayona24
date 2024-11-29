package unit1;

import java.util.Scanner;

/**
 * Description: Calculates carpet dimensions and price <br> 
 * 
 * Date: Oct 9, 2024 <br>
 * @author Alexander Guntayon
 */
public class Carpet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the width in meters");
		int width = sc.nextInt();
		System.out.println("Type the Length in meters");
		int length = sc.nextInt();
		System.out.println("Type the price for square meter");
		int price = sc.nextInt();
	
		
		System.out.println("The carpet costs $" + (width*length*price));
	}

}
