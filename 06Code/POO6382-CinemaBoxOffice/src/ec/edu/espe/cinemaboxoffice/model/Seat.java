/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.cinemaboxoffice.utils.InputValidation;
import ec.edu.espe.filemanagerlibrary.FileManager;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

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

    public int chooseSeat(String selection) throws IOException {
        InputValidation in = new InputValidation();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String seatsJson = new String(Files.readAllBytes(Paths.get("MovieList.json")));
        System.out.println(seatsJson);
        int chosenSeat;
        do {
            chosenSeat = in.getInt("\nChoose the number of seat[01-50]: ", 2);
            if (chosenSeat > 0 & chosenSeat < 51) {
                ArrayList<Seat> seats = gson.fromJson(seatsJson, ArrayList.class);
                seats.add(new Seat(selection, chosenSeat, true));
                FileManager.writeFile(selection + ".json", gson.toJson(seats));
            } else {
                System.out.println("incorrect seat number");
            }
        } while (!(chosenSeat > 0 & chosenSeat < 51));
        return chosenSeat;
    }
}
