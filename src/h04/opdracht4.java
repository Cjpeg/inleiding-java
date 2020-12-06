package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht4 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(40,240,50,40);
        g.setColor(Color.yellow);
        g.fillRect(120,180,50,100);
        g.setColor(Color.blue);
        g.fillRect(200,200,50,80);
        g.setColor(Color.pink);
        g.drawString("valerie",40,300);
        g.drawString("jeroen",120,300);
        g.drawString("hans",200,300);
    }
}
