import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        JFrame fr = new JFrame("Вращение прямоугольника вокруг своего центра тяжести");
        fr.setSize(800, 600);
        MyPanel pan = new MyPanel();
        fr.add(pan);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();

    }
}
class MyPanel extends JPanel{

    double i = 0;

    @Override
    protected void paintComponent(Graphics g){

        int x = 60, y = 30, width = 60, height = 70;
        double cX = x + width / 2.0;
        double cY = y + height / 2.0;

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        AffineTransform transform = AffineTransform.getRotateInstance(Math.toRadians(i), cX, cY);
        g2d.setTransform(transform);
        g2d.fillRect(x - width / 2, y - height / 2, width, height);
        i += 0.1;
        repaint();

    }
}