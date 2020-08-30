/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.cinemaboxoffice.model.Movie;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class SeatControl {
    
      public void controlSeats(Movie movie, int x, int y, boolean seatAvailability) throws IOException {
        Gson gson = new GsonBuilder().setDateFormat("MMM d, yyyy HH:mm:ss a").setPrettyPrinting().create();
        ArrayList<Movie> movies = Movie.consultMovies("Billboard.json");
        for (int z = 0; z < movies.size(); z++) {
            if (movie.getTitle().equals(movies.get(z).getTitle())) {
                int cont = 0;
                for (int i = 0; i < 15; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (i == x & j == y) {
                            movies.get(z).getRoom().getSeats()[cont].setSeatAvailability(seatAvailability);
                        }
                        cont++;
                    }
                }
                MovieRecord.saveRecord("Billboard.json", gson, movies);
            }
        }
    }
}
