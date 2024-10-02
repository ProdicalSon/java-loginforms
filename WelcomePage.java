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

public     class WelcomePage {
    WelcomePage() {
        JFrame welcomeFrame = new JFrame();
        JLabel welcomeLabel = new JLabel("Welcome!");
        welcomeLabel.setBounds(50, 100, 300, 50);
        welcomeLabel.setFont(new Font(null, Font.PLAIN, 30));
        
        welcomeFrame.add(welcomeLabel);
        welcomeFrame.setSize(400, 200);
        welcomeFrame.setLayout(null);
        welcomeFrame.setVisible(true);
    }
}
