import java.awt.EventQueue;
import javax.swing.JFrame;
import java.lang.String;
public class SnakeGame extends JFrame {

    public SnakeGame(String gameTille) {        
        setTitle(gameTille);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();        
    }
    
    public static void main(String[] args) {        
        EventQueue.invokeLater(() -> {
            //create the game with a game title as follow: The Snake Game (C) Your_Name
            JFrame sgame = new SnakeGame("The Snake Game(C) Zachary");
            sgame.setVisible(true);
        });
    }
}
