package h13;

import java.applet.Applet;
import java.awt.*;

public class op2 extends Applet {
    public void init() {


    }


    public void paint(Graphics g) {
        muur(g, 50, 10,69, 69, 20, 10);
    }

    void tekensteen(Graphics g, int x1, int y1, int with, int height) {
        g.setColor(Color.red);
        g.fillRect(x1, y1, with, height);
        g.setColor(Color.GRAY);
        g.drawRect(x1, y1, with, height);
    }

    void muur(Graphics g, int linkhoekX, int linkhoekY, int rij, int kolom, int breedsteen, int hoogsteen) {
        for (int i = 0; i < rij; i++) {
            for (int j = 0; j < kolom; j++) {
                tekensteen(g, linkhoekX+i*breedsteen, linkhoekY+j*hoogsteen, breedsteen, hoogsteen);
            }
        }
    }
}