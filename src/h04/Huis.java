package h04;

import java.applet.Applet;
import java.awt.*;

public class Huis extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.yellow);
        g.drawLine(100, 250, 180, 80);
        g.drawLine(100, 250, 270, 250);
        g.drawLine(180, 80, 270, 250);
        g.drawOval(158, 165, 50, 50);
        g.drawRect(110, 250, 150, 150);
        g.drawRect(220, 350, 25, 50);
        g.drawRect(140, 320, 50, 60);
    }
}
