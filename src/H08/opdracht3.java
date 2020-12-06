package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class H11 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 0; teller < 10; teller++) {
            y += 20;
            g.drawLine(50 , y, 300, y );
            g.drawString("" + teller, 305, y );
        }
    }
}