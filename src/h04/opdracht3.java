package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht3 extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {
        g.drawLine(20,200,20,20);
        g.drawRect(20,60,150,40);
        g.setColor(Color.blue);
        g.fillRect(20,100,150,40);
        g.setColor(Color.red);
        g.fillRect(20,20,150,40);
    }
}
