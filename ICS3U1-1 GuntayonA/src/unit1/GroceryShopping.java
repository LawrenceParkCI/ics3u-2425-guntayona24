package unit1;

import java.util.Scanner;

/**
* Description: Grocery Shopping
* Date: Oct 17 2024
* @author Alexander Guntayon
*/
public class GroceryShopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		final double tax = 0.13;
		//Title
		System.out.println("|| $$$ \\\\\\ ========== \"Alexander's Grocery\" ========== /// $$$ ||");
		System.out.println();
		
		System.out.printf("%20s", "Item 1: \n");
		System.out.print("What do you want to buy today?: ");
		String item = sc.nextLine();

		
		System.out.print("How much does it cost?: ");
		double cost = sc.nextDouble();
		
		
		System.out.print("How many will you buy?: ");
		int amount = sc.nextInt();

		var total_amount = (amount * cost);
		var total_amount_plus_tax = (total_amount + (total_amount * tax));

		
		System.out.println();

		System.out.printf("%20s", "Item 2: \n");
		System.out.print("What do you want to buy today?: ");
		String item2 = sc.nextLine();
		
		System.out.print("How much does it cost?: ");
		double cost2 = sc.nextDouble();
		
		
		System.out.print("How many will you buy?: ");
		int amount2 = sc.nextInt();

		var total_amount2 = (amount2 * cost2);
		var total_amount_plus_tax2 = (total_amount2 + (total_amount2 * tax));
		
		
		System.out.println("This is your printed receipt");
		System.out.println("Item      |  Price  | Quant. | Total Price \r\n");
		System.out.println("------------------------------------------");
		System.out.println(item, cost, total_amount_plus_tax);

	}

}
