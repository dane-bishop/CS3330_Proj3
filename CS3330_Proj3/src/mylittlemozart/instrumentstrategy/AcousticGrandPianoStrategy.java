package mylittlemozart.instrumentstrategy;

import javax.sound.midi.Track;

public class AcousticGrandPianoStrategy implements InstrumentStrategy{
	
	/**
	 * Implementing the applyInstrument method by calling the static method setInstrument
	 * from the InstrumentImplementation class
	 */
	@Override
	public void applyInstrument(Track track, int channel) {
		InstrumentImplementation.setInstrument(track, channel, 0);
	}

}
