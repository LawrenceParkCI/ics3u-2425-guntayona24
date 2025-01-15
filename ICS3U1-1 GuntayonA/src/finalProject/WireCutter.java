package finalProject;

import hsa_new.Console;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class WireCutter {
	/**
	 * Description:
	 * Date: Jan 7 2024
	 * @author Alexander Guntayon
	*/
	
	// Consoles
	static Console c = new Console(50, 1000); // Main console that displays wires, and restartScreen
	static Console c2 = new Console(6, 50); // Input/output console
	
	// Images
	static BufferedImage explosionJpg = null;
	static BufferedImage confettiPng = null;
	
	public static void main(String[] args) {
		// Images
		 try {
			explosionJpg = ImageIO.read(new File ("src/finalProjectPictures/Explosion.jpg")); // TODO Change this image
			confettiPng = ImageIO.read(new File ("src/finalProjectPictures/ConfettiWIn.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		 
		 do {
			 intermission();
			 int badWire = wires((int)(Math.random() * 10) + 1); // Calls the wires function, and gives the randWire parameter a random number to assign the bad wire
			 System.out.println(badWire);
		 } while (restartScreen(false) == true); // Parameter of restartScreen doesn't matter, it has to be filled to get the return value to see if user restarts game

	}

	
	// ADD DESCRIPTION
	public static int wires(int randWire) {
		
		int[] wiresCutList = new int[9]; // A new list that will store the wires that were cut by the user
		
		
		
		
		System.out.println(randWire);
		
		int cut = 0; // Stores the int of what wire was cut
		int wireCutAmount = 0; // The number of good wires cut
		int wiresCutCurrently = -1;
		boolean winGameCheck = false; // Checks if user wins game
		
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
			
			boolean outOfBoundsCheck = false;
			boolean alreadyCutWireCheck = false;
			
			if (cut != randWire && cut <= 10 && cut >= 1) { // Checks if user cuts the correct wire to add points to the score
				int wireValueCheck;
				for (int i = 0; i <= wiresCutList.length; i ++) {
					wireValueCheck = wiresCutList[i];
					if (wireValueCheck == cut) { // If user attempts to cut wire that was already cut, console informs player of mistake
						wiresCutCurrently -= 1; // Prevents wiresCutCurrently increasing when typing invalid number
						c2.print("You already cut this wire! Choose another!");
						
						try {
							  Thread.sleep(1000);
							} catch (InterruptedException e) {
							  Thread.currentThread().interrupt();
							};
							
						alreadyCutWireCheck = true;
						break;
					}
					
					else if (wireValueCheck == 0) {
						wireCutAmount += 1;
						System.out.println((score(wireCutAmount))); // Gets the value of wireCutAmount and uses it as an index to get a score from the score list
						c.setColor(new Color(150, 220, 255));
						c.fillRect(35, 32, 400, 140);
						break;
					}
				}
					
				}
				wiresCutCurrently += 1;
				wiresCutList[wiresCutCurrently] = cut;
				
			if (wiresCutList[8] != 0 && cut != randWire && cut <= 10 && cut >= 1) { // Checks in the list if the 2nd last wire is a valid number, to check if the user cut all the good wires
				System.out.println("You reached the end of the list");
				c2.print("You win");
				winGameCheck = true; // User wins the game
				restartScreen(winGameCheck);
				}	
			else if (!(cut <= 10 && cut >= 1)) { // If user cuts a wire that's out of bounds (ex: 15), console informs user of mistake
				c2.print("This wire is out of bounds! Choose another!");
				wiresCutCurrently -= 1; // Prevents wiresCutCurrently increasing when typing invalid number
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					};
					
				c2.clear();
			}
			else {
				c2.clear(); // Clears the input/output console, not the graphics console
			}
			
			
		} while (cut != randWire); // Loops while the bad wire wasn't cut, or if all the good wires weren't cut
		
		
		if (cut == randWire) { // When user cuts the wrong wire
			c2.print("game over");
			winGameCheck = false; // User loses the game
			c.drawImage (explosionJpg, -200, -300, 2500, 1500, null);
			try {
				  Thread.sleep(1000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();
				}
			
			c.setColor(new Color(000, 200, 213));
			c.fillRect(600, 250, 600, 340);
			
			c.setFont(new Font("MonoSpaced", Font.BOLD, 50));
			c.setColor(new Color(0, 0, 0));
			c.drawString("Total Points: " + score(wireCutAmount), 655, 420);
			
			try {
				  Thread.sleep(3000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();
				}
			restartScreen(winGameCheck);
		}	
		
		int [] wireList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int badWire = wireList[randWire];
		return badWire;
	}
	
	public static boolean restartScreen(boolean winCheck) {
		c.clear();
		c2.clear();
		
		boolean restartMainMethod = false;
		
		c.setColor(new Color(150, 220, 255));
		c.setFont(new Font("MonoSpaced", Font.BOLD, 40));
		if (winCheck == true) {
			c.fillRect(35, 32, 400, 140);
			c.drawImage (confettiPng, -200, -300, 2500, 1500, null);
		}
		else {
			System.out.println("lose");
			c.drawImage (explosionJpg, -200, -300, 2500, 1500, null);
			c.fillRect(600, 250, 600, 340);
			c.drawString("The bomb exploded!", 685, 360);
			c.setColor(new Color(0, 0, 0));
			c.drawString("The bomb exploded!", 685, 360);
			c.drawString("Restart? (Yes or No)", 675, 460);
			
			c2.print("Type \"Yes\" or \"No\": ");
			
			String restartCheck = c2.readString();
			
			if (restartCheck.equalsIgnoreCase("yes")){
				restartMainMethod = true;
				c.clear();
				c2.clear();
			}
			else if (restartCheck.equalsIgnoreCase("no")){
				c.setColor(new Color(150, 220, 255));
				c.fillRect(600, 250, 600, 340);
				c.setColor(new Color(0, 0, 0));
				c.drawString("Thanks for playing!", 685, 360);
				try {
					  Thread.sleep(2000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				restartMainMethod = true;
				c.close();
				c2.close();
			}
		}
		
		return restartMainMethod;
		
	}
	
	public static int score(int wireCutAmount) {
		int [] playerScore = {0, 5, 10, 20, 35, 55, 80, 110, 150, 200}; // Array with specific scores for each wire cut
		int playerScoreChosen = playerScore[wireCutAmount];
		return playerScoreChosen;
	}
	
	public static boolean startScreen(boolean startCheck) {
		int c2.readInt();
		return true;
	}
	
	public static boolean intermission() {
		c.setFont(new Font("MonoSpaced", Font.BOLD, 60));
		c.setColor(new Color(150, 220, 255));
		c.fillRect(600, 250, 600, 340);
		c.setColor(new Color(0, 0, 0));
		c.drawString("Get Ready!", 715, 430);
		
		try {
			  Thread.sleep(2000);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();
			}
		
		c.setColor(new Color(150, 220, 255));
		c.fillRect(600, 250, 600, 340);
		c.setColor(new Color(0, 0, 0));
		c.drawString("3", 865, 440);
		
		try {
			  Thread.sleep(1000);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();
			}
		
		c.setColor(new Color(150, 220, 255));
		c.fillRect(600, 250, 600, 340);
		c.setColor(new Color(0, 0, 0));
		c.drawString("2", 865, 440);
		
		try {
			  Thread.sleep(1000);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();
			}
		
		c.setColor(new Color(150, 220, 255));
		c.fillRect(600, 250, 600, 340);
		c.setColor(new Color(0, 0, 0));
		c.drawString("1", 865, 440);
		
		try {
			  Thread.sleep(1000);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();
			}
		
		c.setColor(new Color(150, 220, 255));
		c.fillRect(600, 250, 600, 340);
		c.setColor(new Color(0, 0, 0));
		c.drawString("GO!", 865, 440);
		
		try {
			  Thread.sleep(1000);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();
			}
		c.clear();
		return true;
	}
	
}

