/**
 * 
 */
package SWINGS;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @author Acer
 *
 */
public class MyPassword {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLocation(100, 500);
		frame.setTitle("First Frame");

		ImageIcon icon = new ImageIcon("sign.jpg");
		frame.setIconImage(icon.getImage());
		Container c = frame.getContentPane();
		c.setBackground(Color.GRAY);
		c.setLayout(null);

		JLabel label = new JLabel("Username");
		label.setBounds(0, 0, 100, 30);
		c.add(label);

		JTextField t1 = new JTextField();
		t1.setBounds(65, 5, 100, 20);
		c.add(t1);
		JLabel label1 = new JLabel("Password");
		c.add(label1);
		label1.setBounds(0, 30, 100, 30);

		// To make an password field in the frame
		JPasswordField pass = new JPasswordField();
		pass.setBounds(65, 35, 100, 20);
		c.add(pass);

		pass.setText("12345");
		pass.setFont(new Font("Arial", Font.PLAIN, 20));

		pass.setEchoChar('*');
		pass.setEchoChar((char) 0);

	}

}
