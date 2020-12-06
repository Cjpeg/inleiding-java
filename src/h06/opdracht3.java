package h06;

import java.applet.Applet;
import java.awt.*;

public class opdracht3 extends Applet {
    int a,b,c;

    public void init() {
        a=1;
        b=2147483647;
        c= a+b;
    }

    public void paint(Graphics g) {
        g.drawString("" + c,20,50);
    }
}
