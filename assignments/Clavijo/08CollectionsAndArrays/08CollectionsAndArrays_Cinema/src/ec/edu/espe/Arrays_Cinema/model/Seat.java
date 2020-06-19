/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Arrays_Cinema.model;

/**
 *
 * @author nicol
 */
public class Seat {

    private String seatType;
    private String priceSeat;

    public Seat(String seatType, String priceSeat) {
        this.seatType = seatType;
        this.priceSeat = priceSeat;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getPriceSeat() {
        return priceSeat;
    }

    public void setPriceSeat(String priceSeat) {
        this.priceSeat = priceSeat;
    }

    @Override
    public String toString() {
        return "Seat{" + "seatType=" + seatType + ", priceSeat=" + priceSeat + '}';
    }
   
    
    
    
}
