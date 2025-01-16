package finalProject;

import hsa_new.Console;


import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


import javax.imageio.ImageIO;


/**
 * Description: A short game, that prompts user to defuse a bomb by cutting wires
 * Date: Jan 16 2024
 * @author Alexander Guntayon
*/


public class WireCutter {


	
	// Checks if user wins game
	static boolean winGameCheck = false;
	
	// Consoles
	static Console c = new Console(50, 1000); // Main console that displays wires, and restartScreen
	static Console c2 = new Console(6, 50); // Input/output console
	
	// Images
	static BufferedImage explosionPng = null;
	static BufferedImage confettiPng = null;
	
	// Boolean to check for game restarts
	static boolean gameRestartBoolCheck = false; 
	
	/**
	* This is the entry point to the program.
	* @param args unused
	*/
	public static void main(String[] args) {
		// Images
		 try {
			explosionPng = ImageIO.read(new File ("src/finalProjectPictures/explosion.png"));
			confettiPng = ImageIO.read(new File ("src/finalProjectPictures/ConfettiWIn.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		 
		 do {
			 gameRestartBoolCheck = false; // Resets gameRestartBoolCheck
			 intermission();
			 int badWire = wires((int)(Math.random() * 10) + 1); // Calls the wires function, and gives the randWire parameter a random number to assign as the bad wire
			 System.out.println(badWire);
		 } while (gameRestartBoolCheck == true); // Parameter of restartScreen doesn't matter, it has to be filled to get the return value to see if user restarts game


	}
	
	  /**
	  (Description: Method for pausing program)
	  @param milliseconds -> amounts of milliseconds paused
	  @return None
	  */
	public static void sleep(int milliseconds) {
	    try {
	        Thread.sleep(milliseconds);
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt(); // Maintain interrupted status
	    }
	}
	
	  /**
	  (Description: Handles wire graphics, and most of the wire logic)
	  @param randWire -> The random wire that will be chosen to become the bad wire
	  @return The number of the bad wire
	  */
	public static int wires(int randWire) {
		
		int[] wiresCutList = new int[10]; // A new list that will store the wires that were cut by the user
		
		
		
		
		int cut = 0; // Stores the int of what wire was cut
		int wireCutAmount = 0; // The number of good wires cut
		int wiresCutCurrently = -1;
		winGameCheck = false;
		
		// Background in game
		c.setColor(new Color(239, 230, 210));
		c.fillRect(0, 0, 10000, 10000);

		
		// Wire Graphics
		c.setColor(new Color(0, 0, 255));
		c.fillRect(450, 100, 1000, 25);
		c.setColor(new Color(255, 0, 0));
		c.fillRect(450, 175, 1000, 25);
		c.setColor(new Color(255, 100, 170));
		c.fillRect(450, 250, 1000, 25);
		c.setColor(new Color(255, 150, 0));
		c.fillRect(450, 325, 1000, 25);
		c.setColor(new Color(255, 215, 0));
		c.fillRect(450, 400, 1000, 25);
		c.setColor(new Color(0, 0, 0));
		c.fillRect(450, 475, 1000, 25);
		c.setColor(new Color(0, 200, 255));
		c.fillRect(450, 550, 1000, 25);
		c.setColor(new Color(170, 0, 255));
		c.fillRect(450, 625, 1000, 25);
		c.setColor(new Color(0, 255, 0));
		c.fillRect(450, 700, 1000, 25);
		c.setColor(new Color(150, 150, 150));
		c.fillRect(450, 775, 1000, 25);
		
		c.setColor(new Color(150, 220, 255));
		c.fillRect(35, 32, 400, 140);
		
		// Numbers Graphics for the wires
		
		c.setColor(new Color(0, 0, 0));
		c.setFont(new Font("MonoSpaced", Font.BOLD, 30));
		c.drawString("1", 1460, 120);
		c.drawString("2", 1460, 195);
		c.drawString("3", 1460, 270);
		c.drawString("4", 1460, 345);
		c.drawString("5", 1460, 420);
		c.drawString("6", 1460, 495);
		c.drawString("7", 1460, 570);
		c.drawString("8", 1460, 645);
		c.drawString("9", 1460, 720);
		c.drawString("10", 1460, 795);
		


		
		do {
			c.setColor(new Color(0, 0, 0));
			
			c.setFont(new Font("MonoSpaced", Font.BOLD, 40));
			c.drawString("Your Score: " + score(wireCutAmount), 70, 100); // Presents score on the top left of screen
			
			c.setColor(new Color(255, 255, 255));
			
			c2.print("Type a wire number to cut it: ");
			cut = c2.readInt();
			
			// Switch case for cutting the wires (makes a cut in the middle of the chosen wire)
			switch(cut) {
			case 1:
				c.fillRect(750, 100, 350, 25);
				break;
			case 2:
				c.fillRect(750, 175, 350, 25);
				break;
			case 3:
				c.fillRect(750, 250, 350, 25);
				break;
			case 4:
				c.fillRect(750, 325, 350, 25);
				break;
			case 5:
				c.fillRect(750, 400, 350, 25);
				break;
			case 6:
				c.fillRect(750, 475, 350, 25);
				break;
			case 7:
				c.fillRect(750, 550, 350, 25);
				break;
			case 8:
				c.fillRect(750, 625, 350, 25);
				break;
			case 9:
				c.fillRect(750, 700, 350, 25);
				break;
			case 10:
				c.fillRect(750, 775, 350, 25);
				break;
			} 
			


			if (cut != randWire && cut <= 10 && cut >= 1) { // Checks if user cuts the correct wire to add points to the score
				int wireValueCheck;
				for (int i = 0; i < wiresCutList.length; i ++) {
					wireValueCheck = wiresCutList[i];
					if (wireValueCheck == cut) { // If user attempts to cut wire that was already cut, console informs player of mistake
						wiresCutCurrently -= 1; // Prevents wiresCutCurrently increasing when typing invalid number
						c2.print("You already cut this wire! Choose another!");


						sleep(1000);


						break;
					}
					
					else if (wireValueCheck == 0) {
						wireCutAmount += 1;
						
						// Regenerates rectangle for score
						c.setColor(new Color(150, 220, 255));
						c.fillRect(35, 32, 400, 140);
						
						break;
					}
				}
					
				}
				wiresCutCurrently += 1;
				wiresCutList[wiresCutCurrently] = cut;
				
			if (wiresCutList[8] != 0 && cut != randWire && cut <= 10 && cut >= 1) { // Checks in the list if the 2nd last wire is a valid number, to check if the user cut all the good wires
				c2.print("You win!");
				winGameCheck = true; // User wins the game
				c.drawImage (confettiPng, -200, -300, 2500, 1500, null);
				
				sleep(1000);
				
				c.setColor(new Color(000, 200, 40));
				c.fillRect(600, 250, 600, 340);
				
				c.setFont(new Font("MonoSpaced", Font.BOLD, 50));
				c.setColor(new Color(0, 0, 0));
				c.drawString("Total Points: " + score(wireCutAmount), 655, 420);  // Gets the value of wireCutAmount and uses it as an index to get a score from the score list
				
				sleep(3000);
				restartScreen(true);
				
				}	
			else if (!(cut <= 10 && cut >= 1)) { // If user cuts a wire that's out of bounds (ex: 15), console informs user of mistake
				c2.print("This wire is out of bounds! Choose another!");
				wiresCutCurrently -= 1; // Prevents wiresCutCurrently increasing when typing invalid number
				
				sleep(1000);
					
				c2.clear();
			}
			else {
				c2.clear(); // Clears the input/output console, not the graphics console
			}
			
			
		} while (cut != randWire); // Loops while the bad wire wasn't cut, or if all the good wires weren't cut
		
		
		if (cut == randWire) { // When user cuts the wrong wire
			c2.print("Game over!");
			winGameCheck = false; // User loses the game
			c.drawImage (explosionPng, 240, -250, 1500, 1500, null);
			
			sleep(1000);


			c.setColor(new Color(000, 200, 213));
			c.fillRect(600, 250, 600, 340);
			
			c.setFont(new Font("MonoSpaced", Font.BOLD, 50));
			c.setColor(new Color(0, 0, 0));
			c.drawString("Total Points: " + score(wireCutAmount), 655, 420);
			
			sleep(3000);
		
			restartScreen(false);
		}	
		
		int [] wireList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		int badWire = wireList[randWire];
		return badWire;
	}
	
	  /**
	  (Description: Displays restart/congratulation screen based on if user wins or loses)
	  @param winCheck -> Checks if the user wins the game
	  @return true of false if user restarts game
	  */
	public static boolean restartScreen(boolean winCheck) {
		c.clear();
		c2.clear();
		
		boolean restartMainMethod = false;
		
		c.setFont(new Font("MonoSpaced", Font.BOLD, 40));
		
		if (winCheck == true) { // If user wins game, they are congratulated, and the game automatically quit
			c.drawImage(confettiPng, -200, -300, 2500, 1500, null);
			c.setColor(new Color(10, 255, 40));
			c.fillRect(600, 250, 600, 340);
			c.setColor(new Color(0, 0, 0));
			c.drawString("You defused the bomb!", 655, 360);
			c.drawString("You completed the game!", 645, 460);
			
			sleep(4000);
			
			c.clear();
			
			c.drawString("Thanks For Playing", 675, 360);
			c.drawString("(Will exit shortly)", 665, 460);
			sleep(3000);
			
			System.exit(0);
			
		}
		else { // If user loses game, they are prompted to leave or restart the game
			c.setColor(new Color(150, 220, 255));
			c.fillRect(600, 250, 600, 340);
			c.setColor(new Color(0, 0, 0));
			c.drawString("The bomb exploded!", 685, 360);
			c.drawString("Restart? (Yes or No)", 675, 460);
			
			boolean loopCheck = false;
			String restartCheck;
			
			do {
				
				loopCheck = false;
				
				c2.print("Type \"Yes\" or \"No\": ");
				
				restartCheck = c2.readString().trim().toLowerCase();
				
				// Prompts user a restart
				if (restartCheck.equalsIgnoreCase("yes")){ // Replays game
					restartMainMethod = true;
					c.clear();
					c2.clear();
					gameRestartBoolCheck = true;
				}
				else if (restartCheck.equalsIgnoreCase("no")){ // Thanks user for playing, and quits game
					c.setColor(new Color(150, 220, 255));
					c.fillRect(600, 250, 600, 340);
					c.setColor(new Color(0, 0, 0));
					c.drawString("Thanks for playing!", 685, 390);
					c.drawString("Try again next time!", 685, 470);
					
					sleep(2000);
		
					restartMainMethod = false;
					System.exit(0);
				}
				
				else { // When user enters invalid string
					c2.clear();
					loopCheck = true;
					c2.println("Please input a valid answer");
					sleep(1500);
					c2.clear();
				}
			} while (loopCheck == true);
		}
		
		
		return restartMainMethod;
		
	}
	
	  /**
	  (Description: Handles the points system)
	  @param wireCutAmount-> The amount of wires cut
	  @return The player score
	  */
	public static int score(int wireCutAmount) {
		int [] playerScore = {0, 5, 10, 20, 35, 55, 80, 110, 150, 200}; // Array with specific scores for each wire cut
		int playerScoreChosen = playerScore[wireCutAmount];
		return playerScoreChosen;
	}
	
	  /**
	  (Description: Displays intermission graphics, which include a countdown, from 3 to 1, and finally calling the wires function at the end.)
	  @param wireCutAmount-> None
	  @return true after completing the intermission sequence.
	  */
	public static boolean intermission() {
		c.clear();
		c2.clear();
		
		c.setFont(new Font("MonoSpaced", Font.BOLD, 60));
		c.setColor(new Color(150, 220, 255));
		c.fillRect(600, 250, 600, 340);
		c.setColor(new Color(0, 0, 0));
		c.drawString("Get Ready!", 715, 430);
		
		sleep(5000);
		
		c.setColor(new Color(150, 220, 255));
		c.fillRect(600, 250, 600, 340);
		c.setColor(new Color(0, 0, 0));
		c.drawString("3", 865, 440);
		
		sleep(1000);


		c.setColor(new Color(150, 220, 255));
		c.fillRect(600, 250, 600, 340);
		c.setColor(new Color(0, 0, 0));
		c.drawString("2", 865, 440);
		
		sleep(1000);
		
		c.setColor(new Color(150, 220, 255));
		c.fillRect(600, 250, 600, 340);
		c.setColor(new Color(0, 0, 0));
		c.drawString("1", 865, 440);


		sleep(1000);
		
		c.setColor(new Color(150, 220, 255));
		c.fillRect(600, 250, 600, 340);
		c.setColor(new Color(0, 0, 0));
		c.drawString("GO!", 865, 440);
		
		sleep(1000);
		
		c.clear();
		c2.clear();


		return true;
	}
	
}


