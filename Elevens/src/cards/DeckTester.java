package cards;

public class DeckTester {
	public void test(){
		String[] rank = {
				"Hettel",
				"Miller",
				"Cornwall",
				"Nathan",
				"Matt"
		};
		String[] suit = {
			"Engineering",
			"Nothing",
			"Engineering",
			"Not Working",
			"Anger"
		};
		int[] pointV = {
				10,
				0,
				11,
				-1,
				7
		};
		Deck d = new Deck(rank, suit, pointV);
		while(!d.isEmpty()){
			P(d.deal().toString(), 1);
		}
	}
	
	private void P(Object p, int i){
		if (i == 1)
			System.out.println(p);
		else
			System.out.print(p);
	}
}
