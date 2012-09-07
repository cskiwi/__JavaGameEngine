/***
 * Main Frame
 * 
 * Project: Java Core v1.0
 * Author: Glenn latomme
 */
package core;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	private static final long serialVersionUID = -7571836969200569994L;
	
	public static void main(String[] args){
		new MainFrame();
	}
	
	public MainFrame(){
		add(new MainPanel());
		setTitle(GameConfig.get_title());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(GameConfig.get_width()	, GameConfig.get_height());
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}
}
