package finalProject;

import hsa_new.Console;

import java.awt.Color;
import java.util.Scanner;

public class WireCutter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Console c = new Console(50, 1000);
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
		c.setColor(new Color(255, 255, 255));
		int cut;
		
		do {
			cut = c.readInt();
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
			System.out.println("np");
			} 
		}while (cut != 11);
	}
	public static int wires(int randWire) {
		int [] wireList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	}
}
