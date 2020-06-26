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
public class Seat{

    private String movieSeat;
    private int seatNumber;
    private boolean availability;

    public Seat(String seatMovie, int numberSeat, boolean freeOrOccupied) {
        this.movieSeat = seatMovie;
        this.seatNumber = numberSeat;
        this.availability = freeOrOccupied;
    }

    @Override
    public String toString() {
        return movieSeat + "," + seatNumber + "," + availability;
    }   
}
