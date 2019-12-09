/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aywon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author pc
 */
public class Appointment extends JFrame implements ActionListener{
    
    private Container c; Frame2 x;
    private JButton button1,button2;
    private JLabel label1,label2,label3;
    private Font f1,f2,f3;
    private JTextField t1,t2;
    //private JPasswordField t2;
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button1){
            
            dispose();
           getP().setVisible(true);
             String query = "select * from doctor_infomation where  = '"+t1.getText()+"'";
            Database db = new Database ();
            
            
        }   
        else if(e.getSource()==button2){
            
            
           // f2.setPrevious(this);
            
            
        }  
        }
    
    Appointment(){
        
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
        
           label1 = new JLabel("Specialist:");
           //label1.setText("Welcome To");
           label1.setBounds(92,250,360,70);
           label1.setForeground(Color.WHITE);
           label1.setFont(f1);
           c.add(label1);
           
            label2 = new JLabel("Doctor's Name:");
           //label1.setText("Welcome To");
           label2.setBounds(92,381,360,70);
           label2.setForeground(Color.WHITE);
           label2.setFont(f1);
           c.add(label2);
           
            label3 = new JLabel("Appointment");
           //label1.setText("Welcome To");
           label3.setBounds(250,130,600,70);
           label3.setForeground(Color.RED);
           label3.setFont(f2);
           c.add(label3);
         
           t1 = new JTextField("");
           //label1.setText("Welcome To");
           t1.setBounds(300,250,500,70);
           //t1.setForeground(Color.WHITE);
           t1.setFont(f1);
           c.add(t1);
           
           t2 = new JTextField("");
           //label1.setText("Welcome To");
           t2.setBounds(400,390,400,70);
           //t2.setForeground(Color.WHITE);
           t2.setFont(f1);
           c.add(t2);
           
           button1 = new JButton("Previous");
           //label1.setText("Welcome To");
           button1.setBounds(281,550,160,50);
           //button1.setForeground(Color.WHITE);
           button1.setFont(f3);
           c.add(button1);
           
          button2 = new JButton("Search");
           //label1.setText("Welcome To");
           button2.setBounds(481,500,160,50);
          button2.setForeground(Color.RED);
           button2.setFont(f3);
           c.add(button2);
           
           
         button1.addActionListener(this); 
         button2.addActionListener(this);
         addMouseListener(new MouseSensor());
         addMouseMotionListener(new MouseSensor());
         
    }
    
     void setP(Frame2 x){
    
        this.x=x;
        
    }
    Frame2 getP(){
        return x;
    }
    
          
    
    
}
