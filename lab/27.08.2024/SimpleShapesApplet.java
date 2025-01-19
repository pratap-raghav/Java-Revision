import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class SimpleShapesApplet extends Applet {

    @Override
    public void paint(Graphics g) {
        // Draw a triangle
        g.setColor(Color.RED);
        int[] xPoints = {50, 100, 150};
        int[] yPoints = {150, 50, 150};
        g.fillPolygon(xPoints, yPoints, 3);

        // Draw a square
        g.setColor(Color.BLUE);
        g.fillRect(200, 50, 100, 100);
    }
}
