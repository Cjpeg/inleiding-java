package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht5 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(50,50,80,50,0,360);

    }
}
