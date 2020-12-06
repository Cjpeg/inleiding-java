package h06;

import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet {
    double geld, antwoord;

    public void init() {
        geld = 113;
        antwoord = 113.0 / 4;
    }

    public void paint(Graphics g) {
        g.drawString("" + antwoord, 20,20);
    }
}

