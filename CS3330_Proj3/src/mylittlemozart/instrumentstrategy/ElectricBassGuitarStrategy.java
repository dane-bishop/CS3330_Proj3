package mylittlemozart.instrumentstrategy;



import javax.sound.midi.*;

public class ElectricBassGuitarStrategy implements InstrumentStrategy{
	
	
	/**
	 * Implementing the applyInstrument method by calling the static method setInstrument
	 * from the InstrumentImplementation class
	 */
	@Override
	public void applyInstrument(Track track, int channel) {
		InstrumentImplementation.setInstrument(track, channel, 33);
	}
	
	
	

}
