package h02;

import java.applet.Applet;
import java.awt.*;

public class H4 extends Applet {


    public void init() {


    }


    public void paint(Graphics g) {
        g.drawLine(50, 20,270,20);
        g.drawOval(0,95,95,80);
        g.drawOval(20,200,100,100);
        g.drawRect(200,150,100,50);
        g.drawRoundRect(50,40,100,50,30,30);
        g.setColor(Color.magenta);
        g.fillArc(20,100,75,75,0,45);
        g.fillOval(200,200,140,80);
        g.fillRect(200,50,140,80);
        g.setColor(Color.black);
        g.drawOval(200,50,140,80);







    }


          }

