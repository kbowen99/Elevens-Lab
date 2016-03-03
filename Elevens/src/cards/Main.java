package cards;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

public class Main {

	public static void main(String[] args) {
		Shufffler.main();
		
		pL("Cheaty flip testing:");
		pL(Shufffler.cheatyFlip());
		pL(Shufffler.cheatyFlip());
		pL(Shufffler.cheatyFlip());
		
		DeckTester2.main(null);
		
		//Win();
	}
	
	public static void Win(){
		try {
			//https://youtu.be/btPJPFnesV4
			Desktop.getDesktop().browse(new URI("https://youtu.be/btPJPFnesV4"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void pL(Object o){
		System.out.println(o);
	}

}
