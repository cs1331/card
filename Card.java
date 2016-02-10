public class Card {
    private String rank;
    private String suit;

    public String toString() {
        return rank + " of " + suit;
    }

    public static void main(String[] args) {
        Card c = new Card();
        c.rank = "ace";
        c.suit = "base";
        System.out.println(c);
    }
}
