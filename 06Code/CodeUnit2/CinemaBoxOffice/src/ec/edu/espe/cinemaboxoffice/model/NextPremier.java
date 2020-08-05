/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class NextPremier extends Movie{

    private String month;

    public NextPremier(String title, String gender, int ageRestriction,
            int duration, String namePoster, String month) {
        super(title, gender, ageRestriction, duration, namePoster);
        this.month = month;
    }
    
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getMonth() {
        return month;
    }
}
