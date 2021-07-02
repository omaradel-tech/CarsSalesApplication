package carssalesapplication;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DELL
 */
public class Search extends JFrame{
    ImageIcon[] img = new ImageIcon[16];
    JLabel image[] = new JLabel[16];
    JLabel NotFound;
    CarForSearch[] cars = new CarForSearch[17];
    JPanel jPanel1;
    JPanel[] jPanel = new JPanel[16];
    JLabel Manu;
    JLabel Model;
    JLabel Price;
    JLabel Color;
    JLabel Year;
    JButton cancel;
    JButton[] buy = new JButton[16];
    private String name;
   public Search(String name){
       this.name = name;
       //Initialize-->
       img = new ImageIcon[16];
       initialize();
       SetImageCar();
       
       jPanel1 = new JPanel();
       cancel = new JButton("Cancel");
       NotFound = new JLabel("Ther's No Data To Display");
       //Frame-->
       setSize(1230, 720);
       setTitle("Search For Cars");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setResizable(false);
       setLayout(null);
       setLocationRelativeTo(null);
       setLayout(null);
       // Button To Cancel-->
       jPanel1.setBounds(0, 635, 1230, 130);
       jPanel1.setLayout(null);
       //jPanel1.setBackground(new java.awt.Color(255, 255, 255));
       cancel.setBounds(580, 0 , 100, 40);
       cancel.setBackground(new java.awt.Color(0,102,102));
       cancel.setForeground(new java.awt.Color(255, 255, 255));
       cancel.setFont(new java.awt.Font("Times New Roman", 3, 20));
       jPanel1.add(cancel);
       add(jPanel1);      
       ActionCancel();
       //Enter invalid Data-->
       NotFound.setBounds(300, 200, 600, 200);
       NotFound.setFont(new Font("arial", 1, 45));
       
       setVisible(true);
   }
  public void SearchCar(String word){
      int hight1 = 0;
      boolean found = false;
                for(int i=0; i<16; i++){
                   String year = String.valueOf(cars[i].YearOfPurch);
                   //String cost =  String.valueOf(cars[i].cost);
                  if(word.equals(cars[i].manufacturer)|| word.equals(cars[i].model)|| word.equals(cars[i].color)
                          || word.equals(year)|| word.equals(cars[i].cost)){
                       Draw(i, hight1);
                       hight1+=154;
                       found = true;
                  }
                }
                if(!found){
                    add(NotFound);
                }
  }
   ////////////////Data Of Cars//////////
   private void initialize(){
       //BMW--->
        cars[0] = new CarForSearch("BMW","X6", "White", 2000, "115$");
        cars[1] = new CarForSearch("BMW","M5", "Red", 2005, "100$");
        cars[2] = new CarForSearch("BMW","740li", "Silver", 2010, "130$");
        cars[3] = new CarForSearch("BMW","m850i", "Blue", 2015, "130$");
        //Toyota--->
       cars[4] = new CarForSearch("Toyota","Yaris", "Red", 2002, "98$");
        cars[5] = new CarForSearch("Toyota","Corolla", "Blue", 2008, "300$");
        cars[6] = new CarForSearch("Toyota","Chr", "White", 2016, "260$");
        cars[7] = new CarForSearch("Toyota","Camry", "Black", 2007, "310$");
        //Kia--->
        cars[8] = new CarForSearch("Kia","Carens", "Black", 2001, "100$");
        cars[9] = new CarForSearch("Kia","Carnival", "Black", 2004, "80$");
        cars[10] = new CarForSearch("Kia","Cerato", "Red", 2011, "90$");
        cars[11] = new CarForSearch("Kia","Rio", "Red", 2014, "105$");
        //Audi--->
        cars[12] = new CarForSearch("Audi","a5", "Oily", 2002, "600$");
        cars[13] = new CarForSearch("Audi","a6", "Black", 2008, "300$");
        cars[14] = new CarForSearch("Audi","Q3", "Orange", 2003, "260$");
        cars[15] = new CarForSearch("Audi","Q7", "Botanical", 2010, "310$");
   }
   ////////////////Images Of Cars//////////
   private void SetImageCar(){
       //Bmw--->
        img[0] = new ImageIcon("X6.jpg");
        img[1] = new ImageIcon("M5.png");
        img[2] = new ImageIcon("740li.jpg");
        img[3] = new ImageIcon("m850i.jpg");
        //Toyota--->
        img[4] = new ImageIcon("yaris.jpg");
        img[5] = new ImageIcon("corolla.jpg");
        img[6] = new ImageIcon("chr.jpeg");
        img[7] = new ImageIcon("camry.jpg");
        //Kia--->
        img[8] = new ImageIcon("carens.jpg");
        img[9] = new ImageIcon("carnival.jpg");
        img[10] = new ImageIcon("cerato.jpg");
        img[11] = new ImageIcon("rio.jpg");
        //Audi--->
        img[12] = new ImageIcon("a5.jpg");
        img[13] = new ImageIcon("a6.jpg");
        img[14] = new ImageIcon("q3.jpg");
        img[15] = new ImageIcon("Q7.jpg");
        
        for(int i=0; i<16; i++){
            image[i] = new JLabel(img[i]);
        }
   }
   ///////////////Actions////////////////
   private void ActionCancel(){
        cancel.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent evt) {
                dispose();
                
            }
        });
   }
   //////////////Draw////////////////////
  private void Draw(int i, int hight){
      jPanel[i] = new JPanel();
      jPanel[i].setLayout(null);
      jPanel[i].setBounds(0, hight+10, 1230, 145);
      jPanel[i].setBackground(new java.awt.Color(255, 255, 255));
      jPanel[i].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
      add(jPanel[i]);
       buy[i] = new JButton("Buy");
        int width = 10;
       Model = new JLabel("Model :");
       Price = new JLabel("Price :");
       Color = new JLabel("Color :");
       Year = new JLabel("Year of parch :");
       JLabel draw_car = new JLabel(""+cars[i].manufacturer);
       JLabel draw_car_model = new JLabel(""+cars[i].model);
       JLabel draw_car_color = new JLabel(""+cars[i].color);
       JLabel draw_car_year = new JLabel(""+cars[i].YearOfPurch);
       JLabel draw_car_cost = new JLabel(""+cars[i].cost);
       
       draw_car.setFont(new Font("Tahoma", 1, 26));
        
       draw_car.setBounds(width, 0, 100, 40);
       jPanel[i].add(draw_car);
       
       image[i] = new JLabel(img[i]);
       image[i].setBounds(width+1000, -15, 220, 170);
       jPanel[i].add(image[i]);
       
       Model.setFont(new Font("Tahoma", 1, 20));
       Model.setBounds(width+20, 45, 100, 50);
       jPanel[i].add(Model);
       draw_car_model.setFont(new Font("Times New Roman", 1, 23));
       draw_car_model.setBounds(width+100, 45, 100, 50);
       jPanel[i].add(draw_car_model);
      
       Color.setFont(new Font("Tahoma", 1, 20));
       Color.setBounds(width+280, 45, 100, 50);
       jPanel[i].add(Color);
       draw_car_color.setFont(new Font("Times New Roman", 1, 23));
       draw_car_color.setBounds(width+350, 45, 100, 50);
       jPanel[i].add(draw_car_color);
       
       Year.setFont(new Font("Tahoma", 1, 20));
       Year.setBounds(width+500, 45, 200, 50);
       jPanel[i].add(Year);
       draw_car_year.setFont(new Font("Times New Roman", 1, 23));
       draw_car_year.setBounds(width+660, 45, 100, 50);
       jPanel[i].add(draw_car_year);
       
       Price.setFont(new Font("Tahoma", 1, 20));
       Price.setBounds(width+830, 45, 100, 50);
       jPanel[i].add(Price);   
       draw_car_cost.setFont(new Font("Times New Roman", 1, 23));
       draw_car_cost.setBounds(width+900, 45, 100, 50);
       jPanel[i].add(draw_car_cost);
       
       buy[i].setBounds(width+450, 105, 80, 30);
       buy[i].setFont(new java.awt.Font("Times New Roman", 3, 18));
       if(name.equals("omar")){
       jPanel[i].add(buy[i]);
       }
       buy(buy[i]);
       }
  //////////////Buy Car//////////////////
  private void buy(JButton button){
       button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               Buying b = new Buying('b');
            }
        });
  }
}