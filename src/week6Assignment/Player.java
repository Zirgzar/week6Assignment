package week6Assignment;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand = new ArrayList<>();
	private int score;
	private String name;
	
	public Player(String name) {
		this.score = 0;
		this.name = name;
	}
	
	public void describe() {
		System.out.println("Player: " + name + "\tScore: " + score);
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		Card topCard = hand.get(0);
		hand.remove(0);
		return topCard;
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		this.score += 1;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
