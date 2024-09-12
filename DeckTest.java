import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {

    @Test
    public void testDeckInitialization() {
        Deck deck = new Deck();
        assertEquals(52, deck.getSize(), "Deck should have 52 cards initially.");
    }

    @Test
    public void testCardDrawing() {
        Deck deck = new Deck();
        Card card = deck.drawCard();
        assertNotNull(card, "Drawn card should not be null.");
        assertEquals(51, deck.getSize(), "Deck should have 51 cards after drawing one.");
    }

    @Test
    public void testDeckEmpty() {
        Deck deck = new Deck();
        for (int i = 0; i < 52; i++) {
            deck.drawCard();
        }
        assertThrows(IllegalStateException.class, deck::drawCard, "Drawing from an empty deck should throw an exception.");
    }
}
