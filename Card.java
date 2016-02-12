public class Card {

    public static final String[] VALID_RANKS =
        {"2", "3", "4", "5", "6", "7", "8", "9",
         "10", "jack", "queen", "king", "ace"};

    public static final String[] VALID_SUITS =
        {"diamonds", "clubs", "hearts","spades"};

    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        setRank(rank);
        setSuit(suit);
    }

    public void setRank(String rank) {
        if (!isValidRank(rank)) {
            System.out.println(rank + " is not a valid rank.");
            System.exit(0);
        }
        this.rank = rank;
    }

    private boolean isValidRank(String someRank) {
        return contains(VALID_RANKS, someRank);
    }

    public void setSuit(String suit) {
        if (!isValidSuit(suit)) {
            System.out.println(suit + " is not a valid suit.");
            System.exit(0);
        }
        this.suit = suit;
    }

    private boolean isValidSuit(String someSuit) {
        return contains(VALID_SUITS, someSuit);
    }

    private boolean contains(String[] array, String item) {
        for (String element: array) {
            if (element.equals(item)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}
