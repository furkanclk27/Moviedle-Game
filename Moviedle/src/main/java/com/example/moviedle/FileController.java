package com.example.moviedle;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileController {
    public static List<Movie> readMovies() throws IOException {
        List<Movie> movieList = new ArrayList<>();
        String filePath = "resource/imdb_top_250.csv";
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "ISO-8859-1"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(";");
            line.trim();
            movieList.add(new Movie(values[0], values[1], values[2], values[3], values[4], values[5], values[6]));
        }
        return movieList;
    }
}
