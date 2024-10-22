package unit1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
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
		//NumberFormat money = NumberFormat.getCurrencyInstance();
		DecimalFormat money = new DecimalFormat("##0.00");		
		
		
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
		
		//Coupon (extra feature)
		System.out.println();
		System.out.print("What is your coupon in %? (0% if you dont): ");
		double coupon = sc.nextDouble();
		double couponConvert = coupon/100;
		
		
		//calculates first item
		var total_amount = (amount * cost);
		
		
		//calculates Second item
		var total_amount2 = (amount2 * cost2);
		
		//calculates tax
		var total_tax = (tax * (total_amount + total_amount2));
		
		//subtotal of both items (no tax)
		var subtotal = (total_amount + total_amount2);
		
		//total of both items plus their tax
		double total = total_tax + subtotal;
		System.out.println(total);
		
		//calculates money saved with coupon
		double money_saved = couponConvert * total;
		
		//calculates total with coupon
		double new_total = total - (money_saved);

		

		
		System.out.printf("%60s", "This is your printed receipt \n");
		System.out.printf("%70s", "Item      |  Price  | Quant. | Total Price \r \n");
		System.out.printf("%68s", "------------------------------------------ \n");
		System.out.printf("%31s   | %6s  | %4s   | %7s \n", item, money.format(cost), amount, money.format(total_amount));
		System.out.printf("%31s   | %6s  | %4s   | %7s \n", item2, money.format(cost2), amount2, money.format(total_amount2));
		System.out.printf("%68s", "------------------------------------------ \n");
		System.out.printf("%55s %10s \n", "Subtotal: $", money.format(subtotal));
		System.out.printf("%55s %10s \n", "Tax: $", money.format(total_tax));
		System.out.printf("%55s %10s \n", "Total: $", money.format(total));
		System.out.printf("%55s %10s \n", "Coupon: %", (coupon));
		System.out.printf("%55s %1s %1s \n", "Saved: $", "-", money.format(money_saved));
		System.out.printf("%55s %10s \n", "New Total: $", money.format(new_total));
		
		//Rounds up the new_total
		long new_total_rounded = Math.round(new_total);
		System.out.println("This purchase was around $" + new_total_rounded);
	}

	private static void close() {
		// TODO Auto-generated method stub
		
	}

}
