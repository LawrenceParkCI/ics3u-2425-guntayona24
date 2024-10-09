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
		String width = sc.nextLine();
		System.out.println("Type the Length in meters");
		String length = sc.nextLine();
		System.out.println("Type the price for square meter");
		String price = sc.nextLine();
	
		
		Double carpetCost = (double)(width * length * price);

	}

}
