package mylittlemozart.csvparser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import mylittlemozart.midieventdata.MidiEventData;

public class CSVParser {
    
	/**
	 * takes a file path, initializes an empty arrayList,
	 * opens a BufferedReader, splits data into a list by making each element before a comma into an element in the list
	 * checks if data length is 6 to avoid errors, and then assigns all elements of that list to a MidiEventData object
	 * after turning note_on_c into a 1, note_off_c into a 0
	 * @param filePath
	 * @return
	 */
    public List<MidiEventData> parseCsv(String filePath) {
        List<MidiEventData> events = new ArrayList<>();
        String line;
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 6) {
                    int startEndTick = Integer.parseInt(data[0]);
                    int noteOnOff = 0;
                    // if the string is "Note_off_c" sets a 0, if the note is on, sets a 1
//                    System.out.println("||" + data[1] + "||");
                    if (data[1].equals(" Note_off_c")) {
                    	noteOnOff = 0;
                    }
                    else if(data[1].equals(" Note_on_c")) {
                    	noteOnOff = 1;
                    }
                    else {
                    	noteOnOff = 2;
                    }
                    int channel = Integer.parseInt(data[2]);
                    int note = Integer.parseInt(data[2]);
                    int velocity = Integer.parseInt(data[3]);
                    int instrument = Integer.parseInt(data[4]);
                    
                    
                    
                    MidiEventData event = new MidiEventData(startEndTick, velocity, note, channel, instrument, noteOnOff);
                    events.add(event);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return events;
    }

    
    
}

