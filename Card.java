public class Card {

    String rank;
    String suit;

    public String toString() {
        return rank + " of " + suit;
    }

    public static void main(String[] args) {
        Card swedishPop = new Card();
        swedishPop.rank = "ace";
        swedishPop.suit = "base";
        Card handy = new Card();
        handy.rank = "jack";
        handy.suit = "all trades";
        System.out.println(swedishPop);
        System.out.println(handy);
    }
}
