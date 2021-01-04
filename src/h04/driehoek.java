package h04;

import java.applet.Applet;
import java.awt.*;

public class driehoek extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.yellow);
        g.drawLine(100, 250, 180, 80);
        g.drawLine(100, 250, 270, 250);
        g.drawLine(180, 80, 270, 250);
    }
}

