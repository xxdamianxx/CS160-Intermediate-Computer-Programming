import java.util.LinkedList;
import java.util.Deque;

public class CardDeck {
   public static void main (String[] args) {
      Deque<String> cards = new LinkedList<String>();

      cards.addFirst("2_clubs");
      cards.addLast("king_spades");
      cards.addLast("queen_diamonds");
      cards.addFirst("5_diamonds");
      cards.addLast("8_spades");

      System.out.println(cards.peekFirst());
      System.out.println(cards.peekLast());
      System.out.println(cards.getLast());
      System.out.println(cards.getFirst());
  }
}