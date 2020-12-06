package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht6 extends Applet {


    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;
        int x = 0;
        int b = 100;
        int a = 100;

        for(teller = 0; teller <5; teller++) {
            y += 10;
            x += 10;
            b -= 5;
            a -= 5;


            g.drawOval(a,b,x,y);
        }
    }
}
