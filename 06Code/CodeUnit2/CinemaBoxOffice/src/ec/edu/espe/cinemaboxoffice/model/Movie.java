/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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
    protected String sinopsis;

    public Movie(String title, String gender, int ageRestriction, String sinopsis) {
        this.title = title;
        this.gender = gender;
        this.ageRestriction = ageRestriction;
        this.sinopsis = sinopsis;
    }
    
    public static ArrayList<Movie> consultMovies(String fileName) throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileManager.createFile(fileName);
        String moviesJson = new String(Files.readAllBytes(Paths.get(fileName)));
        if (gson.fromJson(moviesJson, ArrayList.class) != null) {
            ArrayList<Movie> movies = gson.fromJson(moviesJson, ArrayList.class);
            return movies;
        }
        return null;
    }

    public abstract String getTitle();
    
    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", gender=" + gender + ", ageRestriction=" + ageRestriction + ", sinopsis=" + sinopsis + '}';
    }
}
