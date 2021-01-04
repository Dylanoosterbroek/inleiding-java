package h04;


import java.applet.Applet;
import java.awt.*;

public class Fillarc extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawArc(40, 40, 200, 100, 90, 360);
        g.fillArc(40, 40, 200, 100, 90, 360);

    }
}


