package com.example.drumset;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public class DrumMachineLogic {

    private boolean noteOn = false;

    @FXML
    void noteOnOff_0_3(ActionEvent event) {
        track[0].remove(track[0].get(3));
        if (noteOn = false) {
            TurnNoteOn(0,3);
        } else TurnNoteOff(0,3);
    }

    @FXML
    void noteOnOff_1_3(ActionEvent event) {
        track[1].remove(track[1].get(3));
        if (noteOn = false) {
            TurnNoteOn(1,3);
        } else TurnNoteOff(1,3);
    }

    @FXML
    void noteOnOff_2_3(ActionEvent event) {
        track[2].remove(track[2].get(3));
        if (noteOn = false) {
            TurnNoteOn(2,3);
        } else TurnNoteOff(2,3);
    }

    @FXML
    void noteOnOff_3_3(ActionEvent event) {
        track[3].remove(track[3].get(3));
        if (noteOn = false) {
            TurnNoteOn(3,3);
        } else TurnNoteOff(3,3);
    }

    @FXML
    void noteOnOff_4_3(ActionEvent event) {
        track[4].remove(track[4].get(3));
        if (noteOn = false) {
            TurnNoteOn(4,3);
        } else TurnNoteOff(4,3);
    }

    @FXML
    void noteOnOff_5_3(ActionEvent event) {
        track[5].remove(track[5].get(3));
        if (noteOn = false) {
            TurnNoteOn(5,3);
        } else TurnNoteOff(5,3);
    }

    @FXML
    void noteOnOff_6_3(ActionEvent event) {
        track[6].remove(track[6].get(3));
        if (noteOn = false) {
            TurnNoteOn(6,3);
        } else TurnNoteOff(6,3);
    }

    @FXML
    void noteOnOff_7_3(ActionEvent event) {
        track[7].remove(track[7].get(3));
        if (noteOn = false) {
            TurnNoteOn(7,3);
        } else TurnNoteOff(7,3);
    }

    @FXML
    void noteOnOff_8_3(ActionEvent event) {
        track[8].remove(track[8].get(3));
        if (noteOn = false) {
            TurnNoteOn(8,3);
        } else TurnNoteOff(8,3);
    }

    @FXML
    void noteOnOff_9_3(ActionEvent event) {
        track[9].remove(track[9].get(3));
        if (noteOn = false) {
            TurnNoteOn(9,3);
        } else TurnNoteOff(9,3);
    }

    @FXML
    void noteOnOff_10_3(ActionEvent event) {
        track[10].remove(track[10].get(3));
        if (noteOn = false) {
            TurnNoteOn(10,3);
        } else TurnNoteOff(10,3);
    }

    @FXML
    void noteOnOff_11_3(ActionEvent event) {
        track[11].remove(track[11].get(3));
        if (noteOn = false) {
            TurnNoteOn(11,3);
        } else TurnNoteOff(11,3);
    }

    @FXML
    void noteOnOff_0_4(ActionEvent event) {
        track[0].remove(track[0].get(4));
        if (noteOn = false) {
            TurnNoteOn(0,4);
        } else TurnNoteOff(0,4);
    }

    @FXML
    void noteOnOff_1_4(ActionEvent event) {
        track[1].remove(track[1].get(4));
        if (noteOn = false) {
            TurnNoteOn(1,4);
        } else TurnNoteOff(1,4);
    }

    @FXML
    void noteOnOff_2_4(ActionEvent event) {
        track[2].remove(track[2].get(4));
        if (noteOn = false) {
            TurnNoteOn(2,4);
        } else TurnNoteOff(2,4);
    }

    @FXML
    void noteOnOff_3_4(ActionEvent event) {
        track[3].remove(track[3].get(4));
        if (noteOn = false) {
            TurnNoteOn(3,4);
        } else TurnNoteOff(3,4);
    }

    @FXML
    void noteOnOff_4_4(ActionEvent event) {
        track[4].remove(track[4].get(4));
        if (noteOn = false) {
            TurnNoteOn(4,4);
        } else TurnNoteOff(4,4);
    }

    @FXML
    void noteOnOff_5_4(ActionEvent event) {
        track[5].remove(track[5].get(4));
        if (noteOn = false) {
            TurnNoteOn(5,4);
        } else TurnNoteOff(5,4);
    }

    @FXML
    void noteOnOff_6_4(ActionEvent event) {
        track[6].remove(track[6].get(4));
        if (noteOn = false) {
            TurnNoteOn(6,4);
        } else TurnNoteOff(6,4);
    }

    @FXML
    void noteOnOff_7_4(ActionEvent event) {
        track[7].remove(track[7].get(4));
        if (noteOn = false) {
            TurnNoteOn(7,4);
        } else TurnNoteOff(7,4);
    }

    @FXML
    void noteOnOff_8_4(ActionEvent event) {
        track[8].remove(track[8].get(4));
        if (noteOn = false) {
            TurnNoteOn(8,4);
        } else TurnNoteOff(8,4);
    }

    @FXML
    void noteOnOff_9_4(ActionEvent event) {
        track[9].remove(track[9].get(4));
        if (noteOn = false) {
            TurnNoteOn(9,4);
        } else TurnNoteOff(9,4);
    }

    @FXML
    void noteOnOff_10_4(ActionEvent event) {
        track[10].remove(track[10].get(4));
        if (noteOn = false) {
            TurnNoteOn(10,4);
        } else TurnNoteOff(10,4);
    }

    @FXML
    void noteOnOff_11_4(ActionEvent event) {
        track[11].remove(track[11].get(4));
        if (noteOn = false) {
            TurnNoteOn(11,4);
        } else TurnNoteOff(11,4);
    }

    @FXML
    void noteOnOff_0_5(ActionEvent event) {
        track[0].remove(track[0].get(5));
        if (noteOn = false) {
            TurnNoteOn(0,5);
        } else TurnNoteOff(0,5);
    }

    @FXML
    void noteOnOff_1_5(ActionEvent event) {
        track[1].remove(track[1].get(5));
        if (noteOn = false) {
            TurnNoteOn(1,5);
        } else TurnNoteOff(1,5);
    }

    @FXML
    void noteOnOff_2_5(ActionEvent event) {
        track[2].remove(track[2].get(5));
        if (noteOn = false) {
            TurnNoteOn(2,5);
        } else TurnNoteOff(2,5);
    }

    @FXML
    void noteOnOff_3_5(ActionEvent event) {
        track[3].remove(track[3].get(5));
        if (noteOn = false) {
            TurnNoteOn(3,5);
        } else TurnNoteOff(3,5);
    }

    @FXML
    void noteOnOff_4_5(ActionEvent event) {
        track[4].remove(track[4].get(5));
        if (noteOn = false) {
            TurnNoteOn(4,5);
        } else TurnNoteOff(4,5);
    }

    @FXML
    void noteOnOff_5_5(ActionEvent event) {
        track[5].remove(track[5].get(5));
        if (noteOn = false) {
            TurnNoteOn(5,5);
        } else TurnNoteOff(5,5);
    }

    @FXML
    void noteOnOff_6_5(ActionEvent event) {
        track[6].remove(track[6].get(5));
        if (noteOn = false) {
            TurnNoteOn(6,5);
        } else TurnNoteOff(6,5);
    }

    @FXML
    void noteOnOff_7_5(ActionEvent event) {
        track[7].remove(track[7].get(5));
        if (noteOn = false) {
            TurnNoteOn(7,5);
        } else TurnNoteOff(7,5);
    }

    @FXML
    void noteOnOff_8_5(ActionEvent event) {
        track[8].remove(track[8].get(5));
        if (noteOn = false) {
            TurnNoteOn(8,5);
        } else TurnNoteOff(8,5);
    }

    @FXML
    void noteOnOff_9_5(ActionEvent event) {
        track[9].remove(track[9].get(5));
        if (noteOn = false) {
            TurnNoteOn(9,5);
        } else TurnNoteOff(9,5);
    }

    @FXML
    void noteOnOff_10_5(ActionEvent event) {
        track[10].remove(track[10].get(5));
        if (noteOn = false) {
            TurnNoteOn(10,5);
        } else TurnNoteOff(10,5);
    }

    @FXML
    void noteOnOff_11_5(ActionEvent event) {
        track[11].remove(track[11].get(5));
        if (noteOn = false) {
            TurnNoteOn(11,5);
        } else TurnNoteOff(11,5);
    }

    @FXML
    void noteOnOff_0_6(ActionEvent event) {
        track[0].remove(track[0].get(6));
        if (noteOn = false) {
            TurnNoteOn(0,6);
        } else TurnNoteOff(0,6);
    }

    @FXML
    void noteOnOff_1_6(ActionEvent event) {
        track[1].remove(track[1].get(6));
        if (noteOn = false) {
            TurnNoteOn(1,6);
        } else TurnNoteOff(1,6);
    }

    @FXML
    void noteOnOff_2_6(ActionEvent event) {
        track[2].remove(track[2].get(6));
        if (noteOn = false) {
            TurnNoteOn(2,6);
        } else TurnNoteOff(2,6);
    }

    @FXML
    void noteOnOff_3_6(ActionEvent event) {
        track[3].remove(track[3].get(6));
        if (noteOn = false) {
            TurnNoteOn(3,6);
        } else TurnNoteOff(3,6);
    }

    @FXML
    void noteOnOff_4_6(ActionEvent event) {
        track[4].remove(track[4].get(6));
        if (noteOn = false) {
            TurnNoteOn(4,6);
        } else TurnNoteOff(4,6);
    }

    @FXML
    void noteOnOff_5_6(ActionEvent event) {
        track[5].remove(track[5].get(6));
        if (noteOn = false) {
            TurnNoteOn(5,6);
        } else TurnNoteOff(5,6);
    }

    @FXML
    void noteOnOff_6_6(ActionEvent event) {
        track[6].remove(track[0].get(6));
        if (noteOn = false) {
            TurnNoteOn(6,6);
        } else TurnNoteOff(6,6);
    }

    @FXML
    void noteOnOff_7_6(ActionEvent event) {
        track[7].remove(track[7].get(6));
        if (noteOn = false) {
            TurnNoteOn(7,6);
        } else TurnNoteOff(7,6);
    }

    @FXML
    void noteOnOff_8_6(ActionEvent event) {
        track[8].remove(track[8].get(6));
        if (noteOn = false) {
            TurnNoteOn(8,6);
        } else TurnNoteOff(8,6);
    }

    @FXML
    void noteOnOff_9_6(ActionEvent event) {
        track[9].remove(track[9].get(6));
        if (noteOn = false) {
            TurnNoteOn(9,6);
        } else TurnNoteOff(9,6);
    }

    @FXML
    void noteOnOff_10_6(ActionEvent event) {
        track[10].remove(track[10].get(6));
        if (noteOn = false) {
            TurnNoteOn(10,6);
        } else TurnNoteOff(10,6);
    }

    @FXML
    void noteOnOff_11_6(ActionEvent event) {
        track[11].remove(track[11].get(6));
        if (noteOn = false) {
            TurnNoteOn(11,6);
        } else TurnNoteOff(11,6);
    }

    @FXML
    void noteOnOff_0_7(ActionEvent event) {
        track[0].remove(track[0].get(7));
        if (noteOn = false) {
            TurnNoteOn(0,7);
        } else TurnNoteOff(0,7);
    }

    @FXML
    void noteOnOff_1_7(ActionEvent event) {
        track[1].remove(track[1].get(7));
        if (noteOn = false) {
            TurnNoteOn(1,7);
        } else TurnNoteOff(1,7);
    }

    @FXML
    void noteOnOff_2_7(ActionEvent event) {
        track[2].remove(track[2].get(7));
        if (noteOn = false) {
            TurnNoteOn(2,7);
        } else TurnNoteOff(2,7);
    }

    @FXML
    void noteOnOff_3_7(ActionEvent event) {
        track[3].remove(track[3].get(7));
        if (noteOn = false) {
            TurnNoteOn(3,7);
        } else TurnNoteOff(3,7);
    }

    @FXML
    void noteOnOff_4_7(ActionEvent event) {
        track[4].remove(track[4].get(7));
        if (noteOn = false) {
            TurnNoteOn(4,7);
        } else TurnNoteOff(4,7);
    }

    @FXML
    void noteOnOff_5_7(ActionEvent event) {
        track[5].remove(track[5].get(7));
        if (noteOn = false) {
            TurnNoteOn(5,7);
        } else TurnNoteOff(5,7);
    }

    @FXML
    void noteOnOff_6_7(ActionEvent event) {
        track[6].remove(track[6].get(7));
        if (noteOn = false) {
            TurnNoteOn(6,7);
        } else TurnNoteOff(6,7);
    }

    @FXML
    void noteOnOff_7_7(ActionEvent event) {
        track[7].remove(track[7].get(7));
        if (noteOn = false) {
            TurnNoteOn(7,7);
        } else TurnNoteOff(7,7);
    }

    @FXML
    void noteOnOff_8_7(ActionEvent event) {
        track[8].remove(track[8].get(7));
        if (noteOn = false) {
            TurnNoteOn(8,7);
        } else TurnNoteOff(8,7);
    }

    @FXML
    void noteOnOff_9_7(ActionEvent event) {
        track[9].remove(track[9].get(7));
        if (noteOn = false) {
            TurnNoteOn(9,7);
        } else TurnNoteOff(9,7);
    }

    @FXML
    void noteOnOff_10_7(ActionEvent event) {
        track[10].remove(track[10].get(7));
        if (noteOn = false) {
            TurnNoteOn(10,7);
        } else TurnNoteOff(10,7);
    }

    @FXML
    void noteOnOff_11_7(ActionEvent event) {
        track[11].remove(track[11].get(7));
        if (noteOn = false) {
            TurnNoteOn(11,7);
        } else TurnNoteOff(11,7);
    }

    @FXML
    void noteOnOff_0_8(ActionEvent event) {
        track[0].remove(track[0].get(8));
        if (noteOn = false) {
            TurnNoteOn(0,8);
        } else TurnNoteOff(0,8);
    }

    @FXML
    void noteOnOff_1_8(ActionEvent event) {
        track[1].remove(track[1].get(8));
        if (noteOn = false) {
            TurnNoteOn(1,8);
        } else TurnNoteOff(1,8);
    }

    @FXML
    void noteOnOff_2_8(ActionEvent event) {
        track[2].remove(track[2].get(8));
        if (noteOn = false) {
            TurnNoteOn(2,8);
        } else TurnNoteOff(2,8);
    }

    @FXML
    void noteOnOff_3_8(ActionEvent event) {
        track[3].remove(track[3].get(8));
        if (noteOn = false) {
            TurnNoteOn(3,8);
        } else TurnNoteOff(3,8);
    }

    @FXML
    void noteOnOff_4_8(ActionEvent event) {
        track[4].remove(track[4].get(8));
        if (noteOn = false) {
            TurnNoteOn(4,8);
        } else TurnNoteOff(4,8);
    }

    @FXML
    void noteOnOff_5_8(ActionEvent event) {
        track[5].remove(track[5].get(8));
        if (noteOn = false) {
            TurnNoteOn(5,8);
        } else TurnNoteOff(5,8);
    }

    @FXML
    void noteOnOff_6_8(ActionEvent event) {
        track[6].remove(track[6].get(8));
        if (noteOn = false) {
            TurnNoteOn(6,8);
        } else TurnNoteOff(6,8);
    }

    @FXML
    void noteOnOff_7_8(ActionEvent event) {
        track[7].remove(track[7].get(8));
        if (noteOn = false) {
            TurnNoteOn(7,8);
        } else TurnNoteOff(7,8);
    }

    @FXML
    void noteOnOff_8_8(ActionEvent event) {
        track[8].remove(track[8].get(8));
        if (noteOn = false) {
            TurnNoteOn(8,8);
        } else TurnNoteOff(8,8);
    }

    @FXML
    void noteOnOff_9_8(ActionEvent event) {
        track[9].remove(track[9].get(8));
        if (noteOn = false) {
            TurnNoteOn(9,8);
        } else TurnNoteOff(9,8);
    }

    @FXML
    void noteOnOff_10_8(ActionEvent event) {
        track[10].remove(track[10].get(8));
        if (noteOn = false) {
            TurnNoteOn(10,8);
        } else TurnNoteOff(10,8);
    }

    @FXML
    void noteOnOff_11_8(ActionEvent event) {
        track[11].remove(track[11].get(8));
        if (noteOn = false) {
            TurnNoteOn(11,8);
        } else TurnNoteOff(11,8);
    }

    @FXML
    void noteOnOff_0_9(ActionEvent event) {
        track[0].remove(track[0].get(9));
        if (noteOn = false) {
            TurnNoteOn(0,9);
        } else TurnNoteOff(0,9);
    }

    @FXML
    void noteOnOff_1_9(ActionEvent event) {
        track[1].remove(track[1].get(9));
        if (noteOn = false) {
            TurnNoteOn(1,9);
        } else TurnNoteOff(1,9);
    }

    @FXML
    void noteOnOff_2_9(ActionEvent event) {
        track[2].remove(track[2].get(9));
        if (noteOn = false) {
            TurnNoteOn(2,9);
        } else TurnNoteOff(2,9);
    }

    @FXML
    void noteOnOff_3_9(ActionEvent event) {
        track[3].remove(track[3].get(9));
        if (noteOn = false) {
            TurnNoteOn(3,9);
        } else TurnNoteOff(3,9);
    }

    @FXML
    void noteOnOff_4_9(ActionEvent event) {
        track[4].remove(track[4].get(9));
        if (noteOn = false) {
            TurnNoteOn(4,9);
        } else TurnNoteOff(4,9);
    }

    @FXML
    void noteOnOff_5_9(ActionEvent event) {
        track[5].remove(track[5].get(9));
        if (noteOn = false) {
            TurnNoteOn(5,9);
        } else TurnNoteOff(5,9);
    }

    @FXML
    void noteOnOff_6_9(ActionEvent event) {
        track[6].remove(track[6].get(9));
        if (noteOn = false) {
            TurnNoteOn(6,9);
        } else TurnNoteOff(6,9);
    }

    @FXML
    void noteOnOff_7_9(ActionEvent event) {
        track[7].remove(track[7].get(9));
        if (noteOn = false) {
            TurnNoteOn(7,9);
        } else TurnNoteOff(7,9);
    }

    @FXML
    void noteOnOff_8_9(ActionEvent event) {
        track[8].remove(track[8].get(9));
        if (noteOn = false) {
            TurnNoteOn(8,9);
        } else TurnNoteOff(8,9);
    }

    @FXML
    void noteOnOff_9_9(ActionEvent event) {
        track[9].remove(track[9].get(9));
        if (noteOn = false) {
            TurnNoteOn(9,9);
        } else TurnNoteOff(9,9);
    }

    @FXML
    void noteOnOff_10_9(ActionEvent event) {
        track[10].remove(track[10].get(9));
        if (noteOn = false) {
            TurnNoteOn(10,9);
        } else TurnNoteOff(10,9);
    }

    @FXML
    void noteOnOff_11_9(ActionEvent event) {
        track[11].remove(track[11].get(9));
        if (noteOn = false) {
            TurnNoteOn(11,9);
        } else TurnNoteOff(11,9);
    }

    @FXML
    void noteOnOff_0_10(ActionEvent event) {
        track[0].remove(track[0].get(10));
        if (noteOn = false) {
            TurnNoteOn(0,10);
        } else TurnNoteOff(0,10);
    }

    @FXML
    void noteOnOff_1_10(ActionEvent event) {

    }

    @FXML
    void noteOnOff_2_10(ActionEvent event) {

    }

    @FXML
    void noteOnOff_3_10(ActionEvent event) {

    }

    @FXML
    void noteOnOff_4_10(ActionEvent event) {

    }

    @FXML
    void noteOnOff_5_10(ActionEvent event) {

    }

    @FXML
    void noteOnOff_6_10(ActionEvent event) {

    }

    @FXML
    void noteOnOff_7_10(ActionEvent event) {

    }

    @FXML
    void noteOnOff_8_10(ActionEvent event) {

    }

    @FXML
    void noteOnOff_9_10(ActionEvent event) {

    }

    @FXML
    void noteOnOff_10_10(ActionEvent event) {

    }

    @FXML
    void noteOnOff_11_10(ActionEvent event) {

    }

    @FXML
    void noteOnOff_0_11(ActionEvent event) {

    }

    @FXML
    void noteOnOff_1_11(ActionEvent event) {

    }

    @FXML
    void noteOnOff_2_11(ActionEvent event) {

    }

    @FXML
    void noteOnOff_3_11(ActionEvent event) {

    }

    @FXML
    void noteOnOff_4_11(ActionEvent event) {

    }

    @FXML
    void noteOnOff_5_11(ActionEvent event) {

    }

    @FXML
    void noteOnOff_6_11(ActionEvent event) {

    }

    @FXML
    void noteOnOff_7_11(ActionEvent event) {

    }

    @FXML
    void noteOnOff_8_11(ActionEvent event) {

    }

    @FXML
    void noteOnOff_9_11(ActionEvent event) {

    }

    @FXML
    void noteOnOff_10_11(ActionEvent event) {

    }

    @FXML
    void noteOnOff_11_11(ActionEvent event) {

    }

    @FXML
    void noteOnOff_0_12(ActionEvent event) {

    }

    @FXML
    void noteOnOff_1_12(ActionEvent event) {

    }

    @FXML
    void noteOnOff_2_12(ActionEvent event) {

    }

    @FXML
    void noteOnOff_3_12(ActionEvent event) {

    }

    @FXML
    void noteOnOff_4_12(ActionEvent event) {

    }

    @FXML
    void noteOnOff_5_12(ActionEvent event) {

    }

    @FXML
    void noteOnOff_6_12(ActionEvent event) {

    }

    @FXML
    void noteOnOff_7_12(ActionEvent event) {

    }

    @FXML
    void noteOnOff_8_12(ActionEvent event) {

    }

    @FXML
    void noteOnOff_9_12(ActionEvent event) {

    }

    @FXML
    void noteOnOff_10_12(ActionEvent event) {

    }

    @FXML
    void noteOnOff_11_12(ActionEvent event) {

    }

    @FXML
    void noteOnOff_0_13(ActionEvent event) {

    }

    @FXML
    void noteOnOff_1_13(ActionEvent event) {

    }

    @FXML
    void noteOnOff_2_13(ActionEvent event) {

    }

    @FXML
    void noteOnOff_3_13(ActionEvent event) {

    }

    @FXML
    void noteOnOff_4_13(ActionEvent event) {

    }

    @FXML
    void noteOnOff_5_13(ActionEvent event) {

    }

    @FXML
    void noteOnOff_6_13(ActionEvent event) {

    }

    @FXML
    void noteOnOff_7_13(ActionEvent event) {

    }

    @FXML
    void noteOnOff_8_13(ActionEvent event) {

    }

    @FXML
    void noteOnOff_9_13(ActionEvent event) {

    }

    @FXML
    void noteOnOff_10_13(ActionEvent event) {

    }

    @FXML
    void noteOnOff_11_13(ActionEvent event) {

    }

    @FXML
    void noteOnOff_0_14(ActionEvent event) {

    }

    @FXML
    void noteOnOff_1_14(ActionEvent event) {

    }

    @FXML
    void noteOnOff_2_14(ActionEvent event) {

    }

    @FXML
    void noteOnOff_3_14(ActionEvent event) {

    }

    @FXML
    void noteOnOff_4_14(ActionEvent event) {

    }

    @FXML
    void noteOnOff_5_14(ActionEvent event) {

    }

    @FXML
    void noteOnOff_6_14(ActionEvent event) {

    }

    @FXML
    void noteOnOff_7_14(ActionEvent event) {

    }

    @FXML
    void noteOnOff_8_14(ActionEvent event) {

    }

    @FXML
    void noteOnOff_9_14(ActionEvent event) {

    }

    @FXML
    void noteOnOff_10_14(ActionEvent event) {

    }

    @FXML
    void noteOnOff_11_14(ActionEvent event) {

    }

    @FXML
    void noteOnOff_0_15(ActionEvent event) {

    }

    @FXML
    void noteOnOff_1_15(ActionEvent event) {

    }

    @FXML
    void noteOnOff_2_15(ActionEvent event) {

    }

    @FXML
    void noteOnOff_3_15(ActionEvent event) {

    }

    @FXML
    void noteOnOff_4_15(ActionEvent event) {

    }

    @FXML
    void noteOnOff_5_15(ActionEvent event) {

    }

    @FXML
    void noteOnOff_6_15(ActionEvent event) {

    }

    @FXML
    void noteOnOff_7_15(ActionEvent event) {

    }

    @FXML
    void noteOnOff_8_15(ActionEvent event) {

    }

    @FXML
    void noteOnOff_9_15(ActionEvent event) {

    }

    @FXML
    void noteOnOff_10_15(ActionEvent event) {

    }

    @FXML
    void noteOnOff_11_15(ActionEvent event) {

    }

    @FXML
    void noteOnOff_0_16(ActionEvent event) {

    }

    @FXML
    void noteOnOff_1_16(ActionEvent event) {

    }

    @FXML
    void noteOnOff_2_16(ActionEvent event) {

    }

    @FXML
    void noteOnOff_3_16(ActionEvent event) {

    }

    @FXML
    void noteOnOff_4_16(ActionEvent event) {

    }

    @FXML
    void noteOnOff_5_16(ActionEvent event) {

    }

    @FXML
    void noteOnOff_6_16(ActionEvent event) {

    }

    @FXML
    void noteOnOff_7_16(ActionEvent event) {

    }

    @FXML
    void noteOnOff_8_16(ActionEvent event) {

    }

    @FXML
    void noteOnOff_9_16(ActionEvent event) {

    }

    @FXML
    void noteOnOff_10_16(ActionEvent event) {

    }

    @FXML
    void noteOnOff_11_16(ActionEvent event) {

    }

    @FXML
    void noteOnOff_0_1(ActionEvent event) {

    }

    @FXML
    void noteOnOff_1_1(ActionEvent event) {

    }

    @FXML
    void noteOnOff_2_1(ActionEvent event) {

    }

    @FXML
    void noteOnOff_3_1(ActionEvent event) {

    }

    @FXML
    void noteOnOff_4_1(ActionEvent event) {

    }

    @FXML
    void noteOnOff_5_1(ActionEvent event) {

    }

    @FXML
    void noteOnOff_6_1(ActionEvent event) {

    }

    @FXML
    void noteOnOff_7_1(ActionEvent event) {

    }

    @FXML
    void noteOnOff_8_1(ActionEvent event) {

    }

    @FXML
    void noteOnOff_9_1(ActionEvent event) {

    }

    @FXML
    void noteOnOff_10_1(ActionEvent event) {

    }

    @FXML
    void noteOnOff_11_1(ActionEvent event) {

    }

    @FXML
    void noteOnOff_0_2(ActionEvent event) {

    }

    @FXML
    void noteOnOff_1_2(ActionEvent event) {

    }

    @FXML
    void noteOnOff_2_2(ActionEvent event) {

    }

    @FXML
    void noteOnOff_3_2(ActionEvent event) {

    }

    @FXML
    void noteOnOff_4_2(ActionEvent event) {

    }

    @FXML
    void noteOnOff_5_2(ActionEvent event) {

    }

    @FXML
    void noteOnOff_6_2(ActionEvent event) {

    }

    @FXML
    void noteOnOff_7_2(ActionEvent event) {

    }

    @FXML
    void noteOnOff_8_2(ActionEvent event) {

    }

    @FXML
    void noteOnOff_9_2(ActionEvent event) {

    }

    @FXML
    void noteOnOff_10_2(ActionEvent event) {

    }

    @FXML
    void noteOnOff_11_2(ActionEvent event) {

    }
    @FXML
    private Pane rootPane; // Assuming the root element in beatsequencer.fxml is a Pane


    void play(ActionEvent event){
        if (playing == false) {
            startPlayback();
        } else endPlayback();
    }

    // Method to get the root pane
    public Pane getPane() {
        return rootPane;
    }
    public void close() {
        Platform.exit();
        System.exit(0);
    }


}
