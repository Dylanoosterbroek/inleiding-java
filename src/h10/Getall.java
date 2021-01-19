package h10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Getall extends Applet {
    TextField tekstvak;
    Button voorbeeldKnopje;
    Label label;
    Button okeKnop;

    public void init() {
        label = new Label("Type iets in het tekstvakje");
        tekstvak = new TextField("klik op mij", 20);
        add(label);
        add(tekstvak);
        voorbeeldKnopje = new Button("Reset");
        add(voorbeeldKnopje);
        voorbeeldKnopje.addActionListener(new h10.Getall.KnopjeLatenWerken());
        okeKnop = new Button("oke");
        add(okeKnop);
    }

    public void paint(Graphics g) {

        voorbeeldKnopje.setLocation(350, 5);
    }

    class KnopjeLatenWerken implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.out.println("Knopklik");
            System.out.println(tekstvak.getText());
            tekstvak.setText("");

        }
    }
}