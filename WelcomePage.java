import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class WelcomePage {

    JFrame welcomeFrame = new JFrame();
    JLabel welcomeLabel = new JLabel("Welcome!");


    WelcomePage(String userID) { 
        welcomeLabel.setBounds(0, 0, 200, 35);
        welcomeLabel.setFont(new Font(null, Font.PLAIN, 25));
        welcomeLabel.setText("Welcome " +userID + "!!");

        welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welcomeFrame.add(welcomeLabel);
        welcomeFrame.setSize(420, 420);
        welcomeFrame.setLayout(null);
        welcomeFrame.setLocationRelativeTo(null);
        welcomeFrame.setVisible(true);
        
        
      
    }
}
