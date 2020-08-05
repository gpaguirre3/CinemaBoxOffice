/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.filemanagerlibrary.FileManager;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public abstract class Movie {

    protected String title;
    protected String gender;
    protected int ageRestriction;
    protected int duration;
    protected String namePoster;

    public Movie(String title, String gender, int ageRestriction, int 
            duration, String namePoster) {
        this.title = title;
        this.gender = gender;
        this.ageRestriction = ageRestriction;
        this.duration = duration;
        this.namePoster = namePoster;
    }

    public static ArrayList<Movie> consultMovies(String fileName) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ArrayList<Movie> movies;
        FileManager.createFile(fileName);
        String moviesJson = new String(Files.readAllBytes(Paths.get(fileName)));
        if (gson.fromJson(moviesJson, ArrayList.class) != null) {
            java.lang.reflect.Type typeMovies = new TypeToken<ArrayList<MovieBillboard>>() {
            }.getType();
            movies = gson.fromJson(moviesJson, typeMovies);
            return movies;
        }
        return null;
    }
    
    public static ArrayList<Movie> consultNextPremier(String fileName) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ArrayList<Movie> movies;
        FileManager.createFile(fileName);
        String moviesJson = new String(Files.readAllBytes(Paths.get(fileName)));
        if (gson.fromJson(moviesJson, ArrayList.class) != null) {
            java.lang.reflect.Type typeMovies = new TypeToken<ArrayList<NextPremier>>() {
            }.getType();
            movies = gson.fromJson(moviesJson, typeMovies);
            return movies;
        }
        return null;
    }

    public abstract String getTitle();
    
    public abstract String getMonth();

    public String getGender() {
        return gender;
    }

    public String getAgeRestriction() {
        return ageRestriction+"";
    }

    public String getDuration() {
        return duration+"";
    }

    public String getNamePoster() {
        return namePoster;
    }
}
