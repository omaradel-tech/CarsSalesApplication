/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carssalesapplication;

import java.awt.Color;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author OmarAdEL
 */
public class DisplayBMW extends JFrame {
    JPanel panel1,panel2,panel3,panel4, panel55;
    Display d1 = new Display();
     javax.swing.border.Border blackline = BorderFactory.createLineBorder(Color.black);
     JButton Back = new JButton("Back");
     Events event = new Events();
     String Name;
     char op,lock;
    public DisplayBMW(char o) {
        this.op=o;
        System.out.println(op);
        shown();
    }
    public DisplayBMW(char o, String name){
      this.op=o;
      this.Name=name;
      shown();
    }
    public DisplayBMW(JPanel panel, char p ) {
        lock = p;
    }
    
    
    public void shown(){
   this.setSize(900,600);
    this.setTitle("BMW Cars");
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new GridLayout(2,2));
    
    panel1= new JPanel();
    panel2= new JPanel();
    panel3= new JPanel();
    panel4= new JPanel();
   
    panel1.setBorder(blackline);
    panel2.setBorder(blackline);
    panel3.setBorder(blackline);
    panel4.setBorder(blackline);
    
    d1.Display_Cars(panel1, 0,'m',op);
    d1.Display_Cars(panel2, 1,'m',op);
    d1.Display_Cars(panel3, 2,'m',op);
    d1.Display_Cars(panel4, 3,'m',op);
    Back.setBounds(0, 0, 100, 50);
    panel1.add(Back);
    Back.addActionListener(event);
    
    this.add(panel1);
    this.add(panel2);
    this.add(panel3);
    this.add(panel4);
    this.validate();
    
    this.setVisible(true);
    }
    private class Events implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==Back && op=='v' ){
            dispose();
            
            ViewDetails d = new ViewDetails(Name);
            }
           else if (e.getSource()==Back && op=='d'){
            dispose();
              ADD_DeletionChoosing ch = new ADD_DeletionChoosing("Delete",Name);
               }
           else if (e.getSource()==Back&&op=='b'){
               dispose();
             Buying b= new Buying('c',Name);
           }
        }
    
    
    
    }
    
}
