package mylittlemozart.instrumentstrategy;

import javax.sound.midi.*;

public class InstrumentImplementation {
	
	/**
	 * Method that sets an instrument to the given instrument strategy
	 */
	
	public static void setInstrument(Track track, int channel, int instrument) {
		try {
			ShortMessage programChange = new ShortMessage();
			
			// Program change
			programChange.setMessage(192 + channel, instrument, 0);
			
			// Add a tick at 0
			MidiEvent event = new MidiEvent(programChange, 0);
			
			track.add(event);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
