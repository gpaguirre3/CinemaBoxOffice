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

    private String seatMovie;
    private int numberSeat;
    private boolean freeOrOccupied;

    public Seat(String seatMovie, int numberSeat, boolean freeOrOccupied) {
        this.seatMovie = seatMovie;
        this.numberSeat = numberSeat;
        this.freeOrOccupied = freeOrOccupied;
    }

    @Override
    public String toString() {
        return seatMovie + "," + numberSeat + "," + freeOrOccupied;
    }   
}
