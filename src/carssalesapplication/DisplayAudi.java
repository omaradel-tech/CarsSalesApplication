/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carssalesapplication;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.layout.*;
import javax.swing.*;

/**
 *
 * @author OmarAdEL
 */
public class DisplayAudi extends JFrame{
    JPanel panel1,panel2,panel3,panel4;
       Display d4 = new Display();
      javax.swing.border.Border blackline = BorderFactory.createLineBorder(Color.black);
       JButton Back = new JButton("Back");
       Events event = new Events();
      char op;
      String Name;
       public DisplayAudi(char c) {
           this.op=c;
           shown();
       }
        public DisplayAudi(char c,String name) {
           this.op=c;
           this.Name=name;
           shown();
       }

      private void shown(){
      this.setSize(900,600);
       this.setTitle("AudiCars");
      this.setLocationRelativeTo(null);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       panel1= new JPanel();
       panel2= new JPanel();
       panel3= new JPanel();
       panel4= new JPanel();
       
       panel1.setBorder(blackline);
        panel2.setBorder(blackline);
        panel3.setBorder(blackline);
        panel4.setBorder(blackline);
       
    Back.setBounds(0, 0, 100, 50);
    panel1.add(Back);
    Back.addActionListener(event);
        
        d4.Display_Cars(panel1, 0,'a',op);
       d4.Display_Cars(panel2, 1,'a',op);
       d4.Display_Cars(panel3, 2,'a',op);
       d4.Display_Cars(panel4, 3,'a',op);
       this.setLayout(new GridLayout(2,2));
       this.add(panel1);
       this.add(panel2);
       this.add(panel3);
       this.add(panel4);


       this.setVisible(true);
       }
       private class Events implements ActionListener{



        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==Back&& op == 'v'){
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
