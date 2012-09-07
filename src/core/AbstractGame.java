/***
 * "virtual" class for extending to your own, so if you forget to set functions, this will catch them
 * 
 * Project: Java Core v1.0
 * Author: Glenn latomme
 */
package core;
import java.awt.Graphics;
public abstract class AbstractGame {
	public abstract void Init();					// Called after constructor
	public abstract void Tick(int deltaTime);		// Tick
	public abstract void Paint(Graphics g);			// Paint
    public abstract void keyPressed(int code);		// Checks if Key Pressed
    public void keyReleased(int code) {}			// Check if key Released			
    public void keyTyped(int code) {}				// Something else
}
