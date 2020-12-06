package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht7 extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int a =20;
        int b =20;
        int x =0;
        int y =0;


        for (teller = 0; teller < 100; teller++){
            x += 10;
            y += 10;
            a -= 5;
            b -= 5;
            g.drawOval(a,b,x,y);
        }
    }
}
