
package FINAL.GUI;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends JFrame{
    public Login(){
        JTextField jTextFieldUsername =new JTextField();
        JPasswordField jPasswordField =new JPasswordField();
        JLabel jLabelUsername = new JLabel("Username");
        JLabel jLabelPassword = new JLabel("Password");
        JButton jButtonEnter = new JButton("Enter");
        JButton jButtonCancel = new JButton("Cancel");
        jLabelUsername.setForeground(Color.red);
        
        setLayout(new GridLayout(3, 2));
        getContentPane().add(jLabelUsername);
        getContentPane().add(jTextFieldUsername);
        getContentPane().add(jLabelPassword);
        getContentPane().add(jPasswordField);
        getContentPane().add(jButtonEnter);
        getContentPane().add(jButtonCancel);
        
        
                
        setBounds(600, 300, 400, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
