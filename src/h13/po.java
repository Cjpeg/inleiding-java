package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class po extends Applet {
    Button bos, boom;
    Boolean yn;
    public void init() {
        setSize(700, 300);
        boom = new Button("boom");
        boom.addActionListener( new ButonListener() );
        add (boom);
        bos = new Button("bos");
        bos.addActionListener( new steenListener() );
        add (bos);
    }


    public void paint(Graphics g) {
        if (yn == true) {
            boom(g, 110, 170);
        }
        else if(yn == false) {
            bos(g, 10, 10, 5, 2);
        }

    }

    class ButonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            yn=true;
            repaint();
        }
    }
    class steenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            yn=false;
            repaint();
        }
    }




    void boom(Graphics g, int x1, int y1) {
        g.setColor(Color.BLACK);
        g.fillRect(x1, y1, 50, 150);
        g.setColor(Color.green);
        g.fillArc(x1-10, y1-30, 100, 100, 0, 360);

    }
    void bos(Graphics g, int linkhoekX, int linkhoekY, int rij, int kolom) {
        for (int i = 0; i < rij; i++) {
            for (int j = 0; j < kolom; j++) {
                boom(g, linkhoekX+i*100, linkhoekY+j*150);
            }
        }
    }
}
