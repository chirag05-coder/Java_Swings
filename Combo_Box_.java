package SWINGS;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("RadioButton");
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = frame.getContentPane();
		c.setLayout(null);

		String[] values = { "1", "2", "3", "4", "5" };
		JComboBox c1 = new JComboBox(values);
		c1.setBounds(100, 100, 100, 30);
		c.add(c1);

		// to edit combobox yourself
		c1.setEditable(true);

		// to select an item by default
		c1.setSelectedItem("2");

		// to select an item by index
		c1.setSelectedIndex(4);

		JButton btnButton = new JButton("Ok");
		btnButton.setBounds(300, 100, 100, 30);
		c.add(btnButton);

		JLabel label = new JLabel("");
		label.setBounds(100, 300, 100, 30);
		c.add(label);

		btnButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String item = (String) c1.getSelectedItem();
				label.setText(item);

			}
		});

		frame.setVisible(true);

	}

}
