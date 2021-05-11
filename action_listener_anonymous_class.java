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

/**
 * @author Acer
 *
 */
public class ActionListnerAnonymous {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("ActionDemo3");
		frame.setBounds(100, 100, 500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = frame.getContentPane();
		c.setLayout(null);

		JButton btn = new JButton("Click me");
		btn.setBounds(50, 50, 100, 30);
		c.add(btn);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				c.setBackground(Color.GRAY);

			}
		});
	}

}
