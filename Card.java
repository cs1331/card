public class Card {
    private String rank;
    private String suit;

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}
