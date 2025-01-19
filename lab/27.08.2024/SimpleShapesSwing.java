import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class SimpleShapesSwing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a triangle
        g.setColor(Color.RED);
        int[] xPoints = {50, 100, 150};
        int[] yPoints = {150, 50, 150};
        g.fillPolygon(xPoints, yPoints, 3);

        // Draw a square
        g.setColor(Color.BLUE);
        g.fillRect(200, 50, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes");
        SimpleShapesSwing panel = new SimpleShapesSwing();

        frame.add(panel);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
