package cards;

public class CardTester {

	
	public void unitTest(String rank, String suit, int points){
		Card MagiCard = new Card(rank, suit, points);
		Card NonMagiCard = new Card(rank, suit, points);
		p(".toString() Test");
		p(MagiCard);
		p(NonMagiCard);
		p("Rank Test (should be: " + rank + ")");
		p(MagiCard.rank());
		p(NonMagiCard.rank());
		p("Suit Test (should be: " + suit + ")");
		p(MagiCard.suit());
		p(NonMagiCard.suit());
		p("Point Test (should be: " + points + ")");
		p(MagiCard.pointValue());
		p(NonMagiCard.pointValue());
		p(".equals() Test (should be: true)");
		p(MagiCard.equals(NonMagiCard));
	}
	
	private void p(Object stuff){
		System.out.println(stuff);
	}
}
