/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carssalesapplication;
import javax.swing.*;
/**
 *
 * @author OmarAdEL
 */
public class Display {
    BMW b1=new BMW();
    Kia kia= new Kia();
    Toyota toyota= new Toyota();
    Audi audi = new Audi();
    public Display() {
    }

    /**
     *
     * @param panel
     * @param i
     */
    public void Display_Cars(JPanel panel , int i, char c,char o){
        if(c=='m'){
             b1.display(panel, i,o);
        }
        else if(c=='c'){
         kia.display(panel, i,o);
        }
        else if (c=='t'){
        toyota.display(panel, i,o);
        }
        else if (c=='a'){
        audi.display(panel, i,o);
        }
            
        
    }

}
