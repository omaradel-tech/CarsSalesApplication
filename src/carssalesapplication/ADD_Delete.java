/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carssalesapplication;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author OmarAdEL
 */
public class ADD_Delete extends JFrame {

   JPanel panel = new JPanel();
    JButton BMW,Audio,Kia,Toyota,ADD,Delete,Back,Back2;
    Events event = new Events();
    Font font= new Font("Serif",Font.ITALIC,27);
    ImageIcon img = new ImageIcon("backlog.jpg");
    JLabel background = new JLabel("",img,JLabel.CENTER);
    private String OOP;
    private String Name;

    public ADD_Delete() {
    }
    
    public ADD_Delete(String name) {
       this.Name= name;
      DisplayChoose();
      //  shown();
    }
    public void DisplayChoose(){
     this.setTitle("Cars Sales Application");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setSize(900, 600);
       this.setResizable(false);
       this.setLocationRelativeTo(null);
       this.add(panel);
       panel.setLayout(null);
       ADD = new JButton("ADD");
       Delete = new JButton("Delete");
       Back = new JButton("Back");
       ADD.setFont(font);
       Delete.setFont(font);
       Back.setFont(font);
       ADD.setBounds(350, 150, 200, 40);
       Delete.setBounds(350, 250, 200, 40);
       Back.setBounds(350, 350, 200, 40);
       background.setBounds(0, 0, 900, 600);
        
        panel.add(ADD);
        panel.add(Delete);
        panel.add(Back);
       panel.add(background);
      
       ADD.addActionListener(event);
        Delete.addActionListener(event);
        Back.addActionListener(event);
        
        this.add(panel);
        
        this.validate();
       this.setVisible(true);

    }
//    public void shown(String op){
//        OOP = op;
//       
////       this.setVisible(true);
//    }
//    
    private class Events implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==ADD){
               dispose();
                ADD_DeletionChoosing ad = new ADD_DeletionChoosing ("ADD",Name);
           
            }
            else if (e.getSource()==Delete){
                dispose();
              ADD_DeletionChoosing ad = new ADD_DeletionChoosing ("Delete",Name);
       
            }
            else if (e.getSource()==Back){
                dispose();
            SignIn bk = new SignIn(Name);
            
            }
          
         
            
        }
    
    }
}
