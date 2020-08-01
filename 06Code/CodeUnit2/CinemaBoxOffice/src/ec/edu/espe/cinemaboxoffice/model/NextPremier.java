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
public class NextPremier extends Movie{

    private Date premierDate;

    public NextPremier(String title, String gender, int ageRestriction,
            String sinopsis, Date premierDate) {
        super(title, gender, ageRestriction, sinopsis);
        this.premierDate = premierDate;
    }
    
    @Override
    public String getTitle() {
        return title;
    }
}
