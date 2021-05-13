/**
 * 
 */
package SWINGS;

import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 * @author Acer
 *
 */
public class RadioButton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("RadioButton");
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = frame.getContentPane();
		c.setLayout(null);
		// c.setBackground(Color.GRAY);
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBounds(100, 30, 100, 20);
		c.add(r1);

		JRadioButton r2 = new JRadioButton("Female");
		r2.setBounds(200, 30, 100, 20);
		c.add(r2);

		ButtonGroup gender = new ButtonGroup();
		gender.add(r1);
		gender.add(r2);

		r1.setSelected(true);

		JRadioButton r3 = new JRadioButton("General");
		r3.setBounds(100, 50, 100, 20);
		c.add(r3);

		JRadioButton r4 = new JRadioButton("SC");
		r4.setBounds(200, 50, 100, 20);
		c.add(r4);

		JRadioButton r5 = new JRadioButton("OBC");
		r5.setBounds(300, 50, 100, 20);
		c.add(r5);

		ButtonGroup caste = new ButtonGroup();
		caste.add(r3);
		caste.add(r4);
		caste.add(r5);

		r5.setEnabled(false);
		frame.setVisible(true);

	}

}
