/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikakomputer.widget.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author hendri
 */

public class TextArea extends JTextArea {

    public TextArea() {
        setOpaque(false);
        setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        setBorder(new EmptyBorder(2, 2, 2, 2));
        setForeground(new Color(255, 255, 255));
        setLineWrap(true);
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        super.paintComponent(g);
    }
}
