/**
 * 
 */
package SWINGS;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 * @author Acer
 *
 */
public class TextArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Text");
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// frame.setLayout(null);
		Container c;

		c = frame.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.GRAY);
		JTextArea text = new JTextArea();
		text.setBounds(10, 10, 100, 100);
		c.add(text);
		text.setLineWrap(true);

		frame.setVisible(true);
	}

}
