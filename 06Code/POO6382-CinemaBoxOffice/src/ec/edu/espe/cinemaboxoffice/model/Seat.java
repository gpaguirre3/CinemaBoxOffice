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
public class Seat implements Serializable{
      private String seatMovie;
    private String numberSeat;
    private boolean freeOrOccupied;
    private float priceSeat;
    private float priceSeatVPI;

    public Seat(String seatMovie, String numberSeat, boolean freeOrOccupied) {
        this.seatMovie = seatMovie;
        this.numberSeat = numberSeat;
        this.freeOrOccupied = freeOrOccupied;
    }

    @Override
    public String toString() {
        return "Seat{" + "seatMovie=" + seatMovie + ", numberSeat=" + numberSeat
                + ", freeOrOccupied=" + freeOrOccupied + ", priceSeat=" + 
                priceSeat + ", priceSeatVPI=" + priceSeatVPI + '}';
    }
    
    /**
     * @return the seatMovie
     */
    public String getSeatMovie() {
        return seatMovie;
    }

    /**
     * @param seatMovie the seatMovie to set
     */
    public void setSeatMovie(String seatMovie) {
        this.seatMovie = seatMovie;
    }

    /**
     * @return the numberSeat
     */
    public String getNumberSeat() {
        return numberSeat;
    }

    /**
     * @param numberSeat the numberSeat to set
     */
    public void setNumberSeat(String numberSeat) {
        this.numberSeat = numberSeat;
    }

    /**
     * @return the freeOrOccupied
     */
    public boolean isFreeOrOccupied() {
        return freeOrOccupied;
    }

    /**
     * @param freeOrOccupied the freeOrOccupied to set
     */
    public void setFreeOrOccupied(boolean freeOrOccupied) {
        this.freeOrOccupied = freeOrOccupied;
    }

    /**
     * @return the priceSeat
     */
    public float getPriceSeat() {
        return priceSeat;
    }

    /**
     * @param priceSeat the priceSeat to set
     */
    public void setPriceSeat(float priceSeat) {
        this.priceSeat = priceSeat;
    }

    /**
     * @return the priceSeatVPI
     */
    public float getPriceSeatVPI() {
        return priceSeatVPI;
    }

    /**
     * @param priceSeatVPI the priceSeatVPI to set
     */
    public void setPriceSeatVPI(float priceSeatVPI) {
        this.priceSeatVPI = priceSeatVPI;
    }

    
    
    
}
