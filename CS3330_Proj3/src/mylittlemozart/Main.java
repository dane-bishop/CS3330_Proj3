package mylittlemozart;

import java.util.List;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import mylittlemozart.csvparser.CSVParser;
import mylittlemozart.instrumentstrategy.ElectricBassGuitarStrategy;
import mylittlemozart.instrumentstrategy.InstrumentStrategy;
import mylittlemozart.instrumentstrategy.TrumpetStrategy;
import mylittlemozart.midieventdata.MidiEventData;
import mylittlemozart.midieventfactory.MidiEventFactory;
import mylittlemozart.midieventfactoryabstract.LegatoMidiEventFactoryAbstract;
import mylittlemozart.midieventfactoryabstract.MidiEventFactoryAbstract;
import mylittlemozart.midieventfactoryabstract.StaccatoMidiEventFactoryAbstract;
import mylittlemozart.midieventfactoryabstract.StandardMidiEventFactoryAbstract;
import mylittlemozart.pitchstrategy.HigherPitchStrategy;
import mylittlemozart.pitchstrategy.PitchStrategy;

public class Main {

	
	public static void main(String[] args) {

        
        try {
        	
        	CSVParser parser = new CSVParser();
            List<MidiEventData> midiEvents = parser.parseCsv("CS3330_Proj3\\mystery_song.csv");
            Sequence sequence = new Sequence(Sequence.PPQ, 384);
            Track track = sequence.createTrack();

            MidiEventFactoryAbstract factoryAbstract = new StandardMidiEventFactoryAbstract();
//            MidiEventFactoryAbstract factoryAbstract = new StaccatoMidiEventFactoryAbstract();
//            MidiEventFactoryAbstract factoryAbstract = new LegatoMidiEventFactoryAbstract();

            MidiEventFactory factory = factoryAbstract.createFactory();

            // Choose an instrument strategy (e.g., Trumpet, Bass Guitar, Piano)
            InstrumentStrategy instrumentStrategy = new ElectricBassGuitarStrategy();
            instrumentStrategy.applyInstrument(track, 0);
            instrumentStrategy = new TrumpetStrategy();
            instrumentStrategy.applyInstrument(track, 1);

            
            // Choose a pitch strategy (e.g., HigherPitch, LowerPitch)
            PitchStrategy pitchStrategy = new HigherPitchStrategy();

            for (MidiEventData event : midiEvents) {
                int modifiedNote = pitchStrategy.modifyPitch(event.getNote());
                
                if (event.getNoteOnOff() == ShortMessage.NOTE_ON) {
                    track.add(factory.createNoteOn(event.getStartEndTick(), 
                    								modifiedNote,
                    								event.getVelocity(), 
                    								event.getChannel()));
                } else {
                    track.add(factory.createNoteOff(event.getStartEndTick(), modifiedNote, event.getChannel()));
                }
            }

            // Playing the sequence
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.setSequence(sequence);
            sequencer.start();

            while (sequencer.isRunning()) {
                Thread.sleep(100);
            }
            Thread.sleep(500);
            sequencer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

	
	}

}
