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

	public static void main(String[] args) {
		
		
		 
		 
		 
		int badWire = wires((int)(Math.random() * 10) + 1);
		// System.out.println(badWire);

		Scanner sc = new Scanner(System.in);


	}

	public static int wires(int randWire) {
		Console c = new Console(50, 1000); // Wires console
		Console c2 = new Console(2, 10); // Input/output console
		
		// Images
		 BufferedImage explosionJpg = null;
		
		 try {
			explosionJpg = ImageIO.read(new File ("src/finalProjectPictures/Explosion.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		int cut; // Stores the int of what wire was cut
		int wireCutAmount = 0; // The number of good wires cut
		
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
		
		
		
		do {
			c.setColor(new Color(0, 0, 0));
			
			c.setFont(new Font("MonoSpaced", Font.BOLD, 40));
			c.drawString("Your Score: " + score(wireCutAmount), 70, 100);
			
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
			
			if (cut != randWire) // Checks if user cuts the correct wire to add points to score
				wireCutAmount += 1;
				System.out.println((score(wireCutAmount)));
				c.setColor(new Color(150, 220, 255));
				c.fillRect(35, 32, 400, 140);
				
				
			c2.clear(); // Clears the input/output console, not the graphics console
			
		} while (cut != randWire); 
		
		if (cut == randWire) { // When user cuts the wrong wire
			c2.print("game over");
			c.drawImage (explosionJpg, -200, -300, 2500, 1500, null);
		}	
		
		int [] wireList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // TODO
		int badWire = wireList[randWire];
		return badWire;
	}
	
	public static int restartScreen(boolean winCheck) {
		System.out.println();
		return 0;
	}
	
	public static int score(int wireCutAmount) {
		// MAKE AN ARRAY FOR THIS TOIDO
		int playerScore = wireCutAmount * wireCutAmount;
		return playerScore;
	}
}
