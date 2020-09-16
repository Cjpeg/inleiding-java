package h05;

import java.applet.Applet;
import java.awt.*;

public class H05 extends Applet {
    // variablen voor de recht hoek
    int breedte, hoogte;
    int breedte1, hoogte1;
    int breedte2, hoogte2;

    //kleuren
    Color rechthoekkleur =  Color.pink;



    public void init() {
        setBackground(Color.cyan);
        breedte = 50;
        hoogte = 40;
        breedte1 = 50;
        hoogte1 = 100;
        breedte2 = 50;
        hoogte2 = 80;


    }

    public void paint(Graphics g) {


        g.setColor(rechthoekkleur);

        g.fillRect(0,0,breedte,hoogte);
        g.fillRect(100,0,breedte1,hoogte1);
        g.fillRect(200,0,breedte2,hoogte2);
        g.drawString("valerie",5,280);
        g.drawString("jeroen",105,280);
        g.drawString("hans",210,280);



    }
}