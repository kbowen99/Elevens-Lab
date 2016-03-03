package cards;

public class Card {
	private String suit;
	private String rank;
	private int pointValue;
	
	public Card(){
		
	}
	
	public Card(String cardRank, String cardSuit, int cardPointValue){
		this.suit = cardSuit;
		this.rank = cardRank;
		this.pointValue = cardPointValue;
	}
	
	public String suit() {
		return this.suit;
	}
	
	public String rank() {
		return this.rank;
	}
	
	public int pointValue() {
		return this.pointValue;
	}
	
	public boolean equals(Card otherCard) {
		if(this.rank.equals(otherCard.rank()))
			if(this.suit.equals(otherCard.suit()))
				if(this.pointValue == otherCard.pointValue())
					return true;
		return false;
	}
	
	@Override
	public String toString() {
		return this.rank + " of " + this.suit + " (Point Value: " + this.pointValue + ")";
	}
}
