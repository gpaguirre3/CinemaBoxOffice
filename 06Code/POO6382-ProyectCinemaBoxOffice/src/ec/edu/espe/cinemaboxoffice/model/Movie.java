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
public class Movie {
    private String title;
    private String duration;
    private String gender;
    private float priceMovie;

    public Movie(String title, String duration, String gender, float priceMovie) {
        this.title = title;
        this.duration = duration;
        this.gender = gender;
        this.priceMovie = priceMovie;
    }
    
    public void showDataMovie(){
        
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the priceMovie
     */
    public float getPriceMovie() {
        return priceMovie;
    }

    /**
     * @param priceMovie the priceMovie to set
     */
    public void setPriceMovie(float priceMovie) {
        this.priceMovie = priceMovie;
    }
}
