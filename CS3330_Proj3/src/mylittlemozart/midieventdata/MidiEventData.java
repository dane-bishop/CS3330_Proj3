package mylittlemozart.midieventdata;

public class MidiEventData {

	private int startEndTick, velocity, note, channel, noteOnOff;
	private int instrument;
	
	/**
	 * NOTEONOFF IS A 0 IF OFF AND A 1 IF ON
	 * parameterized MidiEventData constructor
	 * 
	 * @param startEndTick
	 * @param velocity
	 * @param note
	 * @param channel
	 * @param instrument
	 * @param noteOnOff
	 */
	public MidiEventData(int startEndTick, int velocity, int note, int channel, int instrument, int noteOnOff) {
		this.startEndTick = startEndTick;
		this.velocity = velocity;
		this.note = note;
		this.channel = channel;
		this.instrument = instrument;
		this.noteOnOff = noteOnOff;
	}
	
	
	
	// GETTERS AND SETTERSs

	
	// StartEndTick
	public int getStartEndTick() {
		return startEndTick;
	}

	public void setStartEndTick(int startEndTick) {
		this.startEndTick = startEndTick;
	}

	
	
	// Velocity
	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	
	
	// Note
	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	
	
	// Channel
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	
	
	
	// NoteOnOff
	public int getNoteOnOff() {
		return noteOnOff;
	}

	public void setNoteOnOff(int noteOnOff) {
		this.noteOnOff = noteOnOff;
	}

	
	
	
	// Instrument
	public int getInstrument() {
		return instrument;
	}

	public void setInstrument(int instrument) {
		this.instrument = instrument;
	}
	
	
	
	
	
}
