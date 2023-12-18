package week6Assignment;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		deck.shuffle();
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		player1.describe();
		player2.describe();
		
		for (int i = 0; i < 26; i++) {
			Card p1Flip = player1.flip();
			Card p2Flip = player2.flip();
			System.out.println("Player 1 flipped: " + p1Flip.describe() + "\tPlayer 2 flipped: " + p2Flip.describe());
			if (p1Flip.getValue() > p2Flip.getValue()) {
				player1.incrementScore();
				System.out.println("Player 1 won the flip! Player 1's score is " + player1.getScore());
			} else if (p2Flip.getValue() > p1Flip.getValue()) {
				player2.incrementScore();
				System.out.println("Player 2 won the flip! Player 2's score is " + player2.getScore());
			} else {
				System.out.println("It was a tie! No one scores.");
			}
		}
		
		System.out.println("Final scores:\nPlayer 1: " + player1.getScore() + "\nPlayer 2: " + player2.getScore());
		System.out.println(player1.getScore() == player2.getScore() ? "It's a draw" : (player1.getScore() > player2.getScore() ? player1.getName() + " wins!" : player2.getName() + " wins!"));
	}
}
