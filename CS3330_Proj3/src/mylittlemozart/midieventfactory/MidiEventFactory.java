package mylittlemozart.midieventfactory;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;

import mylittlemozart.midieventdata.MidiEventData;

public interface MidiEventFactory {
	
	// forces subclasses to have these two functions that create noteon, noteoff
	MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException;
	MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException;

}
