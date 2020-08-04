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
public class MovieBillboard extends Movie {

    private Date date;
    private float price;
    private CinemaRoom room;

    public MovieBillboard(String title, String gender, int ageRestriction, String sinopsis, Date date,
            float price) {
        super(title, gender, ageRestriction, sinopsis);
        this.date = date;
        this.price = price;
    }





    @Override
    public String toString() {
        return "MovieBillboard{" + super.toString() + "date=" + date + ", price=" + price + ", room=" + room + '}';
    }

    @Override
    public String getTitle() {
        return title;
    }
}
