import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.*;

public class GameBoard extends JPanel {    
    int xcells = 30 ;   
    int ycells = 30;
    int szcell = 10 ;       
       private Image snake;
       private Image snakeB;
       private Image prey;
       
   public GameBoard() {
        
        initGameBoard();
    }
    private void initGameBoard(){
        setPreferredSize(new Dimension(xcells * szcell, ycells * szcell));        
        setBackground(Color.black);
        setFocusable(true);   
        loadImages();
        
        
        
    }
    private void loadImages(){
       
       ImageIcon iih=new ImageIcon("resources/snakeB.png");
        snakeB =iih.getImage();
       ImageIcon iis=new ImageIcon("resources/snake.png");
        snake=iis.getImage();
        
    }
    public void generatePrey(){
        //A method for generating the food 
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    
}
