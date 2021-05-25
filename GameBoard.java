import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.lang.String;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;


public class GameBoard extends JPanel{    
    int xcells = 30 ;   
    int ycells = 30;
    int szcell = 10 ;
    
    private final int DELAY=100;
    private final int ALL_DOTS=600;
    private final int RAND_POS=30;
    private final int DOT_SIZE=20;
    
    private final int x[]=new int[ALL_DOTS];
    private final int y[]=new int[ALL_DOTS];
    
    
   private int dots;
   private int prey_x;
   private int prey_y;
   
    
       private Timer timer;
       private Image snake;
       private Image snakeB;
       private Image prey;
       private boolean inGame=true;
       
   public GameBoard() {
        
        initGameBoard();
    }
    private void initGameBoard(){
       setPreferredSize(new Dimension(xcells * szcell, ycells * szcell)); 
       JFrame sgame = new JFrame("Murugu Zachary(c)");
         setBackground(Color.black);
         sgame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Define the panel to hold the components
		JPanel panel = new JPanel();
		GridBagLayout layout = new GridBagLayout();
		panel.setLayout(layout);
		GridBagConstraints gbc = new GridBagConstraints();

		// Put constraints on different elements
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(new JButton("TOP PLAYER's SCORE"), gbc);

		gbc.gridx = 0;
		gbc.gridy = 3;
		panel.add(new JButton("CURRENT PLAYER SCORE"), gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridwidth = 2;
		panel.add(new JLabel("resources/snake.png"), gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		panel.add(new JButton("QUIT"), gbc);

		sgame.add(panel);
		sgame.pack();
		sgame.setVisible(true);
        
       
        setFocusable(true);  
         loadImages();
        
       
    }
    private void loadImages(){
       
       ImageIcon iih=new ImageIcon("resources/snakeB.png");
        snakeB =iih.getImage();
        ImageIcon iis=new ImageIcon("resources/snake.png");
        snake=iis.getImage();
        ImageIcon iip=new ImageIcon("resources/prey.png");
        prey=iip.getImage();
    }
    private void initGame(){
        dots=3;
        for(int j=0; j<dots; j++){
            x[j]=50-j*10;
            y[j]=50;
        }
   
}
        //A method for generating the food 

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
   private void doDrawing(Graphics g){
       if(inGame){
           g.drawImage(prey,prey_x,prey_y, this);
           
           for(int j=0; j< dots; j++){
               if(j==0){
                   g.drawImage(snake, x[j], y[j], this);
                }else{
                    g.drawImage(snakeB, x[j], y[j], this);
                }
            }
        }
    }
    
  private void locatePrey(){
      
      int r=(int) (Math.random() * RAND_POS);
      prey_x=((r*DOT_SIZE));
      
      r=(int) (Math.random()* RAND_POS);
      prey_y=((r*DOT_SIZE));
    }
}





