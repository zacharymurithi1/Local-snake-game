
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.BorderFactory;
import.java.util.Scanner;
 
/**
 * This program demonstrates how to use JFrame and LayoutManager.
 * @author Murugu Zachary
 */

public class ZM_LoginForm extends JFrame {
    private JLabel labelUsername=new JLabel("Enter username: ");
    private JLabel labelPassword=new JLabel("Enter password: ");   
    private JTextField textUsername=new JTextField(15);
    private JPasswordField fieldPassword=new JPasswordField(20);
    private JButton buttonLogin=new JButton("Login");
     
    public ZM_LoginForm() {
        super("Login Form");
        JPanel newPanel=new JPanel(new GridBagLayout());
        GridBagConstraints constraints=new GridBagConstraints();
        constraints.anchor=GridBagConstraints.WEST;
        constraints.insets=new Insets(10,10,10,10);
        
        constraints.gridx=0;
        constraints.gridy=0;
        newPanel.add(labelUsername,constraints);
        
        constraints.gridx=1;
        newPanel.add(textUsername,constraints);
        
        constraints.gridx=0;
        constraints.gridy=1;
        newPanel.add(labelPassword,constraints);
        
        constraints.gridx=1;
        newPanel.add(fieldPassword,constraints);
        
        constraints.gridx= 0;
        constraints.gridy= 2;
        constraints.gridwidth= 2;
        constraints.anchor=GridBagConstraints.CENTER;
        newPanel.add(buttonLogin,constraints);
        
        newPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Login Panel"));
        add(newPanel);
        pack();
        setLocationRelativeTo(null);
        
      
        
    }
     
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ZM_LoginForm().setVisible(true);
            }
        });
    }
}