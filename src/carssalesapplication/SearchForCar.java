package carssalesapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SearchForCar extends JFrame {
    ////////Variables////////
     JLabel Logo_lbl;
     JLabel search_type;
     JButton Search_button;
     JButton Reset_button;
     JButton Back_button;
     JTextField search_txt;
     JPanel jPanel1;
     ImageIcon img1;
     JLabel background;
     private String name;
   public SearchForCar(String name){
       //Initialize Variables
       this.name = name;
       jPanel1 = new JPanel();
       Logo_lbl = new JLabel();
       search_txt = new JTextField(10);
       search_type = new JLabel();
        Search_button = new JButton();
        Back_button = new JButton();
        img1=new ImageIcon("car2.jpg");
       background=new JLabel("",img1,JLabel.CENTER);
        //The Fram-->
        setSize(900, 600);
        setTitle("Search For Cars");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        background.setBounds(0, 0, 900, 600);
        
        //First Panel-->
        jPanel1.setLayout(null);
        jPanel1.setBackground(Color.lightGray);
        
        jPanel1.setBounds(0, 0, 900, 600);
        add(jPanel1); 
        //Logo of The Page-->
        Logo_lbl.setFont(new Font("vivaldi", 1, 45)); // NOI18N
        Logo_lbl.setText("Search For Cars");
        Logo_lbl.setForeground(Color.lightGray);
        Logo_lbl.setForeground(new java.awt.Color(0, 102, 0));
        Logo_lbl.setBounds(300, 40, 370, 60);
        jPanel1.add(Logo_lbl);
        //Search Text Field-->
        search_type = new JLabel("Enter Type: ");
        search_type.setForeground(new java.awt.Color(0, 102, 0));
        search_type.setFont(new Font ("Arial", 1, 20));
        search_type.setBounds(90, 190, 120, 40);
        search_txt.setBounds(220, 200, 150, 30 );
        jPanel1.add(search_type);
        jPanel1.add(search_txt);
        //Button For Search-->
        Search_button.setText("Search");
        Search_button.setBounds(170, 260, 130, 40);
        jPanel1.add(Search_button);
        ActionSearchButton();
        //Button For Back To Menu
        Back_button.setText("Back");
        Back_button.setBounds(50, 40, 130, 40);
        jPanel1.add(Back_button);
        ActionBackButton();
        
       jPanel1.add(background);
        this.setVisible(true);
    }
  
   ////////////////Action methods/////////
   private void ActionSearchButton(){
       Search_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if(search_txt.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(jPanel1,"Pleas Enter Type");
                }
                else{
                String word = search_txt.getText().toString();
                Search s = new Search(name);
                s.SearchCar(word);
                }
            }
        });
   }
    private void ActionBackButton(){
        Back_button.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent evt) {
                dispose();
                new SignIn(name);
            }
        });
    }
}