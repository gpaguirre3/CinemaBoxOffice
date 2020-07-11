/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import ec.edu.espe.cinemaboxoffice.model.Seat;
import ec.edu.espe.cinemaboxoffice.model.Ticket;
import ec.edu.espe.cinemaboxoffice.utils.InputValidation;
import ec.edu.espe.filemanagerlibrary.FileManager;
import java.io.File;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class MovieSelection {

    public static void showMovieList() {
        InputValidation in = new InputValidation();
        FileManager fileManager;
        String selection;
        fileManager = new FileManager("MovieList.json");
        System.out.println(FileManager.readFile());
        File f = new File("MovieList.json");
        if (f.length() == 0) {
            System.out.println("No movies have been registered yet");
        } else {
            selection = in.getString("\nWhat movie do you want to watch?: ");
            chooseMovie(selection);
        }
    }

    public static void chooseMovie(String selection) {
        Seat seat = new Seat(selection, 0, true);
        FileManager fileManagerLib;
        fileManagerLib = new FileManager(selection + ".json");
        FileManager.readFile();
        Ticket.generateTicket(seat.chooseSeat(selection), selection);
    }
}
