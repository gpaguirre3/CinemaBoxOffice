/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class MoviePremier extends Movie{

    private ArrayList<Date> dates;
    private float pricePremier;
    private CinemaRoom room;

    public MoviePremier(String title, String gender, int ageRestriction, String 
            sinopsis, ArrayList<Date> dates, float pricePremier, CinemaRoom room) {
        super(title, gender, ageRestriction, sinopsis);
        this.dates = dates;
        this.pricePremier = pricePremier;
        this.room = room;
    }

    @Override
    public ArrayList<Movie> consultMovies(String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
