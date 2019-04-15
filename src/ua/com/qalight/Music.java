package ua.com.qalight;

import java.util.logging.Logger;

public class Music {
	
	public static void tone(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	public static void main(String[] args) {
		Wind flute = new Wind();
		tone(flute);
	Wind.play(Note.C_SHARP);
	}
	
}
