/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikakomputer.widget.ui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author hendri
 */

public class TextAreaGlass extends JScrollPane {

    public TextArea textArea;

    public TextAreaGlass() {
        setOpaque(false);
        setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        setBorder(new EmptyBorder(2, 2, 2, 2));
        getViewport().setOpaque(false);
        this.textArea = new TextArea();
        setViewportView(this.textArea);
    }

    public TextArea getTextArea() {
        return this.textArea;
    }

    public void setTextArea(TextArea textArea) {
        this.textArea = textArea;
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Color dark = new Color(1.0F, 1.0F, 1.0F, 0.0F);
        Color light = new Color(1.0F, 1.0F, 1.0F, 0.18F);
        GradientPaint paint = new GradientPaint(0.0F, 0.0F, light, 0.0F, getHeight(), dark);
        g2.setPaint(paint);
        g2.fillRoundRect(0, 0, getWidth() - 2, getHeight() - 2, 20, 20);
        g2.setStroke(new BasicStroke(1.4F));
        g2.setColor(Color.WHITE.brighter());
        g2.drawRoundRect(0, 0, getWidth() - 2, getHeight() - 2, 20, 20);
        g2.dispose();
        super.paintComponent(g);
    }
}
