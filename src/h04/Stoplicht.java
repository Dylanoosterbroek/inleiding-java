package h04;

import java.applet.Applet;
import java.awt.*;

public class Stoplicht extends Applet {
    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.drawRect(20, 20, 150, 450);
        g.fillRect(20, 20, 150, 450);

        g.setColor(Color.black);
        g.fillRect(55,470,75,200);
        g.drawRect(55,470,75,200);

        g.setColor(Color.red);
        g.fillOval(20,20,150,150);
        g.drawOval(20,20,150, 150);

        g.setColor(Color.orange);
        g.fillOval(20,170,150,150);
        g.drawOval(20,170,150,150);

        g.setColor(Color.green);
        g.drawOval(20, 320, 150, 150);
        g.fillOval(20,320,150,150);

    }
}
