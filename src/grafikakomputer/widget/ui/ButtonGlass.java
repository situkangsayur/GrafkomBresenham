/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package grafikakomputer.widget.ui;

/**
 *
 * @author hendri
 */

import java.awt.BasicStroke;
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

public class ButtonGlass extends JButton
{
  private Paint paint;
  private Shape shape;
  private Paint paintglass;
  private boolean rollover;
  private Icon iconshadow;

  public ButtonGlass()
  {
    setIconShadow(null);
    setOpaque(false);
    setContentAreaFilled(false);
    setFocusPainted(false);
    setBorderPainted(false);
    setForeground(new Color(255, 255, 255));
    addMouseListener(new MouseAdapter()
    {
      public void mousePressed(MouseEvent e)
      {
        ButtonGlass.this.setRollover(false);
      }

      public void mouseReleased(MouseEvent e)
      {
        ButtonGlass.this.setRollover(true);
      }

      public void mouseEntered(MouseEvent e) {
        ButtonGlass.this.setRollover(true);
      }

      public void mouseExited(MouseEvent e)
      {
        ButtonGlass.this.setRollover(false);
      } } );
  }

  public Icon getIconShadow() {
    return this.iconshadow;
  }

  public void setIconShadow(Icon iconReflec)
    throws IllegalArgumentException
  {
    if (iconReflec == null)
    {
      setIcon(null);
      firePropertyChange("iconshadow", this.iconshadow, iconReflec);
      this.iconshadow = iconReflec;
    }
    else if ((iconReflec instanceof ImageIcon))
    {
      firePropertyChange("iconshadow", this.iconshadow, iconReflec);
      this.iconshadow = iconReflec;
      BufferedImage image = grafikImage.convertToBufferedImageReflection(((ImageIcon)iconReflec).getImage());
      setIcon(new ImageIcon(image));
    }
    else {
      throw new IllegalArgumentException();
    }
  }

  public boolean isRollover() {
    return this.rollover;
  }

  public void setRollover(boolean over) {
    this.rollover = over;
    repaint();
  }

  protected void paintComponent(Graphics g)
  {
    Graphics2D gd = (Graphics2D)g.create();
    gd.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    gd.setStroke(new BasicStroke(1.3F));
    gd.setColor(Color.WHITE);
    gd.drawRoundRect(0, 0, getWidth() - 2, getHeight() - 2, getHeight(), getHeight() - 1);
    this.paint = new GradientPaint(0.0F, 0.0F, new Color(1.0F, 1.0F, 1.0F, 0.1F), 0.0F, getHeight(), new Color(1.0F, 1.0F, 1.0F, 0.0F));
    this.shape = new RoundRectangle2D.Double(0.0D, 0.0D, getWidth(), getHeight(), getHeight(), getHeight());
    if (isRollover())
      this.paintglass = new GradientPaint(0.0F, 0.0F, new Color(1.0F, 1.0F, 1.0F, 0.0F), 0.0F, getHeight(), new Color(1.0F, 1.0F, 1.0F, 0.3F));
    else {
      this.paintglass = new GradientPaint(0.0F, 0.0F, new Color(1.0F, 1.0F, 1.0F, 0.3F), 0.0F, getHeight(), new Color(1.0F, 1.0F, 1.0F, 0.0F));
    }
    gd.setPaint(this.paint);
    gd.fill(this.shape);
    gd.setPaint(this.paintglass);
    gd.fill(this.shape);
    gd.dispose();
    super.paintComponent(g);
  }
}
