public class Card {
    private String rank;
    private String suit;

    public void setRank(String rank) {
        rank = rank;
    }

    public void setSuit(String suit) {
        suit = suit;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}
