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
public class Seat {
    private int seatNumber;
    private boolean seatAvailability;
    
    public Seat(int seatNumber, boolean SeatAvailableOrBusy) {
        this.seatNumber = seatNumber;
        this.seatAvailability = SeatAvailableOrBusy;
    }

    public boolean isSeatAvailableOrBusy() {
        return seatAvailability;
    }

    public void setSeatAvailability(boolean seatAvailability) {
        this.seatAvailability = seatAvailability;
    }

    public int getSeatNumber() {
        return seatNumber;
    }    
}
