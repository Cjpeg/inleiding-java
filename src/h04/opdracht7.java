package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRoundRect(75,75,200,200,35,35);
        g.setColor(Color.black);
        g.fillOval(90,100,60,60);
        g.fillOval(200,100,60,60);
        g.fillOval(90,190,60,60);
        g.fillOval(200,190,60,60);

    }
}
