/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import ec.edu.espe.cinemaboxoffice.utils.DataValidation;
import ec.edu.espe.filemanagerlibrary.FileManagerLib;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class Seat {

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

    public int chooseSeat(String selection) {
        DataValidation in = new DataValidation();
        boolean repeat;
        int chosenSeat;
        int aux = 0;
        do {
            chosenSeat = in.getInt("\nChoose the number of seat[01-50]: ", 2);
            if (chosenSeat > 0 & chosenSeat < 51) {
                Seat seat = new Seat(selection, chosenSeat, true);
                FileManagerLib.writeFile(seat.toString());
                repeat = true;
            } else {
                System.out.println("incorrect seat number");
                repeat = false;
            }
        } while (repeat == false);
        return chosenSeat;
    }
}
