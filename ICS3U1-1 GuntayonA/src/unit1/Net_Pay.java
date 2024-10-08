package unit1;
/**
 * Description: Calculates net pay <br>
 * 
 * Date: Oct 7, 2024 <br>
 * @author Alexander Guntayon
 */

public class Net_Pay {

	public static void main(String[] args) {
		//Employee Variables
		int hours = 40;
		double wage = 5.00;	
		double insurance = 2.00;
		double tax = 0.22;
		//Calculates Employee net pay
		var netPay = (hours*wage-insurance) - tax*(hours*wage-insurance);
		System.out.println("The net pay of this employee is $" + netPay);

	}

}
