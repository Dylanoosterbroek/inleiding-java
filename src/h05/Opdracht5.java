package h05;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5 extends Applet {

    Color Opvulkleur;
    Color Lijnkleur;
    int Breedte;
    int Hoogte;

    public void init() {
        setBackground(Color.blue);
        Breedte = 200;
        Hoogte = 100;
        Opvulkleur = Color.MAGENTA;
        Lijnkleur = Color.black;
    }


    public void paint(Graphics g){
        g.drawString("Lijn",150,65);
        g.drawLine(50, 50, 270, 50);

        g.drawString("Rechthoek", 140,290 );
        g.drawRect(50,125,Breedte,Hoogte);

        g.drawString("Afgeronde Rechthoek", 120, 515);
        g.drawRoundRect(50, 350, Breedte, Hoogte, 30, 30);

        g.drawString("Gevulde rechthoek met ovaal", 490,285);
        g.setColor(Opvulkleur);
        g.fillRect(450,120,Breedte,Hoogte);
        g.drawRect(450,120,Breedte,Hoogte);

        g.setColor(Color.black);
        g.drawOval(450, 120, Breedte, Hoogte);

        g.drawString("Gevulde ovaal",535,505);
        g.setColor(Opvulkleur);
        g.fillOval(450,340,Breedte,Hoogte);
        g.drawOval(450, 340, Breedte, Hoogte);


        g.fillArc(900,120,Breedte,Hoogte,0,45);
        g.setColor(Lijnkleur);
        g.drawString("Taartpunt met ovaal eromheen", 950, 280);
        g.drawArc(900, 120, Breedte, Hoogte, 0, 45);
        g.drawOval(900, 120, Breedte, Hoogte);

        g.drawOval(900, 300, 200, 200);
        g.drawString("Cirkel",990, 545);




    }
}