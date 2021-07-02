/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carssalesapplication;

import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JPanel;

/**
 *
 * @author OmarAdEL
 */
public class Events extends JFrame implements ActionListener{
    
     JPanel panel;
     JButton b1;
     int counter =0;
     char op ;
    public Events(JPanel panel,JButton button,char c) {
        this.panel = panel;
        this.b1=button;
        this.op=c;
    }

    public Events(JButton b) {
        b1=b;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            
            
         if(op=='d'){
         panel.setVisible(false);
            
            }
            else if (op=='b'){
                //panel.getParent().removeNotify();
                
            Buying b = new Buying('b');
          
            return ;
            }
        }
        
    }
    
}
