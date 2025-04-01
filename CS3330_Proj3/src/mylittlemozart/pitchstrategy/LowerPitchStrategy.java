package mylittlemozart.pitchstrategy;

public class LowerPitchStrategy implements PitchStrategy{
	
	
	/**
	 * Implementation of the modifyPitch method
	 * Used to drop the pitch of a note
	 */
	public int modifyPitch(int note) {
		note -= 2;
		return note;
	}

}
