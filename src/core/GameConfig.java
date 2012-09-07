/***
 * Configurations for the game
 * 
 * Project: Java Core v1.0
 * Author: Glenn latomme
 */
package core;

public class GameConfig {
	private static String _title = "No name set";
	private static int _width = 800;
	private static int _height = 600;
	private static int _fps = 50;
	/**
	 * @return the Title
	 */
	public static String get_title() {
		return _title;
	}
	/**
	 * @param Sets the title in that will show up in the title bar
	 */
	public static void set_title(String _title) {
		GameConfig._title = _title;
	}
	/**
	 * @return the width of the window that has been created on generation
	 */
	public static int get_width() {
		return _width;
	}
	/**
	 * @param Set the width of the window
	 */
	public static void set_width(int _width) {
		GameConfig._width = _width;
	}
	/**
	 * @return the height of the window that has been created on generation
	 */
	public static int get_height() {
		return _height;
	}
	/**
	 * @param Set the height of the window
	 */
	public static void set_height(int _height) {
		GameConfig._height = _height;
	}
	/**
	 * @return the frames per second that has been setted on creation
	 */
	public static int get_fps() {
		return _fps;
	}
	/**
	 * @param set the frames per second the tick and paint will try to run to
	 */
	public static void set_fps(int _fps) {
		GameConfig._fps = _fps;
	}
	
	
}
