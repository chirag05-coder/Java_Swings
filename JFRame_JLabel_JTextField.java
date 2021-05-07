/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package first_frame;

/**
 *
 * @author Acer
 */
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
public class First_frame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocation(100,500);
        frame.setTitle("First Frame");
        
        ImageIcon icon=new ImageIcon("sign.jpg");
        frame.setIconImage(icon.getImage());
        Container c= frame.getContentPane();
        c.setBackground(Color.GRAY);
        //frame.setResizable(false);
        c.setLayout(null);
        
        
     //For labels on the frame    
       // JLabel label=new JLabel("Username");
       //label.setBounds(0,0,100,30);
        //label.setText("Password");
        
     //for image and text together   
       // JLabel label=new JLabel("Username",icon,JLabel.LEFT);
       //label.setBounds(100,100,icon.getIconWidth(),icon.getIconHeight());
         
        
    // To set the format of the font    
        //Font font =new Font("Arial",Font.ITALIC,1000);
         // label.setFont(font);
       // JLabel label= new JLabel(icon);
        //label.setBounds(100, 50,icon.getIconWidth(),icon.getIconHeight());
        //c.add(label);
        JTextField t1= new JTextField();
        t1.setBounds(100,30,100,30);
        c.add(t1);
        
        t1.setText("Chirag Sharma");
        Font font =new Font("Arial",Font.ITALIC,15);
        t1.setFont(font);
        t1.setForeground(Color.blue);
        t1.setBackground(Color.DARK_GRAY);
        
        t1.setEditable(false);
        
        
    
        
        
    }
    
}
