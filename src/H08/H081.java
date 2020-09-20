package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class H081 extends Applet {
    TextField tekstvak;
    Button knop;
    Button knop1;
    Label label;

    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        knop1 = new Button("Reset");
        knop.addActionListener( new KnopListener() );
        knop1.addActionListener( new Knop1Listener() );
        label = new Label("           ");
        add(label);
        add(tekstvak);
        add(knop);
        add(knop1);
    }

    public void paint(Graphics g) {
        label.setLocation(150,50);
    }

    class KnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String message = tekstvak.getText();
            tekstvak.setText(message);
            label.setText(message);
            repaint();
        }

        }
        class Knop1Listener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                String message = tekstvak.getText();
                tekstvak.setText("");
                label.setText("");

            }
        }
}
