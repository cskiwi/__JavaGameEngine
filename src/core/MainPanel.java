/***
 * Class that runs
 * 
 * Project: Java Core v1.0
 * Author: Glenn latomme
 */
package core;

import game.Main;

import java.awt.Graphics;

import javax.swing.JPanel;


public class MainPanel extends JPanel implements Runnable{
	// Change GGGGG to your game class
	AbstractGame gm = new Main();	

	private static final long serialVersionUID = 1L;
	private KeyBoard _keyBoard = null;
	
	private long goalFPS = GameConfig.get_fps();
	private long goalDelataLoop = (1000*1000*1000)/goalFPS;
	
	Thread thisThread;
	Thread _runner;
	
	public MainPanel() {	
		// inti own members
		_keyBoard = new KeyBoard(gm);
		
		// some methods
		setFocusable(true);
		requestFocusInWindow();
		addKeyListener(_keyBoard);
		
		// create the game
		gm.Init();
		
		this.start();
	}
	public void start() {
		if (_runner == null) {
			_runner = new Thread(this);
			_runner.start();
		}
	}
	public void run() {
		Thread thisThread = Thread.currentThread();
		
		long beginLoopTime;
		long endLoopTime;
		long currentUpdateTime = System.nanoTime();
		long LastUpdateTime;
		long deltaLoop;
		
		while(_runner.isAlive() && _runner == thisThread){
			beginLoopTime = System.nanoTime();
			
			repaint();
			
			LastUpdateTime = currentUpdateTime;
			currentUpdateTime = System.nanoTime();
			
			Tick((int) ((currentUpdateTime - LastUpdateTime) / 1000 * 1000));
			
			endLoopTime = System.nanoTime();
			deltaLoop = endLoopTime - beginLoopTime;
			
			if (deltaLoop > goalDelataLoop){
				System.out.println("Can't keep up!");
			} else {
				try {
					Thread.sleep((goalDelataLoop - deltaLoop)/(1000*1000));
				} catch (InterruptedException e){
					// do nothing
				}				
			}
		}
	}
	public void paint(Graphics g) {
		super.paint(g);
		gm.Paint(g);
		g.dispose();
	}
	public void Tick(int deltaTime){	
		gm.Tick(deltaTime);
		
	}
	public void stop() {
		if (_runner != null) {
			_runner = null;
		}
	}
}
