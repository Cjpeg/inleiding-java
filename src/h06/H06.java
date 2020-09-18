package h06;

import java.applet.Applet;
import java.awt.*;

public class H06 extends Applet {
    double getal1,  getal2, optelsom, getal3, getal4, optelsom1;
    public void init() {
        getal1 = 5.9;
        getal2 = 6.3;
        getal3 = 6.9;
        getal4 = 3;
        optelsom = getal1 + getal2 + getal3;
        optelsom1 = optelsom / getal4;
    }

    public void paint(Graphics g) {
        g.drawString(String.valueOf(optelsom1), 50,50);

    }
}
