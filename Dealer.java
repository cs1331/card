public class Dealer {

    public static void main(String[] args) {
        Card c = new Card();
        System.out.println(c); // Printing a new Card instance
        c.setRank("ace");
        c.setSuit("spades");
        System.out.println(c);
    }
}
