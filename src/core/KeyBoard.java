/***
 * Class that handels the keybord things
 * 
 * Project: Java Core v1.0
 * Author: Glenn latomme
 */
package core;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoard extends KeyAdapter implements KeyListener {

    AbstractGame game = null;

    public KeyBoard(AbstractGame gm){
        this.game = gm;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        game.keyPressed(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        game.keyReleased(e.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        game.keyTyped(e.getKeyCode());
    }

    public static char getChar(int key){
        return (char)key;
    }

}