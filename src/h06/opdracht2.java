package opdracht2;

import java.applet.Applet;
import java.awt.*;

 public class opdracht2 extends Applet {
    long seconden,uur,dag,jaar, a1,a2,a3;

    public void init() {
        seconden=60;
        uur=60;
        dag=1440;
        jaar=525948766;
        a1= seconden * uur;
        a2= seconden * dag;
        a3= seconden * jaar;
    }

    public void paint(Graphics g) {
        g.drawString("" + a1,20,20);
        g.drawString("" + a2,20,40);
        g.drawString("" + a3,20,60);
    }
}

