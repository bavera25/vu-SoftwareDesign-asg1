package com.example.drumset;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class DrumLogic {
    
    @FXML
    void baseSound(ActionEvent event) {
        // ADD MIDI SOUND
    }

    @FXML
    void flrTomSound(ActionEvent event) {
        // ADD MIDI SOUND to click
    }

    @FXML
    void medTomSound(ActionEvent event) {
        // ADD MIDI SOUND to click
    }

    @FXML
    void rideSound(ActionEvent event) {
        // ADD MIDI SOUND to click
    }

    @FXML
    void snareSound(ActionEvent event) {
        // ADD MIDI SOUND to click
    }

    @FXML
    void hiTomSound(ActionEvent event) {
        // ADD MIDI SOUND to click
    }


    @FXML
    void hatSound(ActionEvent event) {
        // ADD MIDI SOUND to click
    }


    @FXML
    void crashSound(ActionEvent event) {
        // ADD MIDI SOUND to click
    }

    public void close() {
        Platform.exit();
        System.exit(0);
    }
}
