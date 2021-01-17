/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.project.control;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author PC-lite
 */
public class Objectview extends JLabel implements MouseListener, MouseMotionListener {

    /**
     * Identificador de objeto
     */
    private String key = "";
    /**
     * Posicion de imagen
     */
    private Point posicion = new Point(0, 0);
    /**
     * Tamaño de imagen
     */
    private Dimension d = new Dimension(124, 150);
    /**
     * tamaño de la base
     */
    private Dimension e = new Dimension(500, 500);
    /**
     *
     */
    private Dimension f = new Dimension(700, 20);
    /**
     * variable que sirve para calcular el movimiento del objeto
     */
    private Point start_loc;
    /**
     * variable que sirve para calcular el movimiento del objeto
     */
    private Point start_drag;
    /**
     * variable que sirve para calcular el movimiento del objeto
     */
    private Point offset;
    /**
     * variables auxiliares para el desplazamiento del objeto
     */
    private int nuevo_X = 1;
    private int nuevo_Y = 1;

    
    private int almace = 0 ;
    /*
    
    **/
    public Objectview(String key) {
        //se inician propiedades de objeto
        this.key = key;
        this.setToolTipText(key);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setSize(f);
        this.setPreferredSize(f);
        this.setIcon(new ImageIcon(getClass().getResource("/org/project/Image/Linea-Larga.png")));
        this.setText("");
        this.setVisible(true);
        this.setLocation(posicion);
        //se agregan los listener
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public Objectview(int posic) {
        //se inician propiedades de objeto
        this.key = key;
        this.setToolTipText(key);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setSize(d);
        this.setPreferredSize(d);
        this.almace = posic;
        if (posic == 0) {
            this.setIcon(new ImageIcon(getClass().getResource("/org/project/minis/Burners-simple.png")));
        } else if (posic == 1) {
            this.setIcon(new ImageIcon(getClass().getResource("/org/project/minis/Burners.png")));
        } else if (posic == 2) {
            this.setIcon(new ImageIcon(getClass().getResource("/org/project/minis/Flat-Griddle.png")));
        } else if (posic == 3) {
            this.setIcon(new ImageIcon(getClass().getResource("/org/project/minis/Flyer.png")));
        } else if (posic == 4) {
            this.setIcon(new ImageIcon(getClass().getResource("/org/project/minis/Grill.png")));
        } else if (posic == 5) {
            this.setIcon(new ImageIcon(getClass().getResource("/org/project/minis/Plep-table.png")));
        } else if (posic == 6) {
            this.setIcon(new ImageIcon(getClass().getResource("/org/project/minis/back-door.png")));
        } else if (posic == 7) {
            this.setIcon(new ImageIcon(getClass().getResource("/org/project/minis/cazo.png")));
        } else {
            this.setIcon(new ImageIcon(getClass().getResource("/org/project/minis/warmer.png")));
        }
        this.setText("");
        this.setVisible(true);
        this.setLocation(posicion);
        //se agregan los listener
        this.addMouseListener(this);
        this.addMouseMotionListener(this);

    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.start_drag = getScreenLocation(e);
        this.start_loc = this.getLocation();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        nuevo_X = (this.getLocation().x);
        nuevo_Y = (this.getLocation().y);
        this.setLocation(nuevo_X, nuevo_Y);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setBorder(BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51), 1));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBorder(null);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Point current = this.getScreenLocation(e);
        offset = new Point((int) current.getX() - (int) start_drag.getX(), (int) current.getY() - (int) start_drag.getY());
        Point new_location = new Point((int) (this.start_loc.getX() + offset.getX()), (int) (this.start_loc.getY() + offset.getY()));
        this.setLocation(new_location);
        this.getLocation();
        System.out.println(this.getLocation().getX());
        
        System.out.println(this.getLocation().getY());
        if(this.almace == 0){
         if(this.getLocation().getX() == 45){
            if(this.getLocation().getY() == 164){
                JOptionPane.showMessageDialog(null, "colocado en el traila");
            }
         } 
        }else if(this.almace == 1){
            if(this.getLocation().getX() == 45){
                if(this.getLocation().getY() == 164){
                    JOptionPane.showMessageDialog(null, "colocado en el traila 1");
                }
             } 
        }else if(this.almace == 2){
            if(this.getLocation().getX() == 45){
                if(this.getLocation().getY() == 164){
                   JOptionPane.showMessageDialog(null, "colocado en el traila 2");
                }
            } 
        }else if(this.almace == 3){
            if(this.getLocation().getX() == 45){
                if(this.getLocation().getY() == 164){
                    JOptionPane.showMessageDialog(null, "colocado en el traila 3");
                }
         } 
            
        }
        
        
       
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    /**
     * metodo para obtener la posicion del frame en la pantalla
     *
     * @param MouseEvent evt
     */
    private Point getScreenLocation(MouseEvent evt) {
        Point cursor = evt.getPoint();
        Point target_location = this.getLocationOnScreen();
        return new Point((int) (target_location.getX() + cursor.getX()),
                (int) (target_location.getY() + cursor.getY()));
    }
}
