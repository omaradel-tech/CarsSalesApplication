/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carssalesapplication;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author OmarAdEL
 */
public class ADD_DeletionChoosing extends JFrame {
    JPanel panel = new JPanel();
    private JButton BMW,Audio,Kia,Toyota,ADD,Delete,Back,Back2;
    Events event = new Events();
    Font font= new Font("Serif",Font.ITALIC,27);
    ImageIcon img = new ImageIcon("backlog.jpg");
    JLabel background = new JLabel("",img,JLabel.CENTER);
     String OOP;
     String Name;
    public ADD_DeletionChoosing(String op,String Name) {
        this.Name= Name;
        this.OOP= op ;
        shown();
    }
    public void shown(){
    this.setTitle("Cars Sales Application");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setSize(900, 600);
       this.setResizable(false);
        this.setLocationRelativeTo(null);
      
       Back2 = new JButton("Back");
        // definition 
          BMW = new JButton ("BMW");
          Audio = new JButton ("Audi");
          Kia = new JButton ("Kia");
          Toyota = new JButton ("Toyota");
         
          
          BMW.setFont(font);
          Audio.setFont(font);
          Kia.setFont(font);
          Toyota.setFont(font);
          Back2.setFont(font);
          
          panel.setLayout(null);
         BMW.setBounds(350,100, 200, 40);
         Audio.setBounds(350, 180, 200, 40);
         Kia.setBounds(350, 260, 200, 40);
        Toyota.setBounds(350, 340, 200, 40);
         Back2.setBounds(350, 420, 200, 40);
         
        BMW.addActionListener(event);
        Audio.addActionListener(event);
        Kia.addActionListener(event);
       Toyota.addActionListener(event);
       Back2.addActionListener(event);
       
        panel.add(BMW);
        panel.add(Audio);
        panel.add(Kia);
        panel.add(Toyota);
        panel.add(Back2);
        
        this.add(panel);
        this.validate();
        this.setVisible(true);
    }
    private class Events implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
             if(e.getSource()==BMW){ 
                   if (OOP.compareTo("Delete")==0){
                         dispose();
                          BMW b = new BMW();
                          b.Delete(Name);
                  
                  }
                   else {
                   dispose();
                    Addition add = new Addition("BMW",Name);
                   }

                   
            }
           else if(e.getSource()==Audio  ){
               if (OOP.compareTo("Delete")==0){
                  dispose();
                Audi b = new Audi();
                b.Delete(Name);
               
               }
               else {
               dispose();
              Addition add = new Addition("Audi",Name);
               }
               
               
               
            }
           else if(e.getSource()==Kia ){
               if(OOP.compareTo("ِADD")==0){
                dispose();
             Addition add = new Addition("Kia",Name);
               
               }
               else if (OOP.compareTo("Delete")==0){
               dispose();
             Kia b = new Kia();
             b.Delete(Name);
               
               }
               
               
           
            }
           else if(e.getSource()==Toyota ){
               if(OOP.compareTo("ِADD")==0){
                    dispose();
                 Addition add = new Addition("Toyota",Name);
               
               }
               else if (OOP.compareTo("Delete")==0){
                dispose();
             Toyota b = new Toyota();
             b.Delete(Name);
               
               }

            }

            else if (e.getSource()==Back2){
             dispose();
             ADD_Delete ad = new ADD_Delete(Name);
            }
             
             
             
        }
    
    
    
    
    }
}
