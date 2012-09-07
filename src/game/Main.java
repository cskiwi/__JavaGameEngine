/***
 * Main class for game 
 * 
 * Project: Java Core v1.0
 * Author: Glenn latomme
 */
package game;

import java.awt.Graphics;

import core.AbstractGame;
import core.GameConfig;


public class Main extends AbstractGame{

	public void Init() {		
		GameConfig.set_title("My program");
		// GameConfig.set_height(100);
		// GameConfig.set_width(500);
		// GameConfig.set_fps(50);
	}

	public void Tick(int deltatime) {
		
	}

	public void Paint(Graphics g) {
		
	}

	public void keyPressed(int code) {
		
	}
}
