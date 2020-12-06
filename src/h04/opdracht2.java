package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRect(100,100,130,130);
        g.drawRect(150,170,30,60);
        g.drawLine(100,100,170,30);
        g.drawLine(230,100,170,30);

    }
}

