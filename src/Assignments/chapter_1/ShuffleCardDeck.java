package Assignments.chapter_1;

        import java.util.Random;

public class ShuffleCardDeck {


    public static void shuffleDeck(int[] cards) {

        for (int i = 0; i < cards.length-1; i++) {

            Random random = new Random();
            int r = i + random.nextInt(52 - i);

            int temp = cards[r];
            cards[r] = cards[i];
            cards[i] = temp;

        }

        for (int i = 0; i <= cards.length-1; i++) {
            System.out.print(cards[i]+",");
        }
    }
}
