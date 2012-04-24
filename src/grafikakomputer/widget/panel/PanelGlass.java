/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikakomputer.widget.panel;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;
import javax.swing.JPanel;

/**
 *
 * @author hendri
 */


public class PanelGlass extends JPanel {

    public PanelGlass() {
        setOpaque(false);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        GeneralPath generalpath = new GeneralPath();
        generalpath.moveTo(0.0F, 0.0F);
        generalpath.lineTo(0.0F, getHeight() / 6);
        generalpath.curveTo(0.0F, getHeight(), getWidth() / 4, getHeight() / 4, getWidth(), 0.0F);
        Graphics2D gd = (Graphics2D) g.create();
        gd.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        gd.setComposite(AlphaComposite.SrcOver.derive(0.14F));
        repaint();
        gd.setColor(Color.WHITE.brighter());
        gd.fill(generalpath);
    }
}
