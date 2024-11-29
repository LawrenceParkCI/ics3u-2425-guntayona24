package unit1;
/**
 * Description: This program is a simple bingo game <br>
 * Date: September 20 <br>
 * @author Alexander Guntayon
 */
public class Bingo_Game {

	public static void main(String[] args) {
		//The Rules
		System.out.printf("%10s %10s","","Your Bingo Card \n");
		System.out.println("Rules:");
		System.out.println("1. Bingo Caller calls out a random number");
		System.out.println("2. Once you hear the number, search for it in your card");
		System.out.println("3. If it is on your card, circle it");
		System.out.println("4. Repeat the 3 steps, until the circle of bingo numbers make a \n complete horizontal, vertical, or diagnonal line across the card.");
		System.out.println("5. Once step 4 happens, yell out \"BINGO\"");
		System.out.println();
		System.out.println();
		//The bingo card
		System.out.printf("%4s %1s", "", "__________________________________________ \n");
		System.out.printf("%5s %6s %1s %1s %1s %1s %8s","|", "B\t", "I\t", "N\t", "G\t", "O", "| \n\n");
		System.out.printf("%5s %7s %1s %1s %1s %1s %7s","|", "12\t", "16\t", "34\t", "50\t", "70","| \n\n");
		System.out.printf("%5s %7s %1s %1s %1s %1s %7s","|", "7\t", "30\t", "32\t", "59\t", "72", "| \n\n");
		System.out.printf("%5s %7s %1s %9s %1s %1s %7s","|", "8\t", "15", "FREE\t", "49\t", "62", "| \n\n");
		System.out.printf("%5s %7s %1s %1s %1s %1s %7s","|", "1\t", "27\t", "42\t", "55\t", "65", "| \n\n");
		System.out.printf("%5s %7s %1s %1s %1s %1s %7s","|", "2\t", "22\t", "40\t", "41\t", "69", "| \n\n");
		System.out.printf("%48s","____________________________________________");
	}
}
