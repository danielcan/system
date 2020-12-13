/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.project.control;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import org.project.model.Figure;
/**
 *
 * @author AdminCis
 */
public class FigureRenderer extends JLabel implements ListCellRenderer<Figure>{
    
    public FigureRenderer() {
        setOpaque(true);
    }
 
    @Override
    public Component getListCellRendererComponent(JList<? extends Figure> list, Figure figure, int index,
            boolean isSelected, boolean cellHasFocus) {
 
        String code = figure.getCode();
         ImageIcon imageIcon = new ImageIcon(getClass().getResource("/org/project/minis/" + code + ".png"));
 
        // ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/" + code + ".png"));
 
        setIcon(imageIcon);
        setText(figure.getName());
 
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
 
        return this;
    }
}
