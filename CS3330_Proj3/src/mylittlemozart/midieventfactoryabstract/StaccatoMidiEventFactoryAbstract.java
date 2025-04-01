package mylittlemozart.midieventfactoryabstract;

import mylittlemozart.midieventfactory.MidiEventFactory;
import mylittlemozart.midieventfactory.StaccatoMidiEventFactory;

public class StaccatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract{

	@Override
	public MidiEventFactory createFactory() {
		return new StaccatoMidiEventFactory();
	}

}
