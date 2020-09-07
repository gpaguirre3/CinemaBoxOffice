/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.cinemaboxoffice.model.Movie;
import ec.edu.espe.cinemaboxoffice.model.MovieBillboard;
import ec.edu.espe.cinemaboxoffice.model.NextPremier;
import ec.edu.espe.cinemaboxoffice.utils.InputDataValidation;
import ec.edu.espe.filemanagerlibrary.FileManager;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class MovieRecord {

    InputDataValidation in = new InputDataValidation();

    public static void saveRecord(String fileName, Gson gson, ArrayList<Movie> movies) {
        FileManager.deleteFile(fileName);
        FileManager.writeFile(fileName, gson.toJson(movies));
    }

    public boolean recordMovie(String fileName, Movie movie) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ArrayList<Movie> movies = new ArrayList<>();
        FileManager.createFile(fileName);
        String moviesJson = new String(Files.readAllBytes(Paths.get(fileName)));
        if (gson.fromJson(moviesJson, ArrayList.class) != null) {
            movies = gson.fromJson(moviesJson, ArrayList.class);
        }
        movies.add(movie);
        saveRecord(fileName, gson, movies);
        return true;
    }

    public String defineRoom(int numberRoom) {
        if (numberRoom > 0 & numberRoom < 7) {
            if (numberRoom > 0 & numberRoom < 4) {
                return "2D";
            } else {
                return "3D";
            }
        }
        return "-";
    }

    public boolean deleteMovie(String fileName, String titleMovie) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileManager.createFile(fileName);
        String moviesJson = new String(Files.readAllBytes(Paths.get(fileName)));
        if (gson.fromJson(moviesJson, ArrayList.class) != null) {
            java.lang.reflect.Type typeMovies;
            if ("Billboard.json".equals(fileName)) {
                typeMovies = new TypeToken<ArrayList<MovieBillboard>>() {
                }.getType();
            } else {
                typeMovies = new TypeToken<ArrayList<NextPremier>>() {
                }.getType();
            }
            ArrayList<Movie> movies = gson.fromJson(moviesJson, typeMovies);
            saveRecord(fileName, gson, delete(titleMovie, movies));
        }
        return true;
    }

    public ArrayList<Movie> delete(String titleMovie, ArrayList<Movie> movies) {
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getTitle().equals(titleMovie)) {
                movies.remove(i);
            }
        }
        return movies;
    }
}
