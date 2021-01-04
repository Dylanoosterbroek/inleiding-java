package h04;

import java.applet.Applet;
import java.awt.*;

public class Vlag extends Applet {
    public void init() {
        setBackground(Color.green);
    }

    public void paint(Graphics g) {
        g.drawRect(100, 150, 50, 500);
        g.fillRect(100, 150, 50, 500);

        g.setColor(Color.black);
        g.fillOval(75, 55, 100, 100);

        g.setColor(Color.red);
        g.drawRect(150, 150, 450, 100);
        g.fillRect(150, 150, 450, 100);

        g.setColor(Color.white);
        g.drawRect(150, 250, 450, 100);
        g.fillRect(150, 250, 450, 100);

        g.setColor(Color.blue);
        g.drawRect(150, 350, 450, 100);
        g.fillRect(150, 350, 450, 100);
    }
}

