package collection.compare.test;

public class Card implements Comparable<Card> {

    private final int rank;
    private final Suit suit;

    public Card(int number, Suit suit) {
        this.rank = number;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public int compareTo(Card o) {
        if (this.rank != o.rank) {
            return Integer.compare(this.rank, o.rank);
        } else {
            return this.suit.compareTo(o.suit);
        }
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }
}
