import javax.swing.*;
import java.awt.*;

public class JadiSatu {
    static class Triangle extends JPanel {
        @Override
        public void paint(Graphics g) {
            g.setColor(getBackground());
            g.fillRect(0,10, 1000, 1000);

            g.setColor(Color.GREEN);
//            buat ngecenter
//        int[] x = {100, 200, 300}; // 100 -> 300
            int[] x = {300, 400, 500};
            int[] y = {300, 100, 300};
            g.fillPolygon(x, y, 3);
        }
    }

    static class Rectangle extends JPanel {
        @Override
        public void paint(Graphics g) {
            g.setColor(getBackground());
            g.fillRect(0,10, 1000, 1000);

            g.setColor(Color.RED);

            int[] x = {200, 600, 600, 200};
            int[] y = {120, 120, 320, 320};
            g.fillPolygon(x, y, 4);
            g.dispose();
        }
    }

    static class Circle extends JPanel {
        @Override
        public void paint(Graphics g) {
            g.setColor(getBackground());
            g.fillRect(0,10, 1000, 1000);

            g.setColor(Color.BLUE);

            g.fillOval(200, 50, 400, 400);
            g.dispose();
        }
    }
}
