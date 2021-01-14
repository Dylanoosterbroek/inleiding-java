package h08;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class knopjes extends Applet {
    TextField tekstvak;
    Button voorbeeldKnopje;
    Label label;

    public void init() {
        label = new Label("Type iets in het tekstvakje");
        tekstvak = new TextField("klik op mij",20);
        add(label);
        add(tekstvak);
        voorbeeldKnopje = new Button("Ok");
        add(voorbeeldKnopje);
        voorbeeldKnopje.addActionListener(new KnopjeLatenWerken());
    }

    public void paint(Graphics g) {

        voorbeeldKnopje.setLocation(20, 40);
    }

    class KnopjeLatenWerken implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.out.println("Knopklik");
            System.out.println(tekstvak.getText());
            tekstvak.setText("");

        }
    }





}
