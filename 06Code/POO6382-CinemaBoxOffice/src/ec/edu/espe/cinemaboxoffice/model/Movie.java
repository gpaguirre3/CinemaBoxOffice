/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import java.io.Serializable;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Movie implements Serializable{
    private String movieTitle;
    private String movieDuration;
    private String movieGender;
    private String moviePrice;
    
    Room rooms[];
    
    
    public Movie(String movieTitle, String movieDuration, String movieGender, String moviePrice) {
        this.movieTitle = movieTitle;
        this.movieDuration = movieDuration;
        this.movieGender = movieGender;
        this.moviePrice = moviePrice;
    }
    
    
    
    
    public void showDataMovie(){
        System.out.println("Movie name: "+movieTitle);
        System.out.println("Duration: "+movieDuration);
        System.out.println("Gender: "+movieGender);
        System.out.println("Price: "+moviePrice);
    }

    @Override
    public String toString() {
        return "Movie{" + "movieTitle=" + movieTitle + ", movieDuration=" + movieDuration + ", movieGender=" + movieGender + ", moviePrice=" + moviePrice + ", rooms=" + rooms + '}';
    }
    
    /**
     * @return the title
     */
    
    public String getTitle() {
        return movieTitle;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.movieTitle = title;
    }

    /**
     * @return the duration
     */
    public String getDuration() {
        return movieDuration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.movieDuration = duration;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return movieGender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.movieGender = gender;
    }

    /**
     * @return the priceMovie
     */
    public String getPriceMovie() {
        return moviePrice;
    }

    /**
     * @param priceMovie the priceMovie to set
     */
    public void setPriceMovie(String priceMovie) {
        this.moviePrice = moviePrice;
    }
    
}
