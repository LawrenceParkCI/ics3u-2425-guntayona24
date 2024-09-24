package unit1;
/**
 * Description: This program prints info about me <br>
 * Date: September 20 <br>
 * @author Alexander Guntayon
 */


public class About_Me {

	public static void main(String[] args) {
		//Prints info about me
		System.out.println("INFORMATION:");
		System.out.println("______________________________");
		System.out.println("Name: Alexander");
		System.out.println("Grade: 11");
		System.out.println("Teacher: Ms. Kemp");
		System.out.println("School: Lawrence Park CI");
		System.out.println("\"Go Pathers\"");
		System.out.println("______________________________");
		System.out.println("Schedule Sept 23");
		System.out.println("__________________________________________________");
		System.out.printf("%1s %1s %14s", "Day 1:", "Monday", "Time\n");
		System.out.printf("%16s %19s", "Period 1:", "9:00 - 10:15 am \n");
		System.out.printf("%16s %19s", "Period 2:", "10:20 - 11:40 am \n");
		System.out.printf("%15s %19s", "Period 3:", "12:40 - 1:55 pm \n");
		System.out.printf("%16s %19s", "Period 4:", "2:00 - 3:15 pm \n");
		
		
		System.out.printf("%-1s %-12s %-1s %-15s","Day 2:", "Tuesday", "Time:", "9:00 am \n");
		//System.out.printf("Day 1: %-17sTime: %8s", "Wednesday", "9:55 am \n");
		//System.out.printf("Day 2: %-17sTime: %8s", "Thursday", "9:00 am \n");
		//System.out.printf("Day 1: %-17sTime: %8s", "Friday", "9:00 am \n");
	}

}
