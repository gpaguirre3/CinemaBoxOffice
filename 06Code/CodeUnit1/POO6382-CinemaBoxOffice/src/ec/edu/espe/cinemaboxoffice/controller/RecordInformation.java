/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.cinemaboxoffice.model.FoodCombo;
import ec.edu.espe.cinemaboxoffice.model.Movie;
import ec.edu.espe.cinemaboxoffice.model.Promotion;
import ec.edu.espe.cinemaboxoffice.model.Room;
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
public class RecordInformation {

    InputValidation in = new InputValidation();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void createMovie() throws IOException {
        int roomNumber;
        String formatMovie;
        Room room = new Room();
        FileManager.createFile("MovieList.json");
        String moviesJson;
        do {
            moviesJson = new String(Files.readAllBytes(Paths.get("MovieList.json")));
            System.out.println(moviesJson);
            ArrayList<Movie> movies = gson.fromJson(moviesJson, ArrayList.class);
            room.showRoomData();
            roomNumber = in.getInt("Enter the number movie room: )", 1);
            formatMovie = defineRoomFormat(roomNumber);
            movies.add(new Movie(in.getString("Enter the movie title"),
                    in.getString("Enter the movie gender: "), roomNumber,
                    defineRoomFormat(roomNumber), calculateMoviePrice(formatMovie)));
            FileManager.deleteFile("MovieList.json");
            FileManager.writeFile("MovieList.json", gson.toJson(movies));
        } while ("yes".equals(in.getYesOrNo("Record more movies?[yes/no]: ")));
    }

    public String defineRoomFormat(int roomNumberForMovie) {
        do {
            if (roomNumberForMovie < 10 & roomNumberForMovie > -1) {
                if (roomNumberForMovie > -1 & roomNumberForMovie < 5) {
                    return "2D";
                } else {
                    return "3D";
                }
            }
        } while (!(roomNumberForMovie < 10 & roomNumberForMovie > -1));
        return "The room doesn't exist";
    }

    public float calculateMoviePrice(String roomFormatForMovie){
        float moviePrice;
            if ("2D".equals(roomFormatForMovie)) {
                moviePrice= 6.50f;
            } else {
                moviePrice = 8.0f;
            }
            return moviePrice;
        }

    public void deleteMovie(String fileName) {
        FileManager file = new FileManager();
        FileManager.deleteFile(fileName);
    }

    public void createPromotion() throws IOException {
        FileManager file = new FileManager();
        FoodCombo foodCombo = new FoodCombo(0, "", "", "", 0);
        boolean repeat = false;
        String name;
        String day;
        String answer;
        do {
            ArrayList<Promotion> promo = new ArrayList<>();
            name = "Combo" + Integer.toString(foodCombo.menuCombo());
            day = in.getString("Enter the promotion day: ");
            promo.add(new Promotion(name, day, 2.50f));
            String JsonString = "";
            JsonString = gson.toJson(promo);
            FileManager.writeFile("PromotionsList.json", JsonString);
            answer = in.getYesOrNo("Add another combo?[yes/no]: ");
            if ("no".equals(answer)) {
                repeat = true;
            }
        } while (repeat == false);
    }

    public void deletePromotion(String fileName) {
        FileManager file = new FileManager();
        FileManager.deleteFile(fileName);
    }
}
