package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class op4 extends Applet {
    double[] searching;
    int gezocht;
    TextField txtfield;
    Button knop;
    int out;
    boolean a;



    public void init() {

        searching = new double[3];
        txtfield = new TextField("", 10);
        add(txtfield);

        knop = new Button("ok");
        add(knop);
        knop.addActionListener(new InputListener());
    }


    public void paint(Graphics g) {
        if (a) {
            g.drawString("you have found pi: index "+ out, 50 ,120);
        }
        if (!a) {
            g.drawString("Find pi", 50 ,120);
        }
    }

    //classes
    class InputListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();
            searching [0] = 3.14;
            searching [1] = 3.141;
            searching [2] = 3.1415;

            String b = txtfield.getText();
            gezocht = Integer.parseInt(b);
            for (int i = 0; i < searching.length; i++) {
                if (gezocht == searching [i]) {
                    a = true;
                    out = i;
                    repaint();
                    break;
                }

                else {
                    a = false;
                    repaint();
                }
            }
        }
    }
}