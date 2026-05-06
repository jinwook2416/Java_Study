package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<Card> cards = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void drawCard(Deck deck) {
        cards.add(deck.drawCard());
    }

    public void showHand() {
        cards.sort(null);
        System.out.println(name +"의 카드: " + cards + ", 합계: " + rankSum());
    }

    public String getName() {
        return name;
    }

    public int rankSum() {
        int sum = 0;
        for (Card card : cards) {
            sum += card.getRank();
        }
        return sum;
    }
}
