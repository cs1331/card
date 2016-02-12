public class Dealer {

    public static void main(String[] args) {
        Card c1 = new Card(Rank.ACE, Suit.SPADES);
        Card c2 = new Card(Rank.ACE, Suit.SPADES);
        Card c3 = c1;
        System.out.println("c1 == c2 returns " + (c1 == c2));
        System.out.println("c1.equals(c2) returns " + c1.equals(c2));
        System.out.println("c1 == c3 returns " + (c1 == c3));
        System.out.println("c1.equals(c3) returns " + c1.equals(c3));
    }
}
