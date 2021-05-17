package SWINGS;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenuBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("MenuBar");
		frame.setBounds(100, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();

		JMenu file = new JMenu("File");

		JMenuItem i1 = new JMenuItem("New");
		JMenuItem i2 = new JMenuItem("Open");
		JMenuItem i3 = new JMenuItem("Save");

		file.add(i1);
		file.add(i2);
		file.add(i3);

		menuBar.add(file);

		frame.setJMenuBar(menuBar);
		frame.setVisible(true);

	}

}
