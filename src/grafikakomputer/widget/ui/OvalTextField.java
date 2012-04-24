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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author hendri
 */

public class OvalTextField extends JTextField
{
  private Color LineColor;

  public OvalTextField()
  {
    setOpaque(false);
    setBorder(new EmptyBorder(5, 10, 5, 10));
    setHorizontalAlignment(0);
    setForeground(new Color(255, 255, 255));
    setWarnafield(new Color(255, 255, 255));
  }

  public Color getWarnafield() {
    return this.LineColor;
  }

  public void setWarnafield(Color LineColor) {
    this.LineColor = LineColor;
  }

  protected void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    if (isEnabled())
    {
      Graphics2D g2 = (Graphics2D)g.create();
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      Color dark = new Color(1.0F, 1.0F, 1.0F, 0.0F);
      Color light = new Color(1.0F, 1.0F, 1.0F, 0.3F);
      GradientPaint paint = new GradientPaint(0.0F, 0.0F, light, 0.0F, getHeight() / 2, dark);
      g2.setPaint(paint);
      g2.fillRoundRect(0, 0, getWidth(), getHeight(), getHeight(), getHeight());
      g2.setColor(this.LineColor.brighter().brighter());
      g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, getHeight(), getHeight());
      g2.dispose();
    }
    else
    {
      Graphics2D g2 = (Graphics2D)g.create();
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      Color light = new Color(1.0F, 1.0F, 1.0F, 0.3F);
      g2.setColor(light);
      g2.fillRoundRect(0, 0, getWidth(), getHeight(), getHeight(), getHeight());
      g2.setColor(Color.BLACK);
      g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, getHeight(), getHeight());
      g2.dispose();
    }
  }
}