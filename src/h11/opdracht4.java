package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int a = 1;
        int b;
        int y = 0;

        for (teller = 1; teller < 11; teller++) {
            b = a*3;
            a += 1;
            y +=20;
            g.drawString(String.valueOf(b), 50, y);
        }
    }
}
