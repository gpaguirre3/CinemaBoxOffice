/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import ec.edu.espe.cinemaboxoffice.model.Movie;
import java.util.ArrayList;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class MovieDaily {
    public static ArrayList<Movie> getMoviesDaily(ArrayList<Movie> movies, int day) {
        ArrayList<Movie> moviesDaily = new ArrayList<>();
        if (movies != null) {   
            for (int i = 0; i < movies.size(); i++) {
                if (day == movies.get(i).getDateMovie().getDay()) {
                    moviesDaily.add(movies.get(i));
                }
            }
        }
        return moviesDaily;
    }
}
