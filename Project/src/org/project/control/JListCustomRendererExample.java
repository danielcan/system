/*
 * present view 
 */
package org.project.control;

import javax.swing.*;
import org.project.model.Figure;

/**
 * Methods construct from list in object of figure.
 * @author AdminCis
 */
public class JListCustomRendererExample extends JList {

     private DefaultListModel listModel = new DefaultListModel();
    /**
     *  
     * @param JList
     * @since version 1.0
     */
    public JListCustomRendererExample(JList s) {
        Figure us = new Figure("Burners-simple", "Burners-simple");
        Figure bs = new Figure("Burners", "Burners");
        Figure fg = new Figure("Flat-Griddle", "Flat-Griddle");
        Figure ff = new Figure("Flyer", "Flyer");
        Figure gg = new Figure("Grill", "Grill");
        Figure pp = new Figure("Plep-table", "Plep-table");
        Figure bb = new Figure("back-door", "back-door");
        Figure cc = new Figure("cazo", "cazo");
        Figure ww = new Figure("warmer", "warmer");
        
        listModel.addElement(us);
        listModel.addElement(bs);
        listModel.addElement(fg);
        listModel.addElement(ff);
        listModel.addElement(gg);
        listModel.addElement(pp);
        listModel.addElement(bb);
        listModel.addElement(cc);
        listModel.addElement(ww);
      
        s.setModel(listModel);
        s.setCellRenderer(new FigureRenderer());

    }
    
    
    
//    public void result(JList jList1){
//        
//     int index= jList1.getSelectedIndex();
//     Figure objFigure=(Figure)listModel.getElementAt(index);
//        
//     System.out.println(objFigure.getName());
//     System.out.println(objFigure.getCode());
//    }
}
