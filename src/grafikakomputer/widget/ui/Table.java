/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikakomputer.widget.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hendri
 */
public class Table extends JTable {

    public Table() {
        setOpaque(false);
        setGridColor(new Color(255, 255, 255));
        setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        setForeground(new Color(255, 255, 255));
        setSelectionBackground(Color.RED);
        setBorder(new EmptyBorder(10, 10, 107, 10));
        setModel(new DefaultTableModel());
        
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        super.paintComponent(g);
    }
}
