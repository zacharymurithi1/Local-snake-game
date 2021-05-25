/**
 * Write a description of class Snake here.
 *
 * @author Murugu Zachary
 * @version (24/04/2021)
 */
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class ZM_Snake 

    
{
    private final int ALL_DOTS=600;
    private final int RAND_POS=30;
    private final int DOT_SIZE=20;
    private boolean leftDirection = false;
    private boolean rightDirection = true;
    private boolean upDirection = false;
    private boolean downDirection = false;
    private boolean inGame=true;
    
    private final int x[]=new int[ALL_DOTS];
    private final int y[]=new int[ALL_DOTS];
    private final int B_WIDTH = 200;
    private final int B_HEIGHT = 200;
    private int dots;
     private Timer timer;
    public ZM_Snake() {
        // initialise instance variables  
        
    
    }
    
   
    private void move(){
        //Method for showing the direction the snake moves
         for (int j = dots; j > 0; j--) {
            x[j] = x[(j - 1)];
            y[j] = y[(j - 1)];
        }

        if (leftDirection) {
            x[0] -= DOT_SIZE;
        }

        if (rightDirection) {
            x[0] += DOT_SIZE;
        }

        if (upDirection) {
            y[0] -= DOT_SIZE;
        }

        if (downDirection) {
            y[0] += DOT_SIZE;
        }
    }
    public void  grow(){
        //Method to show by how long the snake grows when it eats the prey
    }
    
private void checkCrash(){

   //Method for checking crash 
     for (int j = dots; j > 0; j--) {

            if ((j > 4) && (x[0] == x[j]) && (y[0] == y[j])) {
                inGame = false;
            }
        }

        if (y[0] >= B_HEIGHT) {
            inGame = false;
        }

        if (y[0] < 0) {
            inGame = false;
        }

        if (x[0] >= B_WIDTH) {
            inGame = false;
        }

        if (x[0] < 0) {
            inGame = false;
        }
        
        if (!inGame) {
            timer.stop();
        }
}
     @Override
        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();

            if ((key == KeyEvent.VK_LEFT) && (!rightDirection)) {
                leftDirection = true;
                upDirection = false;
                downDirection = false;
            }

            if ((key == KeyEvent.VK_RIGHT) && (!leftDirection)) {
                rightDirection = true;
                upDirection = false;
                downDirection = false;
            }

            if ((key == KeyEvent.VK_UP) && (!downDirection)) {
                upDirection = true;
                rightDirection = false;
                leftDirection = false;
            }

            if ((key == KeyEvent.VK_DOWN) && (!upDirection)) {
                downDirection = true;
                rightDirection = false;
                leftDirection = false;
            } 
}
}
