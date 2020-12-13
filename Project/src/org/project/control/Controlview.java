/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.project.control;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
//import java.net.URL;
import javax.swing.DefaultListCellRenderer;
//import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
//import javax.swing.SwingUtilities;

/**
 *
 * @author PC-lite
 */
public class Controlview {
     private Map<String, ImageIcon> imageMap;
    
    private int contador_de_objetos = 0;
    /** Los objetos se almacenaran en un MAP */
    private Map map = new HashMap();   
    /** JPanel */
    private JPanel contenedor;
    /** DefaultListModel */
    private DefaultListModel listModel;
     
//
//     
//
     public Controlview(){
     String[] nameList = {"cazo", "Burners", "Burners-simple", "Flat-Griddle", "Flyer","Grill","Plep-table","back-door","warmer"};
        imageMap = createImageMap(nameList);
        JList list = new JList(nameList);
        
        list.setCellRenderer(new PanelListRenderer());
        JScrollPane scroll = new JScrollPane(list);
        scroll.add(list);
        scroll.setPreferredSize(new Dimension(300, 400));
        
     }
     
     
      public Controlview(JList s){
     String[] nameList = {"cazo", "Burners", "Burners-simple", "Flat-Griddle", "Flyer","Grill","Plep-table","back-door","warmer"};
        imageMap = createImageMap(nameList);
        
        JList list = new JList(nameList);
        list.setCellRenderer(new PanelListRenderer());
        s= list;
        
       
        list.setListData(nameList);     
        list.setCellRenderer(new PanelListRenderer());  
        s = list;
        
        
       // s.add(list);
//        JScrollPane scroll = new JScrollPane(list);
//        scroll.add(list);
//        scroll.setPreferredSize(new Dimension(300, 400));
        
     }
     
     
     public Controlview(JScrollPane scroll,JPanel s){
     String[] nameList = {"cazo", "Burners", "Burners-simple", "Flat-Griddle", "Flyer","Grill","Plep-table","back-door","warmer"};
       imageMap = createImageMap(nameList);
        JList list = new JList(nameList);
        list.setCellRenderer(new PanelListRenderer());
        scroll = new JScrollPane(list);
        scroll.add(list);
        this.contenedor = s;
     }
     
     public void  addcontrol(JScrollPane scroll,JPanel s){
     String[] nameList = {"cazo", "Burners", "Burners-simple", "Flat-Griddle", "Flyer","Grill","Plep-table","back-door","warmer"};
       imageMap = createImageMap(nameList);
        JList list = new JList(nameList);
        list.setListData(nameList);     
        list.setCellRenderer(new PanelListRenderer());  
        scroll.setViewportView(list);  
        this.contenedor = s;
         System.out.println(list.getName());
     }
     
     
       public void  addcontrol(JList y,JPanel s){
     String[] nameList = {"cazo", "Burners", "Burners-simple", "Flat-Griddle", "Flyer","Grill","Plep-table","back-door","warmer"};
       imageMap = createImageMap(nameList);
        JList list = new JList(nameList);
        list.setListData(nameList);     
        list.setCellRenderer(new PanelListRenderer());  
        y = list;
        //scroll.setViewportView(list);  
        this.contenedor = s;
         System.out.println(list.getName());
     }
     
     public class PanelListRenderer extends DefaultListCellRenderer {

        Font font = new Font("helvitica", Font.BOLD, 12);

        @Override
        public Component getListCellRendererComponent(
                JList list, Object value, int index,
                boolean isSelected, boolean cellHasFocus) {

            JLabel label = (JLabel) super.getListCellRendererComponent(
                    list, value, index, isSelected, cellHasFocus);
            label.setIcon(imageMap.get((String) value));
            label.setHorizontalTextPosition(JLabel.RIGHT);
            label.setFont(font);
            return label;
        }
    }
     
     
     
      private Map<String, ImageIcon> createImageMap(String[] list) {
        Map<String, ImageIcon> map = new HashMap<>();
        try {
            map.put("cazo", new ImageIcon("C:\\Users\\PC-lite\\Documents\\NetBeansProjects\\SystemProject\\src\\org\\project\\minis\\cazo.png"));
            map.put("Burners", new ImageIcon("C:\\Users\\PC-lite\\Documents\\NetBeansProjects\\SystemProject\\src\\org\\project\\minis\\Burners.png"));
            map.put("Burners-simple", new ImageIcon("C:\\Users\\PC-lite\\Documents\\NetBeansProjects\\SystemProject\\src\\org\\project\\minis\\Burners-simple.png"));
            map.put("Flat-Griddle", new ImageIcon("C:\\Users\\PC-lite\\Documents\\NetBeansProjects\\SystemProject\\src\\org\\project\\minis\\Flat-Griddle.png"));
            map.put("Flyer", new ImageIcon("C:\\Users\\PC-lite\\Documents\\NetBeansProjects\\SystemProject\\src\\org\\project\\minis\\Flyer.png"));
            map.put("Grill", new ImageIcon("C:\\Users\\PC-lite\\Documents\\NetBeansProjects\\SystemProject\\src\\org\\project\\minis\\Grill.png"));
            map.put("Plep-table", new ImageIcon("C:\\Users\\PC-lite\\Documents\\NetBeansProjects\\SystemProject\\src\\org\\project\\minis\\Plep-table.png"));
            map.put("back-door", new ImageIcon("C:\\Users\\PC-lite\\Documents\\NetBeansProjects\\SystemProject\\src\\org\\project\\minis\\back-door.png"));
            map.put("warmer", new ImageIcon("C:\\Users\\PC-lite\\Documents\\NetBeansProjects\\SystemProject\\src\\org\\project\\minis\\warmer.png"));
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return map;
    }
     
    //controlador
      /**
       
       aqui
       
       */
      
         
    /**
     * Metodo que crea un nuevo objeto
     * 
     * 
     * 
     * 
     */
      
    
      
       /** COntador interno de objetos */
  
    
    
    /**
     * Metodo que crea un nuevo objeto
     */
    public void NuevoObjeto(JPanel s)
    {
        this.contenedor = s;
        //aumenta contador en +1        
        this.contador_de_objetos +=1;
        //Crea una nueva instancia de "MiObjeto"
        Objectview tmp = new Objectview( "Objeto " + this.contador_de_objetos );
        //coloca al objeto creado en una posicion aleatoria
        tmp.setLocation( rndNum( this.contenedor.getWidth() - tmp.getWidth() )  , rndNum(this.contenedor.getHeight()-tmp.getHeight() ) );        
        //agrega el objeto en el MAP
        map.put("Objeto " + this.contador_de_objetos, tmp );        
        
//        //agrega el objeto en el JPanel
       this.contenedor.add(tmp);
//        //actualiza graficos
       this.contenedor.repaint();
    }
    
    public  void entryMouse(JPanel s,int posic){
     this.contenedor = s;
        //aumenta contador en +1        
        this.contador_de_objetos +=1;
        //Crea una nueva instancia de "MiObjeto"
        Objectview tmp = new Objectview( posic );
        //coloca al objeto creado en una posicion aleatoria
      //  tmp.setLocation( rndNum( this.contenedor.getWidth() - tmp.getWidth() )  , rndNum(this.contenedor.getHeight()-tmp.getHeight() ) );        
        //agrega el objeto en el MAP
        map.put("Objeto " + this.contador_de_objetos, tmp );        
        
//        //agrega el objeto en el JPanel
       this.contenedor.add(tmp);
//        //actualiza graficos
       this.contenedor.repaint();
        System.out.println(this.contador_de_objetos); 
     }
   
    public void llenado(JPanel s,String g){
     this.contenedor = s;
        //aumenta contador en +1        
        this.contador_de_objetos +=1;
        //Crea una nueva instancia de "MiObjeto"
        Objectview tmp = new Objectview( g );
        //coloca al objeto creado en una posicion aleatoria
        tmp.setLocation( rndNum( this.contenedor.getWidth() - tmp.getWidth() )  , rndNum(this.contenedor.getHeight()-tmp.getHeight() ) );        
        //agrega el objeto en el MAP
        map.put("Objeto " + this.contador_de_objetos, tmp );        
        
//        //agrega el objeto en el JPanel
       this.contenedor.add(tmp);
//        //actualiza graficos
       this.contenedor.repaint();
        System.out.println(this.contador_de_objetos); 
    }
  
     
    /**
     * Retorna un numero entero aleatorio entre 0 y un numero pasado como parametro
     * @param int numero entero
     */
    public int rndNum( int value ){
        int num = (int) Math.floor(Math.random()*value+1);            
        return num;
    }
      
     
    
}
