package com.example.moviedle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;



public class MovidleApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        URL fxmlLocation = getClass().getResource("/movidle-project.fxml");
        FXMLLoader loader = new FXMLLoader(fxmlLocation);
        Scene scene = new Scene(loader.load(), 615, 400);
        stage.setTitle("Moviedle Game Project");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) throws IOException {


        launch();
    }
}