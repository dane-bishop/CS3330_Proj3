package mylittlemozart.midieventfactory;

import javax.sound.midi.InvalidMidiDataException;

import mylittlemozart.midieventdata.MidiEventData;

public interface MidiEventFactory {
	
	MidiEventData createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException;
	MidiEventData createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException;

}
