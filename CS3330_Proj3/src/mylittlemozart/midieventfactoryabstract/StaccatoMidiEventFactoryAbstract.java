package mylittlemozart.midieventfactoryabstract;

import mylittlemozart.midieventfactory.MidiEventFactory;
import mylittlemozart.midieventfactory.StaccatoMidiEventFactory;

public class StaccatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract{

	/**
	 * creates a staccato factory
	 */
	@Override
	public MidiEventFactory createFactory() {
		return new StaccatoMidiEventFactory();
	}

}
