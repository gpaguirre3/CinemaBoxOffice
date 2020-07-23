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
public class CinemaRoom {
    
    private int roomNumber;
    private String roomFormat;
    private Seat[] seats = new Seat[149];

    public CinemaRoom(int roomNumber, String roomFormat, Seat[] seats) {
        this.roomNumber = roomNumber;
        this.roomFormat = roomFormat;
        this.seats = seats;
    }
}
