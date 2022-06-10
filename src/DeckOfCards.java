import java.lang.reflect.Array;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] card = {"Club", "Diamond", "Hearts", "Spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[][] cardRank = new String[4][9];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                int cards = (int) (Math.random() * 4);
                int ranks = (int) (Math.random() * 13);
                cardRank[i][j] = card[cards] + " " + rank[ranks];
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.print("Player " + i + " ");
            for (int j = 0; j < 9; j++) {
                System.out.print(cardRank[i][j]);
            }
            System.out.println();
        }
    }
}
