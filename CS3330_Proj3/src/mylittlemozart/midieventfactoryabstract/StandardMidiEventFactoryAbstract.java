package mylittlemozart.midieventfactoryabstract;

import mylittlemozart.midieventfactory.MidiEventFactory;
import mylittlemozart.midieventfactory.StandardMidiEventFactory;

public class StandardMidiEventFactoryAbstract implements MidiEventFactoryAbstract{

	@Override
	public MidiEventFactory createFactory() {
		return new StandardMidiEventFactory();
	}

}
