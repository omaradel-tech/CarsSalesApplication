/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carssalesapplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author OmarAdEL
 */
public class ViewDetails extends JFrame{
    JPanel panel = new JPanel();
    JButton BMW,Audio,Kia,Toyota,Back;
    Events event = new Events();
    String Name;
     Font font= new Font("Serif",Font.ITALIC,27);
    public ViewDetails(String name) {
        this.Name = name;
        shown();
    }
    public void shown(){

        this.setTitle("Cars Sales Application");
       
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setSize(900, 600);
       this.setResizable(false);
       this.setLocationRelativeTo(null);
       this.add(panel);
        // definition 
        BMW = new JButton ("BMW");
         Audio = new JButton ("Audi");
          Kia = new JButton ("Kia");
           Toyota = new JButton ("Toyota");
           Back= new JButton("Back");
           panel.setLayout(null);
           BMW.setBounds(350,60, 150, 40);
           Audio.setBounds(350, 160, 150, 40);
           Kia.setBounds(350, 260, 150, 40);
           Toyota.setBounds(350, 360, 150, 40);
           Back.setBounds(350, 460, 150, 40);
           BMW.setFont(font);
            Audio.setFont(font); 
            Kia.setFont(font);
             Toyota.setFont(font);
            Back.setFont(font);
            
           
        BMW.addActionListener(event);
        Audio.addActionListener(event);
        Kia.addActionListener(event);
       Toyota.addActionListener(event);
       Back.addActionListener(event);
        panel.add(BMW);
        panel.add(Audio);
        panel.add(Kia);
        panel.add(Toyota);
        panel.add(Back);
      this.setVisible(true);
    }
     private class Events implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==BMW)
            {
                  dispose();
                  DisplayBMW bm= new DisplayBMW('v',Name);
                  
            }
           else if(e.getSource()==Audio)
            {
                  dispose();
               DisplayAudi audi = new DisplayAudi('v',Name);
            }
           else if(e.getSource()==Kia)
            {
                  dispose();
                 DisplayChev ch= new DisplayChev('v',Name);
            }
            else if (e.getSource()==Toyota){
           dispose();
            DisplayToyota toyota = new DisplayToyota('v',Name);
                                        }
            else if (e.getSource()==Back)
            {
                        dispose();
                        SignIn in = new SignIn(Name); 
            }
       
       }
       
        }

      
    
    
}
