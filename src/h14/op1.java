package h14;

import java.applet.Applet;
import java.awt.*;

public class op1 extends Applet {
    int randomcolorint, randomtypeint, randomint, specialint;
    String [] color;
    String [] type;
    String [] special;
    public void init() {
        color = new String[3];
        type = new String[4];
        special = new String[5];
        color[0] = "Black";
        color[1] = "Red";
        String[] type = {"♣", "♠", "♥", "♦"};
        String [] specials = {"Jack", "Queen", "King", "Ace"};
        randomcolorint = (int) (Math.random() * 2 + 0);
        System.out.println(color[randomcolorint]);
        randomtypeint = (int) (Math.random() * 4 + 0);
        System.out.println(type[randomtypeint]);
        randomint = (int) (Math.random() * 6 + 1);
        System.out.println(randomint);
        specialint = (int) (Math.random() * 4 + 1);
        System.out.println(specials[specialint]);

    }



    public void paint(Graphics g) {
        g.drawString(color[randomcolorint]+" " + type[randomtypeint]+ " "+randomint, 50, 50);


    }
}
