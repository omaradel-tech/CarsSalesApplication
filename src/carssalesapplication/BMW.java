/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carssalesapplication;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author OmarAdEL
 */
public class BMW extends Cars {
   
   JLabel[] Price = new JLabel[5];
  
   JLabel[] ManuFacture = new JLabel[5];
   JLabel[] Color = new JLabel[5];
   JLabel[] Year = new JLabel[5];
   String[] price = new String[5];
   //String[] year = new String[5];
   JLabel [] Model = new JLabel[5];
   Cars[] bmw = new BMW[5];
   
  
   
   Font font;
    
    public BMW() {
        
    }
    public BMW(int year, String ManuFacture, int price, String Color, String model) {
        super(year, ManuFacture, price, Color, model);
    }
    @Override
    public void display(JPanel panel, int i,char c) {
        initail();
     panel.setLayout(null);
     String year1=String.valueOf(bmw[i].year);
       Model[i]= new JLabel("Model:"+bmw[i].model);
      Price[i] = new JLabel("Price:"+price[i]);
      ManuFacture[i] = new JLabel("Manufacture:"+bmw[i].ManuFacture);
      Color[i]= new JLabel("Color :"+bmw[i].Color);
      Year[i] = new JLabel("Year :"+bmw[i]);
       Model[i].setFont(font);
       Price[i].setFont(font);
      ManuFacture[i].setFont(font);
       Color[i].setFont(font);
       Year[i] .setFont(font);
       panel.setLayout(null);
       background[i].setBounds(125, 0,200,150);
      Model[i].setBounds(170, 155, 200, 40);
       Price[i].setBounds(30, 200, 200, 40);
      ManuFacture[i].setBounds(230, 200, 200, 40);
      Color[i].setBounds(30, 240, 200, 40);
       Year[i].setBounds(250, 240, 200, 40);
        panel.add(background[i]);
        panel.add(Model[i]);
       panel.add(Price[i]);
       panel.add(ManuFacture[i]);
        panel.add(Color[i]);
         panel.add(Year[i]);
          panel.validate();
         if(c=='d'){
            button[i].setBounds(150,210,70,40);
            panel.add(button[i]);
            Events event =new Events(panel,button[i],'d');
            button[i].addActionListener(event);
         }   
       else  if(c=='b'){
            button2[i].setBounds(150,210,70,40);
            panel.add(button2[i]);
            Events event =new Events(panel,button2[i],'b');
            button2[i].addActionListener(event);
         }   
    }
  

    @Override
    public void Delete(String Name) {
        DisplayBMW b= new DisplayBMW('d',Name);
    }
    
    
    public void initail(){
     font= new Font("Serif",Font.ITALIC,23);
     bmw[0] = new BMW(2000,"BMW",115,"White","X6"); 
     bmw[1] = new BMW(2005,"BMW",100,"Red","M5"); 
     bmw[2] = new BMW(2010,"BMW",130,"Silver","740li"); 
     bmw[3] = new BMW(2015,"BMW",130,"BLue","m850i"); 
    
     img[0]= new ImageIcon("X6.jpg");
     img[1]= new ImageIcon("M5.png");
     img[2]= new ImageIcon("740li.jpg");
     img[3]= new ImageIcon("m850i.jpg");
     
     button[0]= new JButton("Delete");
     button[1]= new JButton("Delete");
     button[2]= new JButton("Delete");
     button[3]= new JButton("Delete");
     
     button2[0]= new JButton("Buy");
     button2[1]= new JButton("Buy");
     button2[2]= new JButton("Buy");
     button2[3]= new JButton("Buy");
            
     background[0]=new JLabel("",img[0],JLabel.CENTER);
     background[1]=new JLabel("",img[1],JLabel.CENTER);
     background[2]=new JLabel("",img[2],JLabel.CENTER);
    background[3]=new JLabel("",img[3],JLabel.CENTER);
    price[0]=String.valueOf(bmw[0].price);
    price[1]=String.valueOf(bmw[1].price);
    price[2]=String.valueOf(bmw[2].price);
    price[3]=String.valueOf(bmw[3].price);
    
   
    }

    @Override
    public void add( String name, String model, String Color, int Price, int Year) {
        initail();
       bmw[4] = new BMW();
       bmw[4].ManuFacture=name;
       bmw[4].Color=Color;
       bmw[4].model=model;
       bmw[4].price=Price;
       bmw[4].year=Year;
    }

    @Override
    public void Buy(String name) {
       DisplayBMW b= new DisplayBMW('b',name);
    }

    
    
}
