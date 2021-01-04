package h04;

import java.applet.Applet;
import java.awt.*;

public class Dobbelsteen extends Applet {
    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRoundRect(20,20,400,400,20,20);
        g.drawRoundRect(20, 20, 400, 400, 20, 20);

        g.setColor(Color.black);
        g.fillOval(50,50,125,125);
        g.drawOval(50, 50, 125, 125);

        g.fillOval(50,265,125,125);
        g.drawOval(50, 265, 125, 125);

        g.fillOval(265,50,125,125);
        g.drawOval(265, 50, 125, 125);

        g.fillOval(265,265,125,125);
        g.drawOval(265, 265, 125, 125);
    }
}

