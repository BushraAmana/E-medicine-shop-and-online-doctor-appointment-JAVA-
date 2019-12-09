/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aywon;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JComboBox;

class AvailableTime extends JFrame
{
private Container c;
    private JButton button1,button2;
    private JLabel label1,label2,label3;
    private Font f1,f2,f3;
    private JTextField t1,t2;
    private JComboBox cb;
    private String[] AvailableTime={"Select Time","10-2 AM","7-11 PM"}; 
    
    AvailableTime(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,700);
        setLocationRelativeTo(null);
        setTitle("Welcome to DAM");
        setResizable(false);
        
        f1=new Font("Arial",Font.BOLD,40);
        
        f2=new Font("Cooper Black",Font.BOLD,60);
        f3=new Font("Arial",Font.BOLD,20);
        
         c=this.getContentPane();
         c.setLayout(null);
         c.setBackground(new Color(0,0,0));
         cb=new JComboBox(AvailableTime);
         cb.setBounds(280,220,250,70);
         //cb.setEditable(true);
         c.add(cb);
         
         label1 = new JLabel("");
           //label1.setText("Welcome To");
           label1.setBounds(150,300,600,70);
           label1.setForeground(Color.WHITE);
           label1.setFont(f1);
           c.add(label1);
           cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
            String s=cb.getSelectedItem().toString();
            label1.setText("You have selected:"+s);
            }
        
            });
                   
      
            label2 = new JLabel("Select Your Time");
           //label1.setText("Welcome To");
           label2.setBounds(120,122,600,70);
           label2.setForeground(Color.RED);
           label2.setFont(f2);
           c.add(label2);
           
            button1 = new JButton("Previous");
           //label1.setText("Welcome To");
           button1.setBounds(277,490,260,50);
           //button1.setForeground(Color.WHITE);
           button1.setFont(f3);
           c.add(button1);
           
          button2 = new JButton("Confirm Appointment");
           //label1.setText("Welcome To");
           button2.setBounds(277,390,260,50);
          // button2.setForeground(Color.WHITE);
           button2.setFont(f3);
           c.add(button2);
           
           addMouseListener(new MouseSensor());
         addMouseMotionListener(new MouseSensor());
           
}
}