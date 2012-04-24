/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikakomputer.widget.ui;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.BorderFactory;
import javax.swing.JToolBar;

/**
 *
 * @author hendri
 */

public class ToolBarGlass extends JToolBar {

    private BufferedImage gradientImage;
    private BufferedImage ligthImage;
    private Color lightcolor;
    private Color darkcolor;

    public ToolBarGlass() {
        this.lightcolor = new Color(1.0F, 1.0F, 1.0F, 0.5F);
        this.darkcolor = new Color(1.0F, 1.0F, 1.0F, 0.0F);
        setFloatable(false);
        setBorder(BorderFactory.createEmptyBorder(3, 3, 4, 3));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.gradientImage = new BufferedImage(1, getHeight(), 2);
        GradientPaint paint = new GradientPaint(0.0F, 0.0F, getBackground(), 0.0F, getHeight(), Color.BLACK);
        Graphics2D g1 = (Graphics2D) this.gradientImage.getGraphics();
        g1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g1.setPaint(paint);
        g1.fillRect(0, 0, 1, getHeight());
        g1.dispose();
        this.ligthImage = new BufferedImage(1, getHeight() / 2, 2);
        GradientPaint paint1 = new GradientPaint(0.0F, 0.0F, this.lightcolor, 0.0F, getHeight(), this.darkcolor);
        Graphics2D g2 = (Graphics2D) this.ligthImage.getGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setPaint(paint1);
        g2.fillRect(0, 0, 1, getHeight() / 2);
        g2.dispose();
        if (isOpaque()) {
            g.drawImage(this.gradientImage, 0, 0, getWidth(), getHeight(), null);
            g.drawImage(this.ligthImage, 0, 0, getWidth(), getHeight() / 2, null);
        }
    }
}
