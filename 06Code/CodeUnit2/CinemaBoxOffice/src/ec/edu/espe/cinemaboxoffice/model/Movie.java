/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

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
    
    public abstract ArrayList<Movie> consultMovies(String fileName);

    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", gender=" + gender + ", ageRestriction=" + ageRestriction + ", sinopsis=" + sinopsis + '}';
    }
}
