package mylittlemozart.midieventfactoryabstract;

import mylittlemozart.midieventfactory.LegatoMidiEventFactory;
import mylittlemozart.midieventfactory.MidiEventFactory;

public class LegatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract{

	@Override
	public MidiEventFactory createFactory() {
		return new LegatoMidiEventFactory();
	}

}
