/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package grafikakomputer.widget.ui;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

/**
 *
 * @author hendri
 */
public class grafikImage {

  public static final BufferedImage convertToBufferedImage(Image source)
  {
    int width = source.getWidth(null);
    int height = source.getHeight(null);
    BufferedImage dest = new BufferedImage(width, height, 2);
    Graphics2D g2 = (Graphics2D)dest.getGraphics();
    g2.drawImage(source, 0, 0, null);
    g2.dispose();
    return dest;
  }

  public static final BufferedImage convertToBufferedImageReflection(BufferedImage source)
  {
    BufferedImage dest = new BufferedImage(source.getWidth(), source.getHeight() + source.getHeight() / 2, 2);
    Graphics2D g2 = (Graphics2D)dest.getGraphics();
    g2.drawImage(source, 0, 0, null);
    g2.scale(1.0D, -1.0D);
    g2.drawImage(source, 0, -source.getHeight() * 2, null);
    g2.scale(1.0D, -1.0D);
    g2.translate(0, source.getHeight());
    g2.setPaint(new GradientPaint(0.0F, 0.0F, new Color(1.0F, 1.0F, 1.0F, 0.5F), 0.0F, source.getHeight() / 2, new Color(1.0F, 1.0F, 1.0F, 0.0F)));
    g2.setComposite(AlphaComposite.DstIn);
    g2.fillRect(0, 0, source.getWidth(), source.getHeight());
    g2.dispose();
    return dest;
  }

  public static final BufferedImage convertToBufferedImageReflection(Image source)
  {
    return convertToBufferedImageReflection(convertToBufferedImage(source));
  }
}
