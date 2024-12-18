package unit1;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
* Description: Code prompts user for the cost and amount of 2 items, and puts them onto a receipt
* Date: Oct 23 2024
* 
* @author Alexander Guntayon
**/
public class GroceryShopping {


	/**
	* This is the entry point to the program.
	* @param args unused
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		final double tax = 0.13; //The standard tax
		
		//NumberFormat money = NumberFormat.getCurrencyInstance();
		DecimalFormat money = new DecimalFormat("##0.00");		
		DecimalFormat couponPercentage = new DecimalFormat("##0.##");	
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		

		System.out.println("|| $$$ \\\\\\ ========== \"Alexander's Grocery\" ========== /// $$$ ||");
		System.out.println();
		
		//Prompting buying for item, price, and amount
		System.out.printf("%20s", "Item 1: \n");
		System.out.print("What do you want to buy today?: ");
		String item = sc.next();

		
		System.out.print("How much does it cost?: ");
		double cost = sc.nextDouble();
		cost = Math.round(cost * 20) / 20.0; //This line rounds the cost to the nearest 0.05 cents
		
		System.out.print("How many will you buy?: ");
		int amount = sc.nextInt();

		
		System.out.println();

		//Prompting buying for item, price, and amount (2nd item)
		System.out.printf("%20s", "Item 2: \n");
		System.out.print("What do you want to buy today?: ");
		String item2 = sc.next();

		
		System.out.print("How much does it cost?: ");
		double cost2 = sc.nextDouble();
		cost2 = Math.round(cost * 20) / 20.0; //This line rounds the cost2 to the nearest 0.05 cents
		
		System.out.print("How many will you buy?: ");
		int amount2 = sc.nextInt();
		
		//Coupon (extra feature)
		System.out.println();
		System.out.print("What is your coupon in %? (0% if you dont): ");
		double coupon = sc.nextDouble();
		double couponConvert = coupon/100; //Converts the coupon whole numbered into a usable decimal number
		
		
		//calculates first items total 
		double totalAmount = (amount * cost);
		
		
		//calculates Second items total
		double totalAmount2 = (amount2 * cost2);
		
		//calculates tax
		double totalTax = (tax * (totalAmount + totalAmount2));
		
		//subtotal of both items (no tax)
		double subtotal = (totalAmount + totalAmount2);
		
		//total of both items plus their tax
		double total = totalTax + subtotal;
		System.out.println(total);
		
		//calculates money saved with coupon
		double moneySaved = couponConvert * total;
		moneySaved = Math.round(moneySaved * 20) / 20.0; //This line rounds the money that the coupon saved to the nearest 0.05 cents
		
		//calculates total with coupon
		double newTotal = total - (moneySaved);

		

		//Prints out a formatted receipt
		System.out.printf("%70s", "This is your printed receipt \n \n \n \n \n");
   		System.out.printf("%58s","Alexander's Grocery \n \n");
    	System.out.printf("%43s \n", dateTimeFormatter.format(LocalDateTime.now()));
		System.out.printf("%70s", "Item      |  Price  | Quant. | Total Price \r \n");
		System.out.printf("%69s", "-------------------------------------------- \n");
		System.out.printf("%31s   | %6s  | %4s   | %7s \n", item, money.format(cost), amount, money.format(totalAmount));
		System.out.printf("%31s   | %6s  | %4s   | %7s \n", item2, money.format(cost2), amount2, money.format(totalAmount2));
		System.out.printf("%69s", "-------------------------------------------- \n");
		System.out.printf("%55s %10s \n", "Subtotal: $", money.format(subtotal));
		System.out.printf("%55s %10s \n", "Tax: $", money.format(totalTax));
		System.out.printf("%55s %10s \n", "Total: $", money.format(total));
		System.out.printf("%55s %10s \n", "Coupon: %", couponPercentage.format(coupon));
		System.out.printf("%55s %5s %1s \n", "Discounted: $", "-", money.format(moneySaved));
		System.out.printf("%55s %10s \n \n", "New Total: $", money.format(newTotal)); //If the user has a coupon, it's discounted
		
		//Rounds up the newTotal to nearest whole number
		long newTotalRounded = Math.round(newTotal);
		System.out.printf("%50s \n", "This purchase was around $" + newTotalRounded);
    	System.out.printf("%69s", "Thank you for shopping at Alexander's Grocery!");
	}

	private static void close() {
		// TODO Auto-generated method stub
			
	}

}
