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
public class Toyota extends Cars {
  
   JLabel[] Price = new JLabel[5];
   
   JLabel[] ManuFacture = new JLabel[5];
   JLabel[] Color = new JLabel[5];
   JLabel[] Year = new JLabel[5];
   String[] price = new String[5];
 
   JLabel [] Model = new JLabel[5];
   Cars[] toyota = new Toyota[5];
   Font font;
   
   
   Events event ;
   
    public Toyota() {
    }

    public Toyota(int year, String ManuFacture, int price, String Color, String model) {
        super(year, ManuFacture, price, Color, model);
    }
    
    @Override
    public void display(JPanel panel, int i,char c) {
         initail();
     panel.setLayout(null);
     String year1=String.valueOf(toyota[i].year);
       Model[i]= new JLabel("Model:"+toyota[i].model);
      Price[i] = new JLabel("Price:"+price[i]);
      ManuFacture[i] = new JLabel("Manufacture:"+toyota[i].ManuFacture);
      Color[i]= new JLabel("Color :"+toyota[i].Color);
      Year[i] = new JLabel("Year :"+toyota[i]);
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
     toyota[0] = new Toyota(2002,"Toyota",98,"Red","yaris"); 
     toyota[1] = new Toyota(2008,"Toyota",300,"Blue","corolla"); 
     toyota[2] = new Toyota(2016,"Toyota",260,"White","chr"); 
     toyota[3] = new Toyota(2007,"Toyota",310,"Black","camry"); 
    
     img[0]= new ImageIcon("yaris.jpg");
     img[1]= new ImageIcon("corolla.jpg");
     img[2]= new ImageIcon("chr.jpeg");
     img[3]= new ImageIcon("camry.jpg");
     
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
    price[0]=String.valueOf(toyota[0].price);
    price[1]=String.valueOf(toyota[1].price);
    price[2]=String.valueOf(toyota[2].price);
    price[3]=String.valueOf(toyota[3].price);
    

    }

  

    @Override
    public void Delete(String Name) {
        DisplayToyota t= new DisplayToyota('d',Name);
    }

    @Override
    public void add( String name, String model, String Color, int Price, int Year) {
        toyota[4] = new Toyota();
       toyota[4].ManuFacture=name;
       toyota[4].Color=Color;
       toyota[4].model=model;
       toyota[4].price=Price;
       toyota[4].year=Year;
    }

    @Override
    public void Buy(String name) {
       DisplayToyota t= new DisplayToyota('b',name);
    }
    
}
