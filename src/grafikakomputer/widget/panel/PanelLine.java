/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikakomputer.widget.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.GeneralPath;
import javax.swing.JPanel;

/**
 *
 * @author hendri
 */
public class PanelLine extends JPanel {

    protected RenderingHints hints;
    protected int counter = 0;

    public PanelLine() {
        this(new BorderLayout());
    }

    public PanelLine(LayoutManager manager) {
        super(manager);
        this.hints = createRenderingHints();
    }

    protected RenderingHints createRenderingHints() {
        this.hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        this.hints.put(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        this.hints.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        return this.hints;
    }

    public void animate() {
        this.counter += 1;
    }

    public boolean isOpaque() {
        return false;
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        RenderingHints oldHints = g2.getRenderingHints();
        g2.setRenderingHints(this.hints);

        float width = getWidth();
        float height = getHeight();

        g2.translate(0, -30);

        drawCurve(g2, 20.0F, -10.0F, 20.0F, -10.0F, width / 2.0F - 40.0F, 10.0F, 0.0F, -5.0F, width / 2.0F + 40.0F, 1.0F, 0.0F, 5.0F, 50.0F, 5.0F, false);
        g2.translate(0, 30);
        g2.translate(0.0D, height - 60.0F);

        g2.translate(0.0D, -height + 60.0F);

        drawCurve(g2, height - 55.0F, -5.0F, height - 70.0F, 10.0F, width / 2.0F - 40.0F, 1.0F, height - 40.0F, -25.0F, width / 2.0F, 0.5F, height - 1.0F, 0.7F, 20.0F, 0.3F, true);
        g2.setRenderingHints(oldHints);
    }

    protected void drawCurve(Graphics2D g2, float y1, float y1_offset, float y2, float y2_offset, float cx1, float cx1_offset, float cy1, float cy1_offset, float cx2, float cx2_offset, float cy2, float cy2_offset, float thickness, float speed, boolean invert) {
        float width = getWidth();

        float offset = (float) Math.sin(this.counter / (speed * 3.141592653589793D));

        float start_x = 0.0F;
        float start_y = offset * y1_offset + y1;
        float end_x = width;
        float end_y = offset * y2_offset + y2;

        float ctrl1_x = offset * cx1_offset + cx1;
        float ctrl1_y = offset * cy1_offset + cy1;
        float ctrl2_x = offset * cx2_offset + cx2;
        float ctrl2_y = offset * cy2_offset + cy2;

        GeneralPath thickCurve = new GeneralPath();
        thickCurve.moveTo(start_x, start_y);
        thickCurve.curveTo(ctrl1_x, ctrl1_y, ctrl2_x, ctrl2_y, end_x, end_y);

        thickCurve.lineTo(end_x, end_y + thickness);
        thickCurve.curveTo(ctrl2_x, ctrl2_y + thickness, ctrl1_x, ctrl1_y + thickness, start_x, start_y + thickness);

        thickCurve.lineTo(start_x, start_y);

        Rectangle bounds = thickCurve.getBounds();
        if (!bounds.intersects(g2.getClipBounds())) {
            return;
        }

        GradientPaint painter = new GradientPaint(0.0F, bounds.y, invert ? new Color(255, 255, 255, 0) : new Color(255, 255, 255, 200), 0.0F, bounds.y + bounds.height, invert ? new Color(255, 255, 255, 200) : new Color(255, 255, 255, 0));

        Paint oldPainter = g2.getPaint();
        g2.setPaint(painter);
        g2.fill(thickCurve);

        g2.setPaint(oldPainter);
    }
}
