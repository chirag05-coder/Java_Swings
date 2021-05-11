package SWINGS;

/**
 * 
 */

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @author Acer
 *
 */
class login extends JFrame implements ActionListener {
	Container c;
	JButton btn, btn1;
	JLabel label, label2;
	JTextField field;
	JPasswordField pass;

	login() {
		// TODO Auto-generated constructor stub
		setBounds(100, 100, 500, 500);
		c = this.getContentPane();
		c.setLayout(null);
		label = new JLabel("USERNAME");
		label.setBounds(0, 0, 100, 30);
		c.add(label);
		label2 = new JLabel("PASSWORD");
		label2.setBounds(0, 37, 100, 30);
		c.add(label2);
		field = new JTextField();
		field.setBounds(80, 4, 100, 25);
		c.add(field);
		pass = new JPasswordField();
		pass.setBounds(80, 40, 100, 25);
		pass.setText("abcde");
		c.add(pass);
		pass.setEchoChar('*');
		btn = new JButton("Login");
		btn.setBounds(30, 80, 70, 25);
		// btn.setVisible(true);
		c.add(btn);
		btn.addActionListener(this);
		btn1 = new JButton("sign up");
		btn1.setBounds(100, 80, 80, 25);
		c.add(btn1);
		btn1.addActionListener(this);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("USername" + field.getText());
		System.out.println("password" + pass.getText());
	}

}

public class Loginform1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login frame = new login();

	}

}
