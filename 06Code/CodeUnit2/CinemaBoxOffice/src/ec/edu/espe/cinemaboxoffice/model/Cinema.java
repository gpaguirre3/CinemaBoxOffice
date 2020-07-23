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
public class Cinema {

    private Date openingDate;
    private Date closingDate;

    public Cinema(Date openingDate, Date closingDate) {
        this.openingDate = openingDate;
        this.closingDate = closingDate;
    }

    public boolean showListBillboard(ArrayList<Movie> movies){
        return true;
    }
    
    public boolean showListMoviePremiere(ArrayList<Movie> premieres){
        return true;
    }
    
    public boolean showLisNextPremiere(ArrayList<Movie> nextPremiers){
        return true;
    }
    
    public boolean showPromotions(ArrayList<Promotion> promotions){
        return true;
    }
}
