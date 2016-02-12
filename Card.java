public class Card {

    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        setRank(rank);
        setSuit(suit);
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}
