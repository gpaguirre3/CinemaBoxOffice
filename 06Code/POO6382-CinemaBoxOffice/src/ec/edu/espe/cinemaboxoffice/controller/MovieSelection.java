/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import ec.edu.espe.cinemaboxoffice.model.Seat;
import ec.edu.espe.cinemaboxoffice.model.Ticket;
import ec.edu.espe.cinemaboxoffice.utils.InputValidation;
import ec.edu.espe.filemanagerlibrary.FileManagerLib;
import java.io.File;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class MovieSelection {

    public static void showMovieList() {
        InputValidation in = new InputValidation();
        FileManagerLib fileManagerLib;
        String selection;
        fileManagerLib = new FileManagerLib("MovieList.csv");
        FileManagerLib.readFile();
        File f = new File("MovieList.csv");
        if (f.length() == 0) {
            System.out.println("No movies have been registered yet");
        } else {
            selection = in.getString("\nWhat movie do you want to watch?: ");
            chooseMovie(selection);
        }
    }

    public static void chooseMovie(String selection) {
        Seat seat = new Seat(selection, 0, true);
        FileManagerLib fileManagerLib;
        fileManagerLib = new FileManagerLib(selection + ".csv");
        FileManagerLib.readFile();
        Ticket.generateTicket(seat.chooseSeat(selection), selection);
    }
}
