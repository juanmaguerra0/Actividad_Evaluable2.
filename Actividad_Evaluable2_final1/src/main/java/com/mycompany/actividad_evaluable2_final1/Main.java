package com.mycompany.actividad_evaluable2_final1;

import java.io.FileInputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.layout.AnchorPane;

/**
 * JavaFX App
 */
public class Main extends Application {

 
    
    public static void main(String[] args) 
    {
        Application.launch(args);
    }
     
    @Override
    public void start(Stage stage) throws IOException 
    {
        // Create the FXMLLoader 
        FXMLLoader loader = new FXMLLoader();
        // Path to the FXML File
        String fxmlDocPath = "fxml/sample.fxml";
        FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);
 
        // Create the Pane and all Details
        AnchorPane root = (AnchorPane) loader.load(fxmlStream);
 
        // Create the Scene
        Scene scene = new Scene(root);
        // Set the Scene to the Stage
        stage.setScene(scene);
        // Set the Title to the Stage
        stage.setTitle("Actividad_Evaluable_2");
        // Display the Stage
        stage.show();
    }
 
    
}