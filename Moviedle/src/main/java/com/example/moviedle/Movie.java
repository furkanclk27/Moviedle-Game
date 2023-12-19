package com.example.moviedle;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.random.RandomGenerator;




public class Movie {

    private String id;
    private String name;
    private String year;
    private String genre;
    private String origin;
    private String director;
    private String bestRole;

    public Movie(String id, String name, String year, String genre, String origin, String director, String bestRole) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.origin = origin;
        this.director = director;
        this.bestRole = bestRole;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDirector() {
        return director;
    }

    public String getBestRole() {
        return bestRole;
    }

    @Override
    public String toString() {
        return "Movie = " + " Name : " + name + " Year : " + year + " Genre : " + genre +
                " Origin : " + origin + " Director : " + director + " BestRole : " + bestRole;
    }
}
