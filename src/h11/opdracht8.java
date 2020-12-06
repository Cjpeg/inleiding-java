package h11;

import java.awt.*;
import java.applet.Applet;

public class opdracht8 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        double teller;
        int y = 0;
        int x = 0;
        int b = 250;
        int a = 250;

        for(teller = 0; teller <100; teller++) {
            y += 10;
            x += 10;
            b -= 5;
            a -= 5;


            g.drawOval(b, a, x,y);
        }
    }
}

