package cards;

import java.awt.Desktop;
import java.net.URI;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CardTester unitTest = new CardTester();
		//unitTest.unitTest("127", "Magic", 9001);
		//unitTest.unitTest("King", "Nathan", -1);
		//unitTest.unitTest("Hettel", "Engineering", 0);
		//unitTest.unitTest("Miller", "Nothing", 3);
		
		
		DeckTester deckTest = new DeckTester();
		deckTest.test();
		Win();
	}
	
	public static void Win(){
		try {
			//https://youtu.be/btPJPFnesV4
			Desktop.getDesktop().browse(new URI("https://youtu.be/btPJPFnesV4"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
