/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import java.util.Date;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class MovieBillboard extends Movie {

    private Date date;
    private float price;
    private CinemaRoom room;

    public MovieBillboard(String title, String gender, String ageRestriction, int 
            duration, String namePoster, Date date, float price, CinemaRoom room) {
        super(title, gender, ageRestriction, duration, namePoster);
        this.date = date;
        this.price = price;
        this.room = room;
    }

    @Override
    public String toString() {
        return "MovieBillboard{" + super.toString() + "date=" + date + ", price=" + price + ", room=" + room + '}';
    }

    @Override
    public String getTitle() {
        return title;
    }    

    @Override
    public String getMonth() {
        return "";
    }
}
