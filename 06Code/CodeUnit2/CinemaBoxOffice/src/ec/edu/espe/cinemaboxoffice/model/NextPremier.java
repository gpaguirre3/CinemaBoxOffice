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
public class NextPremier extends Movie {

    private Date dateNextPremier;

    public NextPremier(String title, String gender, String ageRestriction,
            int duration, String namePoster, Date dateNextPremier) {
        super(title, gender, ageRestriction, duration, namePoster);
        this.dateNextPremier = dateNextPremier;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Date getDateNextPremier() {
        return dateNextPremier;
    }

    @Override
    public String getSinopsis() {
        return null;
    }

    @Override
    public String getDate() {
        return null;
    }

    @Override
    public String getPrice() {
        return null;
    }

    @Override
    public Date getDateMovie() {
        return null;
    }

    @Override
    public CinemaRoom getRoom() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
