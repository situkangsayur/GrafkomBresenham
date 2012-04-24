/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikakomputer.widget.ui;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.RoundRectangle2D.Double;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author hendri
 */
public class MenuButton extends JButton {

    private Paint paintglass;
    private Shape shape;
    private boolean rollover;
    private Icon iconshadow;

    public MenuButton() {
        setIconShadow(null);
        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setForeground(new Color(255, 255, 255));
        addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent evt) {
                MenuButton.this.setRollover(false);
            }

            public void mouseReleased(MouseEvent evt) {
                MenuButton.this.setRollover(true);
            }

            public void mouseEntered(MouseEvent evt) {
                MenuButton.this.setRollover(true);
            }

            public void mouseExited(MouseEvent evt) {
                MenuButton.this.setRollover(false);
            }
        });
    }

    public Icon getIconShadow() {
        return this.iconshadow;
    }

    public void setIconShadow(Icon iconshadow)
            throws IllegalArgumentException {
        if (iconshadow == null) {
            setIcon(null);
            firePropertyChange("iconshadow", this.iconshadow, iconshadow);
            this.iconshadow = iconshadow;
        } else if ((iconshadow instanceof ImageIcon)) {
            firePropertyChange("iconshadow", this.iconshadow, iconshadow);
            this.iconshadow = iconshadow;
            BufferedImage image = grafikImage.convertToBufferedImageReflection(((ImageIcon) iconshadow).getImage());
            setIcon(new ImageIcon(image));
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean isRollover() {
        return this.rollover;
    }

    public void setRollover(boolean rollover) {
        this.rollover = rollover;
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D) g.create();
        gd.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        gd.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        gd.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        gd.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        this.paintglass = new GradientPaint(0.0F, 0.0F, new Color(1.0F, 1.0F, 1.0F, 0.0F), 0.0F, getHeight(), new Color(1.0F, 1.0F, 1.0F, 0.0F));
        this.shape = new RoundRectangle2D.Double(0.0D, 0.0D, getWidth(), getHeight(), 50.0D, 50.0D);
        gd.setPaint(this.paintglass);
        gd.fillRoundRect(0, 0, getWidth(), getHeight(), 50, 50);
        if (isRollover()) {
            this.paintglass = new GradientPaint(0.0F, 0.0F, new Color(1.0F, 1.0F, 1.0F, 0.0F), 0.0F, getHeight(), new Color(1.0F, 1.0F, 1.0F, 0.15F));
        } else {
            this.paintglass = new GradientPaint(0.0F, 0.0F, new Color(1.0F, 1.0F, 1.0F, 0.15F), 0.0F, getHeight(), new Color(1.0F, 1.0F, 1.0F, 0.0F));
        }
        gd.setPaint(this.paintglass);
        gd.fill(this.shape);
        gd.draw(this.shape);
        gd.dispose();
    }
}
