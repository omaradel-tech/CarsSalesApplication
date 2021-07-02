/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carssalesapplication;

import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author OmarAdEL
 */
public class Addition extends JFrame{
    JPanel panel1,panel2,panel3,panel4,panel5,panel,panel6;
    private String Kind,Name;
    JTextField Price,Color1,Model,Year;
    JLabel price,color,model,year,Image;
    Font font;
    JButton b1= new JButton("ADD");
   private JButton Back = new JButton("Back");
    javax.swing.border.Border blackline = BorderFactory.createLineBorder(Color.black);
    Events event = new Events();
    JButton b_img = new JButton ("upload");
    public Addition(String Kind, String name) {
        this.Name=name;
        this.Kind=Kind;
        shown();
    }
    public void shown(){
    this.setTitle("DetailsOFNewCar");
    this.setSize(900, 600);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    panel= new JPanel();
    panel1= new JPanel();
    panel2= new JPanel();
    panel3= new JPanel();
    panel4= new JPanel();
    panel5= new JPanel();
    panel6=new JPanel();
   Price=new JTextField(12);
   Color1=new JTextField(12);
   Model=new JTextField(12);   
    Year=new JTextField(12); 
    Color1.setBorder(blackline);
    Price.setBorder(blackline);
    Color1.setBorder(blackline);
    Year.setBorder(blackline);
    font= new Font("Serif",Font.ITALIC,23);
    
    price=new JLabel("Price : ");
     year=new JLabel("Year : ");
     model=new JLabel("Model: ");
     color=new JLabel("Color : ");
     Image=new JLabel("Upload Image");
     price.setFont(font);
     year.setFont(font);
     color.setFont(font);
     model.setFont(font);
    b1.setBorder(blackline);
    Back.setBorder(blackline);
    b1.setFont(font);
    Back.setFont(font);
    b1.setBounds(340,0,100,30);
    Back.setBounds(450, 0, 100, 30);
    
    panel6.setLayout(null);
    panel1.add(model);panel1.add(Model);
     panel2.add(year);panel2.add(Year);
     panel3.add(color);panel3.add(Color1);
    panel4.add(price);panel4.add(Price);
    panel5.add(Image); panel5.add(b_img);
    panel6.add(b1); 
    panel6.add(Back);
    
    
    b1.addActionListener(event);
    b_img.addActionListener(event);
    Back.addActionListener(event);
    panel.setLayout(new GridLayout(6,1));
    
    
    this.add(panel);
    panel.add(panel1);
    panel.add(panel2);
    panel.add(panel3);
    panel.add(panel4);
    panel.add(panel5);
    panel.add(panel6);
    
    this.setVisible(true);
    
    }
    private class Events implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           String name_car,price_car,mode_car,year_car,color_car;
           
           name_car=Kind;
           price_car=Price.getText().toString();
           mode_car=Model.getText().toString();
           year_car=Year.getText().toString();
           color_car=Color1.getText().toString();
            if(e.getSource()==b1){
           
           if(name_car.isEmpty() || price_car.isEmpty()||color_car.isEmpty()  || mode_car.isEmpty() || year_car.isEmpty()){
             JOptionPane.showMessageDialog(panel, "Please Fill out all information");
              
           }
           else{
               int Price_Car=Integer.parseInt(price_car);
               int Year_Car=Integer.parseInt(year_car);
               
               if(name_car=="BMW"){
                 BMW b = new BMW();
                b.add(Kind, mode_car, color_car, Price_Car, Year_Car);
                 JOptionPane.showMessageDialog(panel, "The Car has been added");
                 dispose();
                 }
                 else if(name_car=="Audi"){
                Audi b = new Audi();
                 b.add(Kind, mode_car, color_car, Price_Car, Year_Car);
                 JOptionPane.showMessageDialog(panel, "The Car has been added");
                 dispose();
                 }
               else  if(name_car=="Kia"){
                 Kia b = new Kia();
                b.add(Kind, mode_car, color_car, Price_Car, Year_Car);
                 JOptionPane.showMessageDialog(panel, "The Car has been added");
                 dispose();
                 }
               else if(name_car=="Toyota"){
                 Toyota b = new Toyota();
                b.add(Kind, mode_car, color_car, Price_Car, Year_Car);
                 JOptionPane.showMessageDialog(panel, "The Car has been added");
                 dispose();
                 }
           }
            
            }
            
            else if (e.getSource()==b_img){
             JFileChooser img = new JFileChooser();
             int retunvalue=img.showOpenDialog(null);
            }
            else if (e.getSource()==Back){
            dispose();
            ADD_DeletionChoosing ad = new ADD_DeletionChoosing("ِADD",Name);
            
            }
        }
    
    
    
    }
    
    
}
