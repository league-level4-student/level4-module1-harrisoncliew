package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	static void getHoroscope(Zodiac zod) {
		switch(zod) {
		case ARIES :
			JOptionPane.showMessageDialog(null, "Birthdates: March 21 - April 19. Traits: Eager, Dynamic, Quick, and Competitive.");
			break;
		case TAURUS :
			JOptionPane.showMessageDialog(null, "Birthdates: April 20 - May 20. Traits: Strong, Dependable, and Creative.");
			break;
		case GEMINI :
			JOptionPane.showMessageDialog(null, "Birthdates: May 21 - June 20. Traits: Versatile, Expressive, Curious, and Kind.");
			break;
		case CANCER :
			JOptionPane.showMessageDialog(null, "Birthdates: June 21 - July 22. Traits: Intuitive, Sentimental, Compassionate, and Protective.");
			break;
		case LEO :
			JOptionPane.showMessageDialog(null, "Birthdates: Jul 23 - August  . Traits.");
			break;
		case VIRGO :
			JOptionPane.showMessageDialog(null, "Birthdates: . Traits.");
			break;
		case LIBRA :
			JOptionPane.showMessageDialog(null, "Birthdates: . Traits.");
			break;
		case SCORPIO :
			JOptionPane.showMessageDialog(null, "Birthdates: . Traits.");
			break;
		case SAGITTARIUS :
			JOptionPane.showMessageDialog(null, "Birthdates: . Traits.");
			break;
		case CAPRICORN :
			JOptionPane.showMessageDialog(null, "Birthdates: . Traits.");
			break;
		case AQUARIUS :
			JOptionPane.showMessageDialog(null, "Birthdates: . Traits.");
			break;
		case PISCES :
			JOptionPane.showMessageDialog(null, "Birthdates: . Traits.");
			break;
			
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		getHoroscope(Zodiac.LIBRA);
		getHoroscope(Zodiac.ARIES);
		getHoroscope(Zodiac.CANCER);
		getHoroscope(Zodiac.GEMINI);
		getHoroscope(Zodiac.TAURUS);
		
		
		
	}
}
