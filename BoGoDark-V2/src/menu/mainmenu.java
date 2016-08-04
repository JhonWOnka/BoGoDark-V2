/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author Software
 */
public class mainmenu extends JFrame{
    
   public mainmenu()
           {    
               super("BoGoDark v 0.12");
               setBounds(100,100,500,500);
               setVisible(true);
               setDefaultCloseOperation(EXIT_ON_CLOSE);
               setLayout(new BorderLayout());
               JLabel background = new JLabel(new ImageIcon("icon1.png"));
               
           }
    
}
