/**
 * 
 */
package SWINGS;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author Acer
 *
 */
class Simple extends JFrame implements ActionListener {
	Container c;
	JLabel label1, label2, result;
	JTextField t1, t2, res;
	JButton add, sub, mul, div;

	Simple() {
		// TODO Auto-generated constructor stub
		setTitle("Calculator");
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		c = getContentPane();
		c.setLayout(null);
		label1 = new JLabel("First Number");
		label1.setBounds(10, 20, 100, 20);
		c.add(label1);

		t1 = new JTextField();
		t1.setBounds(120, 20, 100, 20);
		c.add(t1);

		label2 = new JLabel("Second Number");
		label2.setBounds(8, 50, 100, 20);
		c.add(label2);

		t2 = new JTextField();
		t2.setBounds(120, 50, 100, 20);
		c.add(t2);

		add = new JButton("+");
		add.setBounds(10, 80, 50, 30);
		c.add(add);
		sub = new JButton("-");
		sub.setBounds(70, 80, 50, 30);
		c.add(sub);
		mul = new JButton("X");
		mul.setBounds(130, 80, 50, 30);
		c.add(mul);
		div = new JButton("/");
		div.setBounds(190, 80, 50, 30);
		c.add(div);

		result = new JLabel("Result:");
		result.setBounds(10, 120, 150, 20);
		c.add(result);

		res = new JTextField();
		res.setBounds(55, 120, 150, 20);
		c.add(res);

		setVisible(true);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {

			if (e.getSource() == add) {
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
				int cc = a + b;
				res.setText(String.valueOf(cc));
				c.setBackground(Color.GRAY);
				add.setBackground(Color.CYAN);
			} else if (e.getSource() == sub) {
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
				int cc = a - b;
				res.setText(String.valueOf(cc));
				c.setBackground(Color.BLUE);
				sub.setBackground(Color.DARK_GRAY);
			} else if (e.getSource() == mul) {
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
				int cc = a * b;
				res.setText(String.valueOf(cc));
				c.setBackground(Color.GREEN);
				mul.setBackground(Color.blue);
			} else if (e.getSource() == div) {
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
				int cc = a / b;
				res.setText(String.valueOf(cc));
				c.setBackground(Color.pink);
				div.setBackground(Color.MAGENTA);
			}
		} catch (NumberFormatException e1) {
			res.setText("Please Input Integers Only");
		} catch (ArithmeticException e1) {
			res.setText("Can not divide by Zero");
		}

	}

}

public class SimpleCalc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple frame = new Simple();

	}

}
