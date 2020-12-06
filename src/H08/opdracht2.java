package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht2 extends Applet {
    TextField tekstvak1, tekstvak2, tekstvak3 ,tekstvak4, tekstvak5;
    Button knop, knop1, knop2, knop3;
    int counter, counter1,counter2,counter3,counter4;

    public void init() {
        counter = 0;
        counter1 = 0;
        counter2 = 0;
        counter3 = 0;
        counter4 = 0;
        tekstvak1 = new TextField("", 30);
        tekstvak2 = new TextField("", 30);
        tekstvak3 = new TextField("", 30);
        tekstvak4 = new TextField("", 30);
        tekstvak5 = new TextField("", 30);
        knop= new Button("");
        knop1= new Button("");
        knop2 = new Button("");
        knop3 = new Button("");
        knop.addActionListener(new opdracht2.KnopListener());
        knop1.addActionListener(new opdracht2.Knop1Listener());
        knop2.addActionListener(new opdracht2.Knop2Listener());
        knop3.addActionListener(new opdracht2.Knop3Listener());
        add(tekstvak1);
        add(tekstvak2);
        add(tekstvak3);
        add(tekstvak4);
        add(tekstvak5);
        add(knop);
        add(knop1);
        add(knop2);
        add(knop3);
    }

    public void paint(Graphics g) {
        g.drawString("man",20,20);
        g.drawString("vrouw",20,50);
        g.drawString("jongen",20,80);
        g.drawString("meisje",20,105);
        g.drawString("totaal",10,135);
    }

    class KnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            counter++;
            counter1++;
            tekstvak5.setText(""+ counter);
            tekstvak1.setText("" + counter1);

        }

    }

    class Knop1Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            counter++;
            counter2++;
            tekstvak5.setText("" + counter);
            tekstvak2.setText("" + counter2);


        }
    }

    class Knop2Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            counter++;
            counter3++;
            tekstvak5.setText("" + counter);
            tekstvak3.setText(""+ counter3);


        }
    }

    class Knop3Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            counter++;
            counter4++;
            tekstvak5.setText("" + counter);
            tekstvak4.setText("" + counter4);


        }
    }
}


