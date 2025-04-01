package mylittlemozart.pitchstrategy;

public class HigherPitchStrategy implements PitchStrategy{
	
	/**
	 * Implementation of the modifyPitch method
	 * Used to raise the pitch of a note
	 */
	public int modifyPitch(int note) {
		note += 2;
		return note;
	}

}
