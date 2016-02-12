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
}
