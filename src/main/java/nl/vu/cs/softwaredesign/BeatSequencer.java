import javax.sound.midi.*;
public class BeatSequencer {

    boolean playing = false;

    javax.sound.midi.Synthesizer synthesizer = MidiSystem.getSynthesizer();
    synthesizer.open();

    javax.sound.midi.Sequencer sequencer = MidiSystem.getSequencer();
    sequencer.open();
    Sequence sequence = new Sequence(Sequence.PPQ, 24, 12);

    public void setSequence(Sequence sequence) {
        this.sequence = sequence;
    }

    int[] instrument = new int[]{35,37,38,41,42,43,45,46,49,51,56,76};
    int[] tick = new int[]{0,8,16,24,32,40,48,64,72,80,88,96,104,112,120};

    for (int i = 0, i<12, i++){
        for (int j = 0, j<16, j++){
            ShortMessage SM_On = new ShortMessage();
            SM_On.setMessage(ShortMessage.NOTE_ON, 9, instrument[i], 0);
            MidiEvent ME_On = new MidiEvent(SM_On, tick[j]);
            track[i].add(ME_On);

            ShortMessage SM_Off = new ShortMessage();
            SM_Off.setMessage(ShortMessage.NOTE_OFF, 9, instrument[i], 0);
            MidiEvent ME_Off = new MidiEvent(SM_Off, tick[j]);
            track[i].add(ME_Off);
        }
    }
}

public void TurnNoteOn(int i, int j){ // i refers to the track number (col), j refers to the tick (row)

    ShortMessage SM_On = new ShortMessage();
    SM_On.setMessage(ShortMessage.NOTE_ON, 9, instrument[i], 0);
    MidiEvent ME_On = new MidiEvent(SM_On, tick[j]);
    track[i].add(ME_On);
}

public void TurnNoteOff(int i, int j){

    ShortMessage SM_On = new ShortMessage();
    SM_On.setMessage(ShortMessage.NOTE_ON, 9, instrument[i], 0);
    MidiEvent ME_On = new MidiEvent(SM_On, tick[j]);
    track[i].add(ME_On);
}

public void startPlayback(){
    try {
        sequencer.start();
        playing = true;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public void endPlayback() {
    try {
        sequencer.stop();
        playing = false;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
