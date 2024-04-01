package com.example.drumset;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class Drum_GUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("beatsequencer.fxml"));
        Scene scene = new Scene(loader.load());

        stage.setScene(scene);
        stage.setTitle("Drum Set");
        stage.setResizable(false);

        DrumMachineLogic dm = loader.getController();

        stage.setOnCloseRequest(event -> {
            dm.close();
            event.consume();
        });

        // Adding a button to change the scene
        Button changeSceneButton = new Button("Change Scene");
        changeSceneButton.setOnAction(e -> {
            try {
                FXMLLoader newLoader = new FXMLLoader(getClass().getResource("drums.fxml"));
                Scene newScene = new Scene(newLoader.load());
                stage.setScene(newScene);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        // Adding the button to the existing scene
        dm.getPane().getChildren().add(changeSceneButton);

        stage.show();
    }

}
