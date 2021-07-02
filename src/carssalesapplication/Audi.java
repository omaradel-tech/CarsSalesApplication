/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carssalesapplication;

import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;

/**
 *
 * @author OmarAdEL
 */
public class Audi extends Cars {
    
   JLabel[] Price = new JLabel[5];

   JLabel[] ManuFacture = new JLabel[5];
   JLabel[] Color = new JLabel[5];
   JLabel[] Year = new JLabel[5];
   String[] price = new String[5];
   
   JLabel [] Model = new JLabel[5];
   Cars[] audi = new Audi[5];
    
     
   Font font;
    Events event ;
    public Audi() {
    }

    public Audi(int year, String ManuFacture, int price, String Color, String model) {
        super(year, ManuFacture, price, Color, model);
    }
    
    @Override
    public void display(JPanel panel, int i,char c) {
         initail();
     panel.setLayout(null);
     String year1=String.valueOf(audi[i].year);
       Model[i]= new JLabel("Model:"+audi[i].model);
      Price[i] = new JLabel("Price:"+price[i]);
      ManuFacture[i] = new JLabel("Manufacture:"+audi[i].ManuFacture);
      Color[i]= new JLabel("Color :"+audi[i].Color);
      Year[i] = new JLabel("Year :"+audi[i]);
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
         if(c=='d'){
            button[i].setBounds(150,210,70,40);
            panel.add(button[i]);
            event =new Events(panel,button[i],'d');
            button[i].addActionListener(event);
         }
         else  if(c=='b'){
            button2[i].setBounds(150,210,70,40);
            panel.add(button2[i]);
            Events event =new Events(panel,button2[i],'b');
            button2[i].addActionListener(event);
         }   
    }
    public void initail(){
     font= new Font("Serif",Font.ITALIC,23);
     audi[0] = new Audi(2002,"Audi",600,"Oily","a5"); 
     audi[1] = new Audi(2008,"Audi",300,"Black","a6"); 
     audi[2] = new Audi(2003,"Audi",260,"Orange","q3"); 
     audi[3] = new Audi(2010,"Audi",310,"Botanical","Q7"); 
    
     img[0]= new ImageIcon("a5.jpg");
     img[1]= new ImageIcon("a6.jpg");
     img[2]= new ImageIcon("q3.jpg");
     img[3]= new ImageIcon("Q7.jpg");
     
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
    price[0]=String.valueOf(audi[0].price);
    price[1]=String.valueOf(audi[1].price);
    price[2]=String.valueOf(audi[2].price);
    price[3]=String.valueOf(audi[3].price);
    

    
    }

    @Override
    public void Delete(String Name) {
       DisplayAudi a= new DisplayAudi('d',Name);
    }

    @Override
    public void add(String name, String model, String Color, int Price, int Year) {
       audi[4] = new Audi();
       audi[4].ManuFacture=name;
       audi[4].Color=Color;
       audi[4].model=model;
       audi[4].price=Price;
       audi[4].year=Year;
       
    }

    @Override
    public void Buy(String name) {
        DisplayAudi a = new DisplayAudi('b',name);
    }
    
}
