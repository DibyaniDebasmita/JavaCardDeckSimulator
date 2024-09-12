import java.util.Comparator;

public class CardComparator implements Comparator<Card> {

    @Override
    public int compare(Card card1, Card card2) {
        // Compare by color
        int colorComparison = getColor(card1).compareTo(getColor(card2));
        if (colorComparison != 0) {
            return colorComparison;
        }

        // Compare by suit within the same color
        int suitComparison = card1.getSuit().compareTo(card2.getSuit());
        if (suitComparison != 0) {
            return suitComparison;
        }

        // Compare by rank
        return card1.getRank().compareTo(card2.getRank());
    }

    private Color getColor(Card card) {
        return (card.getSuit() == Card.Suit.HEART || card.getSuit() == Card.Suit.DIAMOND) ? Color.RED : Color.BLACK;
    }

    private enum Color {
        RED, BLACK
    }
}

