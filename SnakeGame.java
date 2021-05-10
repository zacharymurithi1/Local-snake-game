import java.awt.EventQueue;
import javax.swing.JFrame;
import java.lang.String;
public class SnakeGame extends JFrame {

    public SnakeGame() {  
        initUI();
    }
        private void initUI(){
            add(new GameBoard());
        setTitle("The Snake Game(c) Zachary");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();        
    }
    
    
    public static void main(String[] args) {        
        EventQueue.invokeLater(() -> {
            //create the game with a game title as follow: The Snake Game (C) Your_Name
            JFrame sgame = new SnakeGame();
            sgame.setVisible(true);
        });
    }
}
