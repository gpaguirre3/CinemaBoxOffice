package ec.edu.espe.cinemaboxoffice.service;

import com.google.gson.Gson;
import ec.edu.espe.cinemaboxoffice.model.Movie;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Gabriel Aguirre
 */
public class MovieService {
    public static List<Movie> getAllMovies() {
        Gson gson = new Gson();
        List<Movie> movies = new ArrayList<>();
        String jsonText;
        
        try {
            jsonText = new String(Files.readAllBytes(Paths.get("data/movies.json")));
        } catch (Exception e) {
            jsonText = null;
        }
        
        if (jsonText == null) {
            return movies;
        }
        
        movies.addAll(Arrays.asList(gson.fromJson(jsonText, Movie[].class)));
        
        return movies;
    }
}
