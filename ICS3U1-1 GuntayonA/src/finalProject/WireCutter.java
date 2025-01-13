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
	
	static Console c = new Console(50, 1000); // Main console that displays wires, and restartScreen
	static Console c2 = new Console(2, 10); // Input/output console
	
	public static void main(String[] args) {
		
		int badWire = wires((int)(Math.random() * 10) + 1); // Calls the wires function, and gives the randWire parameter a random number to assign the bad wire
		System.out.println(badWire);


	}

	
	// ADD DESCRIPTION
	public static int wires(int randWire) {
		
		int[] wiresCutList = new int[9]; //COME BACK HERE
		
		
		
		
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
			
			cut = c2.readInt();
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
			default:
				c2.print("Please try again");
			} 
			
			if (cut != randWire && cut <= 10 && cut >= 1) { // Checks if user cuts the correct wire to add points to score
				int wireValueCheck;
				for (int i = 0; i <= wiresCutList.length; i ++) {
					wireValueCheck = wiresCutList[i];
					if (wireValueCheck == 0) {
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
				System.out.println("you cut this wire " + wiresCutList[wiresCutCurrently]); // TODO make a loop to check
				
			// HERE MAKE A LOOP TO CHECK FOR DUPE NUMBERS
			if (wiresCutList[8] != 0 && cut != randWire && cut <= 10 && cut >= 1) { // Checks in the list if the 2nd last wire is a valid number, to check if the user cut all the good wires
				System.out.println("You reached the end of the list");
				c2.print("You win");
				winGameCheck = true; // User wins the game
				restartScreen(winGameCheck);
				}	
			else {
				c2.clear(); // Clears the input/output console, not the graphics console
			}
			
			
		} while (cut != randWire); // Loops while the bad wire wasn't cut, or if all the good wires weren't cut
		
		
		if (cut == randWire) { // When user cuts the wrong wire
			c2.print("game over");
			winGameCheck = false; // User loses the game
			restartScreen(winGameCheck);
		}	
		
		int [] wireList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int badWire = wireList[randWire];
		return badWire;
	}
	
	public static int restartScreen(boolean winCheck) {
		// Images
		 BufferedImage explosionJpg = null;
		 BufferedImage confettiPng = null;
		
		 try {
			explosionJpg = ImageIO.read(new File ("src/finalProjectPictures/Explosion.jpg"));
			confettiPng = ImageIO.read(new File ("src/finalProjectPictures/ConfettiWIn.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		c.clear();
		
		c.setColor(new Color(150, 220, 255));
		c.setFont(new Font("MonoSpaced", Font.BOLD, 30));
		if (winCheck == true) {
			c.fillRect(35, 32, 400, 140);
			c.drawImage (confettiPng, -200, -300, 2500, 1500, null);
		}
		else {
			System.out.println("lose");
			c.drawImage (explosionJpg, -200, -300, 2500, 1500, null);
			c.setColor(new Color(0, 0, 0));
			c.drawString("The bomb exploded!", 700, 320);
			c.drawString("Restart? {Yes or No)", 700, 420);
			c.fillRect(600, 250, 600, 340);
		}
		return 0;1
		
	}
	
	public static int score(int wireCutAmount) {
		// MAKE AN ARRAY FOR THIS TOIDO
		int [] playerScore = {0, 5, 10, 20, 35, 55, 80, 110, 150, 200}; // Array with specific scores for each wire cut
		int playerScoreChosen = playerScore[wireCutAmount];
		return playerScoreChosen;
	}
}
