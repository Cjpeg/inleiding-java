package h02;

import java.applet.Applet;
import java.awt.*;

public class test extends Applet {


    public void init() {
        setBackground(Color.white);


    }


    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Cas", 50, 60);
        g.setColor(Color.red);
        g.drawString("Meyer", 50,80);


    }


          }

