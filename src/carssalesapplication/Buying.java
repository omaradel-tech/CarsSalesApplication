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
public class Buying extends JFrame {
     JPanel panel = new JPanel();
    JButton BMW,Audio,Kia,Toyota,Back;
   Events event = new Events();
     Font font= new Font("Serif",Font.ITALIC,27);
    JButton submit;
      JButton cancel;
      String Name;
      JPanel panel1;
       JTextField entername,enternum,entercredit ;
    char op;

    public Buying(char c) {
        op=c;
                if(c=='c'){
        this .choose();
        }
      else if (c=='b'){
     
    buyingSuccess();
    
    }
    }
    
    public Buying(char c,String name) {
        this.Name=name;
        if(c=='c'){
        this .choose();
        }
      else if (c=='b'){
     
    buyingSuccess();
    
    }
      
    }
   public void buyingSuccess(){
        JLabel name,number,credit;
     
      

      ImageIcon img;
      JLabel background;
      Font font;

       
   font= new Font("Serif",Font.ITALIC,27);

        img=new ImageIcon("backlog.jpg");
        background=new JLabel("",img,JLabel.CENTER);
        this.setTitle("Buying Process");
        this.setSize(900, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        name=new JLabel("Name:");
        number=new JLabel("Number:");
        credit=new JLabel("Credit Card:");
        entername = new JTextField();
        enternum = new JTextField();
        entercredit = new JTextField();
        submit=new JButton("Submit");
        cancel = new JButton("Cancel");
        
        panel1 = new JPanel ();
        
        submit.setBounds(320, 250, 100, 30);
        cancel.setBounds(450, 250, 100, 30);
        name.setBounds(100, 110, 100, 25);
        name.setFont(font);
        number.setBounds(100, 150, 100, 25);
        number.setFont(font);
        credit.setBounds(100, 190, 150, 25);
        credit.setFont(font);

        
        entername.setBounds(270, 110, 200, 30);
        enternum.setBounds(270, 150, 200, 30);
        entercredit.setBounds(270, 190, 200, 30);
        
        
        this.setLayout(null);
        this.add(name);
        this.add(number);
        this.add(credit);
        this.add(entername);
        this.add(entercredit);
        this.add(enternum);
        this.add(submit);
        this.add(cancel);
        submit.addActionListener(event);
        cancel.addActionListener(event);
        panel1.setLayout(null);
        panel1.setSize(900, 516);
        panel1.add(background);
        background.setSize(900, 516);
        this.add(panel1);    
        
        this.setVisible(true);
   
   
   
   
   
   } 
    
    
    
    public void choose(){
      this.setTitle("Cars Sales Application");
       
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setSize(900, 600);
       this.setResizable(false);
       this.setLocation(500, 100);
       this.add(panel);
        // definition 
        BMW = new JButton ("BMW");
         Audio = new JButton ("Audi");
          Kia = new JButton ("Kia");
           Toyota = new JButton ("Toyota");
           Back= new JButton("Back");
           panel.setLayout(null);
           BMW.setBounds(350,70, 150, 40);
           Audio.setBounds(350, 170, 150, 40);
           Kia.setBounds(350, 270, 150, 40);
           Toyota.setBounds(350, 370, 150, 40);
           Back.setBounds(350, 470, 150, 40);
           
           BMW.setFont(font);
            Audio.setFont(font); 
            Kia.setFont(font);
             Toyota.setFont(font);
            Back.setFont(font);
            
           
      BMW.addActionListener(event);
        Audio.addActionListener(event);
        Kia.addActionListener(event);
       Toyota.addActionListener(event);
       Back.addActionListener(event);
//       
        panel.add(BMW);
        panel.add(Audio);
        panel.add(Kia);
        panel.add(Toyota);
        panel.add(Back);
      this.setVisible(true);

    
    }
    private class Events implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==Back){
                dispose();
             SignIn in = new SignIn(Name);
            }
            else if(e.getSource()==BMW){
              dispose();
            BMW b = new BMW();
            b.Buy(Name);
            }
          else  if(e.getSource()==Audio){
              dispose();
            Audi a = new Audi();
            a.Buy(Name);
            
            }
            else if(e.getSource()==Kia){
                 dispose();
                Kia k = new Kia();
                k.Buy(Name);
            }
            else if(e.getSource()==Toyota){
             dispose();
                Toyota t = new Toyota();
            t.Buy(Name);
            }
          else   if(e.getSource()==cancel){
             dispose();
            }
          else if (e.getSource()==submit){
              // JTextField entername,enternum,entercredit ;
               String name,num,credit;
               name = entername.getText();
               num=enternum.getText().toString();
               credit=entercredit.getText().toString();
               if(!name.isEmpty() && num.charAt(0)>='0' && credit.charAt(0)>'0'){
                    JOptionPane.showMessageDialog(panel1, "You have bought this car successfully");
                    dispose();
               }
               else {
                JOptionPane.showMessageDialog(panel1, "Please enter correct information");
               }
          }
        }
    }
}
