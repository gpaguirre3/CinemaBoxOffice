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

    private String movieTitle;
    private String movieGender;
    private int roomNumberForMovie;
    private String roomFormatForMovie;
    private float moviePrice;

    public Movie(String movieTitle, String movieGender, int roomNumberForMovie, String roomFormatForMovie, float moviePrice) {
        this.movieTitle = movieTitle;
        this.movieGender = movieGender;
        this.roomNumberForMovie = roomNumberForMovie;
        this.roomFormatForMovie = roomFormatForMovie;
        this.moviePrice = moviePrice;
    }

    @Override
    public String toString() {
        return movieTitle + "," + movieGender + "," + roomNumberForMovie + "," + roomFormatForMovie + "," + moviePrice;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieGender() {
        return movieGender;
    }

    public void setMovieGender(String movieGender) {
        this.movieGender = movieGender;
    }

    public int getRoomNumberForMovie() {
        return roomNumberForMovie;
    }

    public void setRoomNumberForMovie(int roomNumberForMovie) {
        this.roomNumberForMovie = roomNumberForMovie;
    }

    public String getRoomFormatForMovie() {
        return roomFormatForMovie;
    }

    public void setRoomFormatForMovie(String roomFormatForMovie) {
        this.roomFormatForMovie = roomFormatForMovie;
    }

    public float getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(float moviePrice) {
        this.moviePrice = moviePrice;
    }

    
}
