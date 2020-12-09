package h14;


import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class op2 extends Applet {
    String [] deck;
    int cardsperplayer;


    public void init() {
        setSize(1000,1000);
        fillDeck();
        cardsperplayer = deck.length/4;
    }



    public void paint(Graphics g) {
        for (int i = 0; i < deck.length; i++){
        }
        g.drawString("player 1", 10, 30);
        paintcards(g, 10, 50);
        g.drawString("player 2", 70, 30);
        paintcards(g, 70, 50);
        g.drawString("player 3", 120, 30);
        paintcards(g, 120, 50);
        g.drawString("player 4", 170, 30);
        paintcards(g, 170, 50);
    }

    private void fillDeck () {
        String[] type = {"♣", "♠", "♥", "♦"};
        String[] numbers = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int lengthDeck = type.length * numbers.length;
        deck = new String[lengthDeck];
        int i = 0;
        for (int typeCount = 0; typeCount < type.length; typeCount++) {
            for (int numberCount = 0; numberCount < numbers.length; numberCount++) {
                deck[i] = type[typeCount] + " " + numbers[numberCount];;
                i++;
            }
        }
    }


    private String distributeCards(){
        return deelKaart();
    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }

    void paintcards(Graphics g, int x1, int y1) {
        for (int i = 0; i < cardsperplayer; i++) {
            g.drawString(distributeCards(),x1, y1);
            y1 += 20;
        }

    }
}
