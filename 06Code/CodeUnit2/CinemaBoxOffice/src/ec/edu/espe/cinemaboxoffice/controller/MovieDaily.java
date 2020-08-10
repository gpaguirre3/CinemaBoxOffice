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

    public static ArrayList<Movie> getMoviesToday(ArrayList<Movie> movies, int day) {
        ArrayList<Movie> moviesDaily = new ArrayList<>();
        if (!movies.isEmpty()) {
            for (int i = 0; i < movies.size(); i++) {
                if (day == movies.get(i).getDateMovie().getDay()) {
                    moviesDaily.add(movies.get(i));
                }
            }
        }
        return moviesDaily;
    }

    public static ArrayList<Movie> getMovies(ArrayList<Movie> movies, int day) {
        ArrayList<Movie> moviesDaily = new ArrayList<>();
        if (!movies.isEmpty()) {
            for (int i = 0; i < movies.size(); i++) {
                if (day == movies.get(i).getDateMovie().getDay()) {
                    moviesDaily.add(movies.get(i));
                }
                if (day + 1 == movies.get(i).getDateMovie().getDay()) {
                    moviesDaily.add(movies.get(i));
                }
                if (day + 2 == movies.get(i).getDateMovie().getDay()) {
                    moviesDaily.add(movies.get(i));
                }
            }
        }
        return moviesDaily;
    }

    public static ArrayList<Movie> getMoviesForMonths(ArrayList<Movie> movies, int month) {
        ArrayList<Movie> moviesOfTheMonth = new ArrayList<>();
        if (!movies.isEmpty()) {
            for (int i = 0; i < movies.size(); i++) {
                if (month <= movies.get(i).getDateNextPremier().getMonth()) {
                    moviesOfTheMonth.add(movies.get(i));
                }
            }
        }
        return moviesOfTheMonth;
    }
}
