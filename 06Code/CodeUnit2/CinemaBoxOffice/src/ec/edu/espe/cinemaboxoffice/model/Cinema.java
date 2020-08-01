/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Cinema {

    private Date openingDate;
    private Date closingDate;
    private ArrayList<Movie> movies;

    public Cinema(Date openingDate, Date closingDate, ArrayList<Movie> movies) {
        this.openingDate = openingDate;
        this.closingDate = closingDate;
        this.movies = movies;
    }

    public boolean showListBillboard(String fileName) throws IOException {
        ArrayList<Movie> movies;
        movies = Movie.consultMovies(fileName);
        for (int i=0; i<movies.size(); i++){
            System.out.println(movies.get(i));
        }
        return true;
    }

    public boolean showListMoviePremiere() {
        return true;
    }

    public boolean showLisNextPremieres() {
        return true;
    }

    public boolean showPromotions() {
        return true;
    }
}
