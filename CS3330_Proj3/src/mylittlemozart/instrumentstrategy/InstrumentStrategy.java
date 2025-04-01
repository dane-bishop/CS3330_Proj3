package mylittlemozart.instrumentstrategy;

import javax.sound.midi.*;

public interface InstrumentStrategy {
	// void applyInstrument(Track track, int channel)
	
	/**
	 * Created method to be implemented in all instrument strategy classes
	 * @param track
	 * @param channel
	 */
	public void applyInstrument(Track track, int channel);

}
