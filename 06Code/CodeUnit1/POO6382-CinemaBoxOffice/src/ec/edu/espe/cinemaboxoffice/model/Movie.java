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
    private int roomNumber;
    private String movieFormat;
    private float moviePrice;

    public Movie(String movieTitle, String movieGender, int roomNumberForMovie, String roomFormatForMovie, float moviePrice) {
        this.movieTitle = movieTitle;
        this.movieGender = movieGender;
        this.roomNumber = roomNumberForMovie;
        this.movieFormat = roomFormatForMovie;
        this.moviePrice = moviePrice;
    }

    @Override
    public String toString() {
        return movieTitle + "," + movieGender + "," + roomNumber + "," + movieFormat + "," + moviePrice;
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

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getMovieFormat() {
        return movieFormat;
    }

    public void setMovieFormat(String movieFormat) {
        this.movieFormat = movieFormat;
    }

    public float getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(float moviePrice) {
        this.moviePrice = moviePrice;
    }

    
}
