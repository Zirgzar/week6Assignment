package week6Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cards = new ArrayList<>();
	
	public Deck() {
		createNewDeck();
	}
	
	private List<Card> createNewDeck() {
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		
		for (String suit : suits) {
			for (String rank : ranks) {
				cards.add(createCard(rank, suit));
			}
		}
		return cards;
	}
	
	public Card createCard(String rank, String suit) {
		int value = -1;
		switch (rank) {
			case "2":
				value = 2;
				break;
			case "3":
				value = 3;
				break;
			case "4":
				value = 4;
				break;
			case "5":
				value = 5;
				break;
			case "6":
				value = 6;
				break;
			case "7":
				value = 7;
				break;
			case "8":
				value = 8;
				break;
			case "9":
				value = 9;
				break;
			case "10":
				value = 10;
				break;
			case "Jack":
				value = 11;
				break;
			case "Queen":
				value = 12;
				break;
			case "King":
				value = 13;
				break;
			case "Ace":
				value = 14;
				break;
			default:
				break;
		}
		return new Card(value, rank + " of " + suit);
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
		System.out.println("Deck has been shuffled.");
	}
	
	public Card draw() {
		Card drawnCard = cards.get(0);
		cards.remove(0);
		return drawnCard;
	}
	
	public List<Card> getCards() {
		return cards;
	}
	
}
