package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class op6 extends Applet {
    double[] searching;
    int gezocht;
    TextField txtfield;
    Button knop;
    int out;
    int times;
    boolean a;


    public void init() {

        searching = new double[5];
        txtfield = new TextField("", 10);
        add(txtfield);

        knop = new Button("Confrim");
        add(knop);
        knop.addActionListener(new InputListener());
    }


    public void paint(Graphics g) {
        if (a) {
            g.drawString("pi found: index "+ out + " en komt " + times + " keer voor", 50 ,120);
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
            searching [1] = 69420;
            searching [2] = 420;
            searching [3] = 420;
            searching [4] = 420;

            for (int i = 0; i < searching.length; i++) {
                if (gezocht == searching [i]) {
                    a = true;
                    out = i;
                    if(searching[i] == 420){
                        times++;
                    }
                    repaint();

                }

                else {
                    a = false;
                    repaint();
                }
            }
        }
    }
}
