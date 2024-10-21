package unit1;

import java.util.Scanner;

/**
* Description: Code asks user
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
		
		//Prompting buying for item, price, and amount
		System.out.printf("%20s", "Item 1: \n");
		System.out.print("What do you want to buy today?: ");
		String item = sc.next();

		
		System.out.print("How much does it cost?: ");
		double cost = sc.nextDouble();
		
		
		System.out.print("How many will you buy?: ");
		int amount = sc.nextInt();

		
		System.out.println();

		//Prompting buying for item, price, and amount (2nd item)
		System.out.printf("%20s", "Item 2: \n");
		System.out.print("What do you want to buy today?: ");
		String item2 = sc.next();

		
		System.out.print("How much does it cost?: ");
		double cost2 = sc.nextDouble();
		
		
		System.out.print("How many will you buy?: ");
		int amount2 = sc.nextInt();

		//Type Casting Cost and Amount
		//double costDouble = Double.parseDouble(cost);
		//int amountInt = Integer.parseInt(amount);
		
		//calculates first item
		var total_amount = (amount * cost);
		var total_amount_plus_tax = (total_amount + (total_amount * tax));
		
		
		//calculates Second item
		var total_amount2 = (amount2 * cost2);
		var total_amount_plus_tax2 = (total_amount2 + (total_amount2 * tax));
		
		//subtotal of both items (no tax)
		var subtotal = (total_amount + total_amount2);
		
		//Coupon (extra feature)
		
		System.out.printf("%60s", "This is your printed receipt \n");
		System.out.printf("%70s", "Item      |  Price  | Quant. | Total Price \r \n");
		System.out.printf("%68s", "------------------------------------------ \n");
		System.out.printf("%30s    | %6s  | %8s %13s \n", item, cost, amount, total_amount);
		System.out.printf("%30s %9s %8s %13s \n", item2, cost2, amount2, total_amount2);
		System.out.printf("%68s", "------------------------------------------ \n");
		System.out.printf("%50s %-1s \n", "Subtotal: $", subtotal);

	}

	private static void close() {
		// TODO Auto-generated method stub
		
	}

}
