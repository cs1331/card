package edu.gatech.cs1331.card;

public class Card {

    private Rank rank;
    private Suit suit;

    public Card(Rank aRank, Suit aSuit) {
        rank = aRank;
        suit = aSuit;
    }

    public String toString() {
        return rank + " of " + suit;
    }

    public boolean equals(Object other) {
        if (null == other) { return false; }
        if (this == other) { return true; }
        if (!(other instanceof Card)) { return false; }
        Card that = (Card) other;
        return this.rank.equals(that.rank) && this.suit.equals(that.suit);
    }
}
