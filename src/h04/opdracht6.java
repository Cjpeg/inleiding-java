package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(20,20,100,260);
        g.setColor(Color.green);
        g.fillOval(40,50,60,60);
        g.setColor(Color.yellow);
        g.fillOval(40,120,60,60);
        g.setColor(Color.red);
        g.fillOval(40,190,60,60);
    }
}
