package com.example.moviedle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;


public class MovidleController implements Initializable {
    @FXML
    protected AnchorPane anchorPane;

    @FXML
    protected TextField guessText;

    @FXML
    protected Button btnGuess;

    @FXML
    protected Pane gridPane;

    @FXML
    protected Label lbl00, lbl01, lbl02, lbl03, lbl04, lbl05, lbl10, lbl11, lbl12, lbl13, lbl14, lbl15, lbl20, lbl21, lbl22;

    @FXML
    protected Label lbl23, lbl24, lbl25, lbl30, lbl31, lbl32, lbl33, lbl34, lbl35, lbl40, lbl41, lbl42, lbl43, lbl44, lbl45;

    private Movie correctMovie;

    private List<Movie> movieList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            movieList = FileController.readMovies();
            correctMovie = getRandomMovie(movieList);
            System.out.println(correctMovie);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void winAlert() {
        Alert win = new Alert(Alert.AlertType.INFORMATION);

        ButtonType restart = new ButtonType("Restart");
        ButtonType exit = new ButtonType("Exit");

        win.getButtonTypes().clear();
        win.getButtonTypes().addAll(restart, exit);

        win.setTitle("CONGRATULATIONS :)");
        win.setHeaderText("Congratulations, You Win!");

        win.showAndWait();
    }

    public void loseAlert() {
        Alert lose = new Alert(Alert.AlertType.INFORMATION);

        ButtonType retry = new ButtonType("Retry");
        ButtonType exit = new ButtonType("Exit");

        lose.getButtonTypes().clear();
        lose.getButtonTypes().addAll(retry, exit);

        lose.setTitle("YOU LOSE :(");
        lose.setHeaderText("Sorry, You Lose!");
        lose.showAndWait();
    }

    public void checkAndStyleLabel(Label label, String expectedValue) {
        if (label.getText().equalsIgnoreCase(expectedValue)) {
            label.setStyle("-fx-background-color: green");
        } else {
            label.setStyle("-fx-background-color: red");
        }
    }

    public Movie getRandomMovie(List<Movie> movieList) {
        Random random = new Random();
        int min = 1;
        int max = movieList.size();
        int randomIndex = random.nextInt(max - min + 1) + 1;
        return movieList.get(randomIndex);
    }


    int count = 0;

    @FXML
    protected void onGuessClicked() {
        System.out.println(correctMovie);
        if (count == 0) {
            count++;

            if (guessText.getText().equalsIgnoreCase(correctMovie.getName())) {
                lbl00.setText(correctMovie.getName());
                lbl01.setText(correctMovie.getYear());
                lbl02.setText(correctMovie.getGenre());
                lbl03.setText(correctMovie.getOrigin());
                lbl04.setText(correctMovie.getDirector());
                lbl05.setText(correctMovie.getBestRole());

                lbl00.setStyle("-fx-background-color: green");
                lbl01.setStyle("-fx-background-color: green");
                lbl02.setStyle("-fx-background-color: green");
                lbl03.setStyle("-fx-background-color: green");
                lbl04.setStyle("-fx-background-color: green");
                lbl05.setStyle("-fx-background-color: green");
                count = 0;
                winAlert();
            } else {
                for (Movie movie : movieList) {
                    if (movie.getName().equalsIgnoreCase(guessText.getText())) {
                        lbl00.setText(movie.getName());
                        lbl01.setText(movie.getYear());
                        lbl02.setText(movie.getGenre());
                        lbl03.setText(movie.getOrigin());
                        lbl04.setText(movie.getDirector());
                        lbl05.setText(movie.getBestRole());
                    }
                }
                checkAndStyleLabel(lbl00, correctMovie.getName());
                checkAndStyleLabel(lbl01, correctMovie.getYear());
                checkAndStyleLabel(lbl02, correctMovie.getGenre());
                checkAndStyleLabel(lbl03, correctMovie.getOrigin());
                checkAndStyleLabel(lbl04, correctMovie.getDirector());
                checkAndStyleLabel(lbl05, correctMovie.getBestRole());
            }
        } else if (count == 1) {

            count++;

            if (guessText.getText().equalsIgnoreCase(correctMovie.getName())) {
                lbl10.setText(correctMovie.getName());
                lbl11.setText(correctMovie.getYear());
                lbl12.setText(correctMovie.getGenre());
                lbl13.setText(correctMovie.getOrigin());
                lbl14.setText(correctMovie.getDirector());
                lbl15.setText(correctMovie.getBestRole());

                lbl10.setStyle("-fx-background-color: green");
                lbl11.setStyle("-fx-background-color: green");
                lbl12.setStyle("-fx-background-color: green");
                lbl13.setStyle("-fx-background-color: green");
                lbl14.setStyle("-fx-background-color: green");
                lbl15.setStyle("-fx-background-color: green");

                count = 0;
                winAlert();
            } else {
                for (Movie movie : movieList) {
                    if (movie.getName().equalsIgnoreCase(guessText.getText())) {
                        lbl10.setText(movie.getName());
                        lbl11.setText(movie.getYear());
                        lbl12.setText(movie.getGenre());
                        lbl13.setText(movie.getOrigin());
                        lbl14.setText(movie.getDirector());
                        lbl15.setText(movie.getBestRole());
                    }
                }
                checkAndStyleLabel(lbl10, correctMovie.getName());
                checkAndStyleLabel(lbl11, correctMovie.getYear());
                checkAndStyleLabel(lbl12, correctMovie.getGenre());
                checkAndStyleLabel(lbl13, correctMovie.getOrigin());
                checkAndStyleLabel(lbl14, correctMovie.getDirector());
                checkAndStyleLabel(lbl15, correctMovie.getBestRole());

            }
        } else if (count == 2) {
            count++;

            if (guessText.getText().equalsIgnoreCase(correctMovie.getName())) {
                lbl20.setText(correctMovie.getName());
                lbl21.setText(correctMovie.getYear());
                lbl22.setText(correctMovie.getGenre());
                lbl23.setText(correctMovie.getOrigin());
                lbl24.setText(correctMovie.getDirector());
                lbl25.setText(correctMovie.getBestRole());


                lbl20.setStyle("-fx-background-color: green");
                lbl21.setStyle("-fx-background-color: green");
                lbl22.setStyle("-fx-background-color: green");
                lbl23.setStyle("-fx-background-color: green");
                lbl24.setStyle("-fx-background-color: green");
                lbl25.setStyle("-fx-background-color: green");
                count = 0;
                winAlert();
            } else {
                for (Movie movie : movieList) {
                    if (movie.getName().equalsIgnoreCase(guessText.getText())) {

                        lbl20.setText(movie.getName());
                        lbl21.setText(movie.getYear());
                        lbl22.setText(movie.getGenre());
                        lbl23.setText(movie.getOrigin());
                        lbl24.setText(movie.getDirector());
                        lbl25.setText(movie.getBestRole());
                    }
                }
                checkAndStyleLabel(lbl20, correctMovie.getName());
                checkAndStyleLabel(lbl21, correctMovie.getYear());
                checkAndStyleLabel(lbl22, correctMovie.getGenre());
                checkAndStyleLabel(lbl23, correctMovie.getOrigin());
                checkAndStyleLabel(lbl24, correctMovie.getDirector());
                checkAndStyleLabel(lbl25, correctMovie.getBestRole());
            }


        } else if (count == 3) {
            count++;

            if (guessText.getText().equalsIgnoreCase(correctMovie.getName())) {
                lbl30.setText(correctMovie.getName());
                lbl31.setText(correctMovie.getYear());
                lbl32.setText(correctMovie.getGenre());
                lbl33.setText(correctMovie.getOrigin());
                lbl34.setText(correctMovie.getDirector());
                lbl35.setText(correctMovie.getBestRole());


                lbl30.setStyle("-fx-background-color: green");
                lbl31.setStyle("-fx-background-color: green");
                lbl32.setStyle("-fx-background-color: green");
                lbl33.setStyle("-fx-background-color: green");
                lbl34.setStyle("-fx-background-color: green");
                lbl35.setStyle("-fx-background-color: green");
                count = 0;
                winAlert();
            } else {
                for (Movie movie : movieList) {
                    if (movie.getName().equalsIgnoreCase(guessText.getText())) {

                        lbl30.setText(movie.getName());
                        lbl31.setText(movie.getYear());
                        lbl32.setText(movie.getGenre());
                        lbl33.setText(movie.getOrigin());
                        lbl34.setText(movie.getDirector());
                        lbl35.setText(movie.getBestRole());
                    }
                }
                checkAndStyleLabel(lbl30, correctMovie.getName());
                checkAndStyleLabel(lbl31, correctMovie.getYear());
                checkAndStyleLabel(lbl32, correctMovie.getGenre());
                checkAndStyleLabel(lbl33, correctMovie.getOrigin());
                checkAndStyleLabel(lbl34, correctMovie.getDirector());
                checkAndStyleLabel(lbl35, correctMovie.getBestRole());
            }

        } else {
            count++;

            if (guessText.getText().equalsIgnoreCase(correctMovie.getName())) {
                lbl40.setText(correctMovie.getName());
                lbl41.setText(correctMovie.getYear());
                lbl42.setText(correctMovie.getGenre());
                lbl43.setText(correctMovie.getOrigin());
                lbl44.setText(correctMovie.getDirector());
                lbl45.setText(correctMovie.getBestRole());

                lbl40.setStyle("-fx-background-color: green");
                lbl41.setStyle("-fx-background-color: green");
                lbl42.setStyle("-fx-background-color: green");
                lbl43.setStyle("-fx-background-color: green");
                lbl44.setStyle("-fx-background-color: green");
                lbl45.setStyle("-fx-background-color: green");
                count = 0;
                winAlert();

            } else {
                for (Movie movie : movieList) {
                    if (movie.getName().equalsIgnoreCase(guessText.getText())) {

                        lbl40.setText(movie.getName());
                        lbl41.setText(movie.getYear());
                        lbl42.setText(movie.getGenre());
                        lbl43.setText(movie.getOrigin());
                        lbl44.setText(movie.getDirector());
                        lbl45.setText(movie.getBestRole());
                    }
                }
                checkAndStyleLabel(lbl40, correctMovie.getName());
                checkAndStyleLabel(lbl41, correctMovie.getYear());
                checkAndStyleLabel(lbl42, correctMovie.getGenre());
                checkAndStyleLabel(lbl43, correctMovie.getOrigin());
                checkAndStyleLabel(lbl44, correctMovie.getDirector());
                checkAndStyleLabel(lbl45, correctMovie.getBestRole());
                count = 0;
                loseAlert();
            }
        }

    }


}


