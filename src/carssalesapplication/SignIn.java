/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carssalesapplication;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author OmarAdEL
 */

        // third Jframe
public class SignIn extends JFrame{
    JPanel panel;
    ImageIcon img;
    JLabel background,Welcome,PasswordLabel;
    JTextField usernameText;
    JPasswordField passowrdText;
    Font font;
    JButton Add_delete,View,Search,Buying,Logout;
    Events event = new Events();
    private String Name;
    JLabel []Team = new JLabel[5];

    JMenu m1,m2,m3;
    JMenuBar mb;
    
    public SignIn(String name) {
       this.Name=name;
        this.shown();
    }

   /* public SignIn() {
        this.shown();
    }*/
    
    public void shown(){
       this.setTitle("Cars Sales Application");
       
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setSize(900, 600);
       this.setResizable(false);
       this.setLocationRelativeTo(null);
       
       // objects
       panel= new JPanel();
       img=new ImageIcon("backlog.jpg");
       background=new JLabel("",img,JLabel.CENTER);
       Welcome=new JLabel("Welcome Mr " +Name);
       PasswordLabel=new JLabel("Password : ");
       usernameText=new JTextField();
       passowrdText= new JPasswordField();
       font= new Font("Serif",Font.ITALIC,30);
       Add_delete=new JButton("Add/Delete Cars");
       View=new JButton("View Details");
       Search=new JButton("Searching for a Car");
       Buying=new JButton("Buying a Car");
        Team[0] = new JLabel("OmarAdel");
       Team[1] = new JLabel("AmrEldeeb");
       Team[2] = new JLabel("OmarShrief");
       Team[3] = new JLabel("EssraAli");
       Team[4] = new JLabel("AmiraAyman");
       
       
       
       m1 = new JMenu("TeamMembers");
       m2 = new JMenu("Team G098");
       m3 = new JMenu("Help");
       mb= new JMenuBar();
       Logout = new JButton("Logout");
       
       //
         m1.add(Team[0]); m1.add(Team[1]); m1.add(Team[2]); m1.add(Team[3]); m1.add(Team[4]);
       
       //
       background.setBounds(0, 0, 900, 570);
       Welcome.setBounds(350, 20, 250, 40);
       Welcome.setFont(font);
       
       Add_delete.setBounds(370, 90, 150, 30);
       View.setBounds(370, 150, 150, 30);
       Search.setBounds(370, 210, 150, 30);
       Buying.setBounds(370, 270, 150, 30);
      Logout.setBounds(370, 330, 150, 30);
       mb.setBounds(0, 0, 900, 30);
       this.setLayout(null);
       panel.setBounds(0, 30, 900, 570);
       panel.setLayout(null);
       
       
       m1.setFont(font);
       m2.setFont(font);
       m3.setFont(font);
   //    mb.add(Logout);
       mb.add(m1);
       mb.add(m2);
       mb.add(m3);
       
      
       this.add(mb);
       panel.add(Welcome);
       panel.add(Add_delete);
       panel.add(View);
       panel.add(Search);
       panel.add(Buying);
       panel.add(Logout);
       panel.add(background);
       View.addActionListener(event);
       Add_delete.addActionListener(event);
        Logout.addActionListener(event);
        Buying.addActionListener(event);
        Search.addActionListener(event);
       this.add(panel);
       
       this.validate();
       this.setVisible(true);
    }
    private class Events implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==Add_delete){
                if( Name.compareTo("omar")==0){
                      JOptionPane.showMessageDialog(panel, "sorry Only Admin Can access this");
                }
                else{
                  dispose();
                  ADD_Delete d1 = new ADD_Delete(Name);
                }
            
            }
            else if(e.getSource()==View){
            dispose();
            ViewDetails v = new ViewDetails(Name);
            }
            else if (e.getSource()==Logout){
            dispose();
            Login lg = new Login();
            }
            else if(e.getSource()==Buying){
                if( Name.compareTo("omar")==0){
                      dispose();
                      Buying s = new Buying('c',Name);
                }
                else{
                  JOptionPane.showMessageDialog(panel, "sorry Only Buyer Can access this");
                }
            
            }
            else if(e.getSource()==Search){
                 dispose();
                  SearchForCar b =new SearchForCar(Name);
             }       


       
    }
    

    }
    
    
    
    
}