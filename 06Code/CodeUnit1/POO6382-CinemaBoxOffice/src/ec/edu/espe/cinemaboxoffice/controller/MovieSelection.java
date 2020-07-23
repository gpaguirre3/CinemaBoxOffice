/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.cinemaboxoffice.model.Movie;
import ec.edu.espe.cinemaboxoffice.model.Seat;
import ec.edu.espe.cinemaboxoffice.model.Ticket;
import ec.edu.espe.cinemaboxoffice.utils.InputValidation;
import ec.edu.espe.filemanagerlibrary.FileManager;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public class MovieSelection {

    public static void showMovieList() throws IOException {
        InputValidation in = new InputValidation();
        File f = new File("MovieList.json");
        if (f.length() == 0) {
            System.out.println("No movies have been registered yet");
        } else {
            String moviesJson = new String(Files.readAllBytes(Paths.get("MovieList.json")));
            System.out.println(moviesJson);
            chooseMovie(in.getString("\nWhat movie do you want to watch?: "));
        }
    }

    public static void chooseMovie(String selection) throws IOException {
        Seat seat = new Seat(selection, 0, true);
        FileManager.readFile(selection + ".json");
        Ticket.generateTicket(seat.chooseSeat(selection), selection);
    }
}
