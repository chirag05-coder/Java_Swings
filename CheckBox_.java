/**
 * 
 */
package SWINGS;

import java.awt.Container;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 * @author Acer
 *
 */
public class MyCheckbox {

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

		JCheckBox c1 = new JCheckBox("High School");
		JCheckBox c2 = new JCheckBox("Intermediate");
		JCheckBox c3 = new JCheckBox("Graduation");
		JCheckBox c4 = new JCheckBox("Post_Graduation");

		c1.setBounds(100, 50, 120, 20);
		c2.setBounds(100, 100, 120, 20);
		c3.setBounds(100, 150, 120, 20);
		c4.setBounds(100, 200, 120, 20);

		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);

		c1.setSelected(true);
		frame.setVisible(true);

	}

}
