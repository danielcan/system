/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.project.control;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


/**
 *
 * @author PC-lite
 */
public class BackgroundPanel extends JPanel {
   private Image image;
   
   @Override
   public void paint(Graphics g){
      // image  = new ImageIcon(getClass().getResource("/org/project/Image/istockphoto-949302248-170667a.jpg")).getImage();
       image  = new ImageIcon(getClass().getResource("/org/project/minis/fondo.png")).getImage();
       g.drawImage(image, 0, 0, 998,555,this);
       setOpaque(false);
       super.paint(g);
   }
    
}
