package mylittlemozart.midieventfactory;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public class LegatoMidiEventFactory implements MidiEventFactory{

	/**
	 * Creates note_on event
	 * Sets a ShortMessage with the data inputted, because that is what MidiEvent takes as parameters
	 */
	@Override
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
		ShortMessage message = new ShortMessage();
        message.setMessage(ShortMessage.NOTE_ON, channel, note, velocity);
		return new MidiEvent(message, tick);
	}

	/**
	 * Creates note_off event, setting the tick time to 80 ticks later
	 * Sets a ShortMessage with the data inputted, because that is what MidiEvent takes as parameters
	 */
	@Override
	public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
		ShortMessage message = new ShortMessage();
        message.setMessage(ShortMessage.NOTE_OFF, channel, note, 0);
		tick = tick+80;
		return new MidiEvent(message, tick);
	}

}
