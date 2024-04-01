package com.example.drumset;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class DrumLogic {

    @FXML
    void baseSound(ActionEvent event) {
        playSound(36); 
    }

    @FXML
    void flrTomSound(ActionEvent event) {
        playSound(41);
    }

    @FXML
    void medTomSound(ActionEvent event) {
        playSound(48);
    }

    @FXML
    void rideSound(ActionEvent event) {
        playSound(51);
    }

    @FXML
    void snareSound(ActionEvent event) {
        playSound(38);
    }

    @FXML
    void hiTomSound(ActionEvent event) {
        playSound(50);
    }


    @FXML
    void hatSound(ActionEvent event) {
        playSound(46);
    }


    @FXML
    void crashSound(ActionEvent event) {
        playSound(49);
    }

    public void close() {
        Platform.exit();
        System.exit(0);
    }
}
