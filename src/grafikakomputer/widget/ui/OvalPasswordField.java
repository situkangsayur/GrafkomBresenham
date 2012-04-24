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
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author hendri
 */


public class OvalPasswordField extends JPasswordField
{
  private Color LineColor;

  public OvalPasswordField()
  {
    setOpaque(false);
    setBorder(new EmptyBorder(5, 10, 5, 10));
    setHorizontalAlignment(0);
    setForeground(new Color(255, 255, 255));
    setLineColor(new Color(255, 255, 255));
  }

  public Color getLineColor() {
    return this.LineColor;
  }

  public void setLineColor(Color LineColor) {
    this.LineColor = LineColor;
  }

  protected void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    if (isEnabled() == true)
    {
      Graphics2D g2 = (Graphics2D)g.create();
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      Color darkcolor = new Color(1.0F, 1.0F, 1.0F, 0.0F);
      Color lightcolor = new Color(1.0F, 1.0F, 1.0F, 0.3F);
      GradientPaint paint = new GradientPaint(0.0F, 0.0F, lightcolor, 0.0F, getHeight() / 2, darkcolor);
      g2.setPaint(paint);
      g2.fillRoundRect(0, 0, getWidth(), getHeight(), getHeight(), getHeight());
      g2.setColor(this.LineColor.brighter().brighter());
      g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, getHeight(), getHeight());
      g2.dispose();
    }
    else {
      Graphics2D g2 = (Graphics2D)g.create();
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      Color light = new Color(1.0F, 0.0F, 0.5F, 0.3F);
      g2.setColor(light);
      g2.fillRoundRect(0, 0, getWidth(), getHeight(), getHeight(), getHeight());
      g2.setColor(Color.BLACK);
      g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, getHeight(), getHeight());
      g2.dispose();
    }
  }
}
