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
public class MovieBillboard extends Movie{

    private Date date;
    private float price;
    private CinemaRoom room;

    public MovieBillboard(String title, String gender, int ageRestriction, 
            String sinopsis, Date date, float price, CinemaRoom room) {
        super(title, gender, ageRestriction, sinopsis);
        this.date = date;
        this.price = price;
        this.room = room;
    }

    @Override
    public ArrayList<Movie> consultMovies(String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
