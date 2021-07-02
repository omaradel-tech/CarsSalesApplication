/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carssalesapplication;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author OmarAdEL
 */
public abstract class Cars {
    protected int year;
    protected String ManuFacture;
    protected int price;
    protected String Color;
    protected String model;
    protected ImageIcon[] img = new ImageIcon[5];
    protected JLabel[] background = new JLabel[5];
    protected   JButton [] button =new JButton[5];
    protected JButton [] button2 =new JButton[5];
    public Cars() {
    }

    public Cars(int year, String ManuFacture, int price, String Color, String model) {
        this.year = year;
        this.ManuFacture = ManuFacture;
        this.price = price;
        this.Color = Color;
        this.model = model;
    }
  public abstract void  display(JPanel panel,int i,char c);
  public abstract void add (String name,String model,String Color,int Price,int Year);
  public abstract void Delete (String Name);
  public abstract void Buy(String name);
  
}
