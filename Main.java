import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        ArrayList<Card> drawnCards = new ArrayList<>();

        // Draw 20 random cards
        for (int i = 0; i < 20; i++) {
            drawnCards.add(deck.drawCard());
        }

        System.out.println("Drawn Cards:");
        for (Card card : drawnCards) {
            System.out.println(card);
        }

        // Sort the cards using custom comparator
        Collections.sort(drawnCards, new CardComparator());

        System.out.println("\nSorted Cards:");
        for (Card card : drawnCards) {
            System.out.println(card);
        }
    }
}
