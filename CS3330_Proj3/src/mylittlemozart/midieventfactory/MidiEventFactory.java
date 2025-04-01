package mylittlemozart.midieventfactory;

import javax.sound.midi.InvalidMidiDataException;

import mylittlemozart.midieventdata.MidiEventData;

public interface MidiEventFactory {
	
	// forces subclasses to have these two functions that create noteon, noteoff
	MidiEventData createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException;
	MidiEventData createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException;

}
