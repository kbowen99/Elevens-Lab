package cards;

import java.awt.Desktop;
import java.net.URI;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardTester unitTest = new CardTester();
		unitTest.unitTest("127", "Magic", 9001);
		unitTest.unitTest("King", "Nathan", -1);
		unitTest.unitTest("Hettel", "Engineering", 0);
		unitTest.unitTest("Miller", "Nothing", 3);
	}
	
	public void Win(){
		try {
			Desktop.getDesktop().browse(new URI("https://www.youtube.com/embed/4gd-PY_ammY?rel=0&amp;controls=0&amp;showinfo=0&autoplay=1"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
