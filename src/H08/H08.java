package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H08 extends Applet {
    TextField tekstvak,tekstvak1,Antwoord;
    Button knop,knop1,knop2,knop3;
    double getal1, getal2, resultaat;
    Label label;

    public void init() {
        tekstvak = new TextField("", 12);
        tekstvak1 = new TextField("", 12);
        Antwoord = new TextField("",12);
        knop = new Button("+");
        knop1 = new Button("-");
        knop2 = new Button("x");
        knop3 = new Button(":");
        knop.addActionListener(new KnopListener());
        knop1.addActionListener(new Knop1Listener());
        knop2.addActionListener(new knop2listener());
        knop3.addActionListener(new knop3listener());
        label = new Label("           ");
        add(label);
        add(tekstvak);
        add(tekstvak1);
        add(knop);
        add(knop1);
        add(knop2);
        add(knop3);
        add(Antwoord);
    }

    public void paint(Graphics g) {
        label.setLocation(150, 50);
    }


    class KnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String invoer1 = tekstvak.getText();
            getal1 = Double.parseDouble( invoer1 );

            String invoer2 = tekstvak1.getText();
            getal2 = Double.parseDouble( invoer2 );

            resultaat = getal1 + getal2;
            Antwoord.setText("" + resultaat );
        }

    }

    class Knop1Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String invoer1 = tekstvak.getText();
            getal1 = Double.parseDouble( invoer1 );

            String invoer2 = tekstvak1.getText();
            getal2 = Double.parseDouble( invoer2 );

            resultaat = getal1 - getal2;
            Antwoord.setText("" + resultaat );


        }
    }

    class knop2listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String invoer1 = tekstvak.getText();
            getal1 = Double.parseDouble( invoer1 );

            String invoer2 = tekstvak1.getText();
            getal2 = Double.parseDouble( invoer2 );

            resultaat = getal1 * getal2;
            Antwoord.setText("" + resultaat );


        }
    }

    class knop3listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String invoer1 = tekstvak.getText();
            getal1 = Double.parseDouble( invoer1 );

            String invoer2 = tekstvak1.getText();
            getal2 = Double.parseDouble( invoer2 );

            resultaat = getal1 - getal2;
            Antwoord.setText("" + resultaat );

        }
    }

}