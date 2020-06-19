/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Arrays_Cinema.model;

import java.util.ArrayList;

/**
 *
 * @author nicol
 */
public class PremierMovie {

    private String movieName;
    private String dateMovie;

    public PremierMovie(String movieName, String dateMovie) {
        this.movieName = movieName;
        this.dateMovie = dateMovie;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDateMovie() {
        return dateMovie;
    }

    public void setDateMovie(String dateMovie) {
        this.dateMovie = dateMovie;
    }

    @Override
    public String toString() {
        return "PremierMovie{" + "movieName=" + movieName + ", dateMovie=" + dateMovie + '}';
    }
}
        
    
    
    
    