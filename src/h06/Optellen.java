package h06;

import java.applet.Applet;
import java.awt.*;

public class Optellen extends Applet {

    int a;
    int b;
    int c;
    int Uitkomst;

    public void init() {
    a = 5;
    b = 5;
    c = 20;
    Uitkomst = (a + b) - c;
    }

    public void paint(Graphics g) {
        g.drawString("Als het goed is komt hier achter een min getal te staan: " + Uitkomst,20,20);
    }
}
