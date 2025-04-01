package mylittlemozart.midieventfactory;

import javax.sound.midi.InvalidMidiDataException;

import mylittlemozart.midieventdata.MidiEventData;

public class StaccatoMidiEventFactory implements MidiEventFactory{

	@Override
	public MidiEventData createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MidiEventData createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
		// TODO Auto-generated method stub
		return null;
	}

}
