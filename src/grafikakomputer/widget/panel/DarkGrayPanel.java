/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikakomputer.widget.panel;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JPanel;

/**
 *
 * @author hendri
 */
public class DarkGrayPanel extends JPanel {

    public DarkGrayPanel() {
        setOpaque(false);
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setPaint(new GradientPaint(0.0F, getHeight() * 0.97F, new Color(51, 51, 51).brighter().brighter(), getHeight() * 0.0F, 1.7F, Color.BLACK, true));
        Rectangle clip = g.getClipBounds();
        g2.fillRect(clip.x, clip.y, clip.width, clip.height);
        GradientPaint paint = new GradientPaint(0.0F, 0.0F, new Color(1.0F, 1.0F, 0.6F, 0.2F), 0.0F, getHeight() * 5, new Color(1.0F, 1.0F, 1.0F, 0.0F));
        g2.setPaint(paint);
        g2.dispose();
    }
}
