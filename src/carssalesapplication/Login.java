/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carssalesapplication;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.layout.Background;
import javax.swing.*;

/**
 *
 * @author OmarAdEL
 */
// second Jframe
public class Login extends JFrame {
    private final String username="omar";
    private final String password="2";
    private final String Admin= "admin";
    private final String Admin_password="2";
     
    
    JPanel panel;
    ImageIcon img;
    JLabel background,UserNameLabel,PasswordLabel;
    JTextField usernameText;
    JPasswordField passowrdText;
    Font font;
    JButton SignIn,Cancel;
    Events event = new Events();
    JMenu m1,m2,m3;
    JMenuBar mb;
    JLabel []Team = new JLabel[5];
    public Login() {
        shown();
    }
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
       UserNameLabel=new JLabel("UserName : ");
       PasswordLabel=new JLabel("Password : ");
       usernameText=new JTextField();
       passowrdText= new JPasswordField();
       font= new Font("Serif",Font.ITALIC,27);
       SignIn=new JButton("SignIn");
       Cancel=new JButton("Cancel");
       m1 = new JMenu("TeamMembers");
       m2 = new JMenu("Team G098");
       m3 = new JMenu("Help");
       mb= new JMenuBar();
       Team[0] = new JLabel("OmarAdel");
       Team[1] = new JLabel("AmrEldeeb");
       Team[2] = new JLabel("OmarShrief");
       Team[3] = new JLabel("EssraAli");
       Team[4] = new JLabel("AmiraAyman");
       
       //
       m1.add(Team[0]); m1.add(Team[1]); m1.add(Team[2]); m1.add(Team[3]); m1.add(Team[4]);
       panel.setLayout(null);
       UserNameLabel.setBounds(100, 150, 150, 40);
       UserNameLabel.setFont(font);
       usernameText.setBounds(270,160,200,30);
       
       
       PasswordLabel.setBounds(100, 200, 150, 40);
       PasswordLabel.setFont(font);
       passowrdText.setBounds(270,210,200,30);
       background.setBounds(0, 30, 900, 570);
       
       SignIn.setBounds(180,270,100,20);
       Cancel.setBounds(320,270,100,20);
       
         mb.setBounds(0, 0, 900, 30);
         m1.setFont(font);
         m2.setFont(font);
         m3.setFont(font);
       
       mb.add(m1);
       mb.add(m2);
       mb.add(m3);
       
       panel.add(UserNameLabel);
       panel.add(PasswordLabel);
       panel.add(usernameText);
       panel.add(passowrdText);
       panel.add(SignIn);
       panel.add(Cancel);
       panel.add(background);
       SignIn.addActionListener(event);
        Cancel.addActionListener(event);
       panel.add(mb);
      
       this.add(panel);
        this.validate();
        this.setVisible(true);
    }
    private class Events implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
         if(e.getSource()==SignIn){
           
       String name= usernameText.getText().toString();
       String UserPassword=passowrdText.getText();
       if(  (name.compareTo(username)==0 && UserPassword.compareTo(password)==0 ) || (name.compareTo(Admin)==0 && UserPassword.compareTo(Admin_password)==0)    )
       {
          dispose();
          SignIn ev= new SignIn (name);
       }
       
       else{
           JOptionPane.showMessageDialog(rootPane, "invalid password or username");
           
       }
       
       }
         else if(e.getSource()==Cancel){
                dispose();
            }
       
        }
    
    }
}
