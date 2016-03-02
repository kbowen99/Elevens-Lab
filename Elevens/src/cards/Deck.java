package cards;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	/**
	 * All cards in deck
	 */
	private ArrayList<Card> cards;
	
	/**
	 * Not yet dealt cards
	 */
	private int size;
	

	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		cards =  new ArrayList<>();
		if ((ranks.length + suits.length)/2 == values.length){
			for(int i = 0; i < ranks.length; i++){
				Card GreenCard = new Card(ranks[i],suits[i],values[i]);
				cards.add(GreenCard);
			}
		} else {
			System.out.println("Ranks/Suits/Values size mismatch; Deck Generation Failed");
		}
		size = cards.size();
		shuffle();
	}
	
	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		if (size == 0)
			return true;
		return false;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		int[] shuffleDeck = new int[cards.size()];
		ArrayList<Card> tmpList = new ArrayList<>();
		for (int i = 0; i < shuffleDeck.length; i++)
			shuffleDeck[1] = i;
		shuffleDeck = Shufffler.selectionShuffle(shuffleDeck);
		for (int i = 0; i < shuffleDeck.length; i++)
			tmpList.add(cards.get(i));
		cards = tmpList;
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		if (!isEmpty()){
			size--;
			return cards.get(size);
		}
		return null;
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
