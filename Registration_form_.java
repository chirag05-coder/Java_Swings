package SWINGS;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RegistrationForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Registration Form");
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = frame.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.GRAY);
		JLabel name = new JLabel("Name");
		name.setBounds(20, 20, 100, 20);
		c.add(name);

		JLabel mob = new JLabel("Mobile");
		mob.setBounds(20, 60, 100, 20);
		c.add(mob);

		JTextField name1 = new JTextField();
		name1.setBounds(120, 20, 100, 20);
		c.add(name1);

		JTextField mob1 = new JTextField();
		mob1.setBounds(120, 60, 100, 20);
		c.add(mob1);

		JLabel gender = new JLabel("Gender");
		gender.setBounds(20, 100, 100, 20);
		c.add(gender);

		JRadioButton male = new JRadioButton("Male");
		male.setBounds(120, 100, 100, 20);
		c.add(male);

		JRadioButton female = new JRadioButton("Female");
		female.setBounds(220, 100, 100, 20);
		c.add(female);

		ButtonGroup b1 = new ButtonGroup();
		b1.add(male);
		b1.add(female);

		male.setSelected(true);

		JLabel dob = new JLabel("Date Of Birth");
		dob.setBounds(20, 140, 80, 20);
		c.add(dob);

		String[] date = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
				"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
		JComboBox c1 = new JComboBox(date);
		c1.setBounds(120, 140, 45, 20);
		c.add(c1);

		String[] month = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		JComboBox c2 = new JComboBox(month);
		c2.setBounds(175, 140, 50, 20);
		c.add(c2);

		String[] year = { "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008",
				"2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020",
				"2021" };
		JComboBox c3 = new JComboBox(year);
		c3.setBounds(230, 140, 55, 20);
		c.add(c3);

		JLabel address = new JLabel("Address");
		address.setBounds(20, 180, 100, 20);
		c.add(address);

		JTextArea addrArea = new JTextArea();
		addrArea.setBounds(120, 180, 150, 70);
		c.add(addrArea);

		addrArea.setLineWrap(true);

		JCheckBox check1 = new JCheckBox("Please accept terms and conditions ");
		check1.setBounds(40, 270, 250, 20);
		c.add(check1);

		JButton btn1 = new JButton("Submit");
		btn1.setBounds(90, 320, 100, 20);
		c.add(btn1);

		JTextArea result = new JTextArea();
		result.setBounds(350, 20, 300, 300);
		c.add(result);
		result.setLineWrap(true);

		JLabel message = new JLabel();
		message.setBounds(80, 400, 300, 30);
		c.add(message);

		check1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (check1.isSelected()) {

					btn1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							if (e.getSource() == btn1) {
								message.setText("Registration Successful...");

								String name12 = name1.getText();
								String mobile = mob1.getText();
								String gen = "Male";
								if (female.isSelected())

								{
									gen = "Female";
								}

								String birth = (String) c1.getSelectedItem() + "-" + c2.getSelectedItem() + "-"
										+ c3.getSelectedItem();

								String addr = addrArea.getText();

								result.setText("Name: " + name12 + "\n" + "Mobile No: " + mobile + "\n" + "Gender: "
										+ gen + "\n" + "Dob" + birth + "\n" + "Address: " + addr);
							}

						}
					});

				}

			}
		});

		frame.setVisible(true);
	}

}
