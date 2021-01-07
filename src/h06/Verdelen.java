package h06;

import java.applet.Applet;
import java.awt.*;

public class Verdelen extends Applet {
    int a;
    int b;
    int Uitkomst;

    public void init() {
        a = 113;
        b = 4;
        Uitkomst = a / b;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is" + Uitkomst,  20,20);
        g.drawString("Jan krijgt 28 euro",20,40);
        g.drawString("Ali krijgt 28 euro",20,60);
        g.drawString("Jeannette krijgt 28 euro",20,80);
        g.drawString("Dylan Krijgt 28 euro",20,100);
    }
}
