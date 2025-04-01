package mylittlemozart;

import java.util.List;

import mylittlemozart.csvparser.CSVParser;
import mylittlemozart.midieventdata.MidiEventData;

public class Main {

	public static void main(String[] args) {
		// this is the main method
		// spencer
		
		
        CSVParser parser = new CSVParser();
        List<MidiEventData> midiEvents = parser.parseCsv("CS3330_Proj3\\mystery_song.csv");
        //"C:\Users\Spencer Steinmeyer\git\CS3330_Proj3\CS3330_Proj3\mystery_song.csv"

        // Just for demonstration, print out the parsed objects
        
        for (MidiEventData event : midiEvents) {
            System.out.println("StartEndTick: " + event.getStartEndTick() +
                               ", Velocity: " + event.getVelocity() +
                               ", Note: " + event.getNote() +
                               ", Channel: " + event.getChannel() +
                               ", Instrument: " + event.getInstrument() +
                               ", NoteOnOff: " + event.getNoteOnOff());
        
	}
	
	}

}
