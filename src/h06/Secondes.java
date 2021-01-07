package h06;

import java.applet.Applet;
import java.awt.*;

public class Secondes extends Applet {
    int a;
    int b;
    int c;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    int k;
    int Uitkomst;
    int Uitkomst1;
    int Uitkomst2;
    int Uitkomst3;
    int Uitkomst4;

    public void init() {
        a = 60;
        b = 60;
        c = 24;
        e = 3600;
        f = 7;
        g = 86400;
        h = 4;
        i = 604800;
        j = 12;
        k = 2419200;
        Uitkomst = a * b;
        Uitkomst1 = c * e;
        Uitkomst2 = f * g;
        Uitkomst3 = h * i;
        Uitkomst4 = j * k;

    }

    public void paint(Graphics g) {
        g.drawString("In een minuut zitten 60 seconden",20,20);
        g.drawString("Hoeveel seconden zitten er in een uur: " + Uitkomst ,20,40);
        g.drawString("Hoeveel seconden zitten er in een dag: " + Uitkomst1, 20, 60);
        g.drawString("hoeveel seconden zitten er in een week: " + Uitkomst2,20,80);
        g.drawString("Hoeveel seconden zitten er in een maand:" + Uitkomst3,20,100);
        g.drawString("Hoeveel seconden zitten er in een jaar:" + Uitkomst4,20,120);
    }
}
