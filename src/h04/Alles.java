package h04;

import java.applet.Applet;
import java.awt.*;

public class Alles extends Applet {
    public void init() {
        setBackground(Color.blue);
    }


    public void paint(Graphics g){
        g.drawString("Lijn",150,65);
        g.drawLine(50, 50, 270, 50);

        g.drawString("Rechthoek", 140,290 );
        g.drawRect(50,125,250,150);

        g.drawString("Afgeronde Rechthoek", 120, 515);
        g.drawRoundRect(50, 350, 250, 150, 30, 30);

        g.drawString("Gevulde rechthoek met ovaal", 490,285);
        g.setColor(Color.magenta);
        g.fillRect(450,120,250,150);
        g.drawRect(450,120,250,150);

        g.setColor(Color.black);
        g.drawOval(450, 120, 250, 150);

        g.drawString("Gevulde ovaal",535,505);
        g.setColor(Color.magenta);
        g.fillOval(450,340,250,150);
        g.drawOval(450, 340, 250, 150);


        g.fillArc(900,120,250,150,0,45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 950, 280);
        g.drawArc(900, 120, 250, 150, 0, 45);
        g.drawOval(900, 120, 250, 150);

        g.drawOval(900, 300, 225, 225);
        g.drawString("Cirkel",990, 545);




    }
    }


