package unit1;
/**
* Description: NFOutput worksheet
* Date: Oct 17 2024
* @author Alexander Guntayon
*/

import java.text.NumberFormat;
import java.util.Scanner;

public class NFOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double TAX_RATE = 0.13;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);
		System.out.println("The cost of your item with tax is " + money.format(total));
		System.out.println("The tax rate is " + percent.format(TAX_RATE));
		
		//How can you change how your value is displayed?
		//getCurrencyInstance and getPercentInstance
		
		//What other formats does NumberFormat offer?

		//NumberFormat.getAvailableLocales();
		//NumberFormat.getCompactNumberInstance(null, null);
		//NumberFormat.getIntegerInstance()
		

		sc.close();
	}

}
