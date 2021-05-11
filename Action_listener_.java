/**
 * 
 */
package SWINGS;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @author Acer
 *
 */
class Myframe extends JFrame implements ActionListener {
	Container c;
	JButton btn, btn1;
	JLabel label, label2;
	JTextField field;

	Myframe() {
		// TODO Auto-generated constructor stub
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
		JPasswordField pass = new JPasswordField();
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
		btn1.setBounds(60, 80, 70, 25);
		c.add(btn1);
		btn1.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) {
			c.setBackground(Color.GRAY);

		} else {
			c.setBackground(Color.BLUE);
		}
	}
}

public class ActionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myframe f = new Myframe();
		f.setTitle("Action Demo");
		f.setBounds(400, 100, 500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon icon = new ImageIcon("D:\\Java_Programs\\First_frame\\sign.jpg");
		f.setIconImage(icon.getImage());
	}

}
